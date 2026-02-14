package com.fitness.userservice.model;


import com.fitness.userservice.dto.RegisterRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id ;

    @Column(unique = true, nullable = false)
    private String email ;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String firstname ;
    private String lastname ;

    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;

    @CreationTimestamp
    private LocalDateTime createdAt ;

    @UpdateTimestamp
    private LocalDateTime updatedAt ;


}
