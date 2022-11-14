package film.labRob3;

public enum Seasons {
    SUMMER("Літо"), AUTUMN("Осінь"), WINTER("Зима"), SPRING("Весна");

    private String translate;

    Seasons(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }
}
