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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/Vendor'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Modul_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Submodul_PengadaanLainnya'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Menu_PengadaanLainnyaYangDiikuti'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/input_Searching02'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/Menu_5_Negosiasi'))

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/verify_SedangBerlangsung'), 
    'SEDANG BERLANGSUNG', FailureHandling.OPTIONAL)

// Kirim topik negosiasi
String topik = 'Harga Negosiasi kedua by Vendor sudah terkirim'

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/text_KirimTopikNego'), topik)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/button_KirimTanggapan'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/verify_ChatTopik2'), topik, 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

// Balas topik negosiasi
WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/verify_Sender1'), 'Unit Pengadaan')

String balas = 'Harga Negosiasi sudah ter-update'

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/Icon_Balas'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/text_BalasTopikNego'), balas)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/button_BalasTanggapan'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/verify_Balas01'), balas, 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.closeBrowser()

