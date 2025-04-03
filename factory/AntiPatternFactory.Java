import java.sql.*;


public class AntiPatternFactory {

    Knife knife = null;

    public static Knife orderKnife(String knifeType) {

        if (knifeType.equals("steak")) {
            knife = new SteakKnife();
        } else if (knifeType.equals("chefs")) {
            knife = new ChefsKnife();
        }

        knife.sharper();
        knife.polish();
        knife.package();

        return knife;
    }

}
