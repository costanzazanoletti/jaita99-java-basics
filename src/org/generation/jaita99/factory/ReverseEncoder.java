package org.generation.jaita99.factory;
/* Classe che gestisce l'encoding tramite inversione dei caratteri */
public class ReverseEncoder implements Encoder{

  // metodo encode che prende la stringa in chiaro e la codifica invertendola e la restituisce
  public String encode(String s){
   // "ciao" -> {'c','i','a','o'}-> "oaic"
    // array di appoggio
    char[] revertedChars = new char[s.length()];
    // contatore per l'array di appoggio
    int j = 0;
    for (int i = s.length()-1; i >= 0; i--) {
      // System.out.println(s.charAt(i));
      // aggiungo il carattere partendo dall'inizio
      revertedChars[j] = s.charAt(i);
      j++;
    }
    return new String(revertedChars);
  }

  // metodo decode che prende la stringa codificata e ritorna la stringa originale
  public String decode(String encodedString){
    // "oaic" -> "ciao"
    return encode(encodedString);
  }

}
