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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_DRP'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_DRP'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahDataBaru'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahDataBaru'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_NamaPaket'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Field_NamaPaket'), 'RDP/JPROC/2024/05/27/02')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_RencanaKebutuhanEntitas'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_RencanaKebutuhanEntitas'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Entitas1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Entitas1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_RencanaKebutuhanEntitas'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_RencanaKebutuhanEntitas'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Entitas2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Entitas2'))

/*
WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahKodeMaterial'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahKodeMaterial'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Material1'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Material1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahKodeMaterial'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahKodeMaterial'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Material2'), 0)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Material2'))
*/
WebUI.delay(10)

WebUI.scrollToPosition(0, 300)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/1_NewObject/TambahKodeMaterial_T1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/1_NewObject/TambahKodeMaterial_T1'))

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/1_NewObject/NamaMaterial_T1'))

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/1_NewObject/NamaMaterial_T1_B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-A1'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-A1'), '12')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-A1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-A1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-A1'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-A1'), '120000')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-A1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-A1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-A1'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-A1'), 'Spesifikasi Otomatisasi')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-A1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-A1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Vendor-A1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Vendor-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Vendor-A1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Vendor-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/1_NewObject/TambahKodeMaterial_T2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/1_NewObject/TambahKodeMaterial_T2'))

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/1_NewObject/NamaMaterial_T2'))

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/1_NewObject/NamaMaterial_T2_B9'))

//WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahManual'), 0)
//WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_TambahManual'))
//WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Material-A1'), 0)
//WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Material-A1'), 'ampul')
//WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_DataManualMaterial-A1'), 0)
//WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_DataManualMaterial-A1'))
/*
WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-A2'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-A2'), '24')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-A2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-A2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-A2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-A2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-A2'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-A2'), '12000')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-A2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-A2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-A2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-A2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-A2'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-A2'), 'Spesifikasi Manual')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-A2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-A2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-A2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-A2'))
*/
// Tambah detail material ke-dua
WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-B1'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-B1'), '12')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-B1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-B1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-B1'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-B1'), '120000')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-B1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-B1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-B1'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-B1'), 'Spesifikasi Otomatisasi')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-B1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-B1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Vendor-B1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Vendor-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Vendor-B1'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Vendor-B1'))

/*
WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-B2'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Kuantitas-B2'), '24')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-B2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_MataUang-B2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-B2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_MataUang-B2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-B2'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Harga-B2'), '12000')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-B2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_UOM-B2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-B2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_UOM-B2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-B2'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_Spesifikasi-B2'), 'Spesifikasi Manual')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-B2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_Origin-B2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-B2'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Origin-B2'))
*/
WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Field_DokumenPendukung'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Field_DokumenPendukung'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Dokumen'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Div_Dokumen'))

//Skenario upload file
// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Budget-Planning/DRP/TambahDRP/Field_UploadFile')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Input_ManfaatPenyerahan'), 20)

WebUI.setText(findTestObject('Budget-Planning/DRP/TambahDRP/Input_ManfaatPenyerahan'), 'Penyerahan dokumen pendukung Automated Testing')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/1_NewObject/Button_Simpan'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/1_NewObject/Button_Simpan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_OK'))

WebUI.verifyElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Verify_PopupKonfirmasi_Berhasil'), 30)

WebUI.closeBrowser()

