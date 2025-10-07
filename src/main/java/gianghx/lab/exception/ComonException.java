package gianghx.lab.exception;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
public class ComonException extends RuntimeException {
    private final int status;
    private final String message;

    public ComonException(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
