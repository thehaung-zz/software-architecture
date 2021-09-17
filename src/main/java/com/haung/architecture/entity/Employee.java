package com.haung.architecture.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @Author : Hau Nguyen
 * @Created : 9/14/21, Tuesday
 **/

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotBlank(message = "firstName is required")
    @Length(max = 10, min = 2, message = "firstName less than 10 characters and greater than 2 characters")
    private String firstName;

    @Column
    private String lastName;

    @Column
    @Email(message = "emailAddress invalid")
    private String emailAddress;
}
