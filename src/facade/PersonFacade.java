package facade;

import entity.Person;
import javax.persistence.EntityManagerFactory;

public class PersonFacade extends AbstractFacade<Person>{
    
    public PersonFacade(EntityManagerFactory emf) {
        super(Person.class, emf);
    }
    
}
