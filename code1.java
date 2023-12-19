import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected String url;
    protected String browser;

    @Parameters({"url", "browser"})
    @BeforeMethod
    public void setUp(String url, String browser) {
        this.url = url;
        this.browser = browser;
        // Code to initialize the driver
    }
}