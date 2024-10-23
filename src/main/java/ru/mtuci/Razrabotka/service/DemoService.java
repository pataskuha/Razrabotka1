package ru.mtuci.Razrabotka.service;

import ru.mtuci.Razrabotka.model.Demo;

import java.util.List;

public interface DemoService {
    void save(Demo demo);
    List<Demo> findAll();
    Demo findById(long id);
}
