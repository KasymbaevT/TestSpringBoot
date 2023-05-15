package peaksoft.entity;

import javax.persistence.*;

import lombok.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@Table(name = "ttt")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String salary;

}
