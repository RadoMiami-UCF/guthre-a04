/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static java.nio.file.Files.readAllLines;
import static org.junit.jupiter.api.Assertions.*;

class WebsiteBuilderTest {

    @Test
    void testCreateDirectoriesWithNoScriptFolders() {
        var testWebsiteBuilder = new WebsiteBuilder("createDirectoriesNoScriptFoldersTest", "Jim",
                false, false, "data/unittests");
        testWebsiteBuilder.buildWebsite();
        assertTrue(Files.exists(Path.of("data/unittests/website/createDirectoriesNoScriptFoldersTest")),
                "Root directory of website not created!");
        assertTrue(Files.exists(Path.of("data/unittests/website/createDirectoriesNoScriptFoldersTest/index.html")),
                "index.html not created!");
        assertFalse(Files.exists(Path.of("data/unittests/website/createDirectoriesNoScriptFoldersTest/js")),
                "JavaScript folder created when it shouldn't have!");
        assertFalse(Files.exists(Path.of("data/unittests/website/createDirectoriesNoScriptFoldersTest/css")),
                "CSS folder created when it shouldn't have!");
    }

    @Test
    void testCreateDirectoriesWithBothScriptFolders() {
        var testWebsiteBuilder = new WebsiteBuilder("createDirectoriesBothScriptFoldersTest",
                "Tim", true, true, "data/unittests");
        testWebsiteBuilder.buildWebsite();
        assertTrue(Files.exists(Path.of("data/unittests/website/createDirectoriesBothScriptFoldersTest")),
                "Root directory of website not created!");
        assertTrue(Files.exists(Path.of("data/unittests/website/createDirectoriesBothScriptFoldersTest/index.html")),
                "index.html not created!");
        assertTrue(Files.exists(Path.of("data/unittests/website/createDirectoriesBothScriptFoldersTest/js")),
                "JavaScript folder not created when it should have been!");
        assertTrue(Files.exists(Path.of("data/unittests/website/createDirectoriesBothScriptFoldersTest/css")),
                "CSS folder not created when it should have been!");
    }

    /*This test is for a method that is now private. Make the method public to use the test.
    @Test
    void testMakeHTML() throws IOException {
        var testWebsiteBuilder = new WebsiteBuilder("testName", "testAuthor",
                true, true, "data/unittests");
        testWebsiteBuilder.makeHTML();
        assertLinesMatch(List.of("<!DOCTYPE html>", "<html lang=\"en\">", "", "<head>",
                "    <meta charset=\"utf-8\">", "    <title>testName</title>",
                "    <meta name=\"author\" content=\"testAuthor\">", "</head>", "</html>"),
                readAllLines(Path.of("data/unittests/website/testName/index.html")),
                "Reference HTML and generated HTML do not match!");
    }*/
}