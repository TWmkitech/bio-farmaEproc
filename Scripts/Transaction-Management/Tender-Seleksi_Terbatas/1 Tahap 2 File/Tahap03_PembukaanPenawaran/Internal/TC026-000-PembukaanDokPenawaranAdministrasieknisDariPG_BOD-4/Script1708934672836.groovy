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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGHolding_BioFarma_BOD-4'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/0_Anchor_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/2_Anchor_Tender-Seleksi_Terbatas'))

WebUI.delay(5)

TestObject targetElement = findTestObject('Object Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/Menu_TahapanPembukaanPenawaran'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/Button_PembukaanDokomenPenawaran'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/Button_PopupPembukaanPenawaran_Ya'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Radiobutton_Hadir1'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Radiobutton_Hadir2'))

TestObject targetElement1 = findTestObject('Object Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Button_Checklist_Row1')

WebUI.sendKeys(targetElement1, Keys.chord(Keys.ARROW_RIGHT))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Textbox_NamaPerwakilan_Row1'), 
    'TestNama Perwakilan1')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Textbox_NomorKontak_Row1'), 
    '082112345678')

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Upload_SuratKuasa_Row1')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Button_Checklist_Row1'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Rbutton_PopupStatus1_Lengkap_Row1'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Rbutton_PopupStatus1_Lengkap_Row2'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Rbutton_PopupStatus1_Lengkap_Row3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Rbutton_PopupStatus2_Lengkap_Row1'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/button_PopupStatus_Simpan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Button_PopupStatus_OK'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Textbox_NamaPerwakilan_Row2'), 
    'TestNama Perwakilan2')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Textbox_NomorKontak_Row2'), 
    '082187654321')

// Ambil elemen field "Choose File"
TestObject uploadField2 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Upload_SuratKuasa_Row2')

// Mendapatkan direktori proyek
def projectDir2 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir2 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Button_Checklist_Row2'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Rbutton_PopupStatus1_Lengkap_Row1'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Rbutton_PopupStatus1_Lengkap_Row2'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Rbutton_PopupStatus1_Lengkap_Row3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Rbutton_PopupStatus2_Lengkap_Row1'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/button_PopupStatus_Simpan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Button_PopupStatus_OK'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/button_Simpan'), 
    5)

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/button_Simpan'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/button_Simpan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/2_PembukaanDokPenawaran/Button_PopupKonfirmasi_OK'))

WebUI.closeBrowser()

