public class Main{
    public static void main(String[] args) {
        System.out.println("Hello from docker!");
        int count = 0 ;
        try{
            while (true) {
                Thread.sleep(2000);
                System.out.println("I'am Still here!! Iteration " + count++);
            }
        } catch (InterruptedException e ){
            e.printStackTrace();
        }
    }
}