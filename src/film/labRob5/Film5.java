package film.labRob5;


import film.labRob4.Film4;
import film.labRob4.Movies;

public class Film5 extends Movies1{

    public Film4 film4;

    public Film5(Film4 film4) {
        this.film4 = film4;
    }

    @Override
    public String ticketCost() {
        return film4.film3.getTicketCost();
    }

    @Override
    public int countSeans() {
        return film4.film3.getCountSeans();
    }

    @Override
    public void menu(String... item) {
        film4.film3.getMenu(item);
    }

    @Override
    public void sumCost() {
        film4.film3.getSumCost();
    }

    @Override
    public void group() {
        film4.film3.getGroup();
    }

    public void group(int cntChildFamily) {
        film4.film3.getGroup(cntChildFamily);
    }

    @Override
    public void subscribeCost(Movies o) {
        film4.film3.getSubscribeCost(o.film3);
    }
}
