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

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/input_HargaNego-E1'), '670')

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/input_HargaNego-E2'), '685')

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/text_TermofPayment'), 'Negosiasi 01 by Vendor')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/button_KirimHarga'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/btn_OK'))

WebUI.closeBrowser()

// Verifikasi dari sisi PG
