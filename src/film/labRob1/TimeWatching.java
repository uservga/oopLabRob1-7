package film.labRob1;

public class TimeWatching {
    public int hour;
    public int minute;
    public int second;

    public int season;
    public int series;

    public TimeWatching(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeWatching(int minute, int second) {
        this.minute = minute;
        this.second = second;
    }

    public TimeWatching(int season, int series, int hour, int minute, int second) {
        this.season = season;
        this.series = series;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeWatching() {
    }

    @Override
    public String toString(){
        if(hour==0){
            return String.format("Кількість хвилин - %s; кількість секунд - %s;\n", minute, second);
        }else if(season==0){
            return String.format("Кількість годин - %s; кількість хвилин - %s; кількість секунд - %s;\n", hour, minute, second);
        }else {
            return String.format("Кількість сезонів - %s; кількість серій - %s; кількість годин - %s; кількість хвилин - %s; кількість секунд - %s;\n", season, series, hour, minute, second);
        }
    }

    public double timeAll(){
        return season*series*hour;
    }
}
