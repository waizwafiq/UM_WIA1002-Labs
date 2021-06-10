package LabTest2;

public class TesterA {
    public static void main(String[] args) {
        System.out.println("\n\n!!PART A!!");
        //PART A
        Stack raw = new Stack("Raw list");
        raw.push("ali", 32, "m", "doctor");
        raw.push("lisa", 29, "f", "nurse");
        raw.push("tanaka", 41);
        raw.push("ahmad", 18, "m", "developer");
        raw.push("maria", 20, "f", "accountant");
        raw.push("chong", 70, "m", "lawyer");
        raw.push("raju", 55, "m", "police");
        raw.push("alex", 16, "f", "business man ");
        Person katie = new Person("katie", 36, "f", "teacher");
        raw.push(katie);
        raw.displayStack();


        System.out.println("\n\n!!PART B!!");
        //PART B
        Stack frontliners = new Stack("frontliners");
        Stack others = new Stack("others");

        int size = raw.getSize();
        //DIFFERENTIATING FRONTLINERS AND OTHERS
        /* I traverse through the raw list stack, then check if the person
        is a frontliner or not using the isFrontliner() method,
        if yes: push into the frontliner stack
        else  : push into the others stack
         */
        for (int i = 0; i < size; i++) {
            Person temp = raw.pop();
            if (temp.isFrontliner())
                frontliners.push(temp);
            else
                others.push(temp);
        }
        frontliners.displayStack();
        others.displayStack();


        System.out.println("\n\n!!PART C!!");
        //PART C
        Stack priority = new Stack("Vaccine Priority List");

        /*Since frontliners are prioritized, they'll be on top of the stack, so
         * we will go through "others" stack first then we'll sort them in ascending
         * order because when pushed into the priority stack, it'll be stacked descendingly.
         */

        /*THIS IS THE PART WHERE I SORT THE OTHERS ARRAY BASED ON AGE*/
        Person[] tempArr = others.toArray();
        Person temp;
        //BUBBLE SORT
        for (int i = 0; i < tempArr.length; i++) {
            for (int j = 1; j < tempArr.length - i; j++) {
                if (tempArr[j - 1].getAge() > tempArr[j].getAge()) {
                    temp = tempArr[j - 1];
                    tempArr[j - 1] = tempArr[j];
                    tempArr[j] = temp;
                }
            }
        }

        for (int i = 0; i < tempArr.length; i++) {
            //after sorting the temp array, we'll push it into the stack
            priority.push(tempArr[i]);
        }


        /*THIS IS THE PART WHERE I SORT THE FRONTLINERS ARRAY BASED ON AGE*/
        tempArr = frontliners.toArray();
        //BUBBLE SORT
        for (int i = 0; i < tempArr.length; i++) {
            for (int j = 1; j < tempArr.length - i; j++) {
                if (tempArr[j - 1].getAge() > tempArr[j].getAge()) {
                    temp = tempArr[j - 1];
                    tempArr[j - 1] = tempArr[j];
                    tempArr[j] = temp;
                }
            }
        }

        for (int i = 0; i < tempArr.length; i++) {
            //after sorting the temp array, we'll push it into the stack
            priority.push(tempArr[i]);
        }
        frontliners.displayStack();
        System.out.println();
        others.displayStack();
        System.out.println();
        priority.displayStack();
    }
}
