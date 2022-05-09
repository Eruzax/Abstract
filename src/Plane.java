public class Plane extends Vehicle
{
    private String model;

    public Plane(String m, int topSpeed)
    {
        super("Plane", topSpeed);
        model = m;
    }

    public void drive()
    {
        System.out.println("Whir Whir");
    }
}
