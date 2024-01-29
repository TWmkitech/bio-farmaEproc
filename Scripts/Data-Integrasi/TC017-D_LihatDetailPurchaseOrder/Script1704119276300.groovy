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

CustomKeywords.'login.Bod4.login'(GlobalVariable.BOD_4, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/UploadDataIntegrasiMaterial/Anchor_DataIntegrasi'), 0)

WebUI.click(findTestObject('Data-Integrasi/UploadDataIntegrasiMaterial/Anchor_DataIntegrasi'))

WebUI.scrollToElement(findTestObject('Data-Integrasi/Global-TestObject/Anchor_PurchaseOrder'), 3)

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/Global-TestObject/Anchor_PurchaseOrder'), 0)

WebUI.click(findTestObject('Data-Integrasi/Global-TestObject/Anchor_PurchaseOrder'))

WebUI.delay(10)

TestObject targetElement = findTestObject('Object Repository/Data-Integrasi/LihatDetail_PurchaseRequest/Button_Detail')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/LihatDetail_PurchaseOrder/Button_Detail'), 0)

WebUI.click(findTestObject('Data-Integrasi/LihatDetail_PurchaseOrder/Button_Detail'))

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/LihatDetail_PurchaseOrder/NavLink_PurchaseOrder'), 0)

WebUI.click(findTestObject('Data-Integrasi/LihatDetail_PurchaseOrder/NavLink_PurchaseOrder'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 400)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/LihatDetail_PurchaseOrder/NavLink_LogFailed'), 0)

WebUI.click(findTestObject('Data-Integrasi/LihatDetail_PurchaseOrder/NavLink_LogFailed'))

WebUI.delay(15)

WebUI.closeBrowser()
