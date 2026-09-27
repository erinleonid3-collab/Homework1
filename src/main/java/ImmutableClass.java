import java.util.Objects;

public final class ImmutableClass {
    private final MutableClass mutableClass;
    private final int id;
    private final String name;

    public ImmutableClass(MutableClass mutableClass, int id, String name) {
        this.mutableClass = new MutableClass(mutableClass.getId(), mutableClass.getName());
        this.id = id;
        this.name = name;
    }

    public MutableClass getMuttableClass() {
        return new MutableClass(mutableClass.getId(), mutableClass.getName());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return id == that.id && Objects.equals(mutableClass, that.mutableClass) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mutableClass, id, name);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "muttableClass=" + mutableClass +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
