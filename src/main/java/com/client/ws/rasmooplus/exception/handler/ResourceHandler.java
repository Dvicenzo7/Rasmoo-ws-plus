package com.client.ws.rasmooplus.exception.handler;

import com.client.ws.rasmooplus.exception.BadRequestException;
import com.client.ws.rasmooplus.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //Para pegar os erros das exceptions
public class ResourceHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> NotFoundException(NotFoundException n){
        String errorMensagem = n.getMessage();
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMensagem);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<String> NotFoundException(BadRequestException b){
        String errorMensagem = b.getMessage();
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMensagem);
    }

}
