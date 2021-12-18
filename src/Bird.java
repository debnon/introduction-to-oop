public abstract class Bird
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

}
