package it.unisa.diem.oop.persone;

public class Persona {

  private String nome;
  private String cognome;
  private String codFiscale;

  public Persona(String nome, String cognome, String codFiscale) {
    this.nome = nome;
    this.cognome = cognome;
    this.codFiscale = codFiscale;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCognome() {
    return this.cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public String getCodFiscale() {
    return this.codFiscale;
  }

  public void setCodFiscale(String codFiscale) {
    this.codFiscale = codFiscale;
  }

  // è buona norma, ridefinendo la funzione, aggiungere l'annotation '@Override'
  @Override
  public String toString() {
    return "***\n" +
        "Nome: " + nome +
        "\nCognome: " + cognome +
        "\nCodice Fiscale: " + codFiscale + "\n";
  }

}
