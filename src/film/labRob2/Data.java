package film.labRob2;

public class Data {
    public int day;
    public int month;
    public int year;

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString(){
        return String.format("%s.%s.%s", day, month, year);
    }
}
