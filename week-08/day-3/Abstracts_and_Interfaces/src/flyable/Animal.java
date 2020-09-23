package flyable;

public abstract class Animal {
    protected String name;
    protected String gender;
    protected String color;
    protected int age;

    public abstract String getName();

    public abstract String breed();

    public abstract void eat();

    public abstract void drink();
}
