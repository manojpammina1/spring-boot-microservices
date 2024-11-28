package com.example.explorecalijpa.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.explorecalijpa.business.TourRatingService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * Tour Rating Controller
 *
 * Created by Mary Ellen Bowman
 */
@RestController
@RequestMapping(path = "/tours/{tourId}/ratings")
public class TourRatingController {
  private TourRatingService tourRatingService;

  public TourRatingController(TourRatingService tourRatingService) {
    this.tourRatingService = tourRatingService;
  }
  
  @PostMapping
  @ResponseStatus(HttpS)
  public String postMethodName(@RequestBody String entity) {
      //TODO: process POST request
      
      return entity;
  }
  
  public void createTourRating(@PathVariable(value = "tourId")int tourId,
                              @RequestBody @Valid RatingDto ratingDto) {

                              }
}
