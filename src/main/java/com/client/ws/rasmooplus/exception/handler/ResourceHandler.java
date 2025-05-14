package com.client.ws.rasmooplus.exception.handler;

import com.client.ws.rasmooplus.dto.error.ErrorResponseDto;
import com.client.ws.rasmooplus.exception.BadRequestException;
import com.client.ws.rasmooplus.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //Para pegar os erros das exceptions
public class ResourceHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponseDto> NotFoundException(NotFoundException n){
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setHttpStatus(HttpStatus.NOT_FOUND);
        errorResponseDto.setMessage(n.getMessage());
        errorResponseDto.setStatusCode(HttpStatus.NOT_FOUND.value());
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponseDto);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponseDto> NotFoundException(BadRequestException b){
        ErrorResponseDto errorResponseDto = new ErrorResponseDto();
        errorResponseDto.setHttpStatus(HttpStatus.BAD_REQUEST);
        errorResponseDto.setMessage(b.getMessage());
        errorResponseDto.setStatusCode(HttpStatus.BAD_REQUEST.value());
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponseDto);
    }

}
