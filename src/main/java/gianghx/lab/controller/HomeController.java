package gianghx.lab.controller;

import gianghx.lab.dto.response.HelloResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/live-check")
    private String liveCheck(){
        return "Server is running... ";
    }

    @GetMapping("/hello")
    private ResponseEntity<?> hello(HttpServletRequest request){
        String auth = request.getHeader("Authorization");

        return ResponseEntity.ok(new HelloResponse("msg","stt").toString());
    }
}
