import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YandexPage extends PageObject {

    @FindBy(xpath = "//input[contains(@aria-label,'Запрос')]")
    private WebElement searchBar;

    @FindBy(xpath = "//div[contains(@class,'search2__button')]/button")
    private WebElement searchButton;

    @FindBy(xpath = "//ul[contains(@aria-label,'Результаты поиска')]/li[2]/div/h2/a")
    private WebElement secondLink;

    public void setRequestText(String requestText){
        this.searchBar.sendKeys(requestText);
    }

    public void clickSearchButton(){
        this.searchButton.click();
    }

    public void clickSecondLink(){
        this.secondLink.click();
    }

    public YandexPage(WebDriver driver) {
        super(driver);
    }
}
