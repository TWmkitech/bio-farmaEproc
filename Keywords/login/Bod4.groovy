package login

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory

public class Bod4 {
	public login (String BOD_4, String Pass) {
		WebUI.openBrowser(GlobalVariable.UrlStaging)
		WebUI.maximizeWindow()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Login/internal/Field_Email'), 0)
		WebUI.setText(findTestObject('Object Repository/Login/internal/Field_Email'), GlobalVariable.BOD_4)
		WebUI.setText(findTestObject('Object Repository/Login/internal/Field_Pass'), GlobalVariable.Pass)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Login/internal/Button_Masuk'), 0)
		WebUI.click(findTestObject('Object Repository/Login/internal/Button_Masuk'))
		WebUI.delay(15)
		WebDriver mydriver = DriverFactory.getWebDriver()
	}
}
