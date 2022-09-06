public class For {
    static boolean isTurnOn = false;
    public static void printSOS(){
        System.out.println("...---...");

    }
    public static boolean isIsTurnOff(){
        isTurnOn = (isTurnOn) ? false : true;
        return isTurnOn;
    }
    public static void main(String[] args) {
        isIsTurnOff();

        for (int i = 0; i <=10 ; i++) {
            printSOS();
        }
    }
}
