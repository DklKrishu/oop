class MyException extends Exception   {
    public MyException(){
        System.out.println("error occured");

    }
}
public class main {
    public static void main(String[] args)throws Exception {
        throw new MyException();
        System.out.println("");
    }
}
