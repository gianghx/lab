package gianghx.lab.dto.response;

import lombok.Data;

@Data
public class HelloResponse {
    private String message;
    private String status;

    public HelloResponse(String message, String status) {
        this.message = message;
        this.status = status;
    }

    @Override
    public String toString() {
        return "HelloResponse{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
