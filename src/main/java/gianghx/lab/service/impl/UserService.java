package gianghx.lab.service.impl;

import gianghx.lab.dto.request.UserRequest;
import gianghx.lab.dto.response.UserResponseDto;
import gianghx.lab.entity.User;
import gianghx.lab.repository.UserRepository;
import gianghx.lab.service.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<UserResponseDto> createUser(UserRequest request) {
        try {
            User user = User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .address(request.getAddress())
                .info(request.getInfo())
                .build();
            userRepository.save(user);
            return ResponseEntity.ok(new UserResponseDto(user));
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }

    @Override
    public ResponseEntity<Integer> deleteUser(int id) {
        return ResponseEntity.ok(userRepository.deleteById(id));
    }
}
