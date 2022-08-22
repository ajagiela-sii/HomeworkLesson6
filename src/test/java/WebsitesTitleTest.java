import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class WebsitesTitleTest extends TestBase{

    @ParameterizedTest
    @MethodSource("DataProvider#siiData")
    @Tag("regresja")
    @Tag("sii")
    @DisplayName("Checking title for sii.pl")
    void checkTitleForSii(String expectedTitle){;
        String actualTitle = getWebsiteTitle("https://www.sii.pl");
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @MethodSource("DataProvider#onetData")
    @Tag("regresja")
    @Tag("onet")
    @DisplayName("Checking title for onet.pl")
    void checkTitleForOnet(String expectedTitle){;
        String actualTitle = getWebsiteTitle("https://www.onet.pl");
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @MethodSource("DataProvider#kotuszkowoData")
    @Tag("regresja")
    @Tag("kotuszkowo")
    @DisplayName("Checking title for kotuszkowo.pl")
    void checkTitleForKotuszkowo(String expectedTitle){;
        String actualTitle = getWebsiteTitle("http://kotuszkowo.pl/");
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @MethodSource("DataProvider#filmwebData")
    @Tag("regresja")
    @Tag("filmweb")
    @DisplayName("Checking title for filmweb.pl")
    void checkTitleForFilmweb(String expectedTitle){;
        String actualTitle = getWebsiteTitle("https://www.filmweb.pl/");
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @MethodSource("DataProvider#seleniumData")
    @Tag("regresja")
    @Tag("selenium")
    @DisplayName("Checking title for selenium.dev")
    void checkTitleForSelenium(String expectedTitle){;
        String actualTitle = getWebsiteTitle("https://www.selenium.dev/documentation/en/webdriver/");
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}
