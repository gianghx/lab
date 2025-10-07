package gianghx.lab.controller;

import gianghx.lab.dto.request.UserRequest;
import gianghx.lab.dto.response.UserResponseDto;
import gianghx.lab.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user-management")
@Slf4j
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("create-user")
    public ResponseEntity<UserResponseDto> createUser(UserRequest request) {
        return userService.createUser(request);
    }

    @DeleteMapping("delete-user")
    public ResponseEntity<Integer> deleteUser(int id) {
        return userService.deleteUser(id);
    }
}
