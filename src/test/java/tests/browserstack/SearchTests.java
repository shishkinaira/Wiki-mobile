package tests.browserstack;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {

    @Test
    @Tag("Android")
    void successfulSearchTest() {
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Verify content found", () -> $$(id("org.wikipedia.alpha:id/search_container")).
                shouldHave(sizeGreaterThan(0)));
    }

    @Test
    @Tag("Android")
    void errorPageTest() {
        step("Click on article", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/view_featured_article_card_article_title")).click();
        });
        step("Verify error page open", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/view_wiki_error_text")).
                    shouldHave(text("An error occurred"));
        });
    }

    @Test
    @Tag("Android")
    void addLanguageTest() {
        step("Сlick on the search bar", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
        });
        step("Go to language change tab", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_lang_button")).click();
            $(AppiumBy.className("android.widget.ImageView")).click();
        });
        step("Select language", () -> {
            $$(AppiumBy.className("android.widget.TextView")).findBy(text("Français")).click();
        });
        step("Make sure the selected language is added", () -> {
            $$(AppiumBy.className("android.widget.TextView")).findBy(text("Français")).
                    shouldBe(visible);
        });
    }
}