package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.repository.AfishaRepository;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AfishaManagerTest {
    AfishaRepository repository = new AfishaRepository();
    AfishaManager manager = new AfishaManager(repository);

    private final FilmItem first = new FilmItem(1, 300, "first");
    private final FilmItem second = new FilmItem(2, 250, "second");
    private final FilmItem third = new FilmItem(3, 550, "third");
    private final FilmItem four = new FilmItem(4, 300, "four");
    private final FilmItem five = new FilmItem(5, 250, "five");
    private final FilmItem six = new FilmItem(6, 550, "six");
    private final FilmItem seven = new FilmItem(7, 300, "seven");
    private final FilmItem eight = new FilmItem(8, 250, "eight");
    private final FilmItem nine = new FilmItem(9, 550, "nine");
    private final FilmItem ten = new FilmItem(10, 300, "ten");
    private final FilmItem eleven = new FilmItem(11, 250, "eleven");
    private final FilmItem twelve = new FilmItem(12, 550, "twelve");

    @BeforeEach
    void prepareManager() {
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
        FilmItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll5() {
        AfishaManager manager = new AfishaManager(repository, 5);
        FilmItem[] actual = manager.getAll(manager.countFilms);

        FilmItem[] expected = new FilmItem[]{
                twelve,
                eleven,
                ten,
                nine,
                eight
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        int idToRemove = 2;
        manager.removeById(idToRemove);

        FilmItem[] expected = new FilmItem[]{
                first,
                second,
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
        FilmItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNOTRemoveById() {
        int idToRemove = 22;
        manager.removeById(idToRemove);

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
                twelve
        };
        FilmItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById() {
        int idToFind = 3;
        FilmItem[] actual = new FilmItem[]{manager.findById(idToFind)};
        FilmItem[] expected = new FilmItem[]{four};

        assertArrayEquals(expected, actual);
    }


}