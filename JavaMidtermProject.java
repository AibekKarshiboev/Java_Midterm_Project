import java.util.Scanner;

class JavaMidtermProject {

    JavaMidtermProject(){
        some();
    }

    public void some (){
        Integer abc = 0;
        System.out.print("Hi, please write your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("\n" + name + " Answer only 'yes' or 'no' \n");

        System.out.print("Do you do home bookkeeping?\n" +
                "Do you tend to look at receipts in stores, compare with the prices that you?" +
                " seen in the shop windows? Do you count how much you spent? : ");
        String first = sc.nextLine();
        if (first.equals("yes")){
            ++abc;
        }

        System.out.print("\nIs it easy to make you laugh? : ");
        String second = sc.nextLine();
        if (second.equals("yes")){
            ++abc;
        }

        System.out.print("\n" +
                "Do you believe that after the black streak of fate, there is always white? : ");
        String third = sc.nextLine();
        if (third.equals("yes")){
            ++abc;
        }

        System.out.print("\nDo you like fast driving? : ");
        String four = sc.nextLine();
        if (four.equals("yes")){
            ++abc;
        }

        System.out.print("\nYou like vegetables more than meat? : ");
        String fifth = sc.nextLine();
        if (fifth.equals("да")){
            ++abc;
        }

        System.out.print("\nYou are always kind to others.? : ");
        String six = sc.nextLine();
        if (six.equals("yes")){
            ++abc;
        }

        System.out.print("\n Do you like to take risks? " +
                "Are you ready to put everything you have on the line? : ");
        String seven = sc.nextLine();
        if (seven.equals("yes")){
            ++abc;
        }

        System.out.print("\nDo you lose your temper when you are angry? : ");
        String eight = sc.nextLine();
        if (eight.equals("yes")){
            ++abc;
        }

        System.out.print("\nIs your ideal vacation with friends? : ");
        String nine = sc.nextLine();
        if (nine.equals("yes")){
            ++abc;
        }

        System.out.print("\n Do you like to dream?: ");
        String ten = sc.nextLine();
        if (ten.equals("yes")){
            ++abc;
        }

        System.out.print("\n Can you stay in one position for a long time?: ");
        String eleventh = sc.nextLine();
        if (eleventh.equals("yes")){
            ++abc;
        }

        System.out.print("\n The alarm is ringing " +
                "Do you get up right away or do you laze in bed for a while?: \n");
        String twelve = sc.nextLine();
        if (twelve.equals("yes")){
            ++abc;
        }

        if (abc <=4 ){
            System.out.println("\n" +
                    "Introverts are people who are often tense internally.\n" +
                    " They are comfortable with themselves, in their own world, and wherever there are \"strangers\", they feel like a guest. \n");
        }
        else if (abc > 4  && abc <= 8){
            System.out.println("There is one more personality type - ambivert.\n" +
                    " This is a person who has absorbed the features of both types.\n" +
                    " As a rule, these are people who have clear traits of an introvert or extrovert, while in some moments of behavior, character, lifestyle - they differ.\n");
        }
        else {
            System.out.println("Extroverts are born communicators, people who get bored alone.\n" +
                    " They are cheerful, purposeful, love risky events, and often reckless.\n" +
                    " More often - they are friendly to other people, but they can also be quick-tempered.\n");
        }

        System.out.println("Thanks " + name + " for attention!!!");

    }



    public static void main(String[] args) {
        JavaMidtermProject pr = new JavaMidtermProject();



    }
}