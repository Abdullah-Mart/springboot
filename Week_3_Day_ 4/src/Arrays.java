import java.sql.Array;
import java.util.ArrayList;

public class Arrays {


    Arrays person1= new Arrays("Abdullah");
    Array person2= new Arrays("Mart");

    Array [] person= {person1+ person2};

    public static void main(String[] args) {


        ArrayList<Person>dynamicPersonList= new ArrayList<>();
        dynamicPersonList.add(person1);


//
//
//
//        double[] doublesArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//
//        for (int i = 0; i < doublesArray.length; i++) {
//            System.out.println(doublesArray[i]);
//        }
//
//
//        long[][] multiDimensionalArray = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10, 11}
//        };
//
//
//        for (int i = 0; i < multiDimensionalArray.length; i++) {
//            for (int j = 0; j < multiDimensionalArray[i].length; j++) {
//                System.out.println();
//                System.out.println("("+"i :"+i+", "+"j :"+j+")"+" Value: "+multiDimensionalArray[i][j]);
//            }
//        }
    }
}
