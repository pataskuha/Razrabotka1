package ru.mtuci.Razrabotka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mtuci.Razrabotka.model.User;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByName(String name);
    Optional<User> findByLogin(String login);

}