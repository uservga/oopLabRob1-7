package film.labRob2;

import film.labRob1.Cartoon1;


public class Cartoon2 {
    public Cartoon1 cartoon1;

    public Cartoon2(Cartoon1 cartoon1) {
        this.cartoon1 = cartoon1;
    }

    public void subscribeCost(Cartoon2 o){
        System.out.println("Забонювати перегляд мультфільму '"+o.cartoon1.getName()+"' можна тут: maxfil.com.ua");
        System.out.println("Ціна бронювання: " + 100);
    }

    public void group(){
        System.out.println("Для вас не має знижок!");
    }

    public void group(int cntChildFamily){
        double sale;
        if (cntChildFamily < 3 ){
            sale = 0.1;
            System.out.println("Кількість дітей: "+cntChildFamily);
            System.out.println("З урахуванням знижки на їжу: "+(cartoon1.getPrice()-(cartoon1.getPriceMenu()*sale)));
        }else if (cntChildFamily > 2){
            sale = 0.2;
            System.out.println("Кількість дітей: "+cntChildFamily);
            System.out.println("З урахуванням знижки на їжу: "+(cartoon1.getPrice()-(cartoon1.getPriceMenu()*sale)));
        }
    }
}
