package org.generation.jaita99.veicoli;

public abstract class Veicolo {
  // ATTRIBUTI
  private String targa;
  private int annoImmatricolazione;

  // COSTRUTTORI
  public Veicolo(String targa, int annoImmatricolazione) {
    this.targa = targa;
    this.annoImmatricolazione = annoImmatricolazione;
  }

  // GETTER E SETTER

  public String getTarga() {
    return targa;
  }

  public int getAnnoImmatricolazione() {
    return annoImmatricolazione;
  }

  @Override
  public String toString() {
    return "Targa: " + targa + ", Anno immatricolazione: " + annoImmatricolazione;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Veicolo veicolo = (Veicolo) o;

    return getTarga() != null ? getTarga().equals(veicolo.getTarga()) : veicolo.getTarga() == null;
  }

  @Override
  public int hashCode() {
    return getTarga() != null ? getTarga().hashCode() : 0;
  }
}
