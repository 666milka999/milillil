public class Book implements Printable
{
    public void print()
    {
        System.out.println("Book");
    }

    public static void printBooks(Printable[] printable)
    {
        for (int i = 0; i < printable.length; i++)
        {
            if (printable[i] instanceof Book)
            {
                printable[i].print();
            }
        }
    }
}
