package br.com.cotiinformatica.application.handlers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class IllegalArgumentExceptionHandler {
   @ExceptionHandler(IllegalArgumentException.class)
   public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
       return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro: " + ex.getMessage());
   }
}







