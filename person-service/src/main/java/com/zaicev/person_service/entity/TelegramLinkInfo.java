package com.zaicev.person_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "telegram_link_info")
public class TelegramLinkInfo extends BaseEntity {

    @Size(max = 128)
    @Column(name = "username", nullable = false, length = 128)
    private String username;

    @Column(name = "chat_id", nullable = false)
    private Long chatId;

}
