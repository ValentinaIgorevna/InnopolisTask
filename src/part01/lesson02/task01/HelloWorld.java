package part01.lesson02.task01;

import java.util.Scanner;

/**
 * Класс, в ходе выполнения которого моделируются исключения:
 * - NullPointerException
 * - ArrayIndexOutOfBoundsException
 * - собственное исключение MyException
 * @author Gorbunova VI
 * @version 0.1
 */
public class HelloWorld {
    /**
     *
     * @param args
     * @throws MyException - собственное исключение
     */
    public static void main(String[] args) throws MyException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int num = in.nextInt();

        String helloWorld = null;

        if (num == 0) {
            emulateNullPointerException(helloWorld);
        } else if (num < 0) {
            emulateArrayIndexOutOfBoundsException(helloWorld);
        } else if (num < 10){
            throw new MyException("My exception!");
        } else {
            helloWorld = "Hello world";
            System.out.println(helloWorld);
        }
    }

    /**
     * Эмуляция исключения NullPointerException
     * @param myText - произвольная строка
     */
    private static void emulateNullPointerException(String myText) {
        System.out.println(myText.hashCode());
    }

    /**
     * Эмуляция исключения ArrayIndexOutOfBoundsException
     * @param myText - произвольная строка
     */
    private static void emulateArrayIndexOutOfBoundsException(String myText) {
        String[] stringArray = new String[5];
        stringArray[5] = myText;
    }
}