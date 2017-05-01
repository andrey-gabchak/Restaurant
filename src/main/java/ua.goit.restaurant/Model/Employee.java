package ua.goit.restaurant.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Column(name = "phone")
    private String phoneNumber;

    @Column(name = "salary")
    private Float salary;

    @Column(name = "JOIN_DATE")
    private Date joinDate;

    //    @Enumerated(EnumType.STRING) - Взято с примера, но не подходит, так как для позиции выделен отдельный клас. TODO: Переделать.
    // TODO: Выяснить как передавать связь между классами в DB при помощь hibernate
    private Position position;
}
