package definitions;

import cucumber.api.java.Before;

import static net.serenitybdd.core.Serenity.getWebdriverManager;

/**
 * Created by Ardit Podrimaj
 */

public class Hooks {

    @Before
    public void setup() {
        getWebdriverManager().getWebdriver().manage().window().maximize();
        getWebdriverManager().getWebdriver().get("http://127.0.0.1:8000/");
    }
}