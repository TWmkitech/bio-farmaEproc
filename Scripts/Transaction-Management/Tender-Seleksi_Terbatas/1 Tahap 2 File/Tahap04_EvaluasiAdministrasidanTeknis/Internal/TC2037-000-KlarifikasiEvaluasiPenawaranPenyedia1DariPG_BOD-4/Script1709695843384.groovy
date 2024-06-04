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

//WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses'))
//WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Internal/CustomIconProses'), 
//    [('index') : 2], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/Menu_TahapanEvaluasiAdminTeknis'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/Menu_TahapanEvaluasiAdminTeknis'), 
    5)

//WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/Text_NamaPenyedia2'))
WebUI.delay(5)

TestObject targetElement2 = findTestObject('bject Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/4_KlarifikasiEvaluasiPenawaranPenyedia/Icon_PenilianEvaluasi1')

WebUI.sendKeys(targetElement2, Keys.chord(Keys.ARROW_RIGHT))

WebUI.sendKeys(targetElement2, Keys.chord(Keys.ARROW_RIGHT))

WebUI.sendKeys(targetElement2, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/4_KlarifikasiEvaluasiPenawaranPenyedia/Icon_PenilianEvaluasi1'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/4_KlarifikasiEvaluasiPenawaranPenyedia/button_Kirim Topik'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/4_KlarifikasiEvaluasiPenawaranPenyedia/Textbox_BuatPertanyaan'), 
    'Apakah Ini Pertanyaan ke Vendor1?')

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/4_KlarifikasiEvaluasiPenawaranPenyedia/Upload_DokumenKlarifikasi')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/4_KlarifikasiEvaluasiPenawaranPenyedia/button_Simpan dan Kirim'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/4_KlarifikasiEvaluasiPenawaranPenyedia/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

