import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Browsers.EDGE;
import static com.codeborne.selenide.Browsers.FIREFOX;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void selenideSearchTests() {
        Configuration.browser = EDGE;
        //Открыть гугл
        open("https://www.google.com/");
        //Ввести 'selenide.org'
        $("[name=q]").setValue("Selenide.org").pressEnter();
        $("[id=search]").shouldHave(text("selenide.org"));
        //Проверка результата поиска
    }

}


