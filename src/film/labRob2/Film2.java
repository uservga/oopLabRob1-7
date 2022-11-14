package film.labRob2;

import film.labRob1.Film1;

public class Film2 {
    public Film1 film1;

    public Film2(Film1 film1) {
        this.film1 = film1;
    }

    public void subscribeCost(Film2 o){
        System.out.println("Забонювати перегляд мультфільму '"+o.film1.getName()+"' можна тут: maxfil.com.ua");
        System.out.println("Ціна бронювання: " + 100);
    }

    public void group(){
        System.out.println("Для вас не має знижок!");
    }

    public void group(int cntPeople){
        double sale;
        if (cntPeople > 5 && cntPeople <= 10){
            sale = 0.1;
            System.out.println("Група людей: "+cntPeople);
            System.out.println("З урахуванням знижки: "+(film1.getPrice()-(film1.getPrice()*sale)));
        }else if (cntPeople > 10){
            sale = 0.2;
            System.out.println("Група людей: "+cntPeople);
            System.out.println("З урахуванням знижки: "+(film1.getPrice()-(film1.getPrice()*sale)));
        }
    }
}
