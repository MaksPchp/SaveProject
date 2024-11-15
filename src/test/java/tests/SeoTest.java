package tests;
import driver.DriverProvider;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import testNgRunner.TestNgRunner;
import java.sql.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static constants.Constants.*;
import static java.util.Collections.replaceAll;
import static javax.swing.text.html.CSS.getAttribute;
import static org.testng.AssertJUnit.fail;

public class SeoTest extends TestNgRunner {


    @Description("Проверка Faq, на каналах")
    @Test
    public void verifyFaqOnTheChannels() throws ClassNotFoundException, SQLException{

        String url = "jdbc:mysql://Duration.ofSeconds(10).18.0.1Duration.ofSeconds(10):3306";
        String user = "channel_user";
        String password = "6a1LHDGD1VxKcUla";

        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT faq.id, faq.channel_id, faqt.title, faqt.text, faqt.locale FROM channel_list.channels_faq AS faq\n" +
                "LEFT JOIN channel_list.channels_faq_translations AS faqt ON faqt.channel_faq_id = faq.id";

        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        List<ArrayList<String>> mass = new ArrayList<>();
        while (rs.next()) {
            ArrayList<String> massTest = new ArrayList<>();
            massTest.add(0, String.valueOf(rs.getInt(1)));
            massTest.add(1, String.valueOf(rs.getInt(2)));
            massTest.add(2, rs.getString(3));
            massTest.add(3, rs.getString(4));
            massTest.add(4, rs.getString(5));
            mass.add(0, massTest);
        }

        int idChangeUk = 0;
        for (int j = 0; j < mass.size(); j++){
            if (idChangeUk != Integer.parseInt(mass.get(j).get(1))){
                idChangeUk = Integer.parseInt(mass.get(j).get(1));
                DriverProvider.getDriver().get(URL_TV_PAGE_UKRAINE);
                DriverProvider.getDriver().findElement(By.xpath("//li[@data-channel-id='" + mass.get(j).get(1) + "']")).click();
            }
            if(Objects.equals(mass.get(j).get(1), "479")) {

            }else if (Objects.equals(mass.get(j).get(4), "uk")){
                System.out.println(mass.get(j).get(1));
                System.out.println(mass.get(j).get(2));
                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//*[text()='" + mass.get(j).get(2) + "']/../.."))));
                Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//*[text()='" + mass.get(j).get(2) + "']/../..")).isDisplayed());
            }
        }

        int idChangeRu = 0;
        for (int j = 0; j < mass.size(); j++){
            if (idChangeRu != Integer.parseInt(mass.get(j).get(1))){
                idChangeRu = Integer.parseInt(mass.get(j).get(1));
                DriverProvider.getDriver().get(URL_TV_PAGE_RUSSIA);
                DriverProvider.getDriver().findElement(By.xpath("//li[@data-channel-id='" + mass.get(j).get(1) + "']")).click();
            }
            if(Objects.equals(mass.get(j).get(1), "479")){

            }else if (Objects.equals(mass.get(j).get(4), "ru")){
                System.out.println(mass.get(j).get(1));
                System.out.println(mass.get(j).get(2));
                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//*[text()='" + mass.get(j).get(2) + "']/../.."))));
                Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//*[text()='" + mass.get(j).get(2) + "']/../..")).isDisplayed());
            }
        }

        int idChangeEn = 0;
        DriverProvider.getDriver().get(URL_TV_PAGE_ENGLISH);
        for (int j = 0; j < mass.size(); j++){
            if (idChangeEn != Integer.parseInt(mass.get(j).get(1))){
                idChangeEn = Integer.parseInt(mass.get(j).get(1));
                DriverProvider.getDriver().get(URL_TV_PAGE_ENGLISH);
                DriverProvider.getDriver().findElement(By.xpath("//li[@data-channel-id='" + mass.get(j).get(1) + "']")).click();
            }
            if(Objects.equals(mass.get(j).get(1), "479")){

            }else if (Objects.equals(mass.get(j).get(4), "en") && Objects.equals(mass.get(j).get(1),"479")){

            }else if (Objects.equals(mass.get(j).get(4), "en") && Objects.equals(mass.get(j).get(1),"397")){

            }else if (Objects.equals(mass.get(j).get(4), "en") && Objects.equals(mass.get(j).get(1),"349")){

            }else if(Objects.equals(mass.get(j).get(4), "en")){
                System.out.println(mass.get(j).get(1));
                System.out.println(mass.get(j).get(2));
                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//*[text()='" + mass.get(j).get(2) + "']/../.."))));
                Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//*[text()='" + mass.get(j).get(2) + "']/../..")).isDisplayed());
            }
        }
    }

