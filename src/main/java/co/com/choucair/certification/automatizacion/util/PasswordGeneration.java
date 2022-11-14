package co.com.choucair.certification.automatizacion.util;

import co.com.choucair.certification.automatizacion.tasks.CreatePassword;
import java.security.SecureRandom;

public class PasswordGeneration extends CreatePassword {

    public static String passwordGeneration(int pdwLength){

        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&\'()*+,-./:;<=>?@[]^_`{|}~";

        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < pdwLength; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        return (sb.toString());
    }
}
