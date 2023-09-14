package telecom.ERT.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.FileNotFoundException;

@ControllerAdvice
public class FileExceptionHandler {

    @ExceptionHandler(FileNotFoundException.class)
    public ResponseEntity<String> handleFileNotFoundException(FileNotFoundException ex) {
        // Handle the FileNotFoundException and return an appropriate response
        return new ResponseEntity<>("File not found: " + ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
