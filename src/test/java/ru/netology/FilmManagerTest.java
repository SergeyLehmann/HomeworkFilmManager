package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    String film1 = "First";
    String film2 = "Second";
    String film3 = "Third";

    @Test
    public void test() {


        FilmManager manager = new FilmManager();
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);

        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowMoviesInReverseOrder() {
        FilmManager manager = new FilmManager();
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);

        String[] expected = {"Third", "Second", "First"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllIfAddedFewerThanLimit() {
        FilmManager manager = new FilmManager(3);
        manager.addFilms(film1);
        manager.addFilms(film2);
        String[] expected = {"First", "Second",};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllIfAddedMoreThanLimit() {
        FilmManager manager = new FilmManager(2);
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        String[] expected = {"Third", "Second"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllIfAddedLimitAmount() {
        FilmManager manager = new FilmManager(2);
        manager.addFilms(film1);
        manager.addFilms(film2);
        String[] expected = {"First", "Second"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
