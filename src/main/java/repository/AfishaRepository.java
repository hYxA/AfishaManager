package repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import manager.FilmItem;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AfishaRepository {

    private FilmItem[] items = new FilmItem[0];
    private int id;
    private int filmPrise;
    private String filmName;
    // создание массива для хранения результатов
    private FilmItem[] result = new FilmItem[items.length];

    public void save(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        // копируем поэлементно
        System.arraycopy(items, 0, tmp, 0, length);

        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] findAll() {
        // перебираем результаты
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
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
        FilmItem[] items = new FilmItem[0];
    }

}
