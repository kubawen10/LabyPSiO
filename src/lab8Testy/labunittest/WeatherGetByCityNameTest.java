package lab8Testy.labunittest;

import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.assertThrows;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherGetByCityNameTest {
    @Test
    public void testInvalidParameters(){
        WeatherDownloader tester = new WeatherDownloader();
        UrlObject url = new UrlParser().parseUrl("http://d.com/pathNoCityParam");
        assertThrows(InvalidParameterException.class, () -> {
            tester.getByCityName(url);
        });
    }

    @Test
    public void testHTTPException(){
        WeatherDownloadWorker weatherDownloadWorkerMock = mock(WeatherDownloadWorker.class);


        WeatherDownloader tester = new WeatherDownloader();
        tester.weatherDownloadWorker = weatherDownloadWorkerMock;
        when(weatherDownloadWorkerMock.downloadData()).thenReturn(false);

        UrlObject url = new UrlParser().parseUrl("http://d.com/path?city=wroclaw");

        assertThrows(HTTPException.class, () -> {
            tester.getByCityName(url);
        });
    }
}
