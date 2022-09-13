public class Season {
    Seasons seasonType;
    int averageTemperature;
    String description;


    public Season(Seasons seasonType_, int averageTemperature_){
        seasonType = seasonType_;
        averageTemperature = averageTemperature_;
        switch(seasonType_){
            case Autumn:
            case Spring:
                description = "Прохладное время года";
                break;
            case Summer:
                description = "Теплое время года";
                break;
            case Winter:
                description = "Холодное время года";
                break;
        }
    }
    public static void FavoriteSeasonPrint(Seasons season) {
        switch (season) {
            case Winter:
                System.out.println("Я люблю зиму");
                break;
            case Spring:
                System.out.println("Я люблю весну");
                break;
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Autumn:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public void getDescription(){
        System.out.println(seasonType.name() + ": " + description + ", Среднаяя температура: " + averageTemperature);
    }
}
