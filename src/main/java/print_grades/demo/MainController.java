package print_grades.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping ("/")
    public String print_grade()
    {

        int testScore = 0;
        int scorePercentage = 0;
        String letterGrade = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter test score.");
        testScore = keyboard.nextInt();
        scorePercentage = testScore * 2;


        if (scorePercentage >= 90) {
            letterGrade = "A";
        }
        else if (scorePercentage >= 80) {
            letterGrade = "B";
        }
        else if (scorePercentage >= 70) {
            letterGrade = "C";
        }
        else if (scorePercentage >= 60) {
            letterGrade = "D";
        }
        else if (scorePercentage <= 50) {
            letterGrade = "F";
        }

        String displayGrade = "The grade letter for a test score of " + testScore + " is " + letterGrade + ".";

        System.out.println();
        return displayGrade;

    }



    }

