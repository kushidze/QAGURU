package guru.qa.page;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBox {
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = CHROME;
        Configuration.startMaximized = true;
    }
    @AfterAll
    static void afterAll () {
        System.out.println("Test завершен");
    }

    @Test
    void fillForm() {
        //Тестируем раздел "Text"
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Kush");
        $("#userEmail").setValue("kush78@gms.kz");
        $("#currentAddress").setValue("almatycity 123kjs");
        $("#permanentAddress").setValue("astana 123kjs");
        $("#submit").click();

        //Проверяем что данные отобразились
        $("#output").$("#name").shouldHave(text("Kush"));
        $("#output").$("#email").shouldHave(text("kush78@gms.kz"));
        $("#output").$("#currentAddress").shouldHave(text("almatycity 123kjs"));
        $("#output").$("#permanentAddress").shouldHave(text("astana 123kjs"));

        //$("#output").shouldHave(text("Kush")), (text("kush78@gms.kz")), (text("almatycity 123kjs")), (text("astana 123kjs"));

    }

}




