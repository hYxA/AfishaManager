package repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import manager.FilmItem;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class AfishaRepository {
    // создание массива для хранения результатов
    private FilmItem[] items = new FilmItem[0];
    FilmItem[] result = new FilmItem[items.length];
    private int id;
    private int filmPrise;
    private String filmName;

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

    public FilmItem[] getAfisha() {
        // перебираем результаты
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

//TODO
// findAll - возвращает массив всех хранящихся в массиве объектов
// save - добавляет объект в массив
// findById - возвращает объект по идентификатору (либо null, если такого объекта нет)
// removeById - удаляет объект по идентификатору (если объекта нет, то пусть будет исключение, как на лекции)
// removeAll* - полностью вычищает репозиторий


}
