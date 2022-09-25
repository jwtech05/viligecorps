import 등장인물.*;
import 맵.*;

import java.util.Scanner;

public class 던전 {

    Scanner sc = new Scanner(System.in);
    전투진행 battle = new 전투진행();
    분수광장 fountain = new 분수광장();
    담배골목 cigar = new 담배골목();
    오토바이 motor = new 오토바이();

    int 정화도 = 50;

    int 목표정화도 = 100;

    public void 정화도(){
        System.out.println();
        System.out.println("▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁");
        System.out.println("현재 부평 정화도 : "+ 정화도+" / "+ 목표정화도);
        System.out.println("▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁▶◁");
        System.out.println();
    }


    public void 던전입장(자경단 player){
        정화도();
        System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶부평역◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀");
        System.out.println();
        System.out.println("▻ 부평의 시작인 부평역에 도착했습니다.");
        System.out.println("▻ 이제 부평에서 사건사고가 일어나는 곳에 가서 그곳의 빌런들을 잡아야됩니다.");
        System.out.println("▻ 각 맵별로 특징이 있으며, 특정맵은 일정 정화도 이상을 획득해야 입장하실수 있습니다.");
        System.out.println();
        System.out.println("<<던전>>");
        System.out.println("1. 문화의 거리");
        System.out.println();
        System.out.println("설명 : 주로 학생들이 문화생활을 하는 공간입니다. 그러다 보니 질 안좋은 학생들이 많습니다.");
        System.out.println("      학생들을 제압하여 올바른 방향으로 나아갈 수 있게 도와주세요.");
        System.out.println("▻ 필요 정화도 : 0");
        System.out.println();
        System.out.println();
        System.out.println("2. 테마의 거리");
        System.out.println();
        System.out.println("설명 : 술집거리가 모여있는 공간입니다. 그러다 보니 술먹고 행패를 부리는 사람이나 질 안좋은 사람들이 많습니다.");
        System.out.println("      이들을 제압하여 부평에서는 행패를 부릴 수 없게 만들어주세요.");
        System.out.println("▻ 필요 정화도 : 50");
        System.out.println();
        System.out.println("던전에 들어가시겠습니까?");
        System.out.print("번호 : ");
        int 번호 = sc.nextInt();
        if(번호 == 1){
            문화의거리(player);
        }else if(번호 == 2){
            if(정화도 < 50){
                System.out.println("아직 정화도가 기준을 충족하지 못해서 입장할 수 없습니다.");
            }else{
                테마의거리(player);
            }
        }else{
            System.out.println("던전에서 나가집니다.");
        }
    }

    public void 문화의거리(자경단 player){
        player.능력치임시저장(player.공격력, player.방어력);
        System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶문화의거리◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀");
        System.out.println();
        System.out.println("▻ 학생들의 주 터전인 문화의 거리에 입장하셨습니다.");
        System.out.println("▻ 테마의 거리에서 불량한 학생들이 모여있는 스팟이 있습니다.");
        System.out.println("▻ 원하는 장소에 입장해서 불량한 학생들을 선도해주세요.");
        System.out.println();
        System.out.println("1.분수광장\t2.담배골목\t3.오토바이");
        System.out.print("번호 : ");
        int 번호 = sc.nextInt();
        if(번호 == 1){
            fountain.맵입장();
            빌런 villain = fountain.몬스터등장();
            battle.전투(player, villain);
        }else if(번호 == 2){
            cigar.맵입장();
            빌런 villain = cigar.몬스터등장();
            battle.전투(player, villain);
        }else if(번호 == 3){
            motor.맵입장();
        }else{
            System.out.println("없는 선택지입니다. 던전에서 나가집니다.");
        }
        player.원상복구();
    }

    public void 테마의거리(자경단 player){

        System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶테마의거리◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀");
        System.out.println();
        System.out.println("▻ 부평의 술집이 모여있는 테마의 거리에 입장하셨습니다.");
        System.out.println("▻ 테마의 거리에서는 술 취하거나 질 나쁜 사람들이 많습니다.");
        System.out.println("▻ 그런 사람들을 찾아서 귀가 조치시켜 거리를 깨끗하게 만들어주세요.");
        System.out.println();
        System.out.println("1.술집앞\t2.모텔촌\t3.클럽앞");
        System.out.print("번호 : ");
        int 번호 = sc.nextInt();
        if(번호 == 1){

        }else if(번호 == 2){

        }else if(번호 == 3){

        }else{
            System.out.println("없는 선택지입니다. 던전에서 나가집니다.");
        }
    }
}
