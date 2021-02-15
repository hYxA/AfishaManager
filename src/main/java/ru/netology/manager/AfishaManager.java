package ru.netology.manager;

import ru.netology.repository.AfishaRepository;

public class AfishaManager {

    private AfishaRepository repository;


    public AfishaManager(int countFilms) {
        repository.findAll(countFilms);
    }

    public AfishaManager() {
        repository.findAll(10);
    }

    public AfishaManager(AfishaRepository repository) {this.repository = repository;}

    public void add(FilmItem item) {repository.save(item);}

    public void addFilm(FilmItem item) {repository.save(item);}

    public void removeById(int idToRemove) {repository.removeById(idToRemove);}

    public void findById(int idToFind) {repository.findById(idToFind);}

    public void removeAll() {repository.removeAll();}


}
