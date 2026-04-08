package tests;

import org.testng.annotations.BeforeMethod;

public class BaseMarketsTest extends BaseTest {

    protected String baseUrl;

    @BeforeMethod
    public void init() {
        baseUrl = "https://capital.com";
    }
}