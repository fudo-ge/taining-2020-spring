package example.training.ctrl2;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controll2 {

    @GetMapping("/standard")
    public String hello(Model model, @RequestParam(name = "waitSec", defaultValue = "0") int waitSec) {

    	model.addAttribute("acceptedTime", LocalDateTime.now());

    	String next;
        try {
            heavyProcessing(waitSec, model);
            next = "ctrl2/complete";
        } catch (Exception e) {
            next = "ctrl2/error";
        }

        return next;
    }

    private void heavyProcessing(int waitSec, Model model) {

        if (waitSec == 999) {
            throw new IllegalStateException("Special parameter for confirm error.");
        }

        try {
            TimeUnit.SECONDS.sleep(waitSec);
        } catch (InterruptedException e) {
            Thread.interrupted();
        }
        model.addAttribute("completedTime", LocalDateTime.now());

    }
}