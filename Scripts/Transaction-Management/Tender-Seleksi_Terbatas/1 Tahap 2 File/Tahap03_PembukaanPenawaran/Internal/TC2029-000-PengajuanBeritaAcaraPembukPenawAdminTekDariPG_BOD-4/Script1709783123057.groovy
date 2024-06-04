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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGHolding_BioFarma_BOD-4'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/0_Anchor_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/2_Anchor_Tender-Seleksi_Terbatas'))

WebUI.delay(5)

TestObject targetElement = findTestObject('Object Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/Menu_TahapanPembukaanPenawaran'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/3_PengajuanBeritaAcaraPembukaanPenawaran/Button_PersetujuanPembukaanPenawaran'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/3_PengajuanBeritaAcaraPembukaanPenawaran/Textbox_Lampiran'), 
    'TestNamaLampiran')

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/3_PengajuanBeritaAcaraPembukaanPenawaran/Upload_Lampiran')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/3_PengajuanBeritaAcaraPembukaanPenawaran/Textbox_LinkRecord'), 
    'https://testlinkrecord.com/test/')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/3_PengajuanBeritaAcaraPembukaanPenawaran/Textbox_KeteranganRecord'), 
    'TestKeteranganRecord')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/3_PengajuanBeritaAcaraPembukaanPenawaran/Textbox_CatatanPembukaanPenawaran'), 
    'TestCatatanPembukaanPenawaran')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/3_PengajuanBeritaAcaraPembukaanPenawaran/button_Simpan Dan Kirim'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Internal/3_PengajuanBeritaAcaraPembukaanPenawaran/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

