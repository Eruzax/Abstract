import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Car gtr = new Car("GTR", 300);
        Plane boeing = new Plane("Boeing 777", 1000);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(gtr);
        vehicles.add(boeing);

        for (Vehicle v : vehicles)
        {
            v.drive();
        }
    }
}
