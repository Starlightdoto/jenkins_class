package tests.random_data;

import java.util.Random;

public class RandomUtil {

    public String[] months = {"January", "February", "March", "April",
            "May", "June", "July", "August", "September",
            "October", "November", "December"};

    public String[] subjects = {"Maths", "Accounting", "Arts", "Social Studies"};

    public String[] hobbies = {"Sports", "Reading", "Music"};

    public String pickDate() {
        int rnd = new Random().nextInt(months.length);
        return months[rnd];
    }

    public String pickSubj() {
        int rnd = new Random().nextInt(subjects.length);
        return subjects[rnd];
    }

    public String pickHobbie() {
        int rnd = new Random().nextInt(hobbies.length);
        return hobbies[rnd];
    }



}
