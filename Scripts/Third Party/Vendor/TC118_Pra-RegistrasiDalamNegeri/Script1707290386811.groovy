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

WebUI.openBrowser(GlobalVariable.UrlVendor)

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Button_MenuRegistrasi'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Button_MenuRegistrasi'))

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Field_Pilih_Area_Penyedia'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Field_Pilih_Area_Penyedia'))

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Div_Data_Area_Penyedia'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Div_Data_Area_Penyedia'))

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Field_JenisBarangJasa'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Field_JenisBarangJasa'))

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Div_Data_JenisBarangJasa'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Div_Data_JenisBarangJasa'))

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Field_BentukPerusahaan'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Field_BentukPerusahaan'))

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Div_Data_BentukPerusahaan'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Div_Data_BentukPerusahaan'))

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Field_Provinsi'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Field_Provinsi'))

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Div_Data_Provinsi'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Div_Data_Provinsi'))

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Field_Kota_Kabupaten'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Field_Kota_Kabupaten'))

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Div_Data_Kota_Kabupaten'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Div_Data_Kota_Kabupaten'))

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Field_NPWP'), 0)

WebUI.setText(findTestObject('Third Party/Dalam Negeri/Field_NPWP'), '12.312.124.1-252.1444')

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Field_NamaPerusahaan'), 0)

WebUI.setText(findTestObject('Third Party/Dalam Negeri/Field_NamaPerusahaan'), 'Automated Test X')

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Field_Email'), 0)

WebUI.setText(findTestObject('Third Party/Dalam Negeri/Field_Email'), 'testautomated3@yopmail.com')

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Field_Username'), 0)

WebUI.setText(findTestObject('Third Party/Dalam Negeri/Field_Username'), GlobalVariable.UserCalonRekanan)

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Field_Password'), 0)

WebUI.setText(findTestObject('Third Party/Dalam Negeri/Field_Password'), GlobalVariable.PassCalonRekanan)

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Field_KonfirmasiPassword'), 0)

WebUI.setText(findTestObject('Third Party/Dalam Negeri/Field_KonfirmasiPassword'), GlobalVariable.PassCalonRekanan)

WebUI.waitForElementPresent(findTestObject('Third Party/Dalam Negeri/Button_Daftar'), 0)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Button_Daftar'))

WebUI.click(findTestObject('Third Party/Dalam Negeri/Button_OK'))

WebUI.delay(2)

WebUI.scrollToPosition(300, 0)

WebUI.delay(10)

WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.setText(findTestObject('Third Party/Dalam Negeri/Field_EmailYopmail'), 'testautomated3')

WebUI.click(findTestObject('Third Party/Dalam Negeri/Button_EnterEmail'))

WebUI.delay(50)

WebUI.click(findTestObject('Third Party/Dalam Negeri/Button_Refresh'))

WebUI.delay(5)

WebUI.click(findTestObject('Third Party/Dalam Negeri/a_Aktivasi Akun'))

WebUI.delay(10)

WebUI.closeBrowser()

