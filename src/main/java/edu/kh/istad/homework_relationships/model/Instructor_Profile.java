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
@Table(name = "instructor_profiles")
public class Instructor_Profile {

    @Id
    @Column(name = "user_id", nullable = false, length = 255)
    private String userId;

    @Column(length = 255)
    private String biography;

    @Column(name = "facebook_link", length = 255)
    private String facebookLink;

    @Column(name = "github_link", length = 255)
    private String githubLink;

    @Column(name = "job_title", length = 255)
    private String jobTitle;

    @Column(name = "phone_number", length = 255)
    private String phoneNumber;

    @OneToMany(mappedBy = "instructor")
    private List<Course> courses = new ArrayList<>();
}