public class ex_6_1 {
    public static void main(String[] args)
    {
        StudaCard card1 = new StudaCard(3, false);
        StudaCard card2 = new StudaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }

}

class StudaCard {
    int num;
    boolean isKwang;

    StudaCard()
    {
        this(1, true);
    }
    StudaCard(int num, boolean isKwang)
    {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info()
    {
        String str = "";
        str += num;
        if(isKwang == true) {str += "K";}
        return str;
    }
}