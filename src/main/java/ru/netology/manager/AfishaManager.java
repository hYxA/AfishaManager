package ru.netology.manager;

import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    int countFilms;
    private AfishaRepository repository = new AfishaRepository();
    private FilmItem[] items = new FilmItem[0];


    public AfishaManager(int countFilms) {
        AfishaRepository repository;
        this.countFilms = countFilms;
    }


    public AfishaManager(AfishaRepository repository) {
        this.countFilms = 10;
    }


    public FilmItem[] getAll() {
        FilmItem[] result = repository.getResult();
        return result;
    }

    public FilmItem[] findAll() {
        FilmItem[] result = repository.findAll();

        return result;
    }

    public void addFilm(FilmItem item) {repository.save(item);}

    public void removeById(int idToRemove) {repository.removeById(idToRemove);}

    public FilmItem findById(int idToFind) {repository.findById(idToFind);
        return items[idToFind];
    }

    public void removeAll() {repository.removeAll();}


}
