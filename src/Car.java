public class Car extends Vehicle
{
    private String model;


    public Car(String m, int ts)
    {
        super("Car", ts);
        model = m;
    }

    public void drive()
    {
        System.out.println("Vroom Vroom");
    }
}
