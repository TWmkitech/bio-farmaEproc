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

WebUI.callTestCase(findTestCase('Third Party/Vendor/TC120_Login Pra-Registrasi Calon Vendor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/0_Anchor_ThirdParty'))

WebUI.click(findTestObject('Third Party/Vendor/Relationship/Anchor_Relationship'))

WebUI.click(findTestObject('Third Party/Vendor/Relationship/Button_Tambah'))

WebUI.click(findTestObject('Third Party/Vendor/Relationship/Pilih_Kategori'))

WebUI.click(findTestObject('Third Party/Vendor/Relationship/Pilih_Kategori_Data'))

WebUI.setText(findTestObject('Third Party/Vendor/Relationship/Field_Judul'), 'Automation')

WebUI.setText(findTestObject('Third Party/Vendor/Relationship/Field_Deskripsi'), 'Dibuat menggunakan Automation')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

TestObject uploadField = findTestObject('Third Party/Vendor/Relationship/Upload_Dokumen')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.click(findTestObject('Third Party/Vendor/Relationship/Button_Submit'))

WebUI.click(findTestObject('Third Party/Vendor/Relationship/Button_KonfirmasiOK'))

