package ru.mtuci.Razrabotka.service.impl;

import ru.mtuci.Razrabotka.model.License;
import ru.mtuci.Razrabotka.model.User;

import java.util.List;

public interface LicenseService {
    void add(License license);

    List<License> getAll();

    License getById(Long id);

    License getByKey(String key);
}