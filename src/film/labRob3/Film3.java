package film.labRob3;

import film.labRob2.Film2;

public class Film3 {
    public Film2 film2;

    public Film3(Film2 film2) {
        this.film2 = film2;
    }

    private String ticketCost(){
        return film2.film1.ticketCost();
    }

    public String getTicketCost(){
        return ticketCost();
    }

    private int countSeans(){
        return film2.film1.countSeans();
    }

    public int getCountSeans(){
        return countSeans();
    }

    private void menu(String ... item){
        film2.film1.menu(item);
    }

    public void getMenu(String ... item){
        menu(item);
    }

    private void sumCost(){
        film2.film1.sumCost();
    }

    public void getSumCost(){
        sumCost();
    }

    private void subscribeCost(Film3 o){
        film2.subscribeCost(o.film2);
    }

    public void getSubscribeCost(Film3 o){
        subscribeCost(o);
    }

    private void group(){
        film2.group();
    }

    public void getGroup(){
        group();
    }

    private void group(int cntChildFamily){
        film2.group(cntChildFamily);
    }

    public void getGroup(int cntChildFamily){
        group(cntChildFamily);
    }
//
}
