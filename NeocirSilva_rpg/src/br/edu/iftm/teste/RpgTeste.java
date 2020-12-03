package br.edu.iftm.teste;

import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

public class RpgTeste {

 public static void  main (String[] args) throws Exception {
  
    //Jogador (1 Objeto)  
  Jogador Bill = new Jogador(100, "Bill", 70, "Africano");
  
   //Inimigos (2 Objetos)
    Inimigo Lord = new Inimigo("Lord", 100, 90, "Brasileiro");
   Inimigo Bart = new Inimigo("Bart", 100, 65, "japones");
   
   
   //Luta (1 Objeto)
   Luta luta = new Luta();
   luta.enfrentar(Bill, Lord);
   luta.enfrentar(Bart, Lord);    

}
 }