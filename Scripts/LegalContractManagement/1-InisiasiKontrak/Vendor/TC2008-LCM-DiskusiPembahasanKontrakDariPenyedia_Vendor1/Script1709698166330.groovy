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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/1_Vendor/SCHOTT IGAR GLASS, PT'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/1_Modul/1_Modul_LegalKontrak'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/1_Modul/2_InisiasiKontrak'))

TestObject targetElement = findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/2_BuatTopik/Icon_Rincian')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/2_BuatTopik/Icon_Rincian'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/2_BuatTopik/Sbox_Topik'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/2_BuatTopik/Sbox_Topik1'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/2_BuatTopik/Tbox_Pesan'), 'Pesan Topik Dari Penyedia Vendor 1')

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/2_BuatTopik/Upload_Topik')

def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/2_BuatTopik/button_BuatTopik'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/2_BuatTopik/Button_Popup_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

