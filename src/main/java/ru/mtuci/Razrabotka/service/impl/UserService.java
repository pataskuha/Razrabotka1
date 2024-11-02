package ru.mtuci.Razrabotka.service.impl;

import ru.mtuci.Razrabotka.model.User;
import ru.mtuci.Razrabotka.exception.UserAlreadyCreate;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAll();
    void add(User user);
    User getById(UUID id);
    User getByName(String name);

    void create(String email, String name, String password) throws UserAlreadyCreate;
}