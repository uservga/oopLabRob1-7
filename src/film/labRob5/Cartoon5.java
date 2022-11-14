package film.labRob5;

import film.labRob4.Cartoon4;
import film.labRob4.Movies;

public class Cartoon5 extends Movies1 {

    public Cartoon4 cartoon4;

    public Cartoon5(Cartoon4 cartoon4) {
        this.cartoon4 = cartoon4;
    }

    @Override
    public String ticketCost() {
        return cartoon4.cartoon3.getTicketCost();
    }

    @Override
    public int countSeans() {
        return cartoon4.cartoon3.getCountSeans();
    }

    @Override
    public void menu(String ... item) {
        cartoon4.cartoon3.getMenu(item);
    }

    @Override
    public void sumCost() {
        cartoon4.cartoon3.getSumCost();
    }

    @Override
    public void group() {
        cartoon4.cartoon3.getGroup();
    }

    public void group(int cntChildFamily) {
        cartoon4.cartoon3.getGroup(cntChildFamily);
    }

    @Override
    public void subscribeCost(Movies o) {
        cartoon4.cartoon3.getSubscribeCost(o.cartoon3);
    }
}
