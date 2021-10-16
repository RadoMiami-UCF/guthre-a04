/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public final class Solution43 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private final String siteName;
    private final String author;
    private final boolean wantsJavaScriptFolder;
    private final boolean wantsCSSFolder;

    private Solution43(String inSiteName, String inAuthor, boolean inWantsJavaScriptFolder, boolean inWantsCSSFolder) {
        this.siteName = inSiteName;
        this.author = inAuthor;
        this.wantsJavaScriptFolder = inWantsJavaScriptFolder;
        this.wantsCSSFolder = inWantsCSSFolder;
    }

    public static void main(String[] args) {
        //First, create an instance of Solution43.
        //Then, ask for the site name. Then, for the author. Then, if they want a folder for JavaScript and CSS.
        //(Both of the above are handled in the constructor)
        var app = new Solution43(askThenReturnString("Site name: "), askThenReturnString("Author: "),
                askThenReturnBoolean("Do you want a folder for JavaScript? "),
                askThenReturnBoolean("Do you want a folder for CSS? "));
        //Then, pass these parameters into a new WebsiteBuilder object named websiteBuilder.
        var websiteBuilder = new WebsiteBuilder(app.siteName, app.author, app.wantsJavaScriptFolder,
                app.wantsCSSFolder, "data");
        //Finally, use websiteBuilder.createDirectories to create the directories.
        websiteBuilder.buildWebsite();
    }

    private static String askThenReturnString(String askString) {
        System.out.print(askString);
        return in.nextLine();
    }

    private static boolean askThenReturnBoolean(String askString) {
        System.out.print(askString);
        return "y".equalsIgnoreCase(in.nextLine());
    }
}
