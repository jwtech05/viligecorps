package 맵;

import 등장인물.*;

public class 오락실앞 extends 맵{

    @Override
    public void 맵입장() {

        super.맵입장();
        System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶▶광장◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀◀");
        System.out.println("▻ 광장에는 오토바이를 타고 다니는 미성년자들이 많습니다.");
        System.out.println("▻ 운전면허없이 운전하다보니 위험하게 운전합니다.");
        System.out.println("▻ 무면허 운전을 단속해서 사람들이 편하게 걸어다닐 수 있게 해주세요.");
        System.out.println();
        //로딩 구간 넣기
        System.out.println("▻ 오토바이를 발견했습니다. 전투가 진행됩니다.");

    }

    @Override
    public void 특수효과() {
        super.특수효과();
    }

    public 빌런 몬스터등장(){
        return new 일진("일진", 13, 10, 100, 5000, 20);
    }

}
