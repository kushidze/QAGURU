package guru.qa.page;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = CHROME;
        Configuration.startMaximized = true;
        System.out.println("Test запущен");

    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test успешно завершен");
        sleep(5000);
    }

    @Test
    void practiceForm() {
        //Тестируем раздел "PracticeForm"
        open("https://demoqa.com/automation-practice-form");
        $("#userName-wrapper").$("#firstName").setValue("Timur");
        $("#userName-wrapper").$("#lastName").setValue("Abylaev");
//        $("#userEmail-wrapper").$("#userEmail").setValue("Abylaev93@ccoc.ua");
//        $("#genterWrapper").$("#gender-radio-1").doubleClick();
//        $("#genterWrapper").$("#gender-radio-2").doubleClick();
//        $("#genterWrapper").$("#gender-radio-3").doubleClick();
//        $("#userNumber-wrapper").$("#userNumber").setValue("9996435667");
        $("#dateOfBirth").$("#dateOfBirthInput").click();
        $x("//option[text()='September']").click();
        $x("//option[text()='1992']").click();
        $x("//div[@aria-label='Choose Monday, September 7th, 1992']").click();
        $("#subjectsContainer").$("#subjectsInput").setValue("QA Automation course");
//        $("#hobbiesWrapper").$("#hobbies-checkbox-1").click();
//        $("#hobbiesWrapper").$("#hobbies-checkbox-2").click();
        $(".form-control-file").sendKeys("C:/testFile01.txt");
        $("#currentAddress-wrapper").$("#currentAddress").setValue("Abay st.44, 26/1, dsds332");




//        Проверяем что данные отобразились
        /*$("#output").$("#name").shouldHave(text("Kush"));
        $("#output").$("#email").shouldHave(text("kush78@gms.kz"));
        $("#output").$("#currentAddress").shouldHave(text("almatycity 123kjs"));
        $("#output").$("#permanentAddress").shouldHave(text("astana 123kjs"));*/

        //$("#output").shouldHave(text("Kush")), (text("kush78@gms.kz")), (text("almatycity 123kjs")), (text("astana 123kjs"));

    }

}




