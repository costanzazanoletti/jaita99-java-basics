package org.generation.jaita99.veicoli;

public class Auto extends Veicolo{

  // ATTRIBUTI
  private int numeroPorte;
  // COSTRUTTORI
  public Auto(String targa, int annoImmatricolazione, int numeroPorte) {
    // prima istruzione del costruttore è sempre il super-costruttore
    super(targa, annoImmatricolazione);
    // poi valorizzo gli attributi della sottoclasse
    this.numeroPorte = numeroPorte;
  }
// GETTER E SETTER
  public int getNumeroPorte() {
    return numeroPorte;
  }

  // METODI

  @Override
  public String toString() {
    return "Auto(" + super.toString() + ", Numero di porte: " + numeroPorte +")";
  }
}
