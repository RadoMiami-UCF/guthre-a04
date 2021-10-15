package baseline;

import java.util.Scanner;

public class Solution43 {
    private static final Scanner in = new Scanner(System.in, "UTF_8");

    public static void main(String[] args) {
        //First, ask for the site name.
        //Then, ask for the author.
        //Then, ask if they want a folder for JavaScript and CSS.
        //Then, pass these parameters into a new WebsiteBuilder object named websiteBuilder.
        //Finally, use websiteBuilder.createDirectories to create the directories.
    }

    private String askThenReturnString(String askString) {
        System.out.print(askString);
        return in.nextLine();
    }
}
