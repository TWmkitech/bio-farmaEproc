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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/P2P/OperasionalHolding/OperasionalHolding_BioFarma_BOD-1'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/0_Modul/MODUL_Invoice_OperasionalHolding'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Internal/0_Modul/MODUL_Invoice_OperasionalHolding'))

WebUI.callTestCase(findTestCase('P2P/6_Invoice/SearchDataPaketPekerjaan_Internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/2_Verifikasi/ICON_Detail'), 30)

WebUI.sendKeys(findTestObject('P2P/6_Invoice/Internal/2_Verifikasi/ICON_Detail'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('P2P/6_Invoice/Internal/2_Verifikasi/ICON_Detail'))

WebUI.callTestCase(findTestCase('P2P/6_Invoice/SearchDataNomorInvoice_Internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/2_Verifikasi/ICON_Review'), 30)

WebUI.sendKeys(findTestObject('P2P/6_Invoice/Internal/2_Verifikasi/ICON_Review'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('P2P/6_Invoice/Internal/2_Verifikasi/ICON_Review'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/2_Verifikasi/CBOX_Persetujuan_Setuju'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Internal/2_Verifikasi/CBOX_Persetujuan_Setuju'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/2_Verifikasi/button_Kirim'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Internal/2_Verifikasi/button_Kirim'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/Button_PopupKonfirmasi_OK'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Internal/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

