package OOPs.Abstraction;

public class Book_PS extends PrintMyBook {
    String Name;
    String Writer;
    int Price;

    public static void main(String[] args) {
        Book_PS myBook = new Book_PS("Harry Potter", "J.k. Rowling", 120);
        myBook.getDetails();

    }



//Pram Constructor
    Book_PS(String Name, String Writer, int Price){
        this.Name = Name;
        this.Writer= Writer;
        this.Price = Price;

    }


    @Override
    void getDetails() {
        System.out.println(Name + "  " + Writer+ "  " +  Price);
    }
}


//Abstract Class

abstract class PrintMyBook {

    abstract void getDetails();

    }

