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

WebUI.click(findTestObject('LegalContractManagement/0_Global-TestObject/Anchor_KontrakAmandemen'))

WebUI.delay(5)

TestObject targetElement = findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/1_UploadDokumenFinal/Icon_Rincian')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

//WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/LegalKontrakManajemen/Custom_Icon_Detail'),
//    [('index') : 2], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/1_UploadDokumenFinal/Icon_Rincian'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/2_TambahPermohonan/button_Tambah Permohonan'))

WebUI.scrollToPosition(0, 0)

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/2_TambahPermohonan/TBox_NomorSurat'), 
    '12345')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/2_TambahPermohonan/Sbox_TanggalSurat'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/2_TambahPermohonan/Sbox_TanggalSurat_9'))

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/2_TambahPermohonan/Upload_BerkasSurat')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/2_TambahPermohonan/TBox_Perihal'), 
    'Test Perihal Dari Entitas')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/2_TambahPermohonan/button_Kirim'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/2_TambahPermohonan/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

