package games;

public class Main {
	
    public static void main(String[] args) {
    	
        Player1 player1 = new Player1("Dhoolika","sword",100);
        System.out.println(player1.getName());
        System.out.println(player1.getHealth());
        System.out.println(player1.getWeapon());
        
        Player2 player2 = new Player2("Bhriti", "bow and Arrow", 90);
        System.out.println(player2.getName());
        System.out.println(player2.getHealth());
        System.out.println(player2.getWeapon());
        
   }

}
