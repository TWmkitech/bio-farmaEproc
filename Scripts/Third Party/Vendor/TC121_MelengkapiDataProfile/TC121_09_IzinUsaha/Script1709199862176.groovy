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

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Anchor_Izin Usaha'))

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Button_TambahData'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_JenisUsaha'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_JenisUsaha_Data'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_InstansiPenerbit'), 'Lembaga OSS')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_NoIzinUsaha'), '0098509375')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_TanggalTerbit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_TanggalTerbit_Bulan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_TanggalTerbit_Data'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Checklist_Berlaku'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_Kualifikasi'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_Kualifikasi_Data'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_SubKualifikasi'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_SubKualifikasi_Data'))

TestObject uploadIzin = findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Upload_Izin')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/IzinUsaha/izin.jpg'

WebUI.uploadFile(uploadIzin, filePath)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Field_Keterangan'), 'Dibuat menggunakan automation')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/IzinUsaha/Button_KonfirmasiOK'))

