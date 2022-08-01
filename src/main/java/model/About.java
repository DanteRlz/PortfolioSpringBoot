
package model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter @Setter
@Entity

public class About {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String history;
    @Column
    private String experience;
    @Column
    private String skills;
    
    public About(Long id, String history, String experience, String skills) {
        this.id = id;
        this.history = history;
        this.experience = experience;
        this.skills = skills;
    }
}