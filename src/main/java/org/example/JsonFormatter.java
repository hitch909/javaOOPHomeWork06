package org.example;

/**
 * @apiNote класс пререводит книгу в форат json
 */
public class JsonFormatter implements Formatter{
    @Override
    public void formatTo(Book book) {
        System.out.println("книга преобразованна в формат Json");
    }
}
