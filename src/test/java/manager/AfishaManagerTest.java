package manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();

    final FilmItem first = new FilmItem(1, 300, "first");
    final FilmItem second = new FilmItem(2, 250, "second");
    final FilmItem third = new FilmItem(3, 550, "third");
    final FilmItem four = new FilmItem(4, 300, "four");
    final FilmItem five = new FilmItem(5, 250, "five");
    final FilmItem six = new FilmItem(6, 550, "six");
    final FilmItem seven = new FilmItem(7, 300, "seven");
    final FilmItem eight = new FilmItem(8, 250, "eight");
    final FilmItem nine = new FilmItem(9, 550, "nine");
    final FilmItem ten = new FilmItem(10, 300, "ten");
    final FilmItem eleven = new FilmItem(11, 250, "eleven");
    final FilmItem twelve = new FilmItem(12, 550, "twelve");


    void prepareManager() {
       // AfishaManager manager = new AfishaManager();
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        manager.addFilm(eleven);
        manager.addFilm(twelve);
    }

    @Test
    public void shouldSave() {
        prepareManager();
      //  AfishaManager manager = new AfishaManager();

        int countFilms = 5;
        manager.addFilm(first);
        FilmItem[] expected = new FilmItem[]{
                first,
                second,
                third,
                four,
                five,
                six,
                seven,
                eight,
                nine,
                ten,
                eleven,
                twelve,
                first
        };
        FilmItem[] actual = manager.getItems(countFilms);

        assertArrayEquals(expected, actual);
    }
}