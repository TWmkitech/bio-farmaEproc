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
import com.kms.katalon.core.configuration.RunConfiguration as Config

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/Vendor/Login_vendor/Bespin Global Indonesia'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/Modul_Transaction'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/Submodul_Tender Seleksi Umum'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/span_Tender Umum yang diikuti'))

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/SeachingVendor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/Icon_Detail'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/span_MasaSanggah'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/input__NomorSuratSanggahvendor2'), 
    '02/test/2024')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/PilihTanggalSuratSanggah'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/TanggalSuratSanggah'))

def projectDir = Config.getProjectDir()

TestObject Upload_SuratSanggahVendor2 = findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/Upload_SuratSanggahVendor2')

// Membentuk path lengkap file yang ingin diunggah
def filePathSuratSanggahVendor2 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(Upload_SuratSanggahVendor2, filePathSuratSanggahVendor2)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/Input_AlasanSanggahVendor2'), 
    'ingin menyanggah')

TestObject upload_BuktiSanggahVendor2 = findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/upload_BuktiSanggahVendor2')

// Membentuk path lengkap file yang ingin diunggah
def filePathBuktiSanggahVendor2 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_BuktiSanggahVendor2, filePathBuktiSanggahVendor2)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/PenerbitJaminanVendor2'), 'BUMN')

TestObject Upload_JaminanVendor2 = findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/Upload_JaminanVendor2')

// Membentuk path lengkap file yang ingin diunggah
def filePathJaminanVendor2 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(Upload_JaminanVendor2, filePathJaminanVendor2)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/input_MasaBerlakuJaminanVendor2'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/TanggalMasaBerlaku'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/SimpanKirimSanggahVendor2'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/MasaSanggah/a_ok_konfirmasiSanggahVendor2'))

