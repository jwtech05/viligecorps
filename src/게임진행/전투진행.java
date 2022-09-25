import 등장인물.*;

import java.util.Random;
import java.util.Scanner;


public class 전투진행 {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void 전투(자경단 player, 빌런 monster){

        boolean flag = true;

        while(flag) {
            //물약사용
            System.out.println();
            System.out.println("▻ " + player.이름 + "님의 공격 차례입니다.");
            System.out.println();
            if (player instanceof 운동을배운자경단) {
                flag = ((운동을배운자경단) player).스킬사용여부(monster);
            } else {
                flag = player.공격(monster);
            }
            if(!flag) return;
            System.out.println();
            System.out.println("► " + monster.이름 + "의 공격입니다.");
            System.out.println();
            int 확률 = rd.nextInt(2) + 1;
            if (monster instanceof 빌런2) {
                ((빌런2) monster).스킬사용여부(player);
            } else {
                flag = monster.공격(player);
            }
            if(!flag) return;
        }


    }
}
