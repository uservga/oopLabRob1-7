package film.labRob3;


import film.labRob2.Serial2;

public class Serial3 {
    public Serial2 serial2;

    public Serial3(Serial2 serial2) {
        this.serial2 = serial2;
    }

    private void subscribeCost(){
        serial2.serial1.subscribeCost();
    }

    public void getSubscribeCost(){
        subscribeCost();
    }

    private int countSubscribe(){
        return serial2.serial1.countSubscribe();
    }

    public int getCountSubscribe(){
        return countSubscribe();
    }

    private void subscribeCost(Serial3 o){
        serial2.subscribeCost(o.serial2);
    }

    public void getSubscribeCost(Serial3 o){
        subscribeCost(o);
    }
}
