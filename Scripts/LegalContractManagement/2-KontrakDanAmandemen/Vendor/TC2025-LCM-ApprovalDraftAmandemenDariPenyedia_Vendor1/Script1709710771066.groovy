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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/1_Vendor/Vendor2_Bespin Global Indonesia'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/1_Modul/1_Modul_LegalKontrak'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/1_Modul/3_KontrakAmandemen'))

WebUI.callTestCase(findTestCase('LegalContractManagement/2-KontrakDanAmandemen/Vendor/SearchNamaKontrak'), [:], FailureHandling.STOP_ON_FAILURE)

TestObject targetElement = findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Icon_Rincian')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Icon_Rincian'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Text_Informasi Pembayaran'), 
    5)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Text_Amendemen Kontrak'), 
    5)

WebUI.delay(5)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Icon_Approval'))

WebUI.scrollToPosition(0, 0)

WebUI.waitForElementPresent(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/SBOX_NomorRekening'), 
    20)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/SBOX_NomorRekening'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/SBOX_NomorRekening_R1'))

WebUI.waitForElementPresent(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/TBOX_NoAmandemenPenyedia'), 
    20)

WebUI.clearText(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/TBOX_NoAmandemenPenyedia'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/TBOX_NoAmandemenPenyedia'), 
    'NAP/2024/04/16/001')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/SBOX_NamaPenandatangan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/SBOX_NamaPenandatangan_R1'))

WebUI.scrollToElement(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Text_RiwayatPersetujuanKontrakAmendemen'), 
    5)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/RButton_Setuju'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/button_Kirim'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Vendor/1_ApprovalDraftAmandemen/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

