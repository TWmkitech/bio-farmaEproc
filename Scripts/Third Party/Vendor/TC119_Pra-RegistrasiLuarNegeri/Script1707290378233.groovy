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

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Button_HalamanDaftar'), 0)

WebUI.click(findTestObject('Third Party/Vendor/Luar Negeri/Button_HalamanDaftar'))

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Field_AreaPenyedia'), 0)

WebUI.click(findTestObject('Third Party/Vendor/Luar Negeri/Field_AreaPenyedia'))

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Div_AreaPenyedia'), 0)

WebUI.click(findTestObject('Third Party/Vendor/Luar Negeri/Div_AreaPenyedia'))

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Field_JenisBarangJasa'), 0)

WebUI.click(findTestObject('Third Party/Vendor/Luar Negeri/Field_JenisBarangJasa'))

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Div_JenisBarangJasa'), 0)

WebUI.click(findTestObject('Third Party/Vendor/Luar Negeri/Div_JenisBarangJasa'))

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Field_Negara'), 0)

WebUI.click(findTestObject('Third Party/Vendor/Luar Negeri/Field_Negara'))

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Div_Negara'), 0)

WebUI.click(findTestObject('Third Party/Vendor/Luar Negeri/Div_Negara'))

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Field_NPWP'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Luar Negeri/Field_NPWP'), '12.312.124.1-252.1432')

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Field_NamaPerusahaan'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Luar Negeri/Field_NamaPerusahaan'), 'Overseas Automated X')

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Field_Email'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Luar Negeri/Field_Email'), 'overseasauto@yopmail.com')

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Field_Username'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Luar Negeri/Field_Username'), 'overseasauto')

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Field_Password'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Luar Negeri/Field_Password'), 'Bi0f@rma')

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Field_KonfirmasiPassword'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Luar Negeri/Field_KonfirmasiPassword'), 'Bi0f@rma')

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Button_Registrasi'), 0)

WebUI.click(findTestObject('Third Party/Vendor/Luar Negeri/Button_Registrasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Luar Negeri/Button_OK'), 0)

WebUI.click(findTestObject('Third Party/Vendor/Luar Negeri/Button_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://yopmail.com/en/')

WebUI.setText(findTestObject('Third Party/Vendor/Dalam Negeri/Field_EmailYopmail'), 'overseasauto')

WebUI.click(findTestObject('Third Party/Vendor/Dalam Negeri/Button_EnterEmail'))

WebUI.delay(100)

WebUI.click(findTestObject('Third Party/Vendor/Dalam Negeri/Button_Refresh'))

WebUI.delay(5)

WebUI.click(findTestObject('Third Party/Vendor/Dalam Negeri/a_Aktivasi Akun'))

WebUI.delay(10)

WebUI.closeBrowser()

