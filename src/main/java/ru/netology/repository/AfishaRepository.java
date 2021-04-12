package ru.netology.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.manager.FilmItem;

import static java.lang.System.arraycopy;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AfishaRepository {

    private FilmItem[] items = new FilmItem[0];
    private int id;
    private int filmPrise;
    private String filmName;
    // создание массива для хранения результатов
    FilmItem[] result = new FilmItem[items.length];

    public void save(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        // копируем поэлементно
        arraycopy(items, 0, tmp, 0, items.length);

        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] getItems() {
        FilmItem[] draftResult = new FilmItem[items.length];
        int counter = 0;
        // перебираем результаты
        for (int i = 0; i < items.length; i++) {
            int index = items.length - i - 1;
            if (items[index] != null) {
                // выборка ненулевых значений
                draftResult[counter] = items[index];
                counter += 1;
            }
        }
        // создание массива с нужной длиной
        FilmItem[] result = new FilmItem[counter];
        arraycopy(draftResult, 0, result, 0, counter);

        return result;
    }

    public void removeById(int idToRemove) {
        if (idToRemove > items.length) {
            System.out.println("Не существует объекта с таким ID");
            System.out.println("------------------");
            return;
        }
        int index = 0;
        int length = items.length - 1;
        FilmItem[] result = new FilmItem[length];
        for (FilmItem item : items) {
            if (item.getId() != idToRemove) {
                result[index] = item;
                index++;
            }
        }
    }

    public FilmItem findById(int idToFind) {
        if (idToFind > items.length - 1) {
            System.out.println("Не существует объекта с таким ID");
            System.out.println("------------------");
            return null;
        } else {
            System.out.println("Запрошенный элемент "+ items[idToFind]);
            return items[idToFind];
        }
    }

    public void removeAll() {
        FilmItem[] tmp = new FilmItem[0];
        items = tmp;
    }

}
