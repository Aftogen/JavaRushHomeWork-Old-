package com.javarush.test.level20.lesson02.task01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Читаем и пишем в файл: Human
Реализуйте логику записи в файл и чтения из файла для класса Human
Поле name в классе Human не может быть пустым
В файле your_file_name.tmp может быть несколько объектов Human
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static class A {
        String a = "A.a";
        static  String b = "A.b";
        public static void staticA(){
            System.out.println("staticA");
        }
        public String nonstaticA() {
            return "nonstaticA";
        }
    }
    public static class B extends A{
        String a = "B.a";
        static  String b = "B.b";
        String c = "B.c";
        @Override
        public String nonstaticA() {
            return "nonstaticB";
        }
    }
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
       /* try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            System.out.println(somePerson.name + " " + somePerson.assets.get(0).getName()+" "+somePerson.assets.get(0).getPrice()+" "+
                    somePerson.assets.get(1).getName()+" "+somePerson.assets.get(1).getPrice());
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }*/

    }


    public static class Human {
        public String name="default";
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(this.name);
            if (assets.size()>0){
                for (int i=0; i<assets.size();i++){
                    printWriter.println(assets.get(i).getName());
                    printWriter.println(assets.get(i).getPrice());
                }
            }
            printWriter.close();
            outputStream.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            this.name = reader.readLine();
            while (reader.ready()){
                Asset asset = new Asset(reader.readLine());
                asset.setPrice(Double.parseDouble(reader.readLine()));
                this.assets.add(asset);
            }
            reader.close();
            inputStream.close();
        }
    }
}
