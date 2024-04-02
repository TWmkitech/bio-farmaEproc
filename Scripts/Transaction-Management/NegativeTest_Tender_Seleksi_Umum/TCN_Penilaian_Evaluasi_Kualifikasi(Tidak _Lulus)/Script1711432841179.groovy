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

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/Search'), 
    'Paket Re PQ - Room 3 - 1')

WebUI.delay(3)

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/proses_tender'))

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/evaluasi_kualifikasi'))

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/icon_Penilaian_Vendor1'))

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/1_Nilai_NPWP_PKP'), 
    '5')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/2_Nilai_NIB'), 
    '10')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/3_Nilai_IzinLokasi'), 
    '5')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/4_Nilai_Pernyataan'), 
    '5')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/5_Nilai_Pakta_Integritas'), 
    '10')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/6_Nilai_Company_Profile'), 
    '10')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/7_Nilai_SBU'), 
    '10')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/8_Nilai_SIUP_SIUJK'), 
    '10')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/9_Nilai_SPT_Tahunan'), 
    '10')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/10_Nilai_Referensi_Bank'), 
    '5')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/11_Nilai_CV'), 
    '20')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/12_Nilai Peralatan'), 
    '5')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/13_Nilai_Pengalaman_Perusahaan'), 
    '5')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/14_Nilai_Akta_Perusahaan'), 
    '10')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/15_Nilai_Pemegang_Saham'), 
    '10')

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/dokumen_pendukung'), 
    'File Dokumen Pendukung')

def projectDir = Config.getProjectDir()

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/upload_DokumenPendukung')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/alasan_Tidak_Lulus'), 
    'Nilai kurang dari nilai minimal bobot')

WebUI.delay(8)

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/button_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Penilaian_Evaluasi_Kualifikasi(Tidak _Lulus)/konfirmasi_SimpanKirim'))

WebUI.delay(8)

