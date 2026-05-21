package com.zaicev.person_service.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "persons")
public class Person extends BaseEntity {

    @Size(max = 512)
    @Column(name = "email", nullable = false, unique = true, length = 512)
    private String email;

    @Size(max = 64)
    @Column(name = "first_name", nullable = false, length = 64)
    private String firstName;

    @Size(max = 64)
    @Column(name = "last_name", nullable = false, length = 64)
    private String lastName;

    @OneToOne(optional = false, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "settings_id", nullable = false)
    private PersonSettings settings;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "telegram_link_info_id")
    private TelegramLinkInfo telegramLinkInfo;
}
