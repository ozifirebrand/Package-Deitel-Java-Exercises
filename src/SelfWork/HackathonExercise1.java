/*given a tuition fee for a university is 10000
And interest rate is 5 percent per year
our program displays total tuition of four years after the tenth year


compute the tuition fee per year using the interest rate
sum 10 years using the interest rate
display sum of four years after the first year

initialise to zero when adding
initialise to one when multiplying
*/

package SelfWork;
public class HackathonExercise1 {
    double totalTuitionAfterComputationFor10Years = 0;
    double totalTuitionForFourYears=0;
    int numberOfYears = 0;
    int rate = 5;
    double initialTuitionBeforeAddingInterest = 10000;


    public void setSum() {
        while ((numberOfYears < 10)) {
            double newTuitionAfterAddingPreviousTuition = initialTuitionBeforeAddingInterest * 0.05;
            totalTuitionAfterComputationFor10Years = newTuitionAfterAddingPreviousTuition + initialTuitionBeforeAddingInterest;
            initialTuitionBeforeAddingInterest = totalTuitionAfterComputationFor10Years;
            numberOfYears++;
//            System.out.printf("%.2f%n", initialTuitionBeforeAddingInterest);
        }
    }

    public double getSum() {
        return totalTuitionAfterComputationFor10Years;
    }


    public void setSumForFourYears() {
        totalTuitionAfterComputationFor10Years = 16288.95;
        double newTuitionForNextYear = 16288.95 + (16288.95 * 0.05);
        totalTuitionForFourYears += newTuitionForNextYear;
        while (numberOfYears<4){
            newTuitionForNextYear = totalTuitionForFourYears+ (totalTuitionForFourYears*.05);
            totalTuitionForFourYears = newTuitionForNextYear;
            numberOfYears ++;
            System.out.printf("%.2f%n", totalTuitionForFourYears);
        }
    }

//    public double getSumForFourYears() {
//        return totalTuitionForFourYears;
//    }
}
//    public void setCostOfTuition() {
//        initialTuition +=  initialTuition * .05;
//
//    }
//
//    public double getCostOfTuition() {
//        return initialTuition;
//
//
//    }