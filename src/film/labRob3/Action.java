package film.labRob3;

public class Action {
    private static String season;
    private static int percent;

    private static String discount(){
        if(Seasons.SUMMER.getTranslate().equals(season)){
            System.out.println("Літні знижки: " + getPercent() +"%");
            return "Літні знижки: " + getPercent() +"%";
        }else if(Seasons.AUTUMN.getTranslate().equals(season)){
            System.out.println("Осінні знижки: " + getPercent() +"%");
            return "Осінні знижки: " + getPercent() +"%";
        }else if(Seasons.SPRING.getTranslate().equals(season)){
            System.out.println("Весняні знижки: " + getPercent() +"%");
            return "Весняні знижки: " + getPercent() +"%";
        }else {
            System.out.println("Зимові знижки: " + getPercent() +"%");
            return "Зимові знижки: " + getPercent() +"%";
        }
    }

    public static String getDiscount(){
        return discount()+"\n\n";
    }

    public static String getSeason() {
        return season;
    }

    public static void setSeason(String season) {
        Action.season = season;
    }

    public static int getPercent() {
        return percent;
    }

    public static void setPercent(int percent) {
        Action.percent = percent;
    }
}
