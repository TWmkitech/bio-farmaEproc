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

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/input_Username_username'), '21000535')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/input_Password_password'), 'password.1')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/button_Masuk'))

WebUI.delay(8)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/027_Ajukan_Persetujuan_Hasil_Evaluasi_byEntitas/entitas_Transaction_Management'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/027_Ajukan_Persetujuan_Hasil_Evaluasi_byEntitas/entitas_Seleksi_Umum'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/027_Ajukan_Persetujuan_Hasil_Evaluasi_byEntitas/proses_tender'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/026_Ajukan_Persetujuan_Hasil_Evaluasi_byAgen/tab_Persetujuan_Evaluasi_AdmTeknis'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/026_Ajukan_Persetujuan_Hasil_Evaluasi_byAgen/tombol_Ajukan_Persetujuan'))

WebUI.delay(4)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/027_Ajukan_Persetujuan_Hasil_Evaluasi_byEntitas/pilih_Setuju'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/027_Ajukan_Persetujuan_Hasil_Evaluasi_byEntitas/isikan_Catatan'), 
    'Pengajuan persetujuan oleh entitas')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/027_Ajukan_Persetujuan_Hasil_Evaluasi_byEntitas/tombol_Simpan_Kirim'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/026_Ajukan_Persetujuan_Hasil_Evaluasi_byAgen/konfirmasi_OK'))

WebUI.delay(3)

