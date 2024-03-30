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

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Anchor_KeteranganDomisili'), 
    5)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Anchor_KeteranganDomisili'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Button_EditData'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_Jenis'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_Jenis_Data'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_InstansiPenerbit'), 'Lembaga OSS')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_NoSurat'), '0098509375')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_TanggalTerbit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_TanggalTerbit_Bulan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_TanggalTerbit_Data'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_TanggalBerlaku'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_TanggalBerlaku_Bulan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_TanggalBerlaku_Data'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_SubKlasifikasi'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_SubKlasifikasi_Data'))

TestObject uploadFile = findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Upload_ScanDomisili')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadFile, filePath)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_Keterangan'), 'Diubah menggunakan automation')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Field_Domisili'), 'Jl. Alamat Test No. 123')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/KeteranganDomisili/Button_KonfirmasiOK'))

WebUI.delay(5)

