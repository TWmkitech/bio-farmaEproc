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

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Anchor_AktaPerusahaan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Button_Tambah'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_JenisAkta'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_JenisAkta_Data'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_PrefixNama'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_PrefixNama_Data'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_Nama'), 'Automated Test II')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_SufixNama'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_SufixNama_Data'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_TanggalAkta'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_TanggalAkta_Bulan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_TanggalAkta_Data'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_NomorAkta'), '0098509375')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_NamaNotaris'), 'Harianto S.H')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_AlamatNotaris'), 'Jl. Lemah Hegar Timur')

TestObject uploadAkta = findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_UploadAkta')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePathAkta = projectDir + '/Document/ThirdParty/AktaPerusahaan/akta.pdf'

WebUI.uploadFile(uploadAkta, filePathAkta)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_NoPengesahan'), '10092542943407544')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_TanggalPengesahan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_TanggalPengesahan_Bulan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_TanggalPengesahan_Data'), FailureHandling.STOP_ON_FAILURE)

TestObject uploadSK = findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Field_UploadSK')

// Membentuk path lengkap file yang ingin diunggah
def filePathSK = projectDir + '/Document/ThirdParty/AktaPerusahaan/sk.png'

WebUI.uploadFile(uploadSK, filePathSK)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/AktaPerusahaan/Button_KonfirmasiOK'))

