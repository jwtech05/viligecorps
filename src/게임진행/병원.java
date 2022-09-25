import 등장인물.*;

import java.util.Scanner;

public class 병원 {

    Scanner sc = new Scanner(System.in);

    public void 병원가기(자경단 player, int 정화도){

        System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶병원◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀");

        System.out.println("▻ 병원에 입장하셨습니다.");
        System.out.println("▻ 현재 정화도에 따라 갈 수 있는 병원이 다릅니다.");
        System.out.println("*정화도 0 : 일차병원" );
        System.out.println("설명 : 체력을 50 회복시켜줍니다.");
        System.out.println();
        System.out.println("*정화도 30 이상 : 종합병원");
        System.out.println("설명 : 체력을 100 마력을 30 회복시켜줍니다.");
        System.out.println();
        System.out.println("*정화도 60 이상 : 대학병원" );
        System.out.println("설명 : 체력과 마력을 모두 회복시켜줍니다.");
        System.out.println();
        System.out.println("1.일차병원\t2.종합병원\t3.대학병원");
        System.out.print("번호 : ");
        int 번호 = sc.nextInt();
        if(번호 == 1){
            일차병원(player);
        }else if(번호 == 2 && 정화도 >= 30){
            종합병원(player);
        }else if(번호 == 3 && 정화도 >= 60){
            대학병원(player);
        }else{
            System.out.println("▻ 정화도가 부족하여 들어가실수 없습니다.");
        }
    }

    public void 일차병원(자경단 player){
        System.out.println("▻ 어서오세요 치료를 진행하겠습니다.");
        player.체력 = Math.min(player.체력+50, player.최대체력);
        System.out.println("▻ 치료가 완료되었습니다. 언제나 회복이 필요하면 찾아주세요.");
        System.out.println("▻ 현재 체력 : "+ player.체력);
    }

    public void 종합병원(자경단 player){
        System.out.println("▻ 어서오세요 치료를 진행하겠습니다.");
        player.체력 = Math.min(player.체력+100, player.최대체력);
        player.마력 = Math.min(player.마력+30, player.최대마력);
        System.out.println("▻ 치료가 완료되었습니다. 언제나 회복이 필요하면 찾아주세요.");
        System.out.println("▻ 현재 체력 : "+ player.체력);
        System.out.println("▻ 현재 마력 : "+ player.마력);
    }

    public void 대학병원(자경단 player){
        System.out.println("▻ 어서오세요 치료를 진행하겠습니다.");
        player.체력 = player.최대체력;
        player.마력 = player.최대마력;
        System.out.println("▻ 치료가 완료되었습니다. 언제나 회복이 필요하면 찾아주세요.");
        System.out.println("▻ 현재 체력 : "+ player.체력);
        System.out.println("▻ 현재 마력 : "+ player.마력);
    }

}
