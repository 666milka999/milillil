public class Main {
    public static void main(String[] args)
    {
        Printable[] Notes = new Printable[] {new Book(), new Magazine()};

        for (int i = 0; i < Notes.length; i++) {
            Notes[i].print();
        }

        Magazine.printMagazines(Notes);
        Book.printBooks(Notes);

        Instrument[] instruments = {new Baraban(), new Truba(), new Guitar() };

        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
        }
    }
}