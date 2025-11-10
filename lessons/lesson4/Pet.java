public class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(name + " dice: miau!");
    }

    public void birthday() {
        age++;
        System.out.println(name + " hoy cumple años, ahora tiene " + age + " años.");
    }

    public void greetOwner(String owner) {
        this.owner = owner;
        System.out.println("Hola " + owner + ", soy " + name + ".");
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Pet{name='" + name + "', age=" + age + ", owner='" + owner + "'}";
    }
}
