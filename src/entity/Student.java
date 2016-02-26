package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;

@Entity
public class Student extends Person implements Serializable {
    
    private int matNr;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date matDate;
        
}
