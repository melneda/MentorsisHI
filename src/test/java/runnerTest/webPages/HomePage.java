package runnerTest.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.BasePage;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends ElementUtil{
    private By feature=By.cssSelector("a.ekit-menu-nav-link.menu-link");
    private By featureheader=By.xpath("//h1[contains(text(),'Features')]");
    private By blogclass=By.xpath("//div[@class='infobox-content eael-icon-only']");


    public  String homepagegettitle(){
        String title=BasePage.get().getTitle();
        Assert.assertEquals(title,"Mentorsis – Goal Software to Achieve More by Doing Less");
        return title;
    }
    public void isfeatureEnabled(){
        boolean featurebutton= isElementEnabled(feature);
        System.out.println(featurebutton);
    }
    public void clickfeature(){
    clickOn(feature);
    }

    public void getcollection(){
        List<WebElement> Bloglist= BasePage.get().findElements(blogclass);
        System.out.println(Bloglist.size());
        for (int i = 0; i<Bloglist.size();i++) {
            System.out.println(Bloglist.get(i).getText());
        }
        }
   public void getheader(){
        String header=BasePage.get().findElement(featureheader).getText();
        Assert.assertEquals(header,"FEATURE");





    }
}
