package manager;

import static java.lang.System.arraycopy;

public class AfishaManager {

    private int countFilms = 10;
    private FilmItem[] items = new FilmItem[0];     // создание пустого массива


    public AfishaManager(int countFilms) {
        this.countFilms = countFilms;
    }

    public AfishaManager() {

    }

    public void addFilm(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        // копируем поэлементно
        arraycopy(items, 0, tmp, 0, length);
    }

    public FilmItem[] getItems(int countFilms) {
        if (countFilms > items.length) {
            countFilms = items.length;
        }
        // создание массива для хранения результатов
        FilmItem[] result = new FilmItem[countFilms];
        // перебираем результаты
        for (int i = 0; i < countFilms; i++) {
            int index = countFilms - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
