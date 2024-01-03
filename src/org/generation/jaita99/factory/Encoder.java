package org.generation.jaita99.factory;
/* interfaccia che definisce quali funzionalità deve avere un generico Encoder */
public interface Encoder {
  String encode(String s);
  String decode(String encoded);
}
