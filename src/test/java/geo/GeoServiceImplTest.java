package geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;


class GeoServiceImplTest {

    @Test
    void returnLocation() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location expectedLocation = new Location("", Country.RUSSIA, "", 0);
        Country expectedCountry = expectedLocation.getCountry();
        Country resultTestCountry = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();
        Assertions.assertEquals(expectedCountry, resultTestCountry);
    }
}
