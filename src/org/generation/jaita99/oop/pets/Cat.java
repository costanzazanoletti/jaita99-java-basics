package org.generation.jaita99.oop.pets;

public class Cat {
  // ATTRIBUTI
  String breed;
  int age;
  String gender;
  String name;

  // COSTRUTTORI
 Cat(String breed, int age, String gender, String name) {
    this.breed = breed;
    this.age = age;
    this.gender = gender;
    this.name = name;
  }

  // METODI
  // metodo che incrementa l'età dell'oggetto
  void grow(){
   age++;
  }


  // metodo che rappresenta come stringa i dati dell'oggetto
  @Override
  public String toString() {
    return "Cat{" +
        "breed='" + breed + '\'' +
        ", age=" + age +
        ", gender='" + gender + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
