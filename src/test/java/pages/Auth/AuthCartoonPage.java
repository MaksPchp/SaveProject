package pages.Auth;

import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthCartoonPage {
        WebDriver driver;

        // Коллекция дисней
        @FindBy(xpath = "//a[@data-eventitemid='5189']")
        private WebElement disneyCollection;
        // Коллекция пикчерзбокс
        @FindBy(xpath = "//a[@data-eventitemid='5190']")
        private WebElement pictureboxCollection;
        // Коллекция парамаонт
        @FindBy(xpath = "//a[@data-eventitemid='5191']")
        private WebElement paramountCollection;
        // Коллекция сони
        @FindBy(xpath = "//a[@data-eventitemid='5219']")
        private WebElement sonyCollection;
        // Главный заголовок страницы
        @FindBy(xpath = "//h1[@class='watch-films ng-binding']")
        private WebElement h1ForCartoons;
        // Коллекция от 3 лет
        @FindBy(xpath = "//p[@translate='V2.MOVIE.AGE_COLLECTIONS_1']")
        private WebElement collection3years;
        // Коллекция от 8 лет
        @FindBy(xpath = "//p[@translate='V2.MOVIE.AGE_COLLECTIONS_2']")
        private WebElement collection8years;
        // Коллекция для подростков
        @FindBy(xpath = "//p[@translate='V2.MOVIE.AGE_COLLECTIONS_3']")
        private WebElement collectionForChildren;
        // Коллекция для всей семьи
        @FindBy(xpath = "//p[@translate='V2.MOVIE.AGE_COLLECTIONS_4']")
        private WebElement collectionForAllFamily;



        public AuthCartoonPage() {
            this.driver = DriverProvider.getDriver();
            PageFactory.initElements(driver,this);
        }

        public WebElement getDisneyCollection(){
            return disneyCollection;
        }

        public WebElement getPictureboxCollection(){
            return pictureboxCollection;
        }

        public WebElement getParamountCollection(){
            return paramountCollection;
        }

        public WebElement getSonyCollection(){
            return sonyCollection;
        }

        public WebElement getH1ForCartoons(){
            return h1ForCartoons;
        }

        public WebElement getCollection3years() {
            return collection3years;
        }

        public WebElement getCollection8years() {
            return collection8years;
        }

        public WebElement getCollectionForChildren() {
            return collectionForChildren;
        }

        public WebElement getCollectionForAllFamily() {
            return collectionForAllFamily;
        }
}

