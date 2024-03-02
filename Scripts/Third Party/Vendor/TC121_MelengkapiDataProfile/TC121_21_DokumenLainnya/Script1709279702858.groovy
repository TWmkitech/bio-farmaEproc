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

WebUI.click(findTestObject('Third Party/Data Profile/DokumenLainnya/Anchor_DokumenLainnya'))

WebUI.click(findTestObject('Third Party/Data Profile/DokumenLainnya/Button_TambahData'))

WebUI.setText(findTestObject('Third Party/Data Profile/DokumenLainnya/Field_Nama'), 'Dokumen Pengajuan')

WebUI.setText(findTestObject('Third Party/Data Profile/DokumenLainnya/Field_Nomor'), '050/II/PO/12/2021')

def projectDir = Config.getProjectDir()

TestObject uploadFile = findTestObject('Third Party/Data Profile/DokumenLainnya/Upload_Dokumen')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/DokumenLainnya/DokumenDataTest.pdf'

WebUI.uploadFile(uploadFile, filePath)

WebUI.click(findTestObject('Third Party/Data Profile/DokumenLainnya/Field_TanggalDitetapkan'))

WebUI.click(findTestObject('Third Party/Data Profile/DokumenLainnya/Field_TanggalDitetapkan_Bulan'))

WebUI.click(findTestObject('Third Party/Data Profile/DokumenLainnya/Field_TanggalDitetapkan_Data'))

WebUI.click(findTestObject('Third Party/Data Profile/DokumenLainnya/Field_TanggalAkhir'))

WebUI.click(findTestObject('Third Party/Data Profile/DokumenLainnya/Field_TanggalAkhir_Bulan'))

WebUI.click(findTestObject('Third Party/Data Profile/DokumenLainnya/Field_TanggalAkhir_Data'))

WebUI.click(findTestObject('Third Party/Data Profile/DokumenLainnya/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Data Profile/DokumenLainnya/Button_KonfirmasiOK'))

