package gianghx.lab.service;

import gianghx.lab.dto.request.UserRequest;
import gianghx.lab.dto.response.UserResponseDto;
import org.springframework.http.ResponseEntity;

public interface IUserService {
    ResponseEntity<UserResponseDto> createUser(UserRequest user);
    ResponseEntity<Integer> deleteUser(int id);
}
