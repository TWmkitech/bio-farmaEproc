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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/1_Vendor/Vendor2_Bespin Global Indonesia'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Vendor/Vendor/Modul_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Vendor/Vendor/SubModul_Tender  Seleksi Terbatas'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Vendor/Menu_Tender  Seleksi Terbatas Yang Diikuti'))

//WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Vendor/Icon_ProsesTender'))

WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Vendor/Custom_Icon_ProsesTender'), 
    [('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Vendor/Vendor/Verify_InformasiUmumPengadaan'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/1_BalasTopik/Menu_Negosiasi'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/1_BalasTopik/Text_Riwayat Topik'), 
    5)

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/1_BalasTopik/Textbox_BuatTopik'), 
    'Buat Balasan Topik Dari Penyedia 1 Ke PG Holding')

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/1_BalasTopik/Upload_FileUpload')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/1_BalasTopik/button_Kirim Tanggapan'))

WebUI.delay(5)

WebUI.closeBrowser()

