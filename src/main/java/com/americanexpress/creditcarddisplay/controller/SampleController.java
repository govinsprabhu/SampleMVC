package com.americanexpress.creditcarddisplay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 609600403 on 25/06/2017.
 */
@Controller
public class SampleController {

    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {
        System.out.println("request ");
        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from SampleController.java **********</div><br><br>";
        System.out.println(message);
        return new ModelAndView("welcome", "message", message);
    }

}
