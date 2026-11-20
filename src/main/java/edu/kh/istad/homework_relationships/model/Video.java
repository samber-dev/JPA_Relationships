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
@Table(name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255)
    private String duration;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "is_published")
    private Boolean isPublished;

    @Column(length = 255)
    private String slug;

    @Column(length = 255)
    private String thumbnail;

    @Column(length = 255)
    private String title;

    @Column(length = 255)
    private String youtube;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "video")
    private List<Comment> comments = new ArrayList<>();

}