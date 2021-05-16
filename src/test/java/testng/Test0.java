package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test0 {
@BeforeMethod(alwaysRun = true)
public void openApp() {
	Reporter.log("login",true);
}
@AfterMethod(alwaysRun = true)
public void closeApp() {
	Reporter.log("logout",true);
}

@Test
public void calls() {
	Reporter.log("calls",true);
}

@Test(groups="chats")
public void chats() {
	Reporter.log("chats",true);
}

@Test
public void status() {
	Reporter.log("status",true);
}
}
