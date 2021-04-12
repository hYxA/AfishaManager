package ru.netology.manager;

import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    int countFilms;
    private AfishaRepository repository;// = new AfishaRepository();

    public AfishaManager(AfishaRepository repository, int countFilms) {
        this.repository = repository;
        this.countFilms = countFilms;
    }

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }


    public FilmItem[] getAll() {
        return repository.getItems();
    }

    public FilmItem[] getAll(int countFilms) {
        FilmItem[] result = new FilmItem[countFilms];
        System.arraycopy(repository.getItems(), 0, result, 0, countFilms);
        return result;
    }

    public void addFilm(FilmItem item) {
        repository.save(item);
    }

    public void removeById(int idToRemove) {
        repository.removeById(idToRemove);
    }

    public FilmItem findById(int idToFind) {
        return repository.findById(idToFind);
    }

    public void removeAll() {
        repository.removeAll();
    }


}
