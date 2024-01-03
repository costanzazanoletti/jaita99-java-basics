package org.generation.jaita99.factory;

public class EncoderFactory {
public static Encoder getEncoder(){
  // costruisce un oggetto di tipo Encoder e lo restituisce
  return new Base64Encoder();
}
}
