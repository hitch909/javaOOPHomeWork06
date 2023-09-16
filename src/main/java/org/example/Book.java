package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor@Getter
@ToString
public class Book {
    private String name;
    private String autor;
    private BookGenre genre;

}
