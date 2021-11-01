package guru.qa.page;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBox {

    String username = "Kairow";
    String useremail = "kush78@gms.kz";
    String currentaddress = "almatycity 123kjs";
    String permamentaddress = "astana 123kjs";

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @AfterAll
    static void afterAll() {

        System.out.println("Test завершен");
    }

    @Test
    void fillForm() {
        //Тестируем раздел "Text"
        open("https://demoqa.com/text-box");
        $("#userName").setValue(username);
        $("#userEmail").setValue(useremail);
        $("#currentAddress").setValue(currentaddress);
        $("#permanentAddress").setValue(permamentaddress);
        $("#submit").click();

        //Проверяем что данные отобразились
        $("#output").$("#name").shouldHave(text(username));
        $("#output").$("#email").shouldHave(text(useremail));
        $("#output").$("#currentAddress").shouldHave(text(currentaddress));
        $("#output").$("#permanentAddress").shouldHave(text(permamentaddress));

        //$("#output").shouldHave(text("Kush")), (text("kush78@gms.kz")), (text("almatycity 123kjs")), (text("astana 123kjs"));

    }

}




