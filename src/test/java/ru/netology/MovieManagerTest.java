package ru.netology;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
   public void addMovie() {
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie("Movie 1");
        movieManager.addMovie("Movie 2");
        String[] expected = {"Movie 1", "Movie 2"};
        assertArrayEquals(expected, movieManager.findAll());
    }

    @Test
   public void findAll() {
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie("Movie 1");
        movieManager.addMovie("Movie 2");
        movieManager.addMovie("Movie 3");
        movieManager.addMovie("Movie 4");
        movieManager.addMovie("Movie 5");
        movieManager.addMovie("Movie 6");

        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        assertArrayEquals(expected, movieManager.findLast());
    }

    @Test
   public void defaultLimit() {
        MovieManager movieManager = new MovieManager(3);
        movieManager.addMovie("Movie 1");
        movieManager.addMovie("Movie 2");
        movieManager.addMovie("Movie 3");
        movieManager.addMovie("Movie 4");

        String[] expected = {"Movie 4", "Movie 3", "Movie 2"};
        assertArrayEquals(expected, movieManager.findLast());
    }
    @Test
   public void thanLimit() {
        MovieManager movieManager = new MovieManager(10);
        movieManager.addMovie("Movie 1");
        movieManager.addMovie("Movie 2");

        String[] expected = {"Movie 2", "Movie 1"};
        assertArrayEquals(expected, movieManager.findLast());
    }
    @Test
   public void noMovie() {
        MovieManager movieManager = new MovieManager();

        String[] expected = {};
        assertArrayEquals(expected, movieManager.findLast());
    }
}