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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://eproc-dev.digital-healthcare.id/')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/input_Username_username'), 'bima.g')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/input_Password_password'), 'password.1')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/button_Masuk'))

WebUI.delay(8)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/transaction_Management'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/tender_Seleksi_Umum'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/proses_tender'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/evaluasi_kualifikasi'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/icon_Penilaian_Vendor1'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/1_SBU_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/2_SIUP_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/3_SPTTahunan_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/4_RefBank_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/5_CV_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/6_Peralatan_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/7_Pengalaman_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/8_Akta_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/9_PemegangSaham_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/10_NPWP_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/11_NIB_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/12_IzinLokasi_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/13_Pernyataan_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/14_PaktaIntegritas_Ya'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/15_CompanyProfile_Ya'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/dokumen_pendukung'), 'File Dokumen Pendukung')

def projectDir = Config.getProjectDir()

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/upload_DokumenPendukung')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/button_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/005_PenilaianEvaluasiKualifikasi/konfirmasi_SimpanKirim'))

WebUI.delay(8)

