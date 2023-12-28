package com.salesforce.practice07;

public class PhoneApp {

    public static void main(String[] args) {

        Phone phone = new SmartPhone();
        phone.execute("앱");
        phone.execute("음악");
        phone.execute("통화");
       
        Phone phone2 = new SmartPhone();
        phone2.execute("앱");
        phone2.execute("음악");
    }


}
