package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTestWithoutBeforeEach {

    @Test
    public void removeAll() {
        manager.removeAll();
        FilmItem[] expected = new FilmItem[0];
        FilmItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }
}