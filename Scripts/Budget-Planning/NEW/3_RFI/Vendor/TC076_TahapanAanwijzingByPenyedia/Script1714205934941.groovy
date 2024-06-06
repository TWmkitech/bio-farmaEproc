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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Vendor/Proxsis Solusi Bisnis'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/Anchor_RFI'), 30)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/Anchor_RFI'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/3_RFI/Vendor/CariDataRFI'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/Icon_Aanwijzing'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/Icon_Pencil'), 30)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/Icon_Pencil'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/TBOX_NamaPesertaAanwijzing'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/TBOX_NamaPesertaAanwijzing'), 'Elon Musk')

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/BUTTON_SimpanNamaPesertaAanwijzing'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/TAREA_BuatPertanyaan'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/TAREA_BuatPertanyaan'), 'Bagaimana Proses RFI ini akan dilaksanakan?')

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/Upload_Buat Pertanyaan')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/Button_Kirim'), 30)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/Button_Kirim'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/Button_PopupKonfirmasi_OK'), 30)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/01_Aanwijzing/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

