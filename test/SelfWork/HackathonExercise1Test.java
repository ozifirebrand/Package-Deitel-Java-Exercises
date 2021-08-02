package SelfWork;

import org.junit.jupiter.api.Test;


public class HackathonExercise1Test {

    @Test
    public void testTuitionSum(){
       HackathonExercise1 hackathonExercise1 = new HackathonExercise1();
        hackathonExercise1.setSum();
        System.out.println(hackathonExercise1.getSum());
    }

    @Test
    public void testForSumAfterTenYearsForFourYears(){
        HackathonExercise1 hackathonExercise1 = new HackathonExercise1();
//        hackathonExercise1.setSum();
//        hackathonExercise1.getSum();
        hackathonExercise1.setSumForFourYears();
//        System.out.println(hackathonExercise1.getSumForFourYears());

    }
}