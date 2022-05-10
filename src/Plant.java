public class Plant implements Waterable
{
    private String species;
    private String color;

    public Plant(String s, String c)
    {
        species = s;
        color = c;
    }

    public void giveWater()
    {
        System.out.println("Tinkle");
    }

    public String getName()
    {
        return species;
    }
}
