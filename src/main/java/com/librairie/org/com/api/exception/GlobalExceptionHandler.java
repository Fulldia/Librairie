package com.librairie.org.com.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LivreNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleLivreNotFound(LivreNotFoundException ex) {
        ErrorResponse error = new ErrorResponse(HttpStatus.NOT_FOUND.value(),
                                                "Aucun livre trouvé",
                                                ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }    

    // Classe interne pour la structure JSON
    static class ErrorResponse {
        private int status;
        private String error;
        private String message;

        public ErrorResponse(int status, String error, String message) {
            this.status = status;
            this.error = error;
            this.message = message;
        }

        public int getStatus() { return status; }
        public String getError() { return error; }
        public String getMessage() { return message; }
    }
}