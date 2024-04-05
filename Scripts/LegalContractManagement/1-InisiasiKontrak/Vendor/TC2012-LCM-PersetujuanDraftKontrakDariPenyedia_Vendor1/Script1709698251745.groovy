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

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/1_Modul/2_InisiasiKontrak'))

TestObject targetElement = findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/2_BuatTopik/Icon_Rincian')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/Icon_Persetujuan'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/SBox_Penandatanganan_Nama'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/SBox_Penandatanganan_Nama_1'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/Sbox_NoRekening'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/Sbox_NoRekening_1'))

WebUI.scrollToElement(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/Text_Informasi Rekening'), 
    5)

WebUI.waitForElementClickable(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/Rbutton_Setuju'), 
    5)

WebUI.check(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/Rbutton_Setuju'))

//WebUI.waitForElementPresent(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/button_Kirim'), 
//    5)
//WebUI.waitForElementClickable(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/button_Kirim'), 
//    5)
WebUI.delay(5)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/button_Kirim'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/3_PersetujuanDraft/Button_Popup_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

