import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.assertj.core.api.Assertions.assertThat;

public class WebsitesTitleTest extends TestBase {

    private static Logger logger = LoggerFactory.getLogger(WebsitesTitleTest.class);

    @ParameterizedTest
    @EnumSource(value = WebTitle.class, names = {"SII"})
    @Tag("regresja")
    @Tag("sii")
    @DisplayName("Checking title for sii.pl")
    void checkTitleForSii(WebTitle expectedTitle) {
        logger.info("Starting test " + testInfo.getTestMethod());
        String actualTitle = getWebsiteTitle("https://www.sii.pl");
        logger.debug("Sii title " + actualTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle.toString());
    }

    @ParameterizedTest
    @EnumSource(value = WebTitle.class, names = {"ONET"})
    @Tag("regresja")
    @Tag("onet")
    @DisplayName("Checking title for onet.pl")
    void checkTitleForOnet(WebTitle expectedTitle) {
        logger.info("Starting test " + testInfo.getTestMethod());
        String actualTitle = getWebsiteTitle("https://www.onet.pl");
        logger.debug("Onet title " + actualTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle.toString());
    }

    @ParameterizedTest
    @EnumSource(value = WebTitle.class, names = {"KOTUSZKOWO"})
    @Tag("regresja")
    @Tag("kotuszkowo")
    @DisplayName("Checking title for kotuszkowo.pl")
    void checkTitleForKotuszkowo(WebTitle expectedTitle) {
        logger.info("Starting test " + testInfo.getTestMethod());
        String actualTitle = getWebsiteTitle("http://kotuszkowo.pl/");
        logger.debug("Kotuszkowo title: " + actualTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle.toString());
    }

    @ParameterizedTest
    @EnumSource(value = WebTitle.class, names = {"FILMWEB"})
    @Tag("regresja")
    @Tag("filmweb")
    @DisplayName("Checking title for filmweb.pl")
    void checkTitleForFilmweb(WebTitle expectedTitle) {
        logger.info("Starting test " + testInfo.getTestMethod());
        String actualTitle = getWebsiteTitle("https://www.filmweb.pl/");
        logger.debug("Filmweb title " + actualTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle.toString());
    }

    @ParameterizedTest
    @EnumSource(value = WebTitle.class, names = {"SELENIUM"})
    @Tag("regresja")
    @Tag("selenium")
    @DisplayName("Checking title for selenium.dev")
    void checkTitleForSelenium(WebTitle expectedTitle) {
        logger.info("Starting test " + testInfo.getTestMethod());
        String actualTitle = getWebsiteTitle("https://www.selenium.dev/documentation/en/webdriver/");
        logger.debug("Selenium title " + actualTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle.toString());
    }
}
