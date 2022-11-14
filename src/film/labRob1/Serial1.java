package film.labRob1;

import film.labRob2.Data;

public class Serial1 {
    private String name;
    private String country;
    private String genre;
    private double rate;
    private TimeWatching timeWatching;
    private int budget;
    private int price;

    private Data data;

    public Serial1(String name, String country, String genre, double rate, TimeWatching timeWatching, int budget) {
        this.name = name;
        this.country = country;
        this.genre = genre;
        this.rate = rate;
        this.timeWatching = timeWatching;
        this.budget = budget;
    }

    public Serial1(String name, String country, String genre, Data data, int budget) {
        this.name = name;
        this.country = country;
        this.genre = genre;
        this.data = data;
        this.budget = budget;
    }

    public void subscribeCost(){
        TimeWatching o = new TimeWatching();
        System.out.println("Серіал можна глянути на нашому сайті: maxfilm.com.ua");
        if(o.timeAll()<500){
            price = 100;
            System.out.println("Ціна підписки: " + 100);
        }else{
            price = 150;
            System.out.println("Ціна підписки: " + 150);
        }
    }

    public int countSubscribe(){
        return Math.round(budget/price)+1;
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

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
