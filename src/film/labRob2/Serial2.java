package film.labRob2;

import film.labRob1.Serial1;

public class Serial2 {
    public Serial1 serial1;

    public Serial2(Serial1 serial1) {
        this.serial1 = serial1;
    }

    public void subscribeCost(Serial2 o){
        System.out.println("Забонювати перегляд серіалу '"+o.serial1.getName()+"' можна тут: maxfil.com.ua");
        System.out.println("Ціна бронювання: " + 70);
    }
}
