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

WebUI.callTestCase(findTestCase('Third Party/Vendor/TC121_MelengkapiDataProfile/TC121_00'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Anchor_DataUmum'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Pilih_Prefix'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Pilih_PrefixData'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Pilih_Sufix'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Pilih_SufixData'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_Kodepos'), '12345')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_Alamat'), 'Jl. Test Alamat No. 123')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Button_GPS'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_TitikGPS'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_TitikGPS'), '-6.1644676554880995, 106.82024002075197')

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Button_GPSSimpan'), 0)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Button_GPSSimpan'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_Telepon'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_Telepon'), '022-75690876')

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_Fax'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_Fax'), '-')

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_Website'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_Website'), 'www.google.com')

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_EmailBackup'), 0)

not_run: WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_EmailBackup'), 'automatedtestbackup@yopmail.com')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

TestObject uploadField = findTestObject('Third Party/Vendor/Data Profile/DataUmum/Upload_Logo')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/DataUmum/logo.png'

WebUI.uploadFile(uploadField, filePath)

TestObject uploadProfil = findTestObject('Third Party/Vendor/Data Profile/DataUmum/Upload_Profil')

// Membentuk path lengkap file yang ingin diunggah
def filePathProfil = projectDir + '/Document/ThirdParty/DataUmum/profil.pdf'

WebUI.uploadFile(uploadProfil, filePathProfil)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Field_DokLainnya'), 'Dokumen Tambahan')

TestObject uploadDok = findTestObject('Third Party/Vendor/Data Profile/DataUmum/Upload_DokLain')

// Membentuk path lengkap file yang ingin diunggah
def filePathDokLain = projectDir + '/Document/ThirdParty/DataUmum/doklainnya.pdf'

WebUI.uploadFile(uploadDok, filePathDokLain)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/DataUmum/Button_KonfirmasiOK'))

