import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

public class TestBase {

    private static Logger logger = LoggerFactory.getLogger(TestBase.class);
    protected WebDriver driver;
    protected TestInfo testInfo;

    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
        logger.info("Driver setup correctly");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
    }

    @BeforeEach
    void setUp(TestInfo testInfo) {
        this.testInfo = testInfo;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger.info("Window maximized");
    }

    @AfterEach
    void tearDown() {
        logger.info("Attempting to close the Web driver");
        try {
            driver.quit();
            logger.info("Web driver closed successfully");
        }  catch (Exception e) {
            logger.error("The web driver has not been closed! " + e);
        }
    }

    protected String getWebsiteTitle(String webURL) {
        try {
            driver.get(webURL);
            return driver.getTitle();
        } catch (Exception e) {
            logger.error(webURL + " does not exist!");
        }
    return "";
    }


}
