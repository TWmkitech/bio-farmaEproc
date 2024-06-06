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

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_DRP'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_DRP'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahDataBaru'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahDataBaru'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_NamaPaket'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Field_NamaPaket'), 'RDP/JPROC/2024/002/AUTOMATED-TEST')

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_RencanaKebutuhanEntitas'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_RencanaKebutuhanEntitas'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Entitas1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Entitas1'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_RencanaKebutuhanEntitas'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_RencanaKebutuhanEntitas'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Entitas2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Entitas2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahKodeMaterial'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahKodeMaterial'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Material1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Material1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahKodeMaterial'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahKodeMaterial'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Material2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Material2'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 300)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-A1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-A1'), '12')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-A1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-A1'), '120000')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-A1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-A1'), 'Spesifikasi Otomatisasi')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Vendor-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Vendor-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Vendor-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Vendor-A1'))

//WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahManual'), 0)
//WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahManual'))
//WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Material-A1'), 0)
//WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Material-A1'), 'ampul')
//WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_DataManualMaterial-A1'), 0)
//WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_DataManualMaterial-A1'))
WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-A2'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-A2'), '24')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-A2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-A2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-A2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-A2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-A2'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-A2'), '12000')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-A2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-A2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-A2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-A2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-A2'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-A2'), 'Spesifikasi Manual')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-A2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-A2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-A2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-A2'))

WebUI.delay(2)

// Tambah detail material ke-dua
WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-B1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-B1'), '12')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-B1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-B1'), '120000')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-B1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-B1'), 'Spesifikasi Otomatisasi')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Vendor-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Vendor-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Vendor-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Vendor-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-B2'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-B2'), '24')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-B2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-B2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-B2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-B2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-B2'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-B2'), '12000')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-B2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-B2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-B2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-B2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-B2'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-B2'), 'Spesifikasi Manual')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-B2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-B2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-B2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-B2'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_DokumenPendukung'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_DokumenPendukung'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Dokumen'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Dokumen'))

WebUI.delay(10)

//Skenario upload file
// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Budget-Planning/DRP/TambahDRP/Field_UploadFile')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_ManfaatPenyerahan'), 0)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_ManfaatPenyerahan'), 'Penyerahan dokumen pendukung Automated Testing')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_Kirim'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_Kirim'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_OK'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_OK'))

WebUI.delay(15)

WebUI.closeBrowser()

