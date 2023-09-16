package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @apiNote класс реализует электронную книгу и переводит ее в разные форматы
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class ElectronBook extends Book implements FormatterElectrBook{
    private int weight;
    private FormatElektronBook format;

    @Override
    public void formElBook(FormatElektronBook formatElektronBook) {
        System.out.println("'элекронная книга переведена в формат:  " + formatElektronBook);
    }
}
