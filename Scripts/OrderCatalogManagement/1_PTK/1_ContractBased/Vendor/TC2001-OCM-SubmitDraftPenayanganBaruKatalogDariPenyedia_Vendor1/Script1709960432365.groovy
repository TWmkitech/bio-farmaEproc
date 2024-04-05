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

WebUI.click(findTestObject('OrderCatalogManagement/0_Object/Vendor/0_Modul_CatalogOrder'))

WebUI.click(findTestObject('OrderCatalogManagement/0_Object/Vendor/1_AjukanTayangKatalogKontrak-Based'))

TestObject targetElement = findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/Icon_Detail')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/Icon_Ubah'))

TestObject targetElement1 = findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/DP1_Icon_Detail')

WebUI.sendKeys(targetElement1, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/DP1_Icon_Ubah'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/TBox_KodeProdukPenyedia'), 
    '111')

//WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/button_Link produk terkait'))
//WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/RButton_LinkProduk1'))
//WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/button_LinkProdukSimpan'))
WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/TBox_Merek'), 
    'Test Merek 1')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/TBox_NamaPemilikMerek'), 
    'Test Nama Pemilik Merek 1')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/TBox_MinimalOrder'), 
    '1')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/TBox_NilaiTKDN'), 
    '12')

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/Upload_TKDN')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/TBox_LayananPurnaJual'), 
    'Test Layanan Purna Jual 1')

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

WebUI.waitForElementClickable(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/button_Simpan'), 
    5)

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/button_Simpan'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

// Ambil elemen field "Choose File"
TestObject uploadField3 = findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/Upload_DokPendukung')

// Mendapatkan direktori proyek
def projectDir3 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath3 = projectDir3 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField3, filePath3)

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/Tbox_Catatan'), 
    'Test Catatan Pengajuan Kontrak')

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/button_Kirim'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/1_SubmitDraftPenayangan/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

