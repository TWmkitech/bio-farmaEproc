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

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/BarangJasaMampuPasok/Anchor_BarangJasaMampuPasok'))

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/BarangJasaMampuPasok/Button_TambahData'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/BarangJasaMampuPasok/Field_JenisBarangJasa'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/BarangJasaMampuPasok/Field_JenisBarangJasa_DataPengadaanBarang'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/BarangJasaMampuPasok/Field_Kelompok'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/BarangJasaMampuPasok/Field_Kelompok_Data'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/BarangJasaMampuPasok/Field_NamaProduct'), 'Produk Automation')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/BarangJasaMampuPasok/Field_Manufacture'), 'Manufacture Automation')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/BarangJasaMampuPasok/Field_Spesifikasi'), 'Spesifikasi yang dibuat menggunakan automation test')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/BarangJasaMampuPasok/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/BarangJasaMampuPasok/Button_KonfirmasiOK'))

