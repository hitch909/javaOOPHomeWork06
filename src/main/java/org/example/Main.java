package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("name1", "autor1", new BookGenre("fantesy"));
        List<Book>bookList = new ArrayList<>();
        genereitBook(bookList);
        Bibliory bibliory = new Bibliory(bookList);
        System.out.println(bookList);

        ElectronBook electronBook1 = new ElectronBook(2, FormatElektronBook.DOC);
        ElectronBook electronBook2 = new ElectronBook(1, FormatElektronBook.DOC);
        ElectronBook electronBook3= new ElectronBook(3, FormatElektronBook.DOC);

        electronBook1.formElBook(FormatElektronBook.TXT);

        var autor = bibliory.findByAuthor("autor2");
        System.out.println(autor);

        JsonFormatter jsonFormatter = new JsonFormatter();
        jsonFormatter.formatTo(book);

    }

    /**
     * @apiNote генерирует List книг
     * @param bookList
     */
    private static void genereitBook(List<Book> bookList) {
        for (int i = 0; i < 5; i++) {
            bookList.add(new Book("name"+i, "autor"+i, new BookGenre("fantesy")));
        }
    }
}