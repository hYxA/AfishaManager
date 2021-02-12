package repository;

import org.junit.jupiter.api.BeforeEach;
import manager.AfishaManager;
import manager.FilmItem;
import org.junit.Test;

class AfishaRepositoryTest {
    private AfishaManager manager = new AfishaManager();
    private FilmItem first = new FilmItem(1,300,"first");
    private FilmItem second = new FilmItem(2,250,"second");
    private FilmItem third = new FilmItem(3,550,"third");

    @BeforeEach
    void prepareManager() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

    @Test
    void shouldSave() {

    }

    @Test
    void findAll() {
    }

    @Test
    void removeById() {
    }

    @Test
    void findById() {
    }

    @Test
    void removeAll() {
    }
}