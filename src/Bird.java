public abstract class Bird implements DanceImpl
{

    protected String name;
    protected String colour;
    protected Integer maxSpeed;

    public Bird(String name, String colour, Integer maxSpeed)
    {
        this.name = name;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }

    public abstract void speak();

    public void fly()
    {
        System.out.println("I'm " + name + " and I can fly at " + maxSpeed + " km/h!");
    }

    public void spin() {
        System.out.println(name + " spin!");
    }

    public void doTheCaterpillar() {
        System.out.println(name + " do the wriggly woo!");
    }

    public void jump() {
        System.out.println(name + " jump in the air!");
    }
}
