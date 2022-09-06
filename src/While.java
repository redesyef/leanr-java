public class While {
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
       while (isTurnOn){
           printSOS();
       }
    }
}
