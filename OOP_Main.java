import java.util.Scanner;
public class OOP_Main {
    public static void main(String[] args) {
        //buat objek
        OOP_Player player = new OOP_Player();
        Scanner scan = new Scanner(System.in);
        player.damage = 30;
        player.defense = 20;
        player.energy = 50;
        player.hp = 100;
        player.speed = 0;
        int pilih;
        System.out.print("Input player's name : ");
        player.name = scan.nextLine();
        System.out.print("Input enemy's name : ");
        player.enemy = scan.nextLine();
        System.out.println("");
        System.out.println("Take your action!\n1. Run\n2. Attack\n3. Defend\n4. Heal\n");

        for (int i = 0; i < 10; i++){
            System.out.print("Action : ");
            pilih = scan.nextInt();
            if (pilih == 1){
                player.run();
            } else if (pilih == 2){
                player.attack();
            } else if (pilih == 3){
                player.defend();
            } else if (pilih == 4){
                player.heal();
            } else {
                System.out.println("Action not found bruh");
            }
            System.out.println("");
        }    
        player.attacked();
        if(player.isded()){
            System.out.println("modar wkwk");
            System.out.println("You LOSE...???");
        } else {
            System.out.println(player.name + "made a comebackk");
            System.out.println("You WIN...!!!");
        }
    }   
}
        
//ngajien objek
        // OOP_Player player = new OOP_Player();
        // player.name = "Dapin uwu";
        // player.enemy = "Akmal owo";
        // player.speed = 70;
        // player.hp = 10;
        // player.damage = 40;
        // player.energy = 100;
        // player.defense = 20;

        //manggil ran
        //run, attack, defend, heal, attacked
        // player.run();
        // player.attack();
        // player.defend();
        // player.heal();
        // player.isded();
        // player.attacked();

        // //isded
        // 
        //}