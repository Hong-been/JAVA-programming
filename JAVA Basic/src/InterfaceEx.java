interface PhoneInterface{
    int BUTTONS=20;
    void sendCall();
    void receiveCall();
}
interface MobilePhoneInterface extends PhoneInterface{
    void sendSMS();
    void receiveSMS();
}
interface MP3Interface{
    void play();
    void stop();
}
class PDA{
    public int calculate(int x,int y){ return x+y; }
}

class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface{
    public void sendCall() { System.out.println("Send a call");}
    public void receiveCall() { System.out.println("Receive a call");}
    public void sendSMS() { System.out.println("Send a message");}
    public void receiveSMS() { System.out.println("Receive a call");}
    public void play() { System.out.println("Play music");}
    public void stop() { System.out.println("Stop playing");}

    public void schedule() { System.out.println("Check schedule");}
}
public class InterfaceEx {
    public static void main(String[] args){
        SmartPhone p=new SmartPhone();
        p.sendCall();
        p.play();
        System.out.println(p.calculate(3,5));
        p.schedule();
    }
}