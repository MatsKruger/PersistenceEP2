package facade;

import entity.Student;
import javax.persistence.EntityManagerFactory;

public class StudentFacade extends AbstractFacade<Student>{
    
    public StudentFacade(EntityManagerFactory emf) {
        super(Student.class, emf);
    }
    
}
