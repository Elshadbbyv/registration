package az.iktlab.util;

import az.iktlab.model.Gender;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Validator {

    public static String doHashPassword(String password){

        try{
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(password.getBytes(StandardCharsets.UTF_8));
            byte [] resultArr = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte c: resultArr) {
                sb.append(String.format("%02x",c));
            }
            return sb.toString();
        }catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static Gender validateGender(String gender) {
        try {
            if (gender.equals("MALE"))
                return Gender.MALE;
            else if (gender.equals("FEMALE"))
                return Gender.FEMALE;
            else throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Enter valid gender name. (example: MALE/FEMALE)");
        }
        return null;
    }
}
