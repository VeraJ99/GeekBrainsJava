package Lesson7.project;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaseView {

    private Controller controller = new Controller();

    public void runInterfase(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите название города:");
            String city = scanner.nextLine();
            System.out.println("Введите 1 для получения прогноза на 1 день;"+"Введите 5 для получения прогноза на 5 дней;"+ "Введите 0 для завершения.");
            String command = scanner.nextLine();

            //Сделать метод валидации пользовательского ввода

            if("0".equals(command))
                break;

            boolean equals1= "1".equals(command);
            boolean equals5= "5".equals(command);
           // System.out.println(equals1);
           // System.out.println(equals5);
           if(equals1 == false && equals5 == false ) {
                System.out.println("Прогноз можно получить только на 1 или 5 дней. Повторите запрос корректно");
                runInterfase();
            }

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    }
