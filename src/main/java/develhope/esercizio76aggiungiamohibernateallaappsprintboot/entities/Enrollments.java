package develhope.esercizio76aggiungiamohibernateallaappsprintboot.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;


@Entity
@Table
@Data
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Students students;

    @ManyToMany
    private List<Classes> classes;
}
