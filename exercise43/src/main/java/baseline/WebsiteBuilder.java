/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebsiteBuilder {
    private final Path htmlPath;
    private final Path pathToWebsite;
    private final String siteName;
    private final String authorName;
    private final boolean wantsJavaScriptFolder;
    private final boolean wantsCSSFolder;

    public WebsiteBuilder(String siteNameIn, String authorNameIn, boolean wantsJavaScriptFolderIn,
                          boolean wantsCSSFolderIn, String pathToWebsiteLocationIn) {
        //Set all the instance variables to their respective parameters.
        this.siteName = siteNameIn;
        this.authorName = authorNameIn;
        this.wantsJavaScriptFolder = wantsJavaScriptFolderIn;
        this.wantsCSSFolder = wantsCSSFolderIn;
        //Then, set the path to the website folder to the given path.
        this.pathToWebsite = Paths.get(pathToWebsiteLocationIn + "/website/" + this.siteName);
        this.htmlPath = Paths.get(this.pathToWebsite + "/index.html");
    }

    public void buildWebsite() {
        try {
            //First, create the folder website/siteName.
            Files.createDirectories(this.pathToWebsite);
            sayCreatedDirectory(this.pathToWebsite);
            //Then, create the index.html by using makeHTML.
            makeHTML();
            sayCreatedDirectory(this.htmlPath);
            //Finally, create the JavaScript and CSS folders if applicable.
            if(this.wantsJavaScriptFolder) {
                Files.createDirectories(Paths.get(this.pathToWebsite + "/js"));
                sayCreatedDirectory(Paths.get(this.pathToWebsite + "/js/"));
            }

            if(this.wantsCSSFolder) {
                Files.createDirectories(Paths.get(this.pathToWebsite + "/css"));
                sayCreatedDirectory(Paths.get(this.pathToWebsite + "/css/"));
            }

        } catch (IOException exception) {
            logIOException(exception);
        }
    }

    private static void sayCreatedDirectory(Path inPath) {
        System.out.println("Created " + inPath.toString());
    }

    private void makeHTML() {
        //First, create the file website/siteName/index.html.
        try {
            if(!Files.exists(this.pathToWebsite)) {
                Files.createDirectories(this.pathToWebsite);
                var logger = Logger.getLogger("IOExceptionLogger");
                logger.log(Level.WARNING, "Parent directory did not exist!");
            }

            if(!Files.exists(this.htmlPath)) {
                Files.createFile(this.htmlPath);
            }
        } catch (IOException exception) {
            logIOException(exception);
        }
        //Then, build an HTML file with the title and meta tags populated with the siteName and authorName.
        try(var output = Files.newBufferedWriter(this.htmlPath)) {
            output.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "\n<head>\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <title>" + this.siteName + "</title>\n" +
                    "    <meta name=\"author\" content=\"" + this.authorName + "\">\n" +
                    "</head>\n" +
                    "</html>");

        } catch (IOException exception) {
            logIOException(exception);
        }
    }

    private static void logIOException(IOException exception) {
        var logger = Logger.getLogger("IOExceptionLogger");
        logger.log(Level.SEVERE, "Unforeseen I/O error!", exception);
    }
}
