package day25_constructors.movieTask;

import java.time.LocalDate;

public class TestMovieObject {
    public static void main(String[] args) {
        String[] casts = {"Ozzy", "Ali", " Muhtar", "Mike", "Matt", "Joshua"};
        Movie movie1 = new Movie("USA", " Java Developer: Zero to Hero", "Adventure, Comedy, Thriller", LocalDate.of(2021, 04, 18), " Kuzzat Altay");
        movie1.addCast(casts);

        System.out.println(movie1);
    }
}
/*
    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie

*/