abstract public class Vehicle
{
    private String type;
    private int topSpeed;

    public Vehicle(String t, int ts)
    {
        type = t;
        topSpeed = ts;
    }

    abstract public void drive();
}
