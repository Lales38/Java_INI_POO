package Entity;

/**
  * @author Alejandro
  * Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
 */
public class E1Dog {
    
    private String name;
    private String breed;
    private Integer age;
    private String size;
    private boolean adoptado= false;

    public E1Dog() {
    }

    public E1Dog(String name, String breed, Integer age, String size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "E1Dog{" + "name=" + name + ", breed=" + breed + ", age=" + age + ", size=" + size + ", adoptado=" + adoptado + '}';
    }
    

    
    
    
    
    
}
