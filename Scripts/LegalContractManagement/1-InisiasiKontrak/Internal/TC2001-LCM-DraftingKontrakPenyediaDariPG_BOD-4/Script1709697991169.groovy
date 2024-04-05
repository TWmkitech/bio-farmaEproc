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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGHolding_BioFarma_BOD-4'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LegalContractManagement/0_Global-TestObject/Anchor_LegalContractManagement'))

WebUI.click(findTestObject('LegalContractManagement/0_Global-TestObject/Anchor_InisiasiKontrak'))

WebUI.delay(5)

TestObject targetElement = findTestObject('Object Repository/LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Icon_Rincian')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/LegalKontrakManajemen/1_InisiasiKontrak/Custom_Icon_UbahDraftKontrak'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Date_TanggalKontrak'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Date_TanggalKontrak_11'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Date_PeriodeMulai'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Date_PeriodeMulai_14'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Date_PeriodeSelesai'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Date_PeriodeSelesai_34'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Sbox_Penandatanganan_Nama'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Sbox_Penandatanganan_Nama1'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Sbox_Penandatanganan2_Nama'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Sbox_Penandatanganan2_Nama1'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Sbox_PengaturanPembayaran'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Sbox_PengPembayaran_Contract'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Sbox_TahapSerahTerima'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Sbox_TahapSerahTerima_Sekaligus'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Sbox_DenganUangMuka'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Sbox_DenganUangMuka_Ya'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/IPR1_Tbox_BesaranTermin'), 
    '20')

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/IPR1_Tbox_SyaratPembayaran'), 
    'Syarat 1')

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/IPR2_Tbox_NamaTermin'), 
    'Termin 1')

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/IPR2_Tbox_BesaranTermin'), 
    '80')

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/IPR2_Tbox_SyaratPembayaran'), 
    'Syarat 2')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/button_Simpan'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Upload_Draft')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Tbox_Lampiran'), 
    'Lampiran 1')

// Ambil elemen field "Choose File"
TestObject uploadField2 = findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Upload_Lampiran')

// Mendapatkan direktori proyek
def projectDir2 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir2 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/button_Kirim'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)
/*
WebUI.acceptAlert()

WebUI.acceptAlert()

TestObject targetElement1 = findTestObject('Object Repository/LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Icon_Rincian')

WebUI.sendKeys(targetElement1, Keys.chord(Keys.ARROW_RIGHT))

WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/LegalKontrakManajemen/Custom_Icon_UbahDraftKontrak'), 
    [('index') : 1], FailureHandling.STOP_ON_FAILURE)

// Ambil elemen field "Choose File"
TestObject uploadField3 = findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Upload_Draft')

// Mendapatkan direktori proyek
def projectDir3 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath3 = projectDir3 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField3, filePath3)

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Tbox_Lampiran'), 
    'Lampiran 2')

// Ambil elemen field "Choose File"
TestObject uploadField4 = findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Upload_Lampiran')

// Mendapatkan direktori proyek
def projectDir4 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath4 = projectDir4 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField4, filePath4)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/button_Kirim'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/1_DraftingKontrak/Button_PopupKonfirmasi_OK'))

WebUI.delay(10)
*/
WebUI.closeBrowser()

