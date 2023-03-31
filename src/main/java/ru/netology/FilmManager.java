package ru.netology;
public class FilmManager {
    private String[] films = new String[0];

    private int limit;

    public FilmManager() {
        this.limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void addFilms(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resoultAmount;
        if (films.length < limit) {
            resoultAmount = films.length;
        } else {
            resoultAmount = limit;
        }
        String[] tmp = new String[resoultAmount];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];

        }
        return tmp;
    }
}