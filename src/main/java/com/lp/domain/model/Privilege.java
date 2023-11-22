package com.lp.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "privilege", catalog = "testdb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Privilege extends AbstractEntity {
    private String name;

    @ManyToMany(mappedBy = "privileges")
    private Collection<Role> roles;
}
