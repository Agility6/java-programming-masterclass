package encapsulation;

import java.beans.EventHandler;

public class Main {
    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        player.loseHealth(10);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 100; // 没有通过restoreHealth进行修改health

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Tim Remaining = " + tim.healthRemaining());
    }
}
