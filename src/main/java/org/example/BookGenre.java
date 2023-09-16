package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @apiNote присваивает какой-то жанр книге
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class BookGenre implements Genre{
    private String genreOfBook;
    @Override
    public String takeGenre() {
        return genreOfBook;
    }
}
