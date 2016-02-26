package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.Transient;

@Entity
// Jeg vælger JOINED fordi de Student og Employee er tilpas forskellige, så her vil det give mening at skille ad.
@Inheritance(strategy = InheritanceType.JOINED)
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String firstName;
    private String lastName;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthDate;
    
    @Transient
    private int age;
            
    @OneToOne
    private Grade grade;
    
    private boolean isMarried;
    
    @OneToMany(mappedBy = "superviser")
    private List<Person> supervisees;
    
    @ManyToOne
    private Person superviser;
    
    

    public Person() {
    }

    public Person(String firstName, String lastName, Date birthDate, Grade grade, boolean isMarried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.grade = grade;
        this.isMarried = isMarried;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public List<Person> getSupervisees() {
        return supervisees;
    }

    public void addSupervisee(Person supervisee) {
        this.supervisees.add(supervisee);
    }

    public Person getSuperviser() {
        return superviser;
    }

    public void setSuperviser(Person superviser) {
        this.superviser = superviser;
    }
    
}
