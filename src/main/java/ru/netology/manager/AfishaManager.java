package ru.netology.manager;

import ru.netology.repository.AfishaRepository;

public class AfishaManager {

    private int countFilms;
    private AfishaRepository repository;
    private FilmItem[] items = new FilmItem[0];


    public AfishaManager(int countFilms) {
        this.countFilms = countFilms;
    }


    public AfishaManager() {
        this.countFilms = 10;
    }


    public FilmItem[] getAll() {
        FilmItem[] result = new FilmItem[0];
        result = repository.getAll();
        return result;
    }

    public void addFilm(FilmItem item) {repository.save(item);}

    public void removeById(int idToRemove) {repository.removeById(idToRemove);}

    public FilmItem findById(int idToFind) {repository.findById(idToFind);
        return items[idToFind];
    }

    public void removeAll() {repository.removeAll();}


}
