import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'login.Bod3.login'(GlobalVariable.BOD_3, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'))

WebUI.delay(10)

TestObject targetElement = findTestObject('Object Repository/Budget-Planning/RFI/ReviewRFI/Button_Review')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/ReviewRFI/Button_Review'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/ReviewRFI/Button_Review'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1200)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/ReviewRFI/Checkbox_Persetujuan'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/ReviewRFI/Checkbox_Persetujuan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/ReviewRFI/Button_Simpan'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/ReviewRFI/Button_Simpan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/ReviewRFI/Button_OK'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/ReviewRFI/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

