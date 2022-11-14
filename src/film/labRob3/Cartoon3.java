package film.labRob3;

import film.labRob2.Cartoon2;

public class Cartoon3 {
    public Cartoon2 cartoon2;

    public Cartoon3(Cartoon2 cartoon2) {
        this.cartoon2 = cartoon2;
    }

    private String ticketCost(){
        return cartoon2.cartoon1.ticketCost();
    }

    public String getTicketCost(){
        return ticketCost();
    }

    private int countSeans(){
        return cartoon2.cartoon1.countSeans();
    }

    public int getCountSeans(){
        return countSeans();
    }

    private void menu(String ... item){
        cartoon2.cartoon1.menu(item);
    }

    public void getMenu(String ... item){
        menu(item);
    }

    private void sumCost(){
        cartoon2.cartoon1.sumCost();
    }

    public void getSumCost(){
        sumCost();
    }

    private void subscribeCost(Cartoon3 o){
        cartoon2.subscribeCost(o.cartoon2);
    }

    public void getSubscribeCost(Cartoon3 o){
        subscribeCost(o);
    }

    private void group(){
        cartoon2.group();
    }

    public void getGroup(){
        group();
    }

    private void group(int cntChildFamily){
        cartoon2.group(cntChildFamily);
    }

    public void getGroup(int cntChildFamily){
        group(cntChildFamily);
    }
}
