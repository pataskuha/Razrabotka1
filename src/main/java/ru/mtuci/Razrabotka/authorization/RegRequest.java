package ru.mtuci.Razrabotka.authorization;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class RegRequest {
    private String login;
    private String name;
    private String password;
}