package org.generation.jaita99.veicoli;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {
  // ATTRIBUTI
  private List<Veicolo> veicoli;

  /*private int contatoreAuto;
  private int contatoreMoto;*/

  // COSTRUTTORE
  public GestoreFlotta() {
    // inizializzo la lista veicoli come una lista vuota
    veicoli = new ArrayList<>();
  }

  // METODI
  // metodo per aggiungere un veicolo alla flotta
  // BONUS: verificare che non esista già nella lista un veicolo con quella targa
  public void aggiungiVeicolo(Veicolo veicolo){
/*    // cerco il veicolo in base alla targa
    Veicolo veicoloEsistente = trovaVeicolo(veicolo.getTarga());
    // se il veicolo trovato è diverso da null allora esiste già
    if(veicoloEsistente != null){
      // sollevo una eccezione
      throw new TargaEsistenteException(veicolo.getTarga());
    }*/

    if(veicoli.contains(veicolo))
      throw new TargaEsistenteException(veicolo.getTarga());
    // procedo ad aggiungere il veicolo
    veicoli.add(veicolo);

/*    if(veicolo instanceof Auto)
      contatoreAuto++;
    if(veicolo instanceof Motocicletta)
      contatoreMoto++;*/
  }

  // contare quanti veicoli ci sono di un determinato tipo (automobile o motocicletta)

  public int getNumeroAuto(){
    int contatore = 0;
    for (Veicolo veicolo : veicoli){
      if(veicolo instanceof Auto){
        contatore++;
      }
    }
    return contatore;
  }

  public int getNumeroMoto(){

    return veicoli.size() - getNumeroAuto();

    /*int contatore = 0;
    for(Veicolo veicolo : veicoli){
      if(veicolo instanceof Motocicletta){
        contatore++;
      }
    }
    return contatore;*/
  }

  /*public int getContatoreAuto() {
    return contatoreAuto;
  }

  public int getContatoreMoto() {
    return contatoreMoto;
  }*/

  // trovare un veicolo specifico tramite il numero di targa
  public Veicolo trovaVeicolo(String numeroTarga){

    // per ogni veicolo nella lista di veicoli confronto la targa presa come parametro con quella del veicolo
    for(Veicolo veicolo : veicoli){
      if(veicolo.getTarga().equals(numeroTarga)){
       return veicolo;
      }
    }
    return null;
  }
}
