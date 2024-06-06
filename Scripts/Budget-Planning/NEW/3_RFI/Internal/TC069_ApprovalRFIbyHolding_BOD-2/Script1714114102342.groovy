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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/3_RFI/Internal/SearchRFIDariDRP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

TestObject targetElement = findTestObject('Budget-Planning/RFI/ReviewRFI/Icon_PersetujuanBOD-2')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/ReviewRFI/Icon_PersetujuanBOD-2'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/ReviewRFI/Icon_PersetujuanBOD-2'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1200)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/ApprovalRFI/Checkbox_Persetujuan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/ApprovalRFI/Checkbox_Persetujuan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/ApprovalRFI/Button_Simpan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/ApprovalRFI/Button_Simpan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/ApprovalRFI/Button_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/ApprovalRFI/Button_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

