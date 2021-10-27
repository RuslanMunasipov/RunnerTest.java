package StepDefenition;

import io.cucumber.java.ru.Когда;

import java.util.Scanner;

public class TestSteps {

        @Когда("^Пользователь вводит x$")
            public static int getX(){
            Scanner x = new Scanner(System.in);
            return 0;
            }
        @Когда("^Пользователь вводит y$")
            public static int getY(){
            Scanner y = new Scanner(System.in);
            return 0;
        }
        @Когда("^Получить сумму$")
        public static int getSum(){
            int x = getX();
            int y = getY();
            int sum = (x + y);
            return x;
        }
        @Когда("^Получить результат$")
        public static void getResult(){
            int sum = getSum();
            System.out.println(sum);
        }

}
