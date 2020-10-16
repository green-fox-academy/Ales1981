package com.greenfoxacademy.springstart;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class WebGreetCounterApp {
    private static AtomicInteger counter = new AtomicInteger();
    private Random randNum = new Random();
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    public WebGreetCounterApp() {
    }

    public String[] getHellos() {
        return hellos;
    }

    public static int getCounter() {
        return counter.get();
    }

    public String getRandomHello(){
        int someHelloNumber = randNum.nextInt(hellos.length);
        return hellos[someHelloNumber];
    }

    public int greetCount(){
        while (true){
            int existingValue = getCounter();
            int newValue = existingValue + 1;
            if (counter.compareAndSet(existingValue, newValue)){
                return newValue;
            }
        }
    }
}
