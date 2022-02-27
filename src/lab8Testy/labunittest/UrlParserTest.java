package lab8Testy.labunittest;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;

public class UrlParserTest {

    @Test
    public void testParseSchemeRuntimeException(){
        UrlParser tester = new UrlParser();
        assertThrows(RuntimeException.class, () -> {
            tester.parseUrl("brakPrzedrostka.com");
        });
    }

    @Test
    public void testParseSchemeGood(){
        UrlParser tester = new UrlParser();
        assertEquals("http://", tester.parseUrl("http://poprawnyPrzedrostek").getScheme());
    }

    @Test
    public void parseFullAdressNoPathTest(){
        UrlParser tester = new UrlParser();
        assertEquals("brak", tester.parseUrl("http://brak").getFullAddress());
    }

    @Test
    public void testParseFullAdressGoodAdress(){
        UrlParser tester = new UrlParser();
        assertEquals("poprawny.com", tester.parseUrl("http://poprawny.com/kozak").getFullAddress());
    }

    @Test
    public void testParseFullPathNoQM(){
        UrlParser tester = new UrlParser();
        assertEquals("/path/path", tester.parseUrl("http://poprawny.com/path/path").getPath());
    }

    @Test
    public void testParseFullPathWithQuestionMark(){
        UrlParser tester = new UrlParser();
        assertEquals("/path/path", tester.parseUrl("http://d.com/path/path?Param=00").getPath());
    }

    @Test
    public void testParseParameters(){
        UrlParser tester = new UrlParser();
        Map<String, String> params = new HashMap<>();
        params.put("param1", "wartosc1");
        assertEquals(params, tester.parseUrl("https://d.om/patth/path?param1=wartosc1").getParameters());
    }

    @Test
    public void testParseParametersNoParameters(){
        UrlParser tester = new UrlParser();
        Map<String, String> noParams = new HashMap<>();

        assertEquals(noParams, tester.parseUrl("http://d.com/path/path").getParameters());
    }



}
