package org.example;

/**
 * @apiNote класс переводит книгу в форат html
 */
public class HtmlFormatter implements Formatter{
    @Override
    public void formatTo(Book book) {
        System.out.println("книга преобразованна в формат html");
    }
}
