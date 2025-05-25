import java.time.LocalDate;
import java.time.Period;

public class Boat {
    public static void main(String[] args) {
        LocalDate start= LocalDate.of(2022,01,30);
        LocalDate end = LocalDate.of(2024,01,30);
        Period period= Period.of(1,0,135);
        boatMaintenance(start, end,period);

    }
    private static void boatMaintenance(LocalDate start, LocalDate end, Period period){

        LocalDate upTo= start;
        while (upTo.isBefore(end)){
            System.out.println("Maintenance Time: "+upTo);
            upTo= upTo.plus(period);

        }
    }
}
