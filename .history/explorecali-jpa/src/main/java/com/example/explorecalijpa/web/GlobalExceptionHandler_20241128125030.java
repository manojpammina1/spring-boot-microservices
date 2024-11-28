package com.example.explorecalijpa.web;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Cont
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler  {
 
  
  @ExceptionHandler(NoSuchElementException.class)
  public final ResponseEntiy <Object> handleNoSuchElementException(NoSuchElementException ex, WebRe)

}
