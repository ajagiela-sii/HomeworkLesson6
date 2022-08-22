public enum WebTitle {
    
    SII ("Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska"),
    ONET ("Onet – Jesteś na bieżąco"),
    KOTUSZKOWO ("Kotuszkowo- blog o kotach"),
    FILMWEB("Filmweb - filmy takie jak Ty!"),
    SELENIUM("WebDriver | Selenium");

    private final String title;

    WebTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
