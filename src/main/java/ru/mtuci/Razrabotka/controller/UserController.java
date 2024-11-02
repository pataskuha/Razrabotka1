package ru.mtuci.Razrabotka.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mtuci.Razrabotka.model.User;
import ru.mtuci.Razrabotka.service.impl.UserService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RequestMapping("users")
@RestController
@PreAuthorize("hasAnyRole('ADMIN')")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") UUID id) {
        return userService.getById(id);
    }

    @GetMapping("/name/{name}")
    public User getByName(@PathVariable("name") String name) {
        return userService.getByName(name);
    }

    @PostMapping("/add")
    public void add(@RequestBody User user) {
        userService.add(user);
    }
}