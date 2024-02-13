<<<<<<< HEAD
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

public class EntitasAuditBOD1 {
	public login (String EntitasAuditBOD1, String Pass) {
		WebUI.openBrowser(GlobalVariable.UrlStaging)
		WebUI.maximizeWindow()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Login/internal/Field_Email'), 0)
		WebUI.setText(findTestObject('Object Repository/Login/internal/Field_Email'), GlobalVariable.EntitasAuditBOD1)
		WebUI.setText(findTestObject('Object Repository/Login/internal/Field_Pass'), GlobalVariable.Pass)
		WebUI.delay(10)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Login/internal/Button_Masuk'), 0)
		WebUI.click(findTestObject('Object Repository/Login/internal/Button_Masuk'))
		WebUI.delay(15)
		WebDriver mydriver = DriverFactory.getWebDriver()
	}
}
=======
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

public class EntitasAuditBOD1 {
	public login (String EntitasAuditBOD1, String Pass) {
		WebUI.openBrowser(GlobalVariable.UrlStaging)
		WebUI.maximizeWindow()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Login/internal/Field_Email'), 0)
		WebUI.setText(findTestObject('Object Repository/Login/internal/Field_Email'), GlobalVariable.EntitasAuditBOD1)
		WebUI.setText(findTestObject('Object Repository/Login/internal/Field_Pass'), GlobalVariable.Pass)
		WebUI.delay(10)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Login/internal/Button_Masuk'), 0)
		WebUI.click(findTestObject('Object Repository/Login/internal/Button_Masuk'))
		WebUI.delay(15)
		WebDriver mydriver = DriverFactory.getWebDriver()
	}
}
>>>>>>> branch 'master' of https://github.com/TWmkitech/bio-farmaEproc.git
