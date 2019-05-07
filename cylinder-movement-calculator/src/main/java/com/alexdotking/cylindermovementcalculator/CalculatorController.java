package com.alexdotking.cylindermovementcalculator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CalculatorController {

    @Value("${defaultBore:1}")
    private String defaultBore;

    @Value("${defaultStroke:1}")
    private String defaultStroke;

    @RequestMapping(value = "/getDefaultBoreAndStroke", method = RequestMethod.GET)
    public String getDefaultBoreAndStroke() {
        return "defaultBore:" + defaultBore + "\ndefaultStroke:" + defaultStroke;
    }
}
