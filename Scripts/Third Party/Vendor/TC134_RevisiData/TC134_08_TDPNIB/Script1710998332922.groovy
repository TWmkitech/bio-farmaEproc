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

not_run: WebUI.callTestCase(findTestCase('Third Party/Vendor/TC134_RevisiData/TC134_00'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Anchor_TDPNIB'), 5)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Anchor_TDPNIB'))

not_run: WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Button_EditData'))

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Button_Tambah'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_Jenis'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_Jenis_Data'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_InstansiPenerbit'), 'Lembaga OSS Edit')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_NomorIzin'), '0098509375')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_TanggalTerbit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_TanggalTerbit_Bulan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_TanggalTerbit_Data'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Checklist_BerlakuSelama'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_SubBidangKlasifikasi'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_SubBidangKlasifikasi_Data1'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_SubBidangKlasifikasi'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_SubBidangKlasifikasi_Data2'))

TestObject uploadTDPNIB = findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Upload_TDPNIB')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadTDPNIB, filePath)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Field_Keterangan'), 'Diubah menggunakan automation')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/TDPNIB/Button_KonfirmasiOK'))

WebUI.delay(5)

