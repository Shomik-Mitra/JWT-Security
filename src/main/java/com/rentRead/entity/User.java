package com.rentRead.entity;

import com.rentRead.model.Role;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {

    @Id
    private int id;
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
