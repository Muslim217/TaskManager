package com.itzavod.taskmanager.controller;

import com.itzavod.taskmanager.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user") // Базовый путь для контроллера
public class UserController {


    @PostMapping // Создание пользователя
    public ResponseEntity<String> createUser(@RequestBody User user) {
        // Сохранение пользователя
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
    }

    @GetMapping("/login") // Логин пользователя
    public ResponseEntity<String> loginUser(@RequestParam String username, @RequestParam String password) {
        /*// boolean success = userService.login(username, password); // Проверка логина
        if (success) {
            return ResponseEntity.ok("User logged in successfully");
        } else {*/
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");

    }

    @GetMapping("/logout") // Выход пользователя
    public ResponseEntity<String> logoutUser() {
        //userService.logout(); // Логика выхода
        return ResponseEntity.ok("User logged out successfully");
    }

    @GetMapping("/{id}") // Получение пользователя по ID
    public ResponseEntity<User> getUserById(@PathVariable Long id) {

        return ResponseEntity.notFound().build(); // Возвращаем статус 404 Not Found
    }


    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody User user) {
        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {

        return ResponseEntity.notFound().build();

    }
}