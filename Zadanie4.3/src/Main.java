

public class Main {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.Autumn;
        Season.FavoriteSeasonPrint(favoriteSeason);
        Season[] seasons = {new Season(Seasons.Summer, 25),
                new Season(Seasons.Autumn, 10),
                new Season(Seasons.Winter, -15),
                new Season(Seasons.Spring, 13)};


        for(int i = 0; i < seasons.length; i++){
            seasons[i].getDescription();
        }
    }
}