package class24;

public abstract class Phone {
    /*
    create a phone class and let's create abstract method like displayPicture
    unlockPhone
    SendText
    create 2 child classes IPhone Samsung Google and provide specific implementation
    lets write code to achieve run time polymorphism
     */
    abstract void unlockPhone();
    abstract void SendText();
    abstract void displayPicture();


}
class IPhone extends Phone{
    @Override
    void SendText() {
        System.out.println("lets use the imessage to send the text");

    }

    @Override
    void unlockPhone() {
        System.out.println("faceId to unlock the phone");

    }

    @Override
    void displayPicture() {
        System.out.println("iphoto to browse the pictures");

    }
}
class Samsung extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("using the fingerprint sensor or camera");

    }

    @Override
    void SendText() {
        System.out.println("message app to send the message");

    }

    @Override
    void displayPicture() {
        System.out.println("picture from the gallery");

    }
}
