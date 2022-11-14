package film;

import film.labRob1.*;
import film.labRob2.*;
import film.labRob3.*;
import film.labRob4.*;
import film.labRob5.*;
import film.labRob6.*;

public class Dispatching {
    Cartoon6 cartoon1 = new Cartoon6(new Cartoon5(new Cartoon4(new Cartoon3(new Cartoon2(new Cartoon1("Скубі-Ду", "США", 5, new TimeWatching(3,52,42), 2_500_000))))));
    Film6 film1 = new Film6(new Film5(new Film4(new Film3(new Film2(new Film1("Кіборги","Україна", "Бойовик", 3.5, new TimeWatching(54, 10),4_500_000))))));
    Serial6 serial1 = new Serial6(new Serial5(new Serial4(new Serial3(new Serial2(new Serial1("Слуга Народу","Україна", "Комедія",5, new TimeWatching(3,10,1,0,0), 2_300_000))))));

    Cartoon6 cartoon2 = new Cartoon6(new Cartoon5(new Cartoon4(new Cartoon3(new Cartoon2(new Cartoon1("Джоні Тест", "США", new Data(20,10,2023), 1_900_000))))));
    Film6 film2 = new Film6(new Film5(new Film4(new Film3(new Film2(new Film1("Півтора Шпіона","США", "Бойовик", new Data(8, 11, 2023),3_500_000))))));
    Serial6 serial2 = new Serial6(new Serial5(new Serial4(new Serial3(new Serial2(new Serial1("Друзі","США", "Комедія", new Data(14,11,2023), 900_000))))));


    public String menu(int number){
        if (number==1){
            System.out.println("Назва мультфільму: "+cartoon1.cartoon5.cartoon4.cartoon3.cartoon2.cartoon1.getName());
            System.out.print(cartoon1.cartoon5.cartoon4.cartoon3.cartoon2.cartoon1.getTimeWatching().toString());
            System.out.println(cartoon1.ticketCost());
            cartoon1.menu("попкорн(солений)", "пепсі(0,5)");
            cartoon1.sumCost();
            cartoon1.group();
            System.out.println("-------------------------------------------------------");
            System.out.println("Щоб заробити з продажу мультфільму потрібно "+ cartoon1.countSeans() + " сеансів");
            return "Назва мультфільму: "+cartoon1.cartoon5.cartoon4.cartoon3.cartoon2.cartoon1.getName()+"\n" + cartoon1.cartoon5.cartoon4.cartoon3.cartoon2.cartoon1.getTimeWatching().toString() + cartoon1.ticketCost();
        }else  if (number==2){
            System.out.println("Назва фільму: "+film1.film5.film4.film3.film2.film1.getName());
            System.out.print(film1.film5.film4.film3.film2.film1.getTimeWatching().toString());
            film1.ticketCost();
            film1.menu("попкорн(солодкий)");
            film1.sumCost();
            film1.group(8);
            System.out.println("-------------------------------------------------------");
            System.out.println("Щоб заробити з продажу фільму потрібно "+film1.countSeans()+" сеансів");
        }else  if (number==3){
            System.out.println("Назва серіалу: "+serial1.serial5.serial4.serial3.serial2.serial1.getName());
            System.out.print(serial1.serial5.serial4.serial3.serial2.serial1.getTimeWatching().toString());
            serial1.serial5.serial4.serial3.getSubscribeCost();
            System.out.println("Перегляд серіалу займе: "+serial1.serial5.serial4.serial3.serial2.serial1.getTimeWatching().timeAll()+" годин");
            System.out.println("-------------------------------------------------------");
            System.out.println("Щоб заробити з продажу підписки на серіал потрібно "+serial1.serial5.serial4.serial3.getCountSubscribe()+" підписок");
        }else  if (number==4){
            System.out.println("Мультфільм вийде: "+ cartoon2.cartoon5.cartoon4.cartoon3.cartoon2.cartoon1.getData().toString());
            cartoon2.subscribeCost(cartoon2.cartoon5.cartoon4);
        }else  if (number==5){
            System.out.println("Фільм вийде: "+ film2.film5.film4.film3.film2.film1.getData().toString());
            film2.subscribeCost(film2.film5.film4);
        }else  if (number==6){
            System.out.println("Cеріал вийде: "+ serial2.serial5.serial4.serial3.serial2.serial1.getData().toString());
            serial2.serial5.serial4.serial3.getSubscribeCost(serial2.serial5.serial4.serial3);
        }else {
            System.out.println("Помилка!");
        }
        return null;
    }
}
