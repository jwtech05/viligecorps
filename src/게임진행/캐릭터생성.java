import 등장인물.자경단;

import java.util.Random;
import java.util.Scanner;

public class 캐릭터생성 {
    Scanner sc = new Scanner(System.in);

    public 자경단 캐릭터생성(String 이름){

        boolean flag = true;
        System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶캐릭터생성◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀");
        System.out.println();
        System.out.println("어서오세요 "+이름+"님. 게임을 시작하기 전에 거리를 지킬 회원님의 자경단의 생성해야합니다.");
        System.out.println("능력치는 랜덤으로 설정되며, 회원님이 마음에 드는 능력치가 나올때까지 재설정 할 수 있습니다.");
        System.out.println();
        while(flag){
            System.out.println("입력창에 <<생성>>을 입력해주세요.");
            System.out.print("입력 : ");
            String 입력 = sc.next();
            if(입력.equals("생성")){
                flag = false;
                return 능력치생성(이름);
            }else{
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
        return 능력치생성(이름);
    }

    public 자경단 능력치생성(String 이름){

        Random rd = new Random();
        boolean flag = true;

        int 공격력 = 0;
        int 방어력 = 0;
        int 체력 = 0;
        int 마력 = 0;

        while(flag) {

            int 능력치 = rd.nextInt(10)+10;
            공격력 = 능력치;

            능력치 = rd.nextInt(10)+10;
            방어력 = 능력치;

            능력치 = rd.nextInt(50)+100;
            체력 = 능력치;
            System.out.println();
            System.out.println("자경단이 생성되었습니다. 현재 능력치로 진행하시려면 확정을 선택하세요.");
            System.out.println();
            System.out.println("------------------------");
            System.out.println("▷ 이름 : " + 이름);
            System.out.println();
            System.out.println("▷ 공격력 : " + 공격력);
            System.out.println();
            System.out.println("▷ 방어력 : " + 방어력);
            System.out.println();
            System.out.println("▷ 체력 : " + 체력);
            System.out.println("------------------------");
            System.out.println();
            System.out.println("1.다시생성하기\t2.확정");
            System.out.print("번호 : ");
            int 번호 = sc.nextInt();
            if (번호 == 1) {
                System.out.println("다시 생성하기를 선택하셨습니다.");
                System.out.println();
            } else if (번호 == 2) {
                System.out.println("회원님의 자경단이 생성되었습니다. 축하드립니다.");
                flag = false;
            } else {
                System.out.println("없는 번호입니다. 다시 선택해주세요.");
            }
        }

        return new 자경단(이름, 공격력, 방어력, 체력, 마력);
    }


}
