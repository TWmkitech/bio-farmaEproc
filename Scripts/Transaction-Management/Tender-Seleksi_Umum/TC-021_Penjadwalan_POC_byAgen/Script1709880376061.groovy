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

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/tombol_Penjadwalan'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/jadwal_POC_Vendor1'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_JadwalPOC_Vendor1'))

WebUI.clearText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Jam_Vendor1'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Jam_Vendor1'), '1')

WebUI.clearText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Menit_Vendor1'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Menit_Vendor1'), '45')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_AM_PM_Vendor1'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_AM_PM_Vendor1'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_AM_PM_Vendor1'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_JenisRapat_Vendor1'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilihan_Vendor1_Online'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/input_Link_Rapat_Vendor1'), 
    'https://meet.google.com/test')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/input_Keterangan_Vendor1'), 
    'Diharapkan peserta oncam')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/jadwal_POC_Vendor2'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_JadwalPOC_Vendor2'))

WebUI.clearText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Jam_Vendor2'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Jam_Vendor2'), '2')

WebUI.clearText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Menit_Vendor2'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Menit_Vendor2'), '15')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_AM_PM_Vendor2'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_AM_PM_Vendor2'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_AM_PM_Vendor2'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_JenisRapat_Vendor2'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilihan_Vendor2_Online'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/input_Link_Rapat_Vendor2'), 
    'https://meet.google.com/test')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/input_Keterangan_Vendor2'), 
    'Diharapkan peserta oncam')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/jadwal_POC_Vendor3'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_JadwalPOC_Vendor3'))

WebUI.clearText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Jam_Vendor3'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Jam_Vendor3'), '2')

WebUI.clearText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Menit_Vendor3'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Menit_Vendor3'), '45')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_AM_PM_Vendor3'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_AM_PM_Vendor3'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_AM_PM_Vendor3'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_JenisRapat_Vendor3'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilihan_Vendor3_Online'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/input_Link_Rapat_Vendor3'), 
    'https://meet.google.com/test')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/input_Keterangan_Vendor3'), 
    'Diharapkan peserta oncam')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/tambah_Peserta'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Peserta_Internal'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_NamaPeserta'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/pilih_Peserta'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/input_Email'), 'nurunnadiya@gmail.com')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/input_Unit'), 'Strategi Pengadaan')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/input_Instansi'), 'Biofarma')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/tombol_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/021_Penjadwalan_POC_byAgen/konfirmasi_OK'))

WebUI.delay(4)

WebUI.closeBrowser()

