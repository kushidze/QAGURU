package guru.qa.page;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.collections.ItemWithText;
import com.codeborne.selenide.commands.PressEnter;
import com.codeborne.selenide.commands.UploadFile;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.File;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    String firstName = "Timur";
    String lastName = "Abylaev";
    String email = "Abylaev93@ccoc.ua";
    String gender = "Male";
    String userNumber = "9996435667";
    String dateofBirth = "07 September,1992";
    String subject = "Chemistry, Arts";
    String uploadFile = "testFile1.jpg";
    String hobbies1 = "Sports";
    String hobbies2 = "Music";
    String currentAddress = "Abay st.44, 26/1, dsds332";
    String state = "Uttar Pradesh";
    String city = "Agra";

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void practiceForm() {
        //Open "PracticeForm"
        open("https://demoqa.com/automation-practice-form");
        //Form checking
        $(byText("Student Registration Form")).shouldBe(visible);

        //Test user data check
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);

        //Gender check
        $(byText(gender)).click();

        //Mob.number check
        $("#userNumber").setValue(userNumber);

        //Date of birth check
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionContainingText("September");
        $(".react-datepicker__year-select").selectOptionByValue("1992");
        $$(".react-datepicker__day").find(text("7")).click();

        //Subject check
        $("#subjectsInput").setValue("ch");
        $(byText("Chemistry")).click();
        $("#subjectsInput").setValue("ar");
        $(byText("Arts")).click();

        //Hobbies check
        $(byText(hobbies1)).click();
        $(byText(hobbies2)).click();

        //File upload check
        $("#uploadPicture").uploadFromClasspath(uploadFile);

        //Current address check
        $("#currentAddress").setValue(currentAddress);

        //Select state
        $("#state").click();
        $(byText(state)).click();
        //Select city
        $("#city").click();
        $(byText(city)).click();

        //Submit form
        $("#submit").click();
        //Submit validation
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        //FormFill Check
        $$(byXpath("//td")).shouldHave(itemWithText(firstName + " " + lastName), itemWithText(email), itemWithText(gender), itemWithText(userNumber), itemWithText(dateofBirth), itemWithText(subject), itemWithText(hobbies1 + ", " + hobbies2), itemWithText(uploadFile), itemWithText(currentAddress), itemWithText(state + " " + city));

    }

}




