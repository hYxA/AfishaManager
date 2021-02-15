package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AfishaManagerTest {
    private AfishaManager manager = new AfishaManager();
    private FilmItem first = new FilmItem(1, 300, "first");
    private FilmItem second = new FilmItem(2, 250, "second");
    private FilmItem third = new FilmItem(3, 550, "third");
    private FilmItem four = new FilmItem(4, 300, "four");
    private FilmItem five = new FilmItem(5, 250, "five");
    private FilmItem six = new FilmItem(6, 550, "six");
    private FilmItem seven = new FilmItem(7, 300, "seven");
    private FilmItem eight = new FilmItem(8, 250, "eight");
    private FilmItem nine = new FilmItem(9, 550, "nine");
    private FilmItem ten = new FilmItem(10, 300, "ten");
    private FilmItem eleven = new FilmItem(11, 250, "eleven");
    private FilmItem twelve = new FilmItem(12, 550, "twelve");

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
        FilmItem[] expected = new FilmItem[]{first, second, third, first};
        FilmItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllTen() {

    }

    @Test
    public void removeById() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void removeAll() {
    }
}