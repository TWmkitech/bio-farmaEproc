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

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 30)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_KonfigurasiPengadaan'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_KonfigurasiPengadaan'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/4_CategoryStrategy/2_HPS/SearchPaketPengadaan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.scrollToPosition(0, 1000)

WebUI.sendKeys(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/02_ApprovalKonfigurasiPengadaan/ICON_ReviewKonfigurasiPengadaan'), 
    Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/02_ApprovalKonfigurasiPengadaan/ICON_ReviewKonfigurasiPengadaan'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 500)

WebUI.delay(5)

WebUI.scrollToPosition(0, 1000)

WebUI.delay(5)

WebUI.scrollToPosition(0, 1500)

WebUI.delay(5)

WebUI.scrollToPosition(0, 2000)

WebUI.delay(5)

WebUI.scrollToPosition(0, 2500)

WebUI.delay(5)

WebUI.scrollToPosition(0, 3000)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/02_ApprovalKonfigurasiPengadaan/RBUTTON_Setuju'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/02_ApprovalKonfigurasiPengadaan/RBUTTON_Setuju'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/02_ApprovalKonfigurasiPengadaan/BUTTON_SimpanPersetujuan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/02_ApprovalKonfigurasiPengadaan/BUTTON_SimpanPersetujuan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/01_New/Button_PopupKonfirmasi_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/HPS/01_New/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

