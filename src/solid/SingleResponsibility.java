package solid;

class Book{
    String name;
    String text;

    String replaceWord(String word , String newWord){
        return text.replaceAll("one", "two");

    }

    // this violate single responsibility principle
    // we can make another class for printing
    void printTextToConsole(String text){
        System.out.println(text);
    }
}

class BookPrinter{
    void printTextToConsole(String text){
        System.out.println(text);
    }

    void printTextToAnotherMedium(String text){
        //
    }
}

public class SingleResponsibility {

    public static void main(String[] args) {

        Book book = new Book();
        book.text = "one and only one sakib khan";
        book.text = book.replaceWord("one", "two");
        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printTextToConsole(book.text);

    }
}
