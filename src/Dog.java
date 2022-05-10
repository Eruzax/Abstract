public class Dog implements Waterable
{
    private String name;
    private int age;

    public Dog(String n, int a)
    {
        name = n;
        age = a;
    }

    public void giveWater()
    {
        System.out.println("Slurp Slurp");
    }

    public String getName()
    {
        return name;
    }

    @Override
    public int compareTo(Object dog)
    {
        Dog safeCast = (Dog) dog;
        if(safeCast.getName().compareTo(this.getName()) > 0)
        {
            return 1;
        }
        else if (safeCast.getName().compareTo(this.getName()) < 0)
        {
            return -1;
        }
        else
        {
            return -1;
        }
    }
}
