package part01.lesson02.task01;

public class MyException extends Throwable {
    public MyException(String s) {
        System.out.println(s);
    }
}