    @Description("Проверка актеров, на каналах")
    @Test
    public void verifyActorsOnTheChannels() throws ClassNotFoundException, SQLException{

        String url = "jdbc:mysql://Duration.ofSeconds(10).18.0.1Duration.ofSeconds(10):3306";
        String user = "channel_user";
        String password = "6a1LHDGD1VxKcUla";

        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT act.id, act.channel_id, act.img, actt.name, actt.alt, actt.locale, actt.title, actt.url FROM channel_list.channels_anchorman AS act\n" +
                "LEFT JOIN channel_list.channels_anchorman_translations AS actt ON actt.channel_anchorman_id = act.id";

        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        List<ArrayList<String>> mass = new ArrayList<>();
        while (rs.next()) {
            ArrayList<String> massTest = new ArrayList<>();
            massTest.add(0, String.valueOf(rs.getInt(1))); // id
            massTest.add(1, String.valueOf(rs.getInt(2))); // id channel
            massTest.add(2, rs.getString(3)); // img
            massTest.add(3, rs.getString(4)); // name
            massTest.add(4, rs.getString(5)); // alt
            massTest.add(5, rs.getString(6)); // locale
            massTest.add(6, rs.getString(7)); // title
            massTest.add(7, rs.getString(8)); // url
            mass.add(0, massTest);
        }

        int idChangeUk = 0;
        for (int j = 0; j < mass.size(); j++) {
            if (idChangeUk != Integer.parseInt(mass.get(j).get(1))) {
                idChangeUk = Integer.parseInt(mass.get(j).get(1));
                DriverProvider.getDriver().get(URL_TV_PAGE_UKRAINE);
                DriverProvider.getDriver().findElement(By.xpath("//li[@data-channel-id='" + mass.get(j).get(1) + "']")).click();
            }
            if (Objects.equals(mass.get(j).get(1), "479")) {

            } else if (Objects.equals(mass.get(j).get(5), "uk")) {
                System.out.println(mass.get(j).get(1));
                System.out.println(mass.get(j).get(3));
                System.out.println(mass.get(j).get(2));

                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//img[@src='" + mass.get(j).get(2) + "']"))));
                Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//img[@src='" + mass.get(j).get(2) + "']")).isDisplayed());

                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//*[text()=\"" + mass.get(j).get(3) + "\"]/../.."))));
                Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//*[text()=\"" + mass.get(j).get(3) + "\"]/../..")).isDisplayed());
            }
        }

        int idChangeRu = 0;
        for (int j = 0; j < mass.size(); j++) {
            if (idChangeRu != Integer.parseInt(mass.get(j).get(1))) {
                idChangeRu = Integer.parseInt(mass.get(j).get(1));
                DriverProvider.getDriver().get(URL_TV_PAGE_RUSSIA);
                DriverProvider.getDriver().findElement(By.xpath("//li[@data-channel-id='" + mass.get(j).get(1) + "']")).click();
            }
            if (Objects.equals(mass.get(j).get(1), "479")) {

            } else if (Objects.equals(mass.get(j).get(5), "ru")) {
                System.out.println(mass.get(j).get(1));
                System.out.println(mass.get(j).get(3));
                System.out.println(mass.get(j).get(2));

                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//img[@src='" + mass.get(j).get(2) + "']"))));
                Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//img[@src='" + mass.get(j).get(2) + "']")).isDisplayed());

                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//*[text()=\"" + mass.get(j).get(3) + "\"]/../.."))));
                Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//*[text()=\"" + mass.get(j).get(3) + "\"]/../..")).isDisplayed());
            }
        }

        int idChangeEn = 0;
        DriverProvider.getDriver().get(URL_TV_PAGE_ENGLISH);
        for (int j = 0; j < mass.size(); j++) {
            if (idChangeEn != Integer.parseInt(mass.get(j).get(1))) {
                idChangeEn = Integer.parseInt(mass.get(j).get(1));
                DriverProvider.getDriver().get(URL_TV_PAGE_ENGLISH);
                DriverProvider.getDriver().findElement(By.xpath("//li[@data-channel-id='" + mass.get(j).get(1) + "']")).click();
            }
            if (Objects.equals(mass.get(j).get(1), "479")) {

            } else if (Objects.equals(mass.get(j).get(5), "en") && Objects.equals(mass.get(j).get(1), "479")) {

            } else if (Objects.equals(mass.get(j).get(5), "en") && Objects.equals(mass.get(j).get(1), "397")) {

            } else if (Objects.equals(mass.get(j).get(5), "en") && Objects.equals(mass.get(j).get(1), "349")) {

            } else if (Objects.equals(mass.get(j).get(5), "en")) {
                System.out.println(mass.get(j).get(1));
                System.out.println(mass.get(j).get(3));
                System.out.println(mass.get(j).get(2));

                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//img[@src='" + mass.get(j).get(2) + "']"))));
                Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//img[@src='" + mass.get(j).get(2) + "']")).isDisplayed());

                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
                        .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//*[text()=\"" + mass.get(j).get(3) + "\"]/../.."))));
                Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//*[text()=\"" + mass.get(j).get(3) + "\"]/../..")).isDisplayed());
            }
        }
    }


