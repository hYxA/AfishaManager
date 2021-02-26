package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTestWithoutBeforeEach {
    AfishaRepository repository = new AfishaRepository();
    AfishaManager manager = new AfishaManager(repository);

    @Test
    public void removeAll() {
        manager.removeAll();
        FilmItem[] expected = new FilmItem[0];
        FilmItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll5() {
        int countFilms = 5;
        AfishaManager manager = new AfishaManager(repository, countFilms);

        final FilmItem first = new FilmItem(1, 300, "first");
        final FilmItem second = new FilmItem(2, 250, "second");
        final FilmItem third = new FilmItem(3, 550, "third");
        final FilmItem four = new FilmItem(4, 300, "four");
        final FilmItem five = new FilmItem(5, 250, "five");
        final FilmItem six = new FilmItem(6, 550, "six");
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);

        FilmItem[] actual = manager.getAll(countFilms);

        FilmItem[] expected = new FilmItem[]{
                first,
                second,
                third,
                four,
                five
        };

        assertArrayEquals(expected, actual);
    }
}