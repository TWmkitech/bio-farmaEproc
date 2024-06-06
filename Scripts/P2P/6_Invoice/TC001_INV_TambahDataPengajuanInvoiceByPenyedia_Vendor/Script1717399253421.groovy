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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/P2P/Vendor/Vendor_BespinGlobalIndonesia'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/0_Modul/Modul_Invoicing'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/0_Modul/Modul_Invoicing'))

WebUI.callTestCase(findTestCase('P2P/6_Invoice/SearchDataPaketPekerjaan_Vendor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/ICON_Detail'), 30)

WebUI.sendKeys(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/ICON_Detail'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/ICON_Detail'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/BUTTON_TambahData'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/BUTTON_TambahData'))

WebUI.callTestCase(findTestCase('P2P/6_Invoice/SearchDataNomorSuratJalan_Vendor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/CBOX_NoSuratJalan_R1'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/CBOX_NoSuratJalan_R1'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/TBOX_NomorInvoice'), 30)

WebUI.clearText(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/TBOX_NomorInvoice'))

WebUI.setText(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/TBOX_NomorInvoice'), 'NI/24/06/04/01')

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/DATE_TanggalInvoice'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/DATE_TanggalInvoice'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/DATE_TanggalInvoice_10'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/DATE_TanggalInvoice_10'))

//Skenario upload file
// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

// Ambil elemen field "Choose File"
TestObject UploadBuktiPenerimaan = findTestObject('P2P/6_Invoice/Vendor/2_TambahData/UPLOAD_BuktiPenerimaan')

WebUI.uploadFile(UploadBuktiPenerimaan, filePath)

// Ambil elemen field "Choose File"
TestObject UploadInvoice = findTestObject('P2P/6_Invoice/Vendor/2_TambahData/UPLOAD_Invoice')

WebUI.uploadFile(UploadInvoice, filePath)

// Ambil elemen field "Choose File"
TestObject UploadFakturPajak = findTestObject('P2P/6_Invoice/Vendor/2_TambahData/UPLOAD_FakturPajak')

WebUI.uploadFile(UploadFakturPajak, filePath)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/SBOX_DokumenPendukung'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/SBOX_DokumenPendukung'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/SBOX_DokumenPendukung_LampiranInvoice1'), 
    30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/SBOX_DokumenPendukung_LampiranInvoice1'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/BUTTON_TambahDokumen'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/BUTTON_TambahDokumen'))

// Ambil elemen field "Choose File"
TestObject UploadDokumenPendukung = findTestObject('P2P/6_Invoice/Vendor/2_TambahData/UPLOAD_DokumenPendukung')

WebUI.uploadFile(UploadDokumenPendukung, filePath)

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/TAREA_Catatan'), 30)

WebUI.clearText(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/TAREA_Catatan'))

WebUI.setText(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/TAREA_Catatan'), 'Catatan Pembuatan Invoice')

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/BUTTON_SimpanDraft'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/2_TambahData/BUTTON_SimpanDraft'))

WebUI.waitForElementPresent(findTestObject('P2P/6_Invoice/Vendor/Button_PopupKonfirmasi_OK'), 30)

WebUI.click(findTestObject('P2P/6_Invoice/Vendor/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

