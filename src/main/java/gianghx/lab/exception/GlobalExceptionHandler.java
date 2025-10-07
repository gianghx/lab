package gianghx.lab.exception;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class JsonResponse{
        private int code;
        private String message;
    }
    @ExceptionHandler(ComonException.class)
    public ResponseEntity<JsonResponse> handleException(ComonException e){
        return new ResponseEntity<>(new JsonResponse(e.getStatus(), e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
