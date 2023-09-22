package tests.browserstack;

import com.codeborne.selenide.Configuration;
import drivers.LocalDriver;
import drivers.BrowserstackDriver;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.logevents.SelenideLogger;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {

    public static String testType = System.getProperty("testType");

    @BeforeAll
    public static void setup() {
        if (testType == null) {
            testType = "browserstack";
        }

        switch (testType) {
            case "android":
                Configuration.browser = LocalDriver.class.getName();
                System.out.println("local test start");
                break;
            case "browserstack":
                Configuration.browser = BrowserstackDriver.class.getName();
                System.out.println("remote test start");
                break;
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        String sessionId = sessionId().toString();
        Attach.pageSource();

        closeWebDriver();

        Attach.addVideo(sessionId);
    }
}
