package com.travelocity.test.hooks;


import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class SetUpStages {
    private String testUser= "testUser";
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUpStage(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser)));
        OnStage.theActor(testUser);
    }

    @After
    public void closeTheStage(){
        OnStage.drawTheCurtain();
    }
}
