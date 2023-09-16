package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @apiNote класс создает библиотеку и делает поиск книги по автору
 */
@NoArgsConstructor
@Getter
@ToString
public class Bibliory implements Searchable{
    private List<Book> books = new ArrayList<>();

    public Bibliory(List<Book> books) {
        this.books = books;
    }
    @Override
    public Book findByAuthor(String autor) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getAutor().equals(autor)){
                return books.get(i);
            }
        }
        return null;
    }
}
