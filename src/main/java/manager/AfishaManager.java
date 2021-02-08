package manager;

public class AfishaManager {
    // создание пустого массива
    private FilmItem[] items = new FilmItem[0];
    AfishaManager manager = new AfishaManager(5);
    public AfishaManager(int countFilms) {
    }



    public void addFilm(FilmItem item) {
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        // копируем поэлементно
        System.arraycopy(items, 0, tmp, 0, length);
    }

    public FilmItem[] getItems() {
        // создание массива для хранения результатов
        FilmItem[] result = new FilmItem[items.length];
        // перебираем результаты
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
