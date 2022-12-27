import java.util.*;

public class Kata
{
    public static String[] towerBuilder(int nFloors) {
        StringBuilder sb = new StringBuilder();
        String[] tower = new String[nFloors];
        int floorNumber = 0;
        int noOfSpaces = nFloors-1;
        int noOfAst = 1;

        while (nFloors > 0){

            sb.append(" ".repeat(Math.max(0, noOfSpaces)));
            sb.append("*".repeat(Math.max(0, noOfAst)));
            sb.append(" ".repeat(Math.max(0, noOfSpaces)));
//            sb.append("\n");

            tower[floorNumber] = sb.toString();

            sb.delete(0,sb.length());

            noOfAst+=2;
            nFloors--;
            noOfSpaces--;
            floorNumber++;
        }

        return tower;
    }
}