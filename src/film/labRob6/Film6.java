package film.labRob6;

import film.labRob5.Film5;

public class Film6 implements Movies {
    public Film5 film5;

    public Film6(Film5 film5) {
        this.film5 = film5;
    }


    @Override
    public String ticketCost() {
        return film5.ticketCost();
    }

    @Override
    public int countSeans() {
        return film5.countSeans();
    }

    @Override
    public void menu(String... item) {
        film5.menu(item);
    }

    @Override
    public void sumCost() {
        film5.sumCost();
    }

    @Override
    public void group() {
        film5.group();
    }

    public void group(int cntChildFamily) {
        film5.group(cntChildFamily);
    }

    @Override
    public void subscribeCost(film.labRob4.Movies o) {
        film5.subscribeCost(o);
    }
}
