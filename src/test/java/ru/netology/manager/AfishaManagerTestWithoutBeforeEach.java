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
}