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

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_DR'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_DR'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/2_DR/SearchDRManual'), [:], FailureHandling.STOP_ON_FAILURE)

TestObject targetElement = findTestObject('Object Repository/Budget-Planning/DR/ReviewHoldingBOD3/Button_Review')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/Button_Review'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/Button_Review'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/Button_Persetujuan'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/Button_Persetujuan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/RBUTTON_TidakSetuju'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/RBUTTON_TidakSetuju'))

WebUI.click(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/SBOX_Persetujuan_AlasanTidakSetuju'))

WebUI.click(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/SBOX_Persetujuan_AlasanTidakSetuju_AnggaranTidakCukup'))

WebUI.setText(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/TAREA_Persetujuan_Catatan'), 'Kas perusahaan tidak memadai')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/Button_KirimPersetujuan'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/Button_KirimPersetujuan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/Button_PopupKonfirmasi_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/Button_PopupKonfirmasi_OK'))

WebUI.verifyElementPresent(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/BUTTON_Kembali'), 30)

WebUI.scrollToElement(findTestObject('Budget-Planning/DR/ReviewHoldingBOD3/BUTTON_Kembali'), 20)

WebUI.delay(15)

WebUI.closeBrowser()

