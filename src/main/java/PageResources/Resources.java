package PageResources;

import java.util.Random;

public class Resources {
    public static int generateRandomEmailNumber() {
        Random random = new Random();
        return random.nextInt(1, 10000);
    }

    public static int generateRandomPhoneNumber() {
        Random random = new Random();
        return random.nextInt(111111111, 999999999);
    }

    public static int generateRandomGenderIndex() {
        Random random = new Random();
        return random.nextInt(1, 3);
    }
    public static int generateRandomSubscribeIndex() {
        Random random = new Random();
        return random.nextInt(0, 2);
    }

    // Common
    public static final String HomePageURL = "https://staging-career-180.com/en/home";
    public static final String First_name = "Nour";
    public static final String Last_name = "Hanafy";
    public static final String Password = "Pa$$w0rd!";
    public static final String JobTitle = "General Manager";
    public static final String PromoCode = "Quosvoluptatequia";

    // Learner
    public static final String Learner_PhoneNumber = String.valueOf(generateRandomPhoneNumber());
    public static final String Learner_Email = First_name + Last_name + generateRandomEmailNumber() + "@teml.net";

    // Expert
    public static final String Expert_PhoneNumber = String.valueOf(generateRandomPhoneNumber());
    public static final String Expert_Email = First_name + Last_name + generateRandomEmailNumber() + "@teml.net";
    public static final String LinkedInAccount = "https://www.linkedin.com/in/" + First_name + Last_name;

    // Corporate
    public static final String Corporate_PhoneNumber = String.valueOf(generateRandomPhoneNumber());
    public static final String Corporate_Email = First_name + Last_name + generateRandomEmailNumber() + "@teml.net";
    public static final String CorporateName = "United " + Corporate_Email;
    // Set of Logos to be used as corporate logo
    private static final String[] CorporateLogos = {
            "D:\\Career 180\\Career-180\\Staging\\Test Data\\Images\\Sponsors, Corporates\\Ik37TT0PbcTz3kv3iZTXMb7cGZm8UJ-metaZmluYWxsbGxsbGxsbGxsbGwtbG9nZ2dnZ2dnZ28tZGFya2sucG5n-.png",
            "D:\\Career 180\\Career-180\\Staging\\Test Data\\Images\\Sponsors, Corporates\\01JF8KBRHZ4DEDNM0ETJDYF0SW.png",
            "D:\\Career 180\\Career-180\\Staging\\Test Data\\Images\\Sponsors, Corporates\\3BbJfQyPoQuZCMBWRLubeQ49siesVj-metaYmx1ZS5wbmc=-.png",
            "D:\\Career 180\\Career-180\\Staging\\Test Data\\Images\\Sponsors, Corporates\\cXW2J5j1ZXIU9MX8omRb3P7t1eHBoQ-metaNC5wbmc=-.png",
            "D:\\Career 180\\Career-180\\Staging\\Test Data\\Images\\Sponsors, Corporates\\01JF8K8RCFNZJV3B7EAKG44XAJ.jpeg",
            "D:\\Career 180\\Career-180\\Staging\\Test Data\\Images\\Sponsors, Corporates\\Cit.jpg",
            "D:\\Career 180\\Career-180\\Staging\\Test Data\\Images\\Sponsors, Corporates\\01JF8JVAXC1J0N3QJG2SZAEBRW.png",
    };

    public static String SelectCorporateLogo() {
        Random random = new Random();
        int index = random.nextInt(CorporateLogos.length); // Generate a random index
        return CorporateLogos[index]; // Select the string at the random index
    }

    // Login Credentials
    public static final String Login_Email = "NourHanafy7598@teml.net"; // This Email should be changed after Success subscribe process

}
