public class Magazine implements Printable
{
    public void print()
    {
        System.out.println("Magazine");
    }

    public static void printMagazines(Printable[] printable)
    {
        for (int i = 0; i < printable.length; i++)
        {
            if (printable[i] instanceof Magazine)
            {
                printable[i].print();
            }
        }
    }
}
