package Utils.Messages;

public class ErrorMessages {
    private static String incorrectUserName = "Your username is invalid!";
    private static String incorrectPassword = "Your password is invalid!";

    public static String getIncorrectUsernameText(){
        return incorrectUserName;
    }
    public static String getIncorrectPasswordText(){
        return incorrectPassword;
    }

}
