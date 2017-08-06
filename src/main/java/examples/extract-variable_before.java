package examples;

class ExtractVariableBefore{
    private String platform;
    private String browser;
    private int resize;

    public ExtractVariableBefore(String platform, String browser, int resize) {
        this.platform = platform;
        this.browser = browser;
        this.resize = resize;
    }

    void renderBanner() {
        if ((platform.toUpperCase().indexOf("MAC") > -1) &&
                (browser.toUpperCase().indexOf("IE") > -1) &&
                wasInitialized() && resize > 0 )
        {
            // do something
        }
    }

    private boolean wasInitialized() {
        return Math.random() < 0.5;
    }
}