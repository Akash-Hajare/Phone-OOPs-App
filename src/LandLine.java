public class LandLine implements Phone {

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging = false;
        isPowerOn = true;
    }

    @Override
    public void powerOn() {
       this.isPowerOn=true;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn){
            System.out.println("You are dialing a number "+phoneNo);
        }
        else{
            System.out.println("Your landline is off");
        }
    }

    @Override
    public void receiveCall(String phoneNo) {
       if(isPowerOn && myPhoneNo.equals(phoneNo)){
           this.isRinging=true;
           System.out.println("hey"+phoneNo+" You are receiving a call");
       }
       else {
           System.out.println("Call not received");
       }
    }

    @Override
    public boolean ansCall() {
        if(isRinging){
            System.out.println("Call answered");
            this.isRinging=false;
            return true;
        }
        else return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }
}
