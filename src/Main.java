public class Main {
    public static void main(String[] args) {
       LandLine l1= new LandLine("1234");
       LandLine l2= new LandLine("5678");

       l1.callNumber("5678");
       l2.receiveCall("5678");
        System.out.println(l2.ansCall());
    }
}