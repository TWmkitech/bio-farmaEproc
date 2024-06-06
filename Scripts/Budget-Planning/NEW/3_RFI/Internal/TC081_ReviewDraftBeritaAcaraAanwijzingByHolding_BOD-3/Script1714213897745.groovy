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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 30)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/HoldingBOD-3/Anchor_RequestForInformation'), 
    20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/HoldingBOD-3/Anchor_RequestForInformation'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/3_RFI/Internal/SearchRFIDariDRP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

TestObject targetElement = findTestObject('Budget-Planning/RFI/Aanwijzing/01_ReviewAanwijzing/ICON_PenjelasanRFI')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/Aanwijzing/01_ReviewAanwijzing/ICON_PenjelasanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/Aanwijzing/01_ReviewAanwijzing/ICON_PenjelasanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/Aanwijzing/BUTTON_DraftKonsepBeritaAcara'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/Aanwijzing/BUTTON_DraftKonsepBeritaAcara'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/Aanwijzing/01_ReviewAanwijzing/RBUTTON_Setuju'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/Aanwijzing/01_ReviewAanwijzing/RBUTTON_Setuju'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/Aanwijzing/01_ReviewAanwijzing/BUTTON_Kirim'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/Aanwijzing/01_ReviewAanwijzing/BUTTON_Kirim'))

WebUI.click(findTestObject('Budget-Planning/RFI/Aanwijzing/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

