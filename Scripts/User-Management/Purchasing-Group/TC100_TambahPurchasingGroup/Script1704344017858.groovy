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

CustomKeywords.'login.admin.login'(GlobalVariable.Admin, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_UserManagement'), 0)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_UserManagement'))

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_PurchasingGroup'), 3)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_PurchasingGroup'), 0)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_PurchasingGroup'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Button_TambahPurchasing'), 
    0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Button_TambahPurchasing'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Input_NamaPurchasing'), 
    0)

WebUI.setText(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Input_NamaPurchasing'), 'Pharmaceutical Raw Materials')

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Input_KodePurchasing'), 
    0)

WebUI.setText(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Input_KodePurchasing'), 'PM-001')

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Input_DeskripsiPurchasing'), 
    0)

WebUI.setText(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Input_DeskripsiPurchasing'), 'Pengadaan bahan baku farmasi, termasuk bahan aktif dan bahan penolong, untuk produksi obat-obatan.')

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Input_NomorSK'), 0)

WebUI.setText(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Input_NomorSK'), 'SK-202401')

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_TanggalSK'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_TanggalSK'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Span_DataTanggalSK'), 
    0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Span_DataTanggalSK'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 400)

WebUI.waitForElementClickable(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Upload_SKpurchasingGroup'), 
    0)

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Upload_SKpurchasingGroup')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Checkbox_Entitas'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Checkbox_Entitas'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_NamaPerusahaan'), 
    0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_NamaPerusahaan'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataNamaPerusahaan'), 
    0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataNamaPerusahaan'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_BOD1'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_BOD1'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataBOD1'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataBOD1'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_BOD2'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_BOD2'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataBOD2'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataBOD2'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_BOD3'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_BOD3'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataBOD3'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataBOD3'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_BOD4'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_BOD4'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataBOD4'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataBOD4'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_KategoriMaterial'), 
    0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Field_KategoriMaterial'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataKategoriMaterial'), 
    0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Div_DataKategoriMaterial'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Checkbox_Agreement'), 
    0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Checkbox_Agreement'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Button_SimpanData'), 
    0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Button_SimpanData'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Button_OK'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Tambah_PurchasingGroup/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

