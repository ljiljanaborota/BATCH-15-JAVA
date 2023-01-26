package class12;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.brand = "iphone";
        iphone.color = "gold";
        iphone.price = 1500;
        iphone.version = 11;
        iphone.storage = 256;
        iphone.isUnlocked = true;

        Phone googlePixel = new Phone();
        googlePixel.brand = "iphone";
        googlePixel.color = "gold";
        googlePixel.price = 1500;
        googlePixel.version = 11;
        googlePixel.storage = 256;
        googlePixel.sendingMessage();

        Phone s22ultra = new Phone();
        s22ultra.brand = "iphone";
        s22ultra.color = "gold";
        s22ultra.price = 1500;
        s22ultra.version = 11;
        s22ultra.storage = 256;
        s22ultra.ringing();
    }
}


