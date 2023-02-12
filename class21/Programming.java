package class21;

public class Programming {
    Programming(){
        System.out.println("i love programming");
    }
    Programming(String word){
        System.out.println("i love "+word);
    }

    public static void main(String[] args) {
        new Programming("java");
        Programming programming=new Programming();
    }
}
