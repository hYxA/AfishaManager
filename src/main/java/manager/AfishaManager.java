package manager;

import repository.AfishaRepository;

public class AfishaManager {
    // создание пустого массива


    public AfishaManager(int countFilms) {    }

    AfishaManager manager = new AfishaManager(5);

    private AfishaRepository repository;

    public AfishaManager(AfishaRepository repository) {this.repository = repository;}

    public void add(FilmItem item) {repository.save(item);}

    public void getAll() {repository.getAfisha();}

    public void addFilm(FilmItem item) {

    }


}
