import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;



public class GithubFindElement {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize= "2560x1440";
    }

    @Test
    void findText(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".wiki-more-pages-link > button").click();
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $("#wiki-wrapper").shouldHave(text("com.codeborne.selenide.junit.SoftAsserts"));
    }
}



