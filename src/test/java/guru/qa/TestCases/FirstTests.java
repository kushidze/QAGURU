//package guru.qa.TestCases;
//
//import com.codeborne.selenide.Configuration;
//import org.junit.jupiter.api.*;
//
//import static com.codeborne.selenide.Browsers.EDGE;
//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;
//
//public class FirstTests2 () {
////    @BeforeAll
////    static void beforeAll() {
////        System.out.println("//Test starts();");
////    }
//
//    @AfterAll
//    static void afterAll() {
//        System.out.println("//Test Ends();");
//    }
//
//    @BeforeEach
//    void beforeEach() {
//        open("https://www.google.com/");
//        System.out.println("//takeScreenBefore();");
//    }
//
//    @AfterEach
//    void afterEach() {
//        System.out.println("//takeScreenAfter();");
//    }
//
//    @Test
//    void selenideFirstTests() {
//        Configuration.browser = EDGE;
//        //Ввести 'selenide.org'
//        $("[name=q]").setValue("Selenide.org").pressEnter();
//        $("[id=search]").shouldHave(text("selenide.org"));
//        //Проверка результата поиска
////        Assertions.assertTrue(true);
//    }
//
//    @Test
//    void selenideSecondTests() {
//        Configuration.browser = EDGE;
//        //Ввести 'selenide.org'
//        $("[name=q]").setValue("Selenide.org").pressEnter();
//        $("[id=search]").shouldHave(text("selenide.org"));
//        //Проверка результата поиска
////        Assertions.assertTrue(true);
//    }
//
//}
//
//
