package manager;

public class AfishaManager {

    private int countFilms;
    private FilmItem[] items = new FilmItem[0];     // создание пустого массива


    public AfishaManager(int countFilms) {
        this.countFilms = countFilms;
    }

    public AfishaManager() {
        countFilms = 10;
    }

    public void addFilm(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        // копируем поэлементно
        System.arraycopy(items, 0, tmp, 0, length);
    }

    private FilmItem[] getItems(int countFilms) {
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
