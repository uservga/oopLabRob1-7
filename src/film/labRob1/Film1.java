package film.labRob1;

import film.labRob2.Data;

public class Film1 {
    private String name;
    private String country;
    private String genre;
    private double rate;
    private TimeWatching timeWatching;
    private int budget;
    private int price;
    private int priceMenu = 0;
    public final int visitors = 250;
    private Data data;

    public Film1(String name, String country, String genre, double rate, TimeWatching timeWatching, int budget) {
        this.name = name;
        this.country = country;
        this.genre = genre;
        this.rate = rate;
        this.timeWatching = timeWatching;
        this.budget = budget;
    }

    public Film1(String name, String country, String genre, Data data, int budget) {
        this.name = name;
        this.country = country;
        this.genre = genre;
        this.data = data;
        this.budget = budget;
    }

    public String ticketCost(){
        if(budget<=1_000_000){
            price = 100;
            System.out.println("Ціна білета: " + price);
        }else if(budget<=2_500_000){
            price = 150;
            System.out.println("Ціна білета: " + price);
        }else{
            price = 200;
            System.out.println("Ціна білета: " + price);
        }
        return null;
    }

    public int countSeans(){
        if(budget<=1_000_000){
            price = 100;
        }else if(budget<=2_500_000){
            price = 150;
        }else{
            price = 200;
        }
        return Math.round(budget/price/visitors)+1;
    }

    public void menu(String ... item){
        System.out.print("Меню: ");
        for(String iteration : item){
            System.out.print(iteration + "; ");
            if (iteration.equals("попкорн(солодкий)")){
                priceMenu += 150;
            }else if (iteration.equals("попкорн(сирний)")){
                priceMenu += 150;
            }else if (iteration.equals("попкорн(солений)")){
                priceMenu += 100;
            }else if(iteration.equals("пепсі(0,3)")){
                priceMenu += 50;
            }else if(iteration.equals("пепсі(0,5)")) {
                priceMenu += 70;
            }
        }
        System.out.println();
    }

    public void sumCost(){
        System.out.println("Bартість меню: "+priceMenu);
        System.out.println("Загальна вартість: "+(price+priceMenu));
    }

    @Override
    public String toString(){
        return String.format("Дані про перегляд: %s", timeWatching);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public TimeWatching getTimeWatching() {
        return timeWatching;
    }

    public void setTimeWatching(TimeWatching timeWatching) {
        this.timeWatching = timeWatching;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPriceMenu() {
        return priceMenu;
    }

    public void setPriceMenu(int priceMenu) {
        this.priceMenu = priceMenu;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
