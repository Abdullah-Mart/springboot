public class Main {




    public static void main(String[] args) {

//        int[] someNumbers = {1,2,3,};
//        System.out.println(someNumbers[0]);
//        someNumbers[0]= 5;
//        System.out.println(someNumbers[0]);

//        for(int i= 0; <someNumbers.length; i++){
//            System.out.println(i);
//        }

    int[][] multiDimensionalArray = {{1,2,3},{4,5,6},{9,8,10,11}};
        for (int i=0; i< multiDimensionalArray.length;i++)
          for (int j=0; j< multiDimensionalArray[i].length;j++){
//         System.out.println("i: "+i+" j :"+j);
              System.out.println(multiDimensionalArray[i][j]);
     }

    }



}