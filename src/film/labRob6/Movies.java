package film.labRob6;

public interface Movies {
    String ticketCost();
    int countSeans();
    void menu(String... item);
    void sumCost();
    void group();
    void subscribeCost(film.labRob4.Movies o);
}
