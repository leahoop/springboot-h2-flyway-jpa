package com.leahoop.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "dept")
@Data
@NoArgsConstructor
public class Dept implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    @NotBlank
    private String name;

    @NotNull
    private Boolean enabled;

    @Column(name = "pid", nullable = false)
    @NotNull
    private Long pid;

    @Column(name = "create_time")
    @CreationTimestamp
    private Timestamp createTime;

}
