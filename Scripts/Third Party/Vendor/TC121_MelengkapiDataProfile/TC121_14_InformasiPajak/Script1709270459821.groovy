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

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Anchor_InformasiPajak'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_NPWP'), '092542943407000')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

TestObject uploadFile = findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Upload_NPWP')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/InformasiPajak/npwp.jpg'

WebUI.uploadFile(uploadFile, filePath)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_TanggalNPWP'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_TanggalNPWP_Bulan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_TanggalNPWP_Data'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Radio_PKPYa'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_NoPKP'), '9876554123')

TestObject uploadFile2 = findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Upload_PKP')

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir + '/Document/ThirdParty/InformasiPajak/pkp.jpg'

WebUI.uploadFile(uploadFile2, filePath2)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_TanggalPKP'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_TanggalPKP_Bulan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_TanggalPKP_Data'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_NoSKT'), '002/II/2024')

TestObject uploadFile3 = findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Upload_SKT')

// Membentuk path lengkap file yang ingin diunggah
def filePath3 = projectDir + '/Document/ThirdParty/InformasiPajak/skt.png'

WebUI.uploadFile(uploadFile3, filePath3)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_TanggalSKT'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_TanggalSKT_Bulan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Field_TanggalSKT_Data'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/InformasiPajak/Button_KonfirmasiOK'))