    @Description("Проверка Faq, на каналах")
    @Test(timeOut = 180000)
    public void test() throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://Duration.ofSeconds(10).18.0.1Duration.ofSeconds(10):3306";
        String user = "channel_user";
        String password = "6a1LHDGD1VxKcUla";

        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT faq.id, faq.channel_id, faqt.title, faqt.text, faqt.locale FROM channel_list.channels_faq AS faq\n" +
                "LEFT JOIN channel_list.channels_faq_translations AS faqt ON faqt.channel_faq_id = faq.id";

        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        List<ArrayList<String>> mass = new ArrayList<>();
        while (rs.next()) {
            ArrayList<String> massTest = new ArrayList<>();
            massTest.add(0, String.valueOf(rs.getInt(1)));
            massTest.add(1, String.valueOf(rs.getInt(2)));
            massTest.add(2, rs.getString(3));
            massTest.add(3, rs.getString(4));
            massTest.add(4, rs.getString(5));
            mass.add(0, massTest);
        }

        String i1 = null;
        String i2 = null;
        String i3 = null;
        String i4 = null;
        int idChangeUk = 0;
        for (int j = 0; j < mass.size(); j++){
            if (idChangeUk != Integer.parseInt(mass.get(j).get(1))){
                idChangeUk = Integer.parseInt(mass.get(j).get(1));
                DriverProvider.getDriver().get(URL_TV_PAGE_UKRAINE);
                DriverProvider.getDriver().findElement(By.xpath("//li[@data-channel-id='" + mass.get(j).get(1) + "']")).click();
                i1 = DriverProvider.getDriver().findElement(By.xpath("(//p[@itemprop='text'])[1]")).getText();
                i2 = DriverProvider.getDriver().findElement(By.xpath("(//p[@itemprop='text'])[2]")).getText();
                i3 = DriverProvider.getDriver().findElement(By.xpath("(//p[@itemprop='text'])[3]")).getText();
                i4 = DriverProvider.getDriver().findElement(By.xpath("(//p[@itemprop='text'])[4]")).getText();
                System.out.println("text " + i1);
                System.out.println("text " + i2);
                System.out.println("text " + i3);
                System.out.println("text " + i4);
            }
            if(Objects.equals(mass.get(j).get(1), "479")) {

            }else if (Objects.equals(mass.get(j).get(4), "uk")){
                if (Objects.equals(mass.get(j).get(3).replaceAll("(<.*?>)|(&.*?;)|([ ]{2,})", "") , i1)){
                    Assert.assertEquals(mass.get(j).get(3).replaceAll("(<.*?>)|(&.*?;)|([ ]{2,})", ""), i1);
                }else if (Objects.equals(mass.get(j).get(3).replaceAll("(<.*?>)|(&.*?;)|([ ]{2,})", ""), i2)){
                    Assert.assertEquals(mass.get(j).get(3).replaceAll("(<.*?>)|(&.*?;)|([ ]{2,})", ""), i2);
                }else if (Objects.equals(mass.get(j).get(3).replaceAll("(<.*?>)|(&.*?;)|([ ]{2,})", ""), i3)){
                    Assert.assertEquals(mass.get(j).get(3).replaceAll("(<.*?>)|(&.*?;)|([ ]{2,})", ""), i3);
                }else if (Objects.equals(mass.get(j).get(3).replaceAll("(<.*?>)|(&.*?;)|([ ]{2,})", ""), i4)){
                    Assert.assertEquals(mass.get(j).get(3).replaceAll("(<.*?>)|(&.*?;)|([ ]{2,})", ""), i4);
                }else {
                    System.out.println(mass.get(j).get(3).replaceAll("(<.*?>)|(&.*?;)|([ ]{2,})", ""));
                    fail();
                }
                  System.out.println(mass.get(j).get(3).replaceAll("(<.*?>)|(&.*?;)|([ ]{2,})", ""));
//                System.out.println(mass.get(j).get(1));
//                System.out.println(mass.get(j).get(2));
//                new WebDriverWait(DriverProvider.getDriver(), Duration.ofSeconds(10))
//                        .until(ExpectedConditions.visibilityOf(DriverProvider.getDriver().findElement(By.xpath("//*[text()='" + mass.get(j).get(2) + "']/../.."))));
//                Assert.assertTrue(DriverProvider.getDriver().findElement(By.xpath("//*[text()='" + mass.get(j).get(2) + "']/../..")).isDisplayed());
            }
        }
    }




}
