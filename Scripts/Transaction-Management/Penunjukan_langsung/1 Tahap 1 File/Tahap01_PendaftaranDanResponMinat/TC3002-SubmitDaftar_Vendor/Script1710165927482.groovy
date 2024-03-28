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

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/input_Searching01'), GlobalVariable.NoPP)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap01/verify_StatusTable'), 'Belum Mendaftar')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap01/Icon_Daftar'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap01/Button_Daftar'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap01/Button_Popup_OK'))

WebUI.delay(6)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap01/verify_StatusTable'), 'Sudah Mendaftar')

// Verifikasi dari sisi PG
WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGHolding_KAEF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap01/verify_StatusMinat'), 
    'Daftar')

WebUI.delay(5)

WebUI.closeBrowser()

