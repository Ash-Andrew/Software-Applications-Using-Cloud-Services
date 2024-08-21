package edu.wgu.d387_sample_code.message;

import org.aspectj.bridge.IMessage;

import java.util.Locale;
import java.util.ResourceBundle;

public class DisplayMessage implements Runnable{
    private Locale locale;
    private String message;

    public DisplayMessage(Locale locale) {
        this.locale = locale;
    }

    public String getMessage() {
        if (message == null) {
            ResourceBundle bundle = ResourceBundle.getBundle("welcome", locale);
            message = bundle.getString("welcomeMessage");
        }
        return message;
    }

    @Override
    public void run() {
        System.out.println(getMessage());
    }
}
