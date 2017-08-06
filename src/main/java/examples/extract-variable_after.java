package examples;

class ExtractVariableAfter{
    private String platform;
    private String browser;
    private int resize;

    public ExtractVariableAfter(String platform, String browser, int resize) {
        this.platform = platform;
        this.browser = browser;
        this.resize = resize;
    }

    void renderBanner() {
        final boolean isMacOs = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResized = resize > 0;

        if (isMacOs && isIE && wasInitialized() && wasResized) {
            // do something
        }
    }

    private boolean wasInitialized() {
        return Math.random() < 0.5;
    }
}
