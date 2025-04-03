package factory;
import java.sql.*;


public class KnifeFactory {

    public KnifeFactory createKnife(String knifeType){

    Knife knife = null;

    if (knifeType.equals("steak")) {
        knife = new SteakKnife();
    } else if (knifeType.equals("chefs")) {
        knife = new ChefsKnife();
    }
    return knife;
}
}
