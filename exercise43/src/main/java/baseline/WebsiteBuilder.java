package baseline;

public class WebsiteBuilder {
    private static final String DEFAULT_PATH_TO_WEBSITE_LOCATION = "data";
    private String pathToWebsiteLocation = DEFAULT_PATH_TO_WEBSITE_LOCATION;
    private String siteName;
    private String authorName;
    private boolean wantsJavaScriptFolder;
    private boolean wantsCSSFolder;

    public WebsiteBuilder(String siteNameIn, String authorNameIn, boolean wantsJavaScriptFolderIn,
                          boolean wantsCSSFolderIn) {
        //Set all the instance variables to their respective parameters.
        this.siteName = siteNameIn;
        this.authorName = authorNameIn;
        this.wantsJavaScriptFolder = wantsJavaScriptFolderIn;
        this.wantsCSSFolder = wantsCSSFolderIn;
    }

    public WebsiteBuilder(String siteNameIn, String authorNameIn, boolean wantsJavaScriptFolderIn,
                          boolean wantsCSSFolderIn, String pathToWebsiteLocationIn) {
        //If a specific path to the desired website location is given, then set pathToWebsiteLocation to it.
        this.pathToWebsiteLocation = pathToWebsiteLocationIn;
        new WebsiteBuilder(siteNameIn, authorNameIn, wantsJavaScriptFolderIn, wantsCSSFolderIn);
    }

    public void createDirectories() {
        //First, create the folder website/siteName.
        //Then, create the index.html by using makeHTML.
        //Finally, create the JavaScript and CSS folders if applicable.
        //(Also, print that every step of the way has been completed.)
    }

    private void makeHTML() {
        //First, create the file website/siteName/index.html.
        //Then, populate the title and meta tags with the siteName and authorName.
    }
}
