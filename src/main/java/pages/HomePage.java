package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
public class HomePage extends AbstractPage {

    @FindBy(css = "[href=\"http://127.0.0.1:8000/login\"]")
    WebElementFacade loginButton;

    @FindBy(xpath = "//a[contains(text(), 'Register')]")
    WebElementFacade signUpButton;
}
