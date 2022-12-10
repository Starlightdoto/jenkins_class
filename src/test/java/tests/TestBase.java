package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.RegistrationPage;

public class TestBase {

    RegistrationPage regPage = new RegistrationPage();

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1200";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = false;
    }

    @BeforeEach
    public void addListener(){
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    public void addAttachments() {

    }
}
