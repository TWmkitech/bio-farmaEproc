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

not_run: WebUI.callTestCase(findTestCase('Third Party/Vendor/TC121_MelengkapiDataProfile/TC121_00'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Anchor_LaporanKeuangan'))

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Button_TambahData'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Field_Audit'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Field_AuditYa'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Field_KAP'), 'KAP Automation')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Field_TahunLaporan'), '2023')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Field_Kas'), '1000000000')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Field_Piutang'), '500000000')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Field_TotalAktiva'), '1500000000')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Field_Hutang'), '50000000')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Field_Modal'), '1000000000')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Field_Aset'), '500000000')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Field_Omset'), '1500000000')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

TestObject uploadFile = findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Upload_LaporanKeuangan')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/LaporanKeuangan/laporankeuangan.jpeg'

WebUI.uploadFile(uploadFile, filePath)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/LaporanKeuangan/Button_KonfirmasiOK'))

