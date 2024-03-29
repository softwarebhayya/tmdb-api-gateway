package com.softwarebhayya.tmdb.model;

import lombok.Data;

@Data
public class MovieRating {
    private Movie movie;
    private Rating rating;

}
