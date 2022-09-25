import 등장인물.*;

import java.util.Scanner;

public class 전직 {

    public 자경단 전직하기(자경단 player, int 정화도){

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        if(정화도 > 30) {
            System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶전직◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀");
            System.out.println();
            System.out.println("▻ 어서오세요. 전직을 할 수 있는 공간입니다.");
            System.out.println("▻ 전직을 하실 수 있는 직업은 총 세개 입니다. 한 번 전직을 하시면 되돌릴 수 없으니 신중하게 골라주세요.");
            System.out.println("▻ 선택을 해서 각 직업의 특성을 먼저 볼 수 있습니다.");
            System.out.println();
            System.out.println("1.복싱을배운자경단");
            System.out.println("설명 : 회원님의 자경단이 복싱을 새롭게 배우게 됩니다.");
            System.out.println("      복싱을 배움으로써 공격력이 강해지며 공격 위주의 스킬을 얻게 됩니다.");
            System.out.println();
            System.out.println("2.주짓수배운자경단");
            System.out.println("설명 : 회원님의 자경단이 주짓수를 새롭게 배우게 됩니다.");
            System.out.println("      복싱을 배움으로써 공격력과 체력이 강해지며 흡수 위주의 스킬을 얻게 됩니다.");
            System.out.println();
            System.out.println("3.발레를배운자경단");
            System.out.println("설명 : 회원님의 자경단이 발레를 새롭게 배우게 됩니다.");
            System.out.println("      복싱을 배움으로써 전체적인 능력치가 골고로 강해지며 디버프 위주의 스킬을 얻게 됩니다.");
            System.out.println();
            while(flag) {
                System.out.print("선택 :");
                int 선택 = sc.nextInt();

                if (선택 == 1) {
                    player.해제(0);
                    player.해제(1);
                    복싱을배운자경단();
                    return new 복싱을배운자경단(player.이름, player.공격력+30, player.방어력+5, player.체력+50, player.마력+30);
                } else if (선택 == 2) {

                    player.해제(0);
                    player.해제(1);
                    주짓수배운자경단();
                    return new 주짓수배운자경단(player.이름, player.공격력+20, player.방어력+10, player.체력+100, player.마력+30);
                } else if (선택 == 3) {

                    player.해제(0);
                    player.해제(1);
                    발레를배운자경단();
                    return new 발레를배운자경단(player.이름, player.공격력+15, player.방어력+15, player.체력+50, player.마력+40);
                } else {
                    System.out.println("없는 번호 입니다. 다시선택해주세요.");
                }
            }
        }else{
            System.out.println("▻ 정화도가 부족해서 아직 전직을 하실 수 없으신 상태입니다.");
        }
        return player;
    }

    void 복싱을배운자경단(){

    }

    void 주짓수배운자경단(){

    }

    void 발레를배운자경단(){

    }



}
