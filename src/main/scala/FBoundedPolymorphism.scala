object FBoundedPolymorphism extends App {
  /*
  trait Animal {
    def breed: List[Animal]
  }

  class Cat extends Animal {
    override def breed: List[Animal] = ???
  }

  class Dog extends Animal {
    override def breed: List[Animal] = ???
  }*/
  trait Animal[A <: Animal[A]] { self: A => //recursive type: F-Bounded Polymorphism
    def breed: List[Animal[A]]
  }

  class Cat extends Animal[Cat] {
    override def breed: List[Animal[Cat]] = ???
  }

  class Dog extends Animal[Dog] {
    override def breed: List[Animal[Dog]] = ???
  }
  /*//Will not compile
  class Crocodile extends Animal[Dog] {
    override def breed: List[Animal[Dog]] = ???
  }*/

  class Crocodile extends Animal[Crocodile] {
    override def breed: List[Animal[Crocodile]] = ???
  }
  class Lion extends Animal[Lion] {
    override def breed: List[Animal[Lion]] = ???
  }
  class Tiger extends Animal[Tiger] {
    override def breed: List[Animal[Tiger]] = ???
  }
  class Elephant extends Animal[Elephant] {
    override def breed: List[Animal[Elephant]] = ???
  }
  class Giraffe extends Animal[Giraffe] {
    override def breed: List[Animal[Giraffe]] = ???
  }
  class Penguin extends Animal[Penguin] {
    override def breed: List[Animal[Penguin]] = ???
  }
  class Kangaroo extends Animal[Kangaroo] {
    override def breed: List[Animal[Kangaroo]] = ???
  }
  class Dolphin extends Animal[Dolphin] {
    override def breed: List[Animal[Dolphin]] = ???
  }
  class Eagle extends Animal[Eagle] {
    override def breed: List[Animal[Eagle]] = ???
  }
  class Panda extends Animal[Panda] {
    override def breed: List[Animal[Panda]] = ???
  }
  class Gorilla extends Animal[Gorilla] {
    override def breed: List[Animal[Gorilla]] = ???
  }
  trait Entity[E <: Entity[E]] //ORM
  class Person extends Comparable[Person] { //FBP
    override def compareTo(o: Person): Int = ???
  }
}
