package com.diegobarros.springmovies;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {
private List<Movies> movies = new ArrayList<>();
   public MoviesController(){
    // Initialize list
    int id;
    String title;
    int release_year;
    String director;
    String genre;
    String synopsis;
    movies.add(new Movies(id=1, title="Star Wars: Episode IV - A New Hope", release_year=1977, director="George Lucas", genre="Sci-Fi", synopsis="The Imperial Forces -- under orders from cruel Darth Vader (David Prowse) -- hold Princess Leia (Carrie Fisher) hostage, in their efforts to quell the rebellion against the Galactic Empire. Luke Skywalker (Mark Hamill) and Han Solo (Harrison Ford), captain of the Millennium Falcon, work together with the companionable droid duo R2-D2 (Kenny Baker) and C-3PO (Anthony Daniels) to rescue the beautiful princess, help the Rebel Alliance, and restore freedom and justice to the Galaxy."));
    movies.add(new Movies(id=2, title="Star Wars: Episode V - The Empire Strikes Back", release_year=1980, director="Irvin Kershner", genre="Sci-Fi", synopsis="The adventure continues in this \"Star Wars\" sequel. Luke Skywalker (Mark Hamill), Han Solo (Harrison Ford), Princess Leia (Carrie Fisher) and Chewbacca (Peter Mayhew) face attack by the Imperial forces and its AT-AT walkers on the ice planet Hoth. While Han and Leia escape in the Millennium Falcon, Luke travels to Dagobah in search of Yoda. Only with the Jedi master's help will Luke survive when the dark side of the Force beckons him into the ultimate duel with Darth Vader (David Prowse)."));
    movies.add(new Movies(id=3, title="The Lord of the Rings: The Fellowship of the Ring", release_year=2001, director="Peter Jackson", genre="Fantasy", synopsis="The future of civilization rests in the fate of the One Ring, which has been lost for centuries. Powerful forces are unrelenting in their search for it. But fate has placed it in the hands of a young Hobbit named Frodo Baggins (Elijah Wood), who inherits the Ring and steps into legend. A daunting task lies ahead for Frodo when he becomes the Ringbearer - to destroy the One Ring in the fires of Mount Doom where it was forged."));
    movies.add(new Movies(id=4, title="Spirited Away", release_year=2002, director="Hayao Miyazaki", genre="Fantasy", synopsis="10-year-old Chihiro (Daveigh Chase) moves with her parents to a new home in the Japanese countryside. After taking a wrong turn down a wooded path, Chihiro and her parents discover an amusement park with a stall containing an assortment of food. To her surprise, Chihiro's parents begin eating and then transform into pigs. In this supernatural realm, Chihiro encounters a host of characters and endures labor in a bathhouse for spirits, awaiting a reunion with her parents."));
    movies.add(new Movies(id=5, title="Beetlejuice", release_year=1988, director="Tim Burton", genre="Comedy", synopsis="After Barbara (Geena Davis) and Adam Maitland (Alec Baldwin) die in a car accident, they find themselves stuck haunting their country residence, unable to leave the house. When the unbearable Deetzes (Catherine O'Hara, Jeffrey Jones) and teen daughter Lydia (Winona Ryder) buy the home, the Maitlands attempt to scare them away without success. Their efforts attract Beetlejuice (Michael Keaton), a rambunctious spirit whose \"help\" quickly becomes dangerous for the Maitlands and innocent Lydia."));

   }
   @GetMapping("/peliculas")
   public List<Movies> getMovies() {
       return movies;
   }


@GetMapping("/peliculas/{id}")
public Movies getMovieById(@PathVariable("id") int id) {
    // Method logic to retrieve product details
Movies targetMovie = new Movies(0,"Error",0,"Error","Error","Error");
    for (Movies movie : movies){
        if(movie.getId() == id){
        targetMovie = movie;
        break;
        };
    };
    return targetMovie;

}

}