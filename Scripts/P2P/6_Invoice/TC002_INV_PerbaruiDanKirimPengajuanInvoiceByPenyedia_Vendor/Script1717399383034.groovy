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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/P2P/Vendor/Vendor_BespinGlobalIndonesia'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/0_Modul/Modul_Invoicing'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/0_Modul/Modul_Invoicing'))

WebUI.callTestCase(findTestCase('P2P/6_Invoice/SearchDataPaketPekerjaan_Vendor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/ICON_Detail'), 30)

WebUI.sendKeys(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/ICON_Detail'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/ICON_Detail'))

WebUI.callTestCase(findTestCase('P2P/6_Invoice/SearchDataNomorInvoice_Vendor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/3_Perbaharui/ICON_PerbaharuiData'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/3_Perbaharui/ICON_PerbaharuiData'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/3_Perbaharui/TAREA_Catatan'), 30)

WebUI.clearText(findTestObject('P2P/6_Invoice/Vendor/3_Perbaharui/TAREA_Catatan'))

WebUI.setText(findTestObject('P2P/6_Invoice/Vendor/3_Perbaharui/TAREA_Catatan'), 'Perbaharui Catatan Pembuatan Invoice')

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/3_Perbaharui/BUTTON_SimpanDanKirim'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/3_Perbaharui/BUTTON_SimpanDanKirim'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/Button_PopupKonfirmasi_OK'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

