package i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

class LocalizationServiceImplTest {

    @Test
    void returnMessage() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String expectedText = "Добро пожаловать";
        Assertions.assertEquals(expectedText, localizationService.locale(Country.RUSSIA));
    }
}