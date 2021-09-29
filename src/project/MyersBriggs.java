package project;

import java.util.Arrays;
import java.util.Scanner;

public class MyersBriggs {
    public static String [] questions;
    public static char [] answer;



    public static void main(String[] args){
        //saveQuestions();
        printQuestions();
        displayAnswer();
        calculateResult();



    }

    public static String [] saveQuestions(){
        System.out.println("This is Myers Briggs questionaire");
        System.out.println("For every question has an answer between option A or B pick one");
        String [] questions = {
                """
                 Question 1
                 A-expend energy, enjoy groups.
                 B-conserve energy, enjoy one-on-one.
                 """,
                """ 
                 Question 2
                 A-interpret literally.
                 B-look for meaning and possibilities.
                 """,
                """
                 Question 3.
                 A-logical, thinking, questioning.
                 B-empathetic, feeling, accommodating.
                 """,
                """
                 Question 4.
                 A-organized, orderly.
                 B-flexible, adaptable.
                 """,
                """
                 Question 5
                 A-more outgoing, think out loud.
                 B-more reserve, think to think to yourself.
                 """,
                """
                 Question 6
                 A-pratical, realistic, experinmental.
                 B-imaginative, innovative, theoretical.
                 """,
                """
                Question 7
                A-candid, straight forward, frank.
                B-tactful, kind, encouraging.
                """,
                """
                Question 8
                A-plan schedule.
                B-unplanned spontaneous.
                """,
                """
                Question 9.
                A-seek many tasks, public activities, interaction with others.
                B-seek private, solitary activities with quiet to concentrate.
                """,
                """
                Question 10.
                A-standard, usual, conventional.
                B-different, novel, unique.
                """,
                """
                question 11.
                A-firm, tend criticize, hold the line.
                B-gentle, tend to appreciate, conciliate.
                """,
                """
                Question 12.
                A-Regulated, structured.
                B-easygoing "live" and "let live".
                """,
                """
                Question 13.
                A-external, communicative, express yourself.
                B-internal, reticent, keep to yourself.
                """,
                """
                Question 14.
                A-focus on here-and-now.
                B-look to the future, global perspective, "big picture".
                """,
                """
                Question 15.
                A-tough-minded, just.
                B-tender-hearted, merciful.
                """,
                """
                Question 16.
                A-preparation, plan ahead.
                B-go with the flow, adapt as you go.
                """,
                """
                Question 17
                A-active, initiate.
                B-reflective deliberate.
                """,
                """
                Question 18.
                A-facts, things, "what is".
                B-ideas, dreams,"what could be," philosophical.
                """,
                """
                Question 19.
                A-matter of fact, issue-oriented.
                B-sensitive, people-oriented, compassionate.
                """,
                """
                Question 20.
                A-control, govern.
                B-latitude freedom.
                """
        };
        return questions;
    }
    public static void printQuestions(){
        questions = saveQuestions();
        Scanner input = new Scanner(System.in);
        answer = new char[questions.length];
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            char collectorAnswer = input.next().charAt(0);
            System.out.println("pick an answer between A and B for what describe you best.");

            answer[i] = collectorAnswer;
            System.out.println(answer);
        }

    }


    public static void displayTable() {
        System.out.println("=".repeat(70));
        String main = String.format("%5s%5s%5s", " ", "A", "B");
        System.out.println(main.repeat(4));
        System.out.println("=".repeat(70));

    }
    public static void displayAnswer(){
        displayTable();
        for (int i = 1; i < questions.length; i+=4) {
            System.out.printf("%5d", i);
            if(answer[i-1] == 'A' || answer[i-1] == 'a'){
                System.out.printf("%5s%5s",'A'," ");
            }else{
                System.out.printf("%5s%5s", " ", 'B');
            }
            System.out.printf("%5d",i+1);
            if(answer[i] == 'A' || answer[i] == 'a'){
                System.out.printf("%5s%5s",'A'," ");
            }else {
                System.out.printf("%5s%5s", " ", 'B');
            }
            System.out.printf("%5d", i+2);
            if(answer[i+1] == 'A' || answer[i+1] == 'a'){
                System.out.printf("%5s%5s",'A'," ");
            }else{
                System.out.printf("%5s%5s", " ", 'B');
            }
            System.out.printf("%5d",i+3);

            if(answer[i+2] == 'A' || answer[i+2] == 'a'){
                System.out.printf("%5s%5s",'A'," ");
            }else{
                System.out.printf("%5s%5s", " ", 'B');
            }
            System.out.println();
        }

    }

    public static void calculateResult() {
        String[] personalityTypes = new String[4];
        int countsForAs = 0;
        int countsForBs = 0;
        System.out.println("=".repeat(70));
        System.out.printf("%5s", "Total");
        for (int i = 0; i < 4; i++) {
            countsForAs = 0;
            countsForBs = 0;
            if (answer[i] == 'A' || answer[i] == 'a') {
                countsForAs++;
            } else {
                countsForBs++;
            }
            if (answer[i + 4] == 'A' || answer[i + 4] == 'a') {
                countsForAs++;
            } else {
                countsForBs++;
            }
            if (answer[i + 8] == 'A' || answer[i + 8] == 'a') {
                countsForAs++;
            } else {
                countsForBs++;
            }
            if (answer[i + 12] == 'A' || answer[i + 12] == 'a') {
                countsForAs++;
            } else {
                countsForBs++;
            }
            if (answer[i + 16] == 'A' || answer[i + 16] == 'a') {
                countsForAs++;
            } else {
                countsForBs++;
            }


            switch (i) {
                case 0 -> {
                    if (countsForAs > countsForBs) {
                        personalityTypes[i] = "Extrovert";
                    } else {
                        personalityTypes[i] = "Introvert";
                    }
                }
                case 1 -> {
                    if (countsForAs > countsForBs) {
                        personalityTypes[i] = "Sensing";
                    } else {
                        personalityTypes[i] = "Intuition";
                    }
                }
                case 2 -> {
                    if (countsForAs > countsForBs) {
                        personalityTypes[i] = "Thinking";
                    } else {
                        personalityTypes[i] = "Feeling";
                    }
                }
                case 3 -> {
                    if (countsForAs > countsForBs) {
                        personalityTypes[i] = "Judging";
                    } else {
                        personalityTypes[i] = "Perceiving";
                    }
                }
            }
            System.out.printf("%5d%5d%5s", countsForAs, countsForBs, " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(personalityTypes));
        }
    }