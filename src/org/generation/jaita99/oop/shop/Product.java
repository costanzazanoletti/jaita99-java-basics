package org.generation.jaita99.oop.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;


public class Product {
  // ATTRIBUTI
  private int code;
  private String name;
  private String description;

 private BigDecimal price;
 private BigDecimal vat;

 private Category category;


  // COSTRUTTORI
  public Product(){
    this.code = generateCode();
  }

  public Product(String name, String description, BigDecimal price, BigDecimal vat, Category category) {
    this.code = generateCode();
    this.name = name;
    this.description = description;
    this.price = price;
    this.vat = vat;
    this.category = category;
  }
  // GETTER e SETTER

  public int getCode() {
    return code;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public BigDecimal getVat() {
    return vat;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public void setVat(BigDecimal vat) {
    this.vat = vat;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  // METODI
  // metodo che calcola il prezzo con iva
  // 1) livello di accesso, 2) tipo di dato di ritorno, 3) nome del metodo 4) parametri
  public BigDecimal getFullPrice(){
    // double fullPrice = price + price*vat;
    BigDecimal vatOnPrice = price.multiply(vat);
    return price.add(vatOnPrice).setScale(2, RoundingMode.HALF_EVEN);
  }
  // metodo che restituisce il nome completo codice + nome
  public String getFullName(){
    return code + " " + name;
  }
  // metodo che genera un numero random da assegnare al codice
  private int generateCode(){
    Random randomGenerator = new Random();
    return randomGenerator.nextInt(0, 10000);
  }

  // facciamo il toString che mi restituisce nome completo + prezzo in euro + categoria
  @Override
  public String toString(){
    return getFullName() + ": " + getFullPrice() + "€ ("+ category.getName() +")";
  }
}
