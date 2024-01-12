public class OOP_Player {
    //atribud
    String name, enemy;
    int speed, hp, damage, defense, energy;

    //metot
    void run(){
        if (energy > 10){
            speed += 10;
            energy -= 10;
            hp -= 15;
            System.out.println(name + " is running...");
            System.out.println("Speed +10*");
            System.out.println("Energi -10*\n");
            System.out.println("HP -15*");
            System.out.println("Current speed : " + speed);
            System.out.println("Current energy : " + energy);
            System.out.println("Current HP : " + hp);
            System.out.println("Current damage : " + damage);
            System.out.println("Current defense : " + defense);
        } else {
            System.out.println("Energy not enough. Heal first\n");
        }
    }
    void attack(){
        if (energy > 10) {
            energy -= 10;
            hp -=15;
            System.out.println(name + " is attacking...!");
            System.out.println("Energi -10*\n");
            System.out.println("HP -15*");
            System.out.println("Current speed : " + speed);
            System.out.println("Current energy : " + energy);
            System.out.println("Current HP : " + hp);
            System.out.println("Current damage : " + damage);
            System.out.println("Current defense : " + defense);
        } else {
            System.out.println("Energy not enough. Heal first\n");
        }
    }
    void defend(){
        if (energy > 10){
            energy -= 20;
            System.out.println(name + " is defending...");
            System.out.println("Energi -20*\n");
            System.out.println("Current speed : " + speed);
            System.out.println("Current energy : " + energy);
            System.out.println("Current HP : " + hp);
            System.out.println("Current damage : " + damage);
            System.out.println("Current defense : " + defense);
        } else {
            System.out.println("Energy not enough. Heal first\n");
        }
    }
    void attacked(){
        hp -= 100;
        System.out.println(name + " is attacked by " + enemy + "...!!!");
        System.out.println("HP -100*\n");
    }
    void heal(){
        energy += 20;
        hp += 20;
        speed = 0;
        System.out.println(name + " is healing...");
        System.out.println("HP, Energy +20*");
        System.out.println("Current speed : " + speed);
        System.out.println("Current energy : " + energy);
        System.out.println("Current HP : " + hp);
        System.out.println("Current damage : " + damage);
        System.out.println("Current defense : " + defense);    
        System.out.println("");
    }
    boolean isded(){
        if(hp<=0) return true;
        return false;
    }
}
