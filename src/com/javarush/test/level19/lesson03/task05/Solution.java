package com.javarush.test.level19.lesson03.task05;

import java.util.HashMap;
import java.util.Map;

/* Закрепляем адаптер
Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
*/

public class Solution {
    private static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU",  "Russia");
        countries.put("CA", "Canada");
    }

    public static class DataAdapter implements RowItem {
        String countryCode = "UA";
        String company = "JavaRush Ltd.";
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String numPhone = "+38(050)123-45-67";
        
        
        private Customer customer = new Customer() {
            @Override
            public String getCompanyName() {
                return company;
            }

            @Override
            public String getCountryName() {
                return countries.get(countryCode);
            }
        };
        
        private Contact contact = new Contact() {
            @Override
            public String getName() {
                return lastName + ", " + firstName;
            }

            @Override
            public String getPhoneNumber() {
                return numPhone;  //// TODO: 17.10.2016  
            }
        };

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            return countryCode;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] list = contact.getName().split(", ");
            return list[1];
        }

        @Override
        public String getContactLastName() {
            String[] list = contact.getName().split(", ");
            return list[0];
        }

        @Override
        public String getDialString() {

            return  "callto://+" + contact.getPhoneNumber().replaceAll("[^0-9]", "");
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}