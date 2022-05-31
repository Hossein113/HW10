package maktab74.practice.org;

import maktab74.practice.org.Base.util.ApplicationContent;
import maktab74.practice.org.Base.util.ShowMenu;
import maktab74.practice.org.domain.User;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        ApplicationContent applicationContent = new ApplicationContent();
        applicationContent.getFileWriter();
        applicationContent.getUserRepository();

        String countiniu = "y";
        while (countiniu.equalsIgnoreCase("y")) {
            ShowMenu.showName();
            String name = applicationContent.getStringScanner().nextLine();
            ShowMenu.showService();
            String service = applicationContent.getStringScanner().nextLine();
            ShowMenu.showAmount();
            String amount = applicationContent.getStringScanner().nextLine();

            User user = new User(name, service, amount);

            //user.setName(name);
            // user.setService(service);
            // user.setAmount(amount);

            applicationContent.getUserService().save(user);

            ShowMenu.showCountinu();
            countiniu = applicationContent.getStringScanner().nextLine();
        }
    }
}
