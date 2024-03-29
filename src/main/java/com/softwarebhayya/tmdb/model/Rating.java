package com.softwarebhayya.tmdb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    private Long id;

    private String name;

    private double avgRating;

    private int count;
}
