package develhope.esercizio76aggiungiamohibernateallaappsprintboot.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table
@Data
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentId", nullable = false)
    //@JoinColumn(nullable = false)
    private Students students;

    @OneToOne
    @JoinColumn(name = "classId")
    private Classes classes;
}
