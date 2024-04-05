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

WebUI.click(findTestObject('OrderCatalogManagement/0_Object/Vendor/2_AjukanTayangKatalogNonKontrak-Based'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/Button_Tambah Penayangan Baru'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/button_Tambah'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_KodeProdukPenyedia'), 
    '333')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_NamaProdukPenyedia'), 
    'Test Nama Produk Penyedia Non Contract Based')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Spesifikasi'), 
    'Test Spesifikasi')

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/Date_MasaBerlaku'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/Date_MasaBerlaku_36'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Merek'), 
    'Test Merek')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_NamaPemilikMerek'), 
    'Test Nama Pemilik Merek')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Pabrikan'), 
    'Test Pabrikan')

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_AsalNegaraPabrikan'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_AsalNegaraPabrikan_land Islands'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_UOM'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_UOM_l'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_Ketersediaan'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_Ketersediaan_Ready Stock'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_QtyKetersediaan'), 
    '2000000')

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_Currency'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/SBOX_Currency_AUD'))

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_Harga'), 
    '500')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_MinimalOrder'), 
    '1')

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_NilaiTKDN'), 
    '5')

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/Upload_TKDNFile')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/TBOX_LayananPurnaJual'), 
    'Test NonContract Based Layanan Purna Jual')

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

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/button_Simpan'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1_TambahPenayanganBaru/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

