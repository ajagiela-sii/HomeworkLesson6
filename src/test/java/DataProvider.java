import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class DataProvider {

    private static Stream<Arguments> siiData() {
        return Stream.of(Arguments.of("Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska"));
    }

    private static Stream<Arguments> onetData() {
        return Stream.of(Arguments.of("Onet – Jesteś na bieżąco"));
    }

    private static Stream<Arguments> kotuszkowoData() {
        return Stream.of(Arguments.of("Kotuszkowo- blog o kotach"));
    }

    private static Stream<Arguments> filmwebData() {
        return Stream.of(Arguments.of("Filmweb - filmy takie jak Ty!"));
    }

    private static Stream<Arguments> seleniumData() {
        return Stream.of(Arguments.of("WebDriver | Selenium"));
    }



}
