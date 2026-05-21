package com.zaicev.person_service.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "person_settings")
public class PersonSettings extends BaseEntity {

    @NotNull
    @ColumnDefault("true")
    @Column(name = "notification_enable", nullable = false)
    private boolean notificationEnable;

    @NotNull
    @ColumnDefault("0")
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "notification_statistics_frequency", nullable = false)
    private NotificationStatisticsFrequency notificationStatisticsFrequency;

    @NotNull
    @ColumnDefault("0")
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "notification_service", nullable = false)
    private NotificationService notificationService;
}
