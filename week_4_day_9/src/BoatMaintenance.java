import java.time.LocalDate;
import java.time.Period;

public class BoatMaintenance {
    public static void main(String[] args) {


        LocalDate start = LocalDate.of(2023, 01, 30);
        LocalDate end = LocalDate.of(2024, 01, 30);
        Period period = Period.ofMonths(3);
        maintenancePeriod(start, end, period);
    }
        private static void maintenancePeriod (LocalDate start, LocalDate end, Period period){

            LocalDate upTo = start;
            while (upTo.isBefore(end)) {
                System.out.println("Maintenance Time: " + upTo);
                upTo = upTo.plus(period);
            }
        }

}
