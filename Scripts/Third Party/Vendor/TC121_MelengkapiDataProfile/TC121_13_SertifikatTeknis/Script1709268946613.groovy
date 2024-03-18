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

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Anchor_Sertifikat Teknis'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Button_TambahData'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_JenisSertifikasi'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_JenisSertifikasi_Data'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_InstansiPenerbit'), 'Lembaga OSS')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_NamaSertifikasi'), 'Dokumen Sertifikasi Automation')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_NomorSertifikasi'), '0098509375')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_TanggalTerbit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_TanggalTerbit_Bulan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_TanggalTerbit_Data'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_TanggalBerlaku'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_TanggalBerlaku_Bulan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_TanggalBerlaku_Data'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Field_SubBidangSertifikasi'), 'Bidang Automation')

def projectDir = Config.getProjectDir()

TestObject uploadFile = findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Upload_Sertifikat')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/SertifikasiTeknis/sertifikat.jpg'

WebUI.uploadFile(uploadFile, filePath)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/SertifikasiTeknis/Button_KonfirmasiOK'))

