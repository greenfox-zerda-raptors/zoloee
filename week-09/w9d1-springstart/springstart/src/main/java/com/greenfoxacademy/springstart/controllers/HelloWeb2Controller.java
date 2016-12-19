package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by zoloe on 2016. 12. 19..
 */
@Controller
public class HelloWeb2Controller {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    final AtomicLong counter = new AtomicLong (1);

    @RequestMapping("/web2/greeting")
    public String greeting(Model model) {
        randomColor randomColor = new randomColor();
        Random rand = new Random(); // for sizes
        long id = counter.incrementAndGet();

        String[] colors = new String[hellos.length];
        Integer[] sizes = new Integer[hellos.length];
        int i = 0;
        for (String h:
             hellos) {
            colors[i] = randomColor.getRandomColor();
            sizes[i] = rand.nextInt(30) + 6;
            i++;
        }
            model.addAttribute("colors",colors);
            model.addAttribute("sizes",sizes);
            model.addAttribute("hellos",hellos);

        return "greetingInDifferentSizesAndColors";
    }
}
