public interface Phone {
    void powerOn();
    void callNumber(String phoneNo);
    void receiveCall(String phoneNo);
    boolean ansCall();
    boolean isRinging();
}
