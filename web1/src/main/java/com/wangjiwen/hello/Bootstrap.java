package com.wangjiwen.hello;

public class Bootstrap {
    public static void main(String[] args) {
        Person person = new Person();
        SayHello sayHello = new SayHello();
        //person.setSayHello(sayHello);
        person.speak("you are the apple of my eye");

    }
}
