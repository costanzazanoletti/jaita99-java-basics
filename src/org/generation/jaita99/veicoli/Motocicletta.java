package org.generation.jaita99.veicoli;

public class Motocicletta extends Veicolo{
  // ATTRIBUTI
  private boolean haCavalletto;
// COSTRUTTORI
  public Motocicletta(String targa, int annoImmatricolazione, boolean haCavalletto) {
    super(targa, annoImmatricolazione);
    this.haCavalletto = haCavalletto;
  }
// GETTER E SETTER
  public boolean isHaCavalletto() {
    return haCavalletto;
  }

  // METODI

  @Override
  public String toString() {
    return "Motocicletta (" + super.toString() + ", " + (haCavalletto ? "con cavalletto " : "senza cavalletto") + ")";
  }
}
