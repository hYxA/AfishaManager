package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AfishaManagerTest {
    private AfishaManager manager = new AfishaManager();
    private FilmItem first = new FilmItem(1, 300, "first");
    private FilmItem second = new FilmItem(2, 250, "second");
    private FilmItem third = new FilmItem(3, 550, "third");

    @BeforeEach
    void prepareManager() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
    }

    @Test
    public void shouldSave() {
        manager.addFilm(first);
        FilmItem[] expected = {first, second, third, first};
        FilmItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAll() {
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