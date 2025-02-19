package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String ddd = "";

        for(int i =2; i <= numberOfRows; i++){
            for(int j = 1; j < i; j++){
                ddd += "*";
            }
                ddd += "\n";
        }
        return ddd;
    } // call getRow

    public static String getRow(int numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            sb.append("*");
        }
        return sb.toString();
    } // do first

    public static String getSmallTriangle() {
        return getTriangle(5);

    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
