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

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/4_SuntingAmandemen/Icon_Sunting'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/4_SuntingAmandemen/Tbox_NoSurat'), 
    '890')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/4_SuntingAmandemen/Date_TanggalSurat'))

WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/LegalKontrakManajemen/2_KontrakAmandemen/4_SuntingAmandemen/Select_Date_TanggalSurat'), 
    [('index') : 16], FailureHandling.STOP_ON_FAILURE)

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/4_SuntingAmandemen/Upload_BerkasSurat')

def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/4_SuntingAmandemen/TBox_Perihal'), 
    'Perihal Sunting Dari PG BOD-4')

// Ambil elemen field "Choose File"
TestObject uploadField2 = findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/4_SuntingAmandemen/Upload_DraftAmandemen')

def projectDir2 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir2 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/4_SuntingAmandemen/button_Kirim'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/4_SuntingAmandemen/Button_PopupKonfirmasi_OK'))

WebUI.delay(15)

WebUI.closeBrowser()

