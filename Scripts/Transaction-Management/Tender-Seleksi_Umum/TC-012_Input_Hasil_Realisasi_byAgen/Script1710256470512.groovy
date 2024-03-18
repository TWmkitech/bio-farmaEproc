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

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/pemberian_penjelasan'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/button_Anwijzing_Lapangan'), 
    2)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/button_Anwijzing_Lapangan'))

WebUI.sendKeys(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/Scroll'), '')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/hasil_Realisasi_Vendor4'))

def projectDir = Config.getProjectDir()

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/unggah_File_Realisasi')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/button_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/konfirmasi_OK'))

WebUI.delay(4)

