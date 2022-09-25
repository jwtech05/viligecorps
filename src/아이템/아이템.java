public class 아이템 {

    public String 이름;
    public int 효과1;

    public int 효과2;
    public String 설명;
    public int 가격;

    public 아이템(String 이름, int 효과1, String 설명, int 가격) {
        this.이름 = 이름;
        this.효과1 = 효과1;
        this.설명 = 설명;
        this.가격 = 가격;
    }

    public 아이템(String 이름, int 효과1, int 효과2, String 설명, int 가격){
        this.이름 = 이름;
        this.효과1 = 효과1;
        this.효과2 = 효과2;
        this.설명 = 설명;
        this.가격 = 가격;
    }


}
