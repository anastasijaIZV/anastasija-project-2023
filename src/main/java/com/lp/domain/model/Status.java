package com.lp.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "status", catalog = "testdb")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status extends AbstractEntity {
    @Enumerated(EnumType.STRING)
    @Column(unique = true)
    private StatusEnum name;
}
