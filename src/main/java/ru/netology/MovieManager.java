package ru.netology;

public class MovieManager {
    private String[] movies = new String[0];
    private int limit;

    // Конструктор без параметров, устанавливающий лимит по умолчанию в 5
    public MovieManager() {
        this.limit = 5;
    }

    // Конструктор с параметром для задания пользовательского лимита
    public MovieManager(int limit) {
        this.limit = limit;
    }

    // Метод для добавления нового фильма
    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    // Метод для вывода всех фильмов в порядке добавления
    public String[] findAll() {
        return movies;
    }

    // Метод для вывода последних добавленных фильмов в обратном от добавления порядке
    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }

        return result;
    }

}

