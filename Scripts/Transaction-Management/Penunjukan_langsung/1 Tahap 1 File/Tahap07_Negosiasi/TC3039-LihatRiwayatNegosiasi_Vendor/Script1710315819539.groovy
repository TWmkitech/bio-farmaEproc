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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/Vendor_PT Bespin Global Indonesia'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Modul_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Submodul_PengadaanLainnya'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Menu_PengadaanLainnyaYangDiikuti'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/Menu_5_Negosiasi'))

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/verify_SedangBerlangsung'), 
    'SEDANG BERLANGSUNG')

int nego1 = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/text_offer_KFTD')).replace(
	'.', '').toInteger() * 0.98

int nego2 = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/text_offer_KAEF')).replace(
	'.', '').toInteger() * 0.98

WebUI.delay(5)

TestObject riwayat1 = findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/button_RiwayatNegoKFTD')

WebUI.sendKeys(riwayat1, Keys.chord(Keys.ARROW_RIGHT))

// Lihat Riwayat & Verifikasi Harga dan Pengirim
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/button_RiwayatNegoKFTD'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/verify_Pengirim'), 'Bespin Global Indonesia')

String nego1a = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/verify_Harga')).replace('IDR ', '')

int nego1b = nego1a.replace('.', '').toInteger()

WebUI.delay(3)

WebUI.verifyMatch(nego1b.toString(), nego1.toString(), false)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/button_TutupRiwayat'))

WebUI.delay(3)

// Lihat Riwayat & Verifikasi Harga dan Pengirim
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/button_RiwayatNegoKAEF'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/verify_Pengirim'), 'Bespin Global Indonesia')

String nego2a = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/verify_Harga')).replace('IDR ', '')

int nego2b = nego2a.replace('.', '').toInteger()

WebUI.delay(3)

WebUI.verifyMatch(nego2b.toString(), nego2.toString(), false)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/button_TutupRiwayat'))

WebUI.delay(5)

WebUI.closeBrowser()

