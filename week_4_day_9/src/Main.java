//import java.time.LocalDate;
//import java.time.Period;
//
//public class Main {
//    public static void main(String[] args) {
//
//        LocalDate start= LocalDate.of(2023, 1, 30);
//        LocalDate end= LocalDate.of(2024, 1, 30);
//        Period period=Period.ofMonths(3);
//
//        performDemo(start,end,period);
//    }
//
//
//    private static void performDemo(LocalDate start, LocalDate end, Period period) {
//        LocalDate upTo = start;
//        while (upTo.isBefore(end)) {
//            System.out.println("give new toy on: " + upTo);
//            upTo = upTo.plus(period);
//        }
//    }
//}
