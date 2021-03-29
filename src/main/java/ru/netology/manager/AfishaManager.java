package ru.netology.manager;

import ru.netology.domain.FilmItem;

import static java.lang.System.arraycopy;

public class AfishaManager {

    private int countFilms = 10;
    private FilmItem[] items = new FilmItem[0];     // создание пустого массива


    public AfishaManager(int countFilms) {
        this.countFilms = countFilms;
    }

    public AfishaManager() {
        this.countFilms = 10;

    }

//    AfishaManager manager = new AfishaManager();

    public void addFilm(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        // копируем поэлементно
        arraycopy(items, 0, tmp, 0, length - 1);

        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public FilmItem[] getItems(int countFilms) {
       // int count = 10;

        FilmItem[] result = new FilmItem[countFilms];
        // перебираем результаты
        for (int i = 0; i < countFilms; i++) {
            int index = countFilms - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
