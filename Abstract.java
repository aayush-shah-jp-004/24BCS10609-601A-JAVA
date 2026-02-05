abstract class Animal{
      abstract void sound();
      abstract void move();
      abstract void eat();

      void sleep(){
            System.out.println("Animal is sleeping");
      }
      void breathe(){
            System.out.println("Animal is breathing");
      }
}

class Dog extends Animal{
      void sound(){
            System.out.println("Dog barks");
      }
      void move(){
            System.out.println("Dog runs");
      }
      void eat(){
            System.out.println("Dog eats food");
      }
}

public class Abstract {
      public static void main(String[] args) {
            Dog d = new Dog();
            d.sound();
            d.move();
            d.eat();
            d.sleep();
            d.breathe();
      }
}
