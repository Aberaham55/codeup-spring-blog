package com.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class DiceController {
    private Random rnd = new Random();

    @GetMapping("/roll-dice")
    public String showRollDIce(){
        return "rolldice";
    }
    @GetMapping("roll-dice/{guess}")
    public String showRollDIce(@PathVariable int guess, Model model) {
        List<String> messages = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String message = rollDieAndCreateMessage(guess);
            messages.add(message);
        }

        model.addAttribute("messages", messages);
        return "rolldice";
    }
    private String rollDieAndCreateMessage(int guess) {
        //generating a number between 1 and 6
        int roll = rnd.nextInt(6);//returns a number from 0 to 5
        roll++;//shifts it to a number from 1 to 6

        String message = String.format("You guessed %d. The roll is %d. ", guess, roll);
        if (guess == roll) {
            message += "you guessed correctly";
        } else {
            message += "loser";
        }
        return message;
    }

}
