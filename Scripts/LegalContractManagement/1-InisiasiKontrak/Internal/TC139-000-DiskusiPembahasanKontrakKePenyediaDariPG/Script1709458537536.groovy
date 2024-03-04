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

//WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/LegalKontrakManajemen/Custom_Icon_Detail'),
//    [('index') : 2], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/2_TambahReviewer/Icon_Detail_'))

WebUI.waitForElementClickable(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/3_Diskusi/Button_Penyedia'), 
    10)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/3_Diskusi/Button_Penyedia'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/3_Diskusi/Sbox_Topik'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/3_Diskusi/Tbox_Topik1_Kepenyedia'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/3_Diskusi/Tbox_Pesan'), 'Topik Dari PG BOD-4 ke Penyedia')

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/3_Diskusi/Upload_Topik_KeVendor')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/3_Diskusi/button_Buat Topik'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Internal/3_Diskusi/Button_PopupKonfirmasi_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

