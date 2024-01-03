package org.generation.jaita99.factory;

import java.util.Base64;
import java.util.Scanner;

public class PasswordManager {
/* chiediamo all'utente di darci la sua password e la codifichiamo */
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Your password: ");
  String password = scanner.nextLine();
  // istanzio un Encoder
  Encoder encoder = EncoderFactory.getEncoder();
  // codifico la password
  String encodedPassword = encoder.encode(password);
  // decodifico la password codificata
  String decodedPassword = encoder.decode(encodedPassword);
  System.out.println("Encoded password: " + encodedPassword);
  System.out.println("Decoded password: " + decodedPassword);



  // encode password with ReverseEncoder
  /*ReverseEncoder reverseEncoder = new ReverseEncoder();
  String encoded = reverseEncoder.encode(password);
  String decoded = reverseEncoder.decode(encoded);
  // print encoded password
  System.out.println("Encoded password: " + encoded);
  System.out.println("Decoded password: " + decoded);

  // encode password with Base64Encoder
  Base64Encoder base64Encoder = new Base64Encoder();
  String base64Encoded = base64Encoder.encode(password);
  String base64Decoded = base64Encoder.decode(base64Encoded);
  // print encoded password
  System.out.println("Encoded password: " + base64Encoded);
  System.out.println("Decoded password: " + base64Decoded);*/



  scanner.close();
}


}
