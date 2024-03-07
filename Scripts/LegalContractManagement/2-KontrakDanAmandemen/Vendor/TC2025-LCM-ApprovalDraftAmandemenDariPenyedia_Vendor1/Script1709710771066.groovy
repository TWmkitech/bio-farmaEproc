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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/1_Vendor/Vendor1_PT SURYA TUBAL INDONESIA'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/1_Modul/1_Modul_LegalKontrak'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/1_Modul/3_KontrakAmandemen'))

TestObject targetElement = findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Icon_Rincian')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Icon_Rincian'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Text_Informasi Pembayaran'), 
    0)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Text_Amendemen Kontrak'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Icon_Approval'))

WebUI.scrollToElement(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Text_RiwayatPersetujuanKontrakAmendemen'), 
    5)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/RButton_Setuju'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/button_Kirim'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Button_PopupKonfirmasi_OK'))

WebUI.delay(15)

WebUI.closeBrowser()
