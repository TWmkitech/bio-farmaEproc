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

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Anchor_TDPNIB'))

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Button_Tambah'))

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Field_Jenis'))

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Field_Jenis_Data'))

WebUI.setText(findTestObject('Third Party/Data Profile/TDPNIB/Field_InstansiPenerbit'), 'Lembaga OSS')

WebUI.setText(findTestObject('Third Party/Data Profile/TDPNIB/Field_NomorIzin'), '0098509375')

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Field_TanggalTerbit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Field_TanggalTerbit_Bulan'))

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Field_TanggalTerbit_Data'))

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Checklist_BerlakuSelama'))

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Field_SubBidangKlasifikasi'))

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Field_SubBidangKlasifikasi_Data1'))

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Field_SubBidangKlasifikasi'))

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Field_SubBidangKlasifikasi_Data2'))

TestObject uploadTDPNIB = findTestObject('Third Party/Data Profile/TDPNIB/Upload_TDPNIB')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/TDPNIB/nib.jpg'

WebUI.uploadFile(uploadTDPNIB, filePath)

WebUI.setText(findTestObject('Third Party/Data Profile/TDPNIB/Field_Keterangan'), 'Dibuat menggunakan automation')

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Data Profile/TDPNIB/Button_KonfirmasiOK'))

