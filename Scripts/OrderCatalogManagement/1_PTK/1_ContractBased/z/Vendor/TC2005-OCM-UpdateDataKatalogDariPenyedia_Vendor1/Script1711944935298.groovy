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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/1_Vendor/TECHOLUTION DIGITAL INDONESIA, PT'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrderCatalogManagement/0_Object/Vendor/0_Modul_CatalogOrder'))

WebUI.click(findTestObject('OrderCatalogManagement/0_Object/Internal/2_DaftarKatalog'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/2_UpdateData/TBox_Search'), 'SPJ/JPROC/2024/100033')

WebUI.delay(10)

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/2_UpdateData/Icon_DetailUpdateData1'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/2_UpdateData/DUD_button_Update Data'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/TBox_KodeProdukPenyedia'), 
    '222')

//WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/button_Link produk terkait'))
//WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/RButton_LinkProduk1'))
//WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/button_LinkProdukSimpan'))
WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/TBox_Merek'), 
    'Test Merek 11')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/TBox_NamaPemilikMerek'), 
    'Edit Test Nama Pemilik Merek 2')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/TBox_MinimalOrder'), 
    '1')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/2_UpdateData/TBox_NilaiTKDN'), '10')

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/Upload_TKDN')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/TBox_LayananPurnaJual'), 
    'Edit Test Layanan Purna Jual 1')

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/Upload_FotoProduk')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Photo/JPEGPhoto.jpg'

WebUI.uploadFile(uploadField1, filePath1)

// Ambil elemen field "Choose File"
TestObject uploadField2 = findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/Upload_Brosur')

// Mendapatkan direktori proyek
def projectDir2 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir2 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.scrollToElement(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/Text_InformasiMaterialEntitas'), 
    5)

WebUI.waitForElementClickable(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/2_UpdateData/Button_Simpan'), 
    5)

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/2_UpdateData/Button_Simpan'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/2_UpdateData/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

