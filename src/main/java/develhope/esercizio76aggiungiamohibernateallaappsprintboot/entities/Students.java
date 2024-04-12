package develhope.esercizio76aggiungiamohibernateallaappsprintboot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String firstName;

    @Column(unique = true, name = "userEmail", length = 100, nullable = false)
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "students")
    private List<Enrollments> enrollmentsList;
}