package br.edu.iftm.rpg;

public class Luta {
   
	//Metodos especificos da classe
    public void enfrentar(Jogador bill, Inimigo lord){
    lord.apresentacao();
    System.out.println("");
    bill.apresentacao();
    System.out.println("");
    

    lord.atacar(bill);
    System.out.println();
    bill.atacar(lord);
    System.out.println();
    lord.perderVida(bill );
    System.out.println();        
    bill.perderVida(lord);
    System.out.println("");    
        
    }

	public void enfrentar(Inimigo bart, Inimigo lord) {
	}

}
