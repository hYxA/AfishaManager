package ru.netology.manager;

import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    int countFilms;
    private AfishaRepository repository = new AfishaRepository();
    private FilmItem[] items = new FilmItem[0];


    public AfishaManager(AfishaRepository repository, int countFilms) {
        this.repository = repository;
        this.countFilms = countFilms;
    }


    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }


    public FilmItem[] findAll() {
        return repository.getItems();
    }

    public void addFilm(FilmItem item) {repository.save(item);}

    public void removeById(int idToRemove) {repository.removeById(idToRemove);}

    public FilmItem findById(int idToFind) {repository.findById(idToFind);
        return items[idToFind];
    }

    public void removeAll() {repository.removeAll();}


}
