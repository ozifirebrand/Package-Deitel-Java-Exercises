package chapter2;
import java.util.Scanner;
public class TwoPointThreeFourPopulation {
    public static void main(String[] args) {

        int numberOfYears=0;

        Scanner valueReader = new Scanner(System.in);

        System.out.println("Enter current world population below");
        double currentWorldPopulation = valueReader.nextDouble();

        System.out.println("Enter the world's estimated growth rate below");
        double worldPopulationGrowthRate=valueReader.nextDouble();

        double worldPopulationAfterAYear= currentWorldPopulation*worldPopulationGrowthRate;
        System.out.println("1 YEARS \n" +worldPopulationAfterAYear);

        double worldPopulationAfterTwoYears = worldPopulationAfterAYear*worldPopulationGrowthRate;
        System.out.println("2 YEARS \n"+worldPopulationAfterTwoYears);

        double worldPopulationAfterThreeYears= worldPopulationAfterTwoYears*worldPopulationGrowthRate;
        System.out.println("3 YEARS \n"+worldPopulationAfterThreeYears);

        double worldPopulationAfterFourYears = worldPopulationAfterThreeYears*worldPopulationGrowthRate;
        System.out.println("4 YEARS \n" +worldPopulationAfterFourYears);

        double worldPopulationAfterFiveYears= worldPopulationAfterFourYears*worldPopulationGrowthRate;
        System.out.println("5 YEARS \n"+worldPopulationAfterFiveYears);

        //USING FOR LOOPS

        for(numberOfYears=5;numberOfYears>0;numberOfYears--){
            double worldPopulation = currentWorldPopulation * worldPopulationGrowthRate;
            currentWorldPopulation = worldPopulation;
            System.out.printf("%.3f%n",(worldPopulation));
        }
    }
}
