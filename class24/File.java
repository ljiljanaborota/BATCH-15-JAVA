package class24;



public abstract class File {
    int size;
    File(int size){
        this.size=size;
    }
    abstract void open();

    void edit() {
        System.out.println("edit the file");
    }

    void close() {
        System.out.println("closing the file");
    }
}
class JavaFile extends File{
    JavaFile(int size){
        super(size);
    }
    void open(){
        System.out.println("opening the file in intellijj");
    }
    void edit(){
        System.out.println("editing the file in intellijj");
    }
}

class wordFile extends File {
    wordFile(int size) {
        super(size);
    }

    void open() {
        System.out.println("opening the file in Microsoft");
    }

    void edit() {
        System.out.println("editing the file in Microsoft");
    }
}
class PDFFile extends File{
    PDFFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("opening the file in adobe reader");
    }

    @Override
    void edit() {
        System.out.println("editing the file in adobe reader");
    }
}