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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/1_Vendor/Vendor1_PT SURYA TUBAL INDONESIA'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrderCatalogManagement/0_Object/Vendor/0_Modul_CatalogOrder'))

WebUI.click(findTestObject('OrderCatalogManagement/0_Object/Vendor/2_AjukanTayangKatalogNonKontrak-Based'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/1/Icon_Ubah'))

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/2_SubmitDraftPenayangan/Upload_Proposal')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.setText(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/2_SubmitDraftPenayangan/TBOX_Catatan'), 
    'Test Catatan NonContract Based')

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/2_SubmitDraftPenayangan/button_Kirim'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Vendor/2_SubmitDraftPenayangan/Button_PopupKonfirmasi_OK'))

WebUI.delay(15)

WebUI.closeBrowser()

