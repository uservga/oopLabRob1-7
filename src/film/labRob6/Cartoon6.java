package film.labRob6;

import film.labRob5.Cartoon5;

public class Cartoon6 implements Movies {

    public Cartoon5 cartoon5;

    public Cartoon6(Cartoon5 cartoon5) {
        this.cartoon5 = cartoon5;
    }


    @Override
    public String ticketCost() {
        return cartoon5.ticketCost();
    }

    @Override
    public int countSeans() {
        return cartoon5.countSeans();
    }

    @Override
    public void menu(String... item) {
        cartoon5.menu(item);
    }

    @Override
    public void sumCost() {
        cartoon5.sumCost();
    }

    @Override
    public void group() {
        cartoon5.group();
    }

    public void group(int cntChildFamily) {
        cartoon5.group(cntChildFamily);
    }

    @Override
    public void subscribeCost(film.labRob4.Movies o) {
        cartoon5.subscribeCost(o);
    }
}
