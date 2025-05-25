public class DoubleArrays {

    public static void main(String[] args) {


        double[] doublesArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < doublesArray.length; i++) {
            System.out.println(doublesArray[i]);
        }


        long[][] multiDimensionalArray = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10, 11}
        };


        for (int i = 0; i < multiDimensionalArray.length; i++) {
            for (int j = 0; j < multiDimensionalArray[i].length; j++) {
                System.out.println();
                System.out.println("("+"i :"+i+", "+"j :"+j+")"+" Value: "+multiDimensionalArray[i][j]);
            }
        }
    }
}
