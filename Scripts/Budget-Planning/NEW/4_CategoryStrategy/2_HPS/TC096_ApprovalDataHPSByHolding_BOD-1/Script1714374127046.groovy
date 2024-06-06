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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 30)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_HPS'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_HPS'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/4_CategoryStrategy/2_HPS/SearchPaketPengadaan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.scrollToPosition(0, 1000)

WebUI.sendKeys(findTestObject('Budget-Planning/HPS/01_New/02_ApprovalHPS/ICON_Approve'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('Budget-Planning/HPS/01_New/02_ApprovalHPS/ICON_Approve'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 800)

WebUI.delay(5)

WebUI.scrollToPosition(0, 1700)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/01_New/02_ApprovalHPS/RBUTTON_Setuju'), 20)

WebUI.click(findTestObject('Budget-Planning/HPS/01_New/02_ApprovalHPS/RBUTTON_Setuju'))

WebUI.scrollToPosition(0, 2500)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/01_New/02_ApprovalHPS/BUTTON_Simpan'), 20)

WebUI.click(findTestObject('Budget-Planning/HPS/01_New/02_ApprovalHPS/BUTTON_Simpan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/01_New/Button_PopupKonfirmasi_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/HPS/01_New/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

