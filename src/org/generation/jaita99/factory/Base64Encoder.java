package org.generation.jaita99.factory;

import java.util.Base64;

/* classe che gestisce l'encoding attraverso una codifica base 64 */
public class Base64Encoder implements Encoder{
  // metodo che prende in ingresso la stringa in chiaro e ritorna quella codificata
  public String encode(String s){
    // trasforma la stringa in un array di bytes e li codifica in base 64
    byte[] base64Bytes = Base64.getEncoder().encode(s.getBytes());
    return new String(base64Bytes);
  }

  // metodo che prende in ingresso la stringa codificata e ritorna quella originale
  public String decode(String encoded){
   byte[] decodedBytes =  Base64.getDecoder().decode(encoded.getBytes());
   return new String(decodedBytes);
  }
}
