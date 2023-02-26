package infrastructure;

import domain.EmailService;
import domain.User;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AngusEmailService implements EmailService {

    private Logger logger = LoggerFactory.getLogger("email-service");

    public AngusEmailService() {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.mailtrap.io");
        prop.put("mail.smtp.port", "25");
        prop.put("mail.smtp.ssl.trust", "smtp.mailtrap.io");
    }

    @Override
    public void sendVerificationEmailTo(User user) {
        logger.info("Sending email to {}", user.email());
    }
}
