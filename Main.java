 class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
	
}// Cat.java
 class Cat extends Animal {
	 
    public void makeSound() {
        System.out.println("The cat quarrels.");
    }
}
// Main.java
 class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();        
        animal.makeSound();
        cat.makeSound();
    }
}
