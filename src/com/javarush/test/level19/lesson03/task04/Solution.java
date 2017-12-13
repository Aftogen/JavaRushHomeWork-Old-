package com.javarush.test.level19.lesson03.task04;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке.
Метод read() должен читать данные одного человека.
*/

public class Solution {


    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner scanner;


        public PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException{
            String[] list = scanner.nextLine().split(" ");
            Calendar date = new GregorianCalendar(Integer.parseInt(list[5]),Integer.parseInt(list[4])-1, Integer.parseInt(list[3]));
            Person person = new Person(list[1], list[2], list[0], date.getTime());
            System.out.println(person.toString());
            return person;
            //Person(String firstName, String middleName, String lastName, Date birthDate)
            //String.format("%s %s %s %s", lastName, firstName, middleName, birthDate.toString());
            }

        @Override
        public void close() throws IOException {
            this.scanner.close();
        }
    }

    public static void main(String[] args) throws IOException{
        PersonScannerAdapter test = new PersonScannerAdapter(new Scanner(System.in));
        test.read();
    }
}
