package manager;

import repository.AfishaRepository;

public class AfishaManager {
    // создание пустого массива


    public AfishaManager(int countFilms) {    }

    AfishaManager manager = new AfishaManager(5);

    private AfishaRepository repository;

    public AfishaManager(AfishaRepository repository) {this.repository = repository;}

    public void add(FilmItem item) {repository.save(item);}

    public void getAll() {repository.findAll();}

    public void addFilm(FilmItem item) {repository.save(item);}

    public void removeById(int idToRemove) {repository.removeById(idToRemove);}

    public void findById(int idToFind) {repository.findById(idToFind);}


}
