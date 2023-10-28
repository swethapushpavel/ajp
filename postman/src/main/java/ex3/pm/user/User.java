package ex3.pm.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Blog3")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String username;
    private String movie;
    private String time;
    private String screen; 
}

