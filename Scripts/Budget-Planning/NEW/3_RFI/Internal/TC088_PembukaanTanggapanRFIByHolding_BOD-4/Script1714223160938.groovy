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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/3_RFI/Internal/SearchRFIDariDRP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

TestObject targetElement = findTestObject('Budget-Planning/RFI/PembukaanTanggapan/ICON_ResponRFI')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/PembukaanTanggapan/ICON_ResponRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/PembukaanTanggapan/ICON_ResponRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/PembukaanTanggapan/SBOX_TindakLanjut'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/PembukaanTanggapan/SBOX_TindakLanjut'))

WebUI.click(findTestObject('Budget-Planning/RFI/PembukaanTanggapan/SBOX_TindakLanjut_LanjutKeCS'))

WebUI.setText(findTestObject('Budget-Planning/RFI/PembukaanTanggapan/TAREA_Alasan'), 'Diterima')

WebUI.click(findTestObject('Budget-Planning/RFI/PembukaanTanggapan/BUTTON_Simpan'))

WebUI.click(findTestObject('Budget-Planning/RFI/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

