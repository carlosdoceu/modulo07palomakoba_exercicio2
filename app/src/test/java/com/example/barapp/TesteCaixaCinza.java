package com.example.barapp;

import com.example.barapp.util.DriverFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TesteCaixaCinza{





    private AndroidDriver<MobileElement> driver;

    @Before
    public void setUp()  {
        driver = DriverFactory.getDriver();

    }



    @Test
    public void TestaUmitem() throws InterruptedException {
        MobileElement el1 = (MobileElement) driver.findElementById("com.example.barapp:id/cb_Vodka");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.example.barapp:id/btn_PedidoOk");

        el2.click();

        Thread thread = new Thread();
        thread.sleep(5000);
        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.example.barapp:id/text_ResumoPedido");

        el4.click();
        Assert.assertEquals("1 Vodka \n", el4.getText());
    }




    @Test
    public void TestaTodosItens() throws InterruptedException {
        MobileElement el1 = (MobileElement) driver.findElementById("com.example.barapp:id/cb_Cerveja");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.example.barapp:id/cb_Agua");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.example.barapp:id/cb_Cigarro");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.example.barapp:id/cb_Vodka");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.example.barapp:id/cb_Cachaca");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.example.barapp:id/cb_Whisky");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementById("com.example.barapp:id/btn_PedidoOk");
        el7.click();
        Thread thread = new Thread();
        thread.sleep(5000);

        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementById("com.example.barapp:id/text_ResumoPedido");
        el9.click();

        Assert.assertEquals("1 Whisky \n"+"1 Cachaça \n"+"1 Vodka \n"+"1 Cigarro \n"
                +"1 Água \n"+"1 Cerveja \n", el9.getText());

    }





    @After
    public void tearDown() {

        DriverFactory.finalizarDriver();
    }

}
