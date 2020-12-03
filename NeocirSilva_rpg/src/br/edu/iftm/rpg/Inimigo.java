package br.edu.iftm.rpg;

public class Inimigo {
    //Atributos da classe
     private String nome;
     private int vida;
     private int dano;
     private String nacionalidade;
 
     //Metodos Constutores
     public Inimigo(String nome, int vida, int dano, String nacionalidade) {
      this.nome = nome;
      this.vida = vida;
      this.dano = dano;
      this.nacionalidade = nacionalidade;
      
    }
 
     //Metodos especificos da classe
       public void apresentacao(){
       System.out.println("-- INFORMAÇÕES --");
       System.out.println("Nome: " + getNome() );
       System.out.println("Pontos de vida: " + getVida());
       System.out.println("Nacionalidade: " + getNacionalidade());
     }
          
     public void atacar(Jogador jogador){        
        System.out.println("O " + getNome() + " atacou o " + jogador.getNome() + " e causou " + getDano()
        + " de dano! ");
    
    }
     
    public void perderVida(Jogador jogador) {         
    if  (dano >= vida){
      System.out.println("O "+ getNome() + " derrotou o " + jogador.getNome() );
  } else {
    System.out.println(" Apos o ataque de " + getNome() +  ".  Restou para " + jogador.getNome() + " " +  (jogador.getVida() - getDano()) + " pontos de vida!" );        
  }
    
    }

    
    // Getters e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade(){
      return nacionalidade;
    }
}