package LabTest2;

public class Person {
    private String name, gender, occupation;
    private int age;
    private boolean frontliner = false;
    final private String[] occupation_list = {"doctor", "nurse", "teacher", "police"};

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        this.age = age;
        setFrontliner();
    }

    public void setFrontliner() {
        for (String occ : occupation_list) {
            if (occ.equalsIgnoreCase(occupation)) {
                frontliner = true;
                return;
            }
        }
        frontliner = false;
    }

    public String toString() {
        String isFL;
        if (frontliner)
            isFL = "Frontliner";
        else
            isFL = "Not frontliner";

        return name + " " + age + " " + gender + " " + isFL;
    }

    public boolean isFrontliner() {
        return frontliner;
    }

    public int getAge() {
        return age;
    }
}
