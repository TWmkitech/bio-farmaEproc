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

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/Vendor/Login_vendor/Techolution Digital Indonesia'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/Modul_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/Submodul_Tender Seleksi Umum'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/span_Tender Umum yang diikuti'))

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/SeachingVendor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/Icon_Detail'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/InputNegosiasiByPenyedia/a_Negosiasi'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/InputNegosiasiByPenyedia/Riwayat_Topik'), 
    0)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/InputNegosiasiByPenyedia/b_Balas'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/InputNegosiasiByPenyedia/teks_Balas'), 'sanggup')

def projectDir = Config.getProjectDir()

TestObject upload_DokBalas = findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/InputNegosiasiByPenyedia/upload_DokBalas')

// Membentuk path lengkap file yang ingin diunggah
def filePathDokBalas = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_DokBalas, filePathDokBalas)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/InputNegosiasiByPenyedia/kirim_balas'))

not_run: WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/InputNegosiasiByPenyedia/textarea_buatTopik'), 
    'negosiasi')

TestObject upload_topikPenyedia = findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/InputNegosiasiByPenyedia/upload_topikPenyedia')

// Membentuk path lengkap file yang ingin diunggah
def filePathtopikPenyedia = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_topikPenyedia, filePathtopikPenyedia)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/InputNegosiasiByPenyedia/KirimTanggapan_Penyedia'))

