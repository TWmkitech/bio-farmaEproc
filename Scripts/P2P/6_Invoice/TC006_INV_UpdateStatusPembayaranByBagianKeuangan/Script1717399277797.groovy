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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/P2P/FinanceDivision/FinanceDivision_BioFarma_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/0_Modul/MODUL_PaidInvoice'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Internal/0_Modul/MODUL_PaidInvoice'))

WebUI.callTestCase(findTestCase('P2P/6_Invoice/SearchDataPaketPekerjaan_Internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/3_PaidInvoice/ICON_UpdateStatusPembayaran'), 30)

WebUI.sendKeys(findTestObject('P2P/6_Invoice/Internal/3_PaidInvoice/ICON_UpdateStatusPembayaran'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('P2P/6_Invoice/Internal/3_PaidInvoice/ICON_UpdateStatusPembayaran'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/3_PaidInvoice/CBOX_StatusPembayaran_Paid'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Internal/3_PaidInvoice/CBOX_StatusPembayaran_Paid'))

//Skenario upload file
// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Photo/JPEGPhoto.jpg'

// Ambil elemen field "Choose File"
TestObject UploadBuktiPembayaran = findTestObject('P2P/6_Invoice/Internal/3_PaidInvoice/UPLOAD_UnggahBuktiPembayaran')

WebUI.uploadFile(UploadBuktiPembayaran, filePath)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/3_PaidInvoice/TAREA_Catatan'), 30)

WebUI.clearText(findTestObject('P2P/6_Invoice/Internal/3_PaidInvoice/TAREA_Catatan'))

WebUI.setText(findTestObject('P2P/6_Invoice/Internal/3_PaidInvoice/TAREA_Catatan'), 'Catatan status pembayaran berhasil')

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/3_PaidInvoice/BUTTON_Kirim'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Internal/3_PaidInvoice/BUTTON_Kirim'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Internal/Button_PopupKonfirmasi_OK'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Internal/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

