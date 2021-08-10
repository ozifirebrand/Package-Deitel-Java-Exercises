package chapter4;
// ADDING INTEGERS IN FOR DIFFERENT WAYS USING LOOPS

public class FourPointThree {
    public static void main(String[] args) {
        int firstValueToBeLooped = 5;
        int numberOfLoops = 1;
        for (; numberOfLoops<=4; numberOfLoops++){
            firstValueToBeLooped = firstValueToBeLooped +1;
        }
        System.out.println(firstValueToBeLooped);

        for (numberOfLoops=4; numberOfLoops>= 0; numberOfLoops--){
            firstValueToBeLooped ++;
        }
        System.out.println(firstValueToBeLooped);
        numberOfLoops=4;
        while (numberOfLoops>=1){
            firstValueToBeLooped++;
            numberOfLoops --;
        }
        System.out.println(firstValueToBeLooped);

        numberOfLoops= 0;
        while (numberOfLoops<=4){
            firstValueToBeLooped++;
            numberOfLoops++;
        }
        System.out.println(firstValueToBeLooped);
    }
}
