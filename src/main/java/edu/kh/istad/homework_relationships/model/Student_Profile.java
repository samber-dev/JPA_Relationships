package edu.kh.istad.homework_relationships.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student_profiles")
public class Student_Profile {

    @Id
    @Column(name = "user_id", nullable = false, length = 255)
    private String userId;

    @Column(length = 255)
    private String biography;

    @Column(name = "facebook_link", length = 255)
    private String facebookLink;

    @Column(name = "github_link", length = 255)
    private String githubLink;

    @Column(length = 255)
    private String major;

    @Column(name = "phone_number", length = 255)
    private String phoneNumber;

    @Column(length = 255)
    private String university;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments = new ArrayList<>();

}