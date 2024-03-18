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

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/tab_Evaluasi_AdmTeknis'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/penilaian_Evaluasi_Vendor3'))

WebUI.delay(2)

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Catatan_Pelaksanaan'), 
    'Pelaksanaan POC sudah dilakukan dengan baik dan berjalan lancar')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/upload_Dokumen_POC'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_DokumenPendukung'), 
    'Dokumen Pendukung POC')

def projectDir = Config.getProjectDir()

// Ambil elemen field "Choose File"
TestObject uploadField_POC = findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/upload_File_POC')

// Membentuk path lengkap file yang ingin diunggah
def filePath_POC = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField_POC, filePath_POC)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/tombol_Upload_Dokumen'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/konfirmasi_OK'))

WebUI.delay(3)

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Nilai_Adm1'), '80')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Nilai_Adm2'), '80')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Nilai_Adm3'), '80')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Nilai_Adm4'), '80')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Catatan_EvaluasiAdm'), 
    'Hasil evaluasi administrasi dinyatakan LULUS')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Nilai_Teknis1'), '80')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Nilai_Teknis2'), '80')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Nilai_Teknis3'), '80')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Nilai_Teknis4'), '80')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Nilai_Teknis5'), '80')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Nilai_Teknis6'), '80')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Nilai_Teknis7'), '80')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Catatan_EvaluasiTeknis'), 
    'Hasil evaluasi teknis dinyatakan LULUS')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/upload_Dokumen_Evaluasi'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/input_Dokumen_KertasKerja'), 
    'Dokumen Kertas Kerja')

TestObject uploadField_Evaluasi = findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/upload_File_Evaluasi')

// Membentuk path lengkap file yang ingin diunggah
def filePath_Evaluasi = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField_Evaluasi, filePath_Evaluasi)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/upload_Dokumen_Evaluasi_AdmTeknis'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/konfirmasi_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/tombol_Simpan_Perubahan'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/022_Evaluasi_AdmTeknis_byAgen/konfirmasi_OK'))

WebUI.delay(4)

WebUI.closeBrowser()

