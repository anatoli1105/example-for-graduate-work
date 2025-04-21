package ru.skypro.homework.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.Login;
import ru.skypro.homework.service.AuthService;

@RestController
@RequestMapping("/user")
public class UserController {


    @PostMapping("/set_password")

    @GetMapping("/me")
    public ResponseEntity<?> get(@RequestBody Login login) {
        return null;
    }


    @PatchMapping("/me")
    @PatchMapping("/me/image")
}
