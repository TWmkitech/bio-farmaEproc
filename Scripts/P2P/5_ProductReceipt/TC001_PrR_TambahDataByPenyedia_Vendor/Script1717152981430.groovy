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

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/0_Modul/MODUL_ProductReceipt'), 30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/0_Modul/MODUL_ProductReceipt'))

WebUI.callTestCase(findTestCase('P2P/5_ProductReceipt/SearchDataPaketPekerjaan_Vendor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/ICON_DaftarProductReceipt'), 
    30)

WebUI.sendKeys(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/ICON_DaftarProductReceipt'), Keys.chord(
        Keys.ARROW_RIGHT))

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/ICON_DaftarProductReceipt'))

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/BUTTON_TambahData'), 
    30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/BUTTON_TambahData'))

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_NamaPetugas'), 30)

WebUI.clearText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_NamaPetugas'))

WebUI.setText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_NamaPetugas'), 'Shadiq Akasya')

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_NomorHP'), 30)

WebUI.clearText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_NomorHP'))

WebUI.setText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_NomorHP'), '089876543211')

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_NomorSuratJalan'), 
    30)

WebUI.clearText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_NomorSuratJalan'))

WebUI.setText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_NomorSuratJalan'), 'NSJ/24/06/03/01')

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/DATE_TanggalSuratJalan'), 
    30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/DATE_TanggalSuratJalan'))

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/DATE_TanggalSuratJalan_9'), 
    30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/DATE_TanggalSuratJalan_9'))

//Skenario upload file
// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

// Ambil elemen field "Choose File"
TestObject UploadUnggahSuratJalan = findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/UPLOAD_UnggahSuratJalan')

WebUI.uploadFile(UploadUnggahSuratJalan, filePath)

//Skenario upload file
// Ambil elemen field "Choose File"
TestObject UploadUnggahDokumenDeliveryOrder = findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/UPLOAD_UnggahDokumenDeliveryOrder')

WebUI.uploadFile(UploadUnggahDokumenDeliveryOrder, filePath)

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/SBOX_Material_PilihPengiriman'), 
    30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/SBOX_Material_PilihPengiriman'))

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/SBOX_Material_PilihPengiriman_BIOFKolonelMasturi'), 
    30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/SBOX_Material_PilihPengiriman_BIOFKolonelMasturi'))

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_Material1_NoBatch'), 
    30)

WebUI.clearText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_Material1_NoBatch'))

WebUI.setText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_Material1_NoBatch'), 'NB/24/06/03/01')

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_Material1_QtyKirim'), 
    30)

WebUI.clearText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_Material1_QtyKirim'))

WebUI.setText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TBOX_Material1_QtyKirim'), '5')

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/DATE_Material1_TanggalKadaluarsa'), 
    30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/DATE_Material1_TanggalKadaluarsa'))

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/DATE_Material1_TanggalKadaluarsa_42'), 
    30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/DATE_Material1_TanggalKadaluarsa_42'))

//Skenario upload file
// Ambil elemen field "Choose File"
TestObject UploadDeliverableDokumen1 = findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/UPLOAD_UnggahDeliverableDokumen1')

WebUI.uploadFile(UploadDeliverableDokumen1, filePath)

//Skenario upload file
// Ambil elemen field "Choose File"
TestObject UploadDeliverableDokumen2 = findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/UPLOAD_UnggahDeliverableDokumen2')

WebUI.uploadFile(UploadDeliverableDokumen2, filePath)

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/SBOX_DokumenPendukung'), 
    30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/SBOX_DokumenPendukung'))

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/SBOX_DokumenPendukung_LampiranPR1'), 
    30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/SBOX_DokumenPendukung_LampiranPR1'))

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/BUTTON_TambahDokumen'), 
    30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/BUTTON_TambahDokumen'))

//Skenario upload file
// Ambil elemen field "Choose File"
TestObject UploadUnggahDokumenPendukung = findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/UPLOAD_TambahDokumenPendukung')

WebUI.uploadFile(UploadUnggahDokumenPendukung, filePath)

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TAREA_Catatan'), 30)

WebUI.clearText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TAREA_Catatan'))

WebUI.setText(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/TAREA_Catatan'), 'Catatan pembuatan data Product Receipt')

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/BUTTON_SimpanDraft'), 
    30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/1_TambahDataProductReceipt/BUTTON_SimpanDraft'))

WebUI.waitForElementPresent(findTestObject('P2P/5_ProductReceipt/Vendor/Button_PopupKonfirmasi_OK'), 30)

WebUI.click(findTestObject('P2P/5_ProductReceipt/Vendor/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

