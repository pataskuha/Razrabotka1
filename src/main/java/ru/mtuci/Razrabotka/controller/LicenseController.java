package ru.mtuci.Razrabotka.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.Razrabotka.model.License;
import ru.mtuci.Razrabotka.model.User;
import ru.mtuci.Razrabotka.service.impl.LicenseService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("licenses")
@RestController
public class LicenseController {
    private final LicenseService licenseService;

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping
    public List<License> getAll() {
        return licenseService.getAll();
    }
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/{id}")
    public License getById(@PathVariable("id") Long id) {
        return licenseService.getById(id);
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/key/{key}")
    public License getByKey(@PathVariable("key") String key) {
        return licenseService.getByKey(key);
    }

    @PreAuthorize("hasAnyAuthority('modification')")
    @PostMapping("/add")
    public void add(@RequestBody License license) {
        licenseService.add(license);
    }
}