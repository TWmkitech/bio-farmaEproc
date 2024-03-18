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

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/transaction_Management'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/tender_Seleksi_Umum'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/proses_tender'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/tab_Pembukaan_Penawaran'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/018_Pengajuan_Berita_Acara/tombol_Persetujuan_Pembukaan_Penawaran'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/018_Pengajuan_Berita_Acara/text_PokokAcaraRapat'), 'Acara Rapat Pengajuan Berita Acara')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/018_Pengajuan_Berita_Acara/text_JalannyaRapat'), 'Rapat berjalan dengan baik dan lancar')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/018_Pengajuan_Berita_Acara/text_Penutup'), 'Terimakasih atas kehadirannya di acara rapat pengajuan berita acara')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/018_Pengajuan_Berita_Acara/input_Lampiran'), 'Data Lampiran')

def projectDir = Config.getProjectDir()

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('TransactionManagement/Seleksi-Umum/018_Pengajuan_Berita_Acara/upload_Lampiran')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/018_Pengajuan_Berita_Acara/input_Link_Record'), 'http://gdrive_rapat')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/018_Pengajuan_Berita_Acara/input_Keterangan_Record'), 'Record BA')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/018_Pengajuan_Berita_Acara/input_Catatan_Pembukaan_Penawaran'), 
    'Pengajuan Berita Acara')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/018_Pengajuan_Berita_Acara/tombol_Persetujuan_BA'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/018_Pengajuan_Berita_Acara/konfirmasi_OK'))

WebUI.delay(4)

WebUI.closeBrowser()

