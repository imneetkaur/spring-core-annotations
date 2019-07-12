package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean(name = "movie")
    public Movie getMovie(){
        Movie movie=new Movie();
        movie.setMovieName("Krish11");
        movie.setGenre("Fantasy1");
        movie.setActor(getActor());
        return movie;
    }
    @Bean(name = "movie1")
    public Movie getMovie1(){
        Movie movie=new Movie();
        movie.setMovieName("Krish");
        movie.setGenre("Fantasy");
        movie.setActor(getActor());
        return movie;
    }
    @Bean(name = "actor")
    public Actor getActor(){
        Actor actor=new Actor();
        actor.setName("Hritik");
        actor.setAge(40);
        actor.setGender("Male");
        return actor;
    }
    
}
