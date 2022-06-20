package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ResultPage;

public class SearchUsingEnterBtnTest extends BaseTest{
	HomePage homePageObj;
	ResultPage resultPageObj; 
	
	@Test
    public void verify_that_user_can_searchFor_anyThing_using_Enter_button(){
    	homePageObj = new HomePage(driver);
    	resultPageObj = new ResultPage(driver);
        homePageObj.searchUsingSearchBtn("instabug");
        Assert.assertTrue(resultPageObj.testRedirectionToResultPage("instabug"));
           
    }
}
