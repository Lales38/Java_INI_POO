package Entity;

import java.util.ArrayList;

/**
  * @author Alejandro
  * la clase Persona con atributos: nombre, apellido, edad, documento y Perro.
 */
public class E1Person {
    
    private String name;
    private String surname;
    private Integer age;
    private Integer dni;    
    private E1Dog dog;

    public E1Person() {
    }

    public E1Person(String name, String surname, Integer age, Integer dni) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dni = dni;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public E1Dog getDog() {
        return dog;
    }

    public void setDog(E1Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "E1Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", dni=" + dni + ", dog=" + dog + '}';
    }

   

   
    
    
    

}
