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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/1_Vendor/Vendor1_PT SURYA TUBAL INDONESIA'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/1_Modul/1_Modul_LegalKontrak'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/1_Modul/5_Jaminan'))

TestObject targetElement = findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Icon_Rincian')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Icon_Rincian'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/button_Tambah'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Sbox_JenisJaminan'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Sbox_JenisJaminan_Pelaksanaan'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/TBox_NomorIndukJaminan'), 
    '111')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Date_Jaminan'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Date_Jaminan_12'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Date_MasaBerlakuJaminan'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Date_MasaBerlakuJaminan_31'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/TBox_Nilai'), '100')

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Upload_Jaminan')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Tbox_Penerbit'), 
    'Test Penerbit 1')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Sbox_NoPO'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Sbox_NoPO_POJPROC000030'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Tbox_Catatan'), 'Test Catatan PO 1')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/button_Kirim'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Vendor/1_TambahDataJaminan/Button_PopupKonfirmasi_OK'))

WebUI.delay(15)

WebUI.closeBrowser()

