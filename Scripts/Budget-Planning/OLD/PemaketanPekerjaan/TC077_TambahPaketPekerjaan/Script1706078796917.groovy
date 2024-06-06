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

CustomKeywords.'login.Bod4.login'(GlobalVariable.BOD_4, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_PemaketanPekerjaan'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_PemaketanPekerjaan'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_Tambah'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_Tambah'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Input_NamaPaketPekerjaan'), 0)

WebUI.setText(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Input_NamaPaketPekerjaan'), 'Paket - Automated Pertama')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_TglRapat'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_TglRapat'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_TglRapat'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_TglRapat'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Upload_BeritaAcara'), 0)

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Upload_BeritaAcara')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Checkbox_DR1'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Checkbox_DR1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Checkbox_DR2'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Checkbox_DR2'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_LanjutkanTahap2'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_LanjutkanTahap2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_OkTahap2'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_OkTahap2'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_JenisKontrak'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_JenisKontrak'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_JenisKontrak'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_JenisKontrak'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_JenisDokumen'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_JenisDokumen'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataJenisDokumen'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataJenisDokumen'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_TambahDokumen'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_TambahDokumen'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Upload_DokumenKontrak'), 0)

// Ambil elemen field "Choose File"
TestObject uploadField2 = findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Upload_DokumenKontrak')

// Mendapatkan direktori proyek
def projectDir2 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir2 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_PilihDokumenPendukung'), 
    0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_PilihDokumenPendukung'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataDokumenPendukung'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataDokumenPendukung'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Upload_DokumenPendukung'), 0)

// Ambil elemen field "Choose File"
TestObject uploadField3 = findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Upload_DokumenPendukung')

// Mendapatkan direktori proyek
def projectDir3 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath3 = projectDir3 + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField3, filePath3)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_Unggah'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_Unggah'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_LanjutkanTahap3'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_LanjutkanTahap3'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_OkTahap3'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_OkTahap3'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_UnitPengadaan'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_UnitPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataUnitPengadaan'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataUnitPengadaan'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_PilihPurchasing'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_PilihPurchasing'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataPilihPurchasing'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataPilihPurchasing'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_Mengajukan'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_Mengajukan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Input_NamaPG'), 0)

WebUI.setText(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Input_NamaPG'), 'PG - Automated Test')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Upload_SKpg'), 0)

// Ambil elemen field "Choose File"
TestObject uploadField4 = findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Upload_SKpg')

// Mendapatkan direktori proyek
def projectDir4 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath4 = projectDir4 + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField4, filePath4)

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Input_Deskripsi'), 0)

WebUI.setText(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Input_Deskripsi'), 'Data ini dibuat secara automated test')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_BOD1'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_BOD1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataBOD1'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataBOD1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_BOD2'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_BOD2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataBOD2'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataBOD2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_BOD3'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_BOD3'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataBOD3'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataBOD3'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_BOD4'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Field_BOD4'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataBOD4'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Div_DataBOD4'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_SimpanPengajuan'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_SimpanPengajuan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_OKpengajuan'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_OKpengajuan'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 500)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_SimpanPaket'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_SimpanPaket'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_OKpaket'), 0)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/TambahPaket/Button_OKpaket'))

WebUI.delay(10)

WebUI.closeBrowser()

