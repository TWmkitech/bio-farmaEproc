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

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/proses_tender'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/pemberian_penjelasan'))

not_run: WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/buat_Topik'), 
    'Topik yang dibahas terkait KAK dan CV')

not_run: def projectDir = Config.getProjectDir()

// Ambil elemen field "Choose File"
not_run: TestObject uploadField = findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/unggah_DokumenPendukung')

// Membentuk path lengkap file yang ingin diunggah
not_run: def filePath = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadField, filePath)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/button_KirimTopik'))

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/konfirmasi_OK'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/button_Anwijzing_Lapangan'), 
    2)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/button_Anwijzing_Lapangan'))

WebUI.scrollToPosition(0, 4)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/button_Tambah_Anwijzing_Lapangan'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/pilih_Peserta'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/pilih_Peserta_Vendor1'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/Tanggal_Waktu_Anwijzing'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/pilih_Tanggal'))

WebUI.clearText(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/pilih_Jam'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/pilih_Jam'), '10')

WebUI.clearText(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/pilih_Menit'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/pilih_Menit'), '05')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/pilih_AM_PM'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/pilih_AM_PM'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/pilih_AM_PM'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/input_Lokasi'), 'Jakarta')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/input_Catatan'), 'Anwijzing dilakukan hybrid, peserta bisa online ataupun offline')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/button_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/010_Pemberian_Penjelasan_byAgen/konfirmasi_OK'))

WebUI.delay(5)

WebUI.closeBrowser()

