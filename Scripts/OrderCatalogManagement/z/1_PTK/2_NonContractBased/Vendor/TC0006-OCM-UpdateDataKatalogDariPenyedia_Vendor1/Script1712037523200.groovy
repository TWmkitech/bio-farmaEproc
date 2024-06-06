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

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/2_UpdateData/TBox_Search'), 'Test Nama Produk Penyedia Non Contract Based5')

WebUI.delay(10)

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/2_UpdateData/Icon_DetailUpdateData1'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Vendor/2_UpdateData/DUD_button_Update Data'))

WebUI.clearText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_KodeProdukPenyedia'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_KodeProdukPenyedia'), 
    '99999')

WebUI.clearText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_NamaProdukPenyedia'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_NamaProdukPenyedia'), 
    'UpdateTestNamaProdukPenyedia5')

WebUI.clearText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Spesifikasi'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Spesifikasi'), 
    'UpdateTestSpesifikasi5')

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/Date_MasaBerlaku'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/Date_MasaBerlaku_36'))

WebUI.clearText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Merek'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Merek'), 
    'UpdateTestMerek5')

WebUI.clearText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_NamaPemilikMerek'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_NamaPemilikMerek'), 
    'UpdateTestNamaPemilikMerek5')

WebUI.clearText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Pabrikan'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Pabrikan'), 
    'UpdateTestPabrikan5')

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_AsalNegaraPabrikan'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_AsalNegaraPabrikan_Albania'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_UOM'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_UOM_l'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_Ketersediaan'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_Ketersediaan_Ready Stock'))

WebUI.clearText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_QtyKetersediaan'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_QtyKetersediaan'), 
    '4000000')

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_Currency'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_Currency_IDR'))

WebUI.clearText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Harga'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Harga'), 
    '555')

WebUI.clearText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_MinimalOrder'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_MinimalOrder'), 
    '2')

WebUI.clearText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_NilaiTKDN'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_NilaiTKDN'), 
    '8')

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/Upload_TKDNFile')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.clearText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_LayananPurnaJual'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_LayananPurnaJual'), 
    'UpdateTestNonContractBasedLayananPurnaJual')

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/Upload_FotoProduk')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Photo/JPEGPhoto.jpg'

WebUI.uploadFile(uploadField1, filePath1)

// Ambil elemen field "Choose File"
TestObject uploadField2 = findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/Upload_Brosur')

// Mendapatkan direktori proyek
def projectDir2 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir2 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/3_UpdateData/Button_Simpan'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

