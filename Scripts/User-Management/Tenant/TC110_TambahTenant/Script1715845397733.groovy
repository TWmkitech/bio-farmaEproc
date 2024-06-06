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

CustomKeywords.'login.admin.login'(GlobalVariable.Admin, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_UserManagement'), 0)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_UserManagement'))

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_Tenant'), 0)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_Tenant'), 0)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_Tenant'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Button_Tambah'), 0)

WebUI.click(findTestObject('User-Management/Tenant/Tambah_Tenant/Button_Tambah'))

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Field_Entitas'), 0)

WebUI.click(findTestObject('User-Management/Tenant/Tambah_Tenant/Field_Entitas'))

WebUI.click(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_Entitas'))

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/UploadFile'), 0)

WebUI.uploadFile(findTestObject('User-Management/Tenant/Tambah_Tenant/UploadFile'), 'D:\\Automation Biofarma\\Biofarma new\\Document\\test.jpg')

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_NPWP'), 0)

WebUI.setText(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_NPWP'), '5462262646')

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_NPPKP'), 0)

WebUI.setText(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_NPPKP'), '1616463')

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_PosisiCC'), 0)

WebUI.setText(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_PosisiCC'), 'Automated Testing')

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_NoTelp'), 0)

WebUI.setText(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_NoTelp'), '08465164621')

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_Fax'), 0)

WebUI.setText(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_Fax'), '9061')

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_Kota'), 0)

WebUI.setText(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_Kota'), 'Testing')

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_Alamat'), 0)

WebUI.setText(findTestObject('User-Management/Tenant/Tambah_Tenant/Div_Alamat'), 'Automated Test')

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Checkbox_Agreement'), 0)

WebUI.click(findTestObject('User-Management/Tenant/Tambah_Tenant/Checkbox_Agreement'))

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Button_Simpan'), 0)

WebUI.click(findTestObject('User-Management/Tenant/Tambah_Tenant/Button_Simpan'))

WebUI.waitForElementPresent(findTestObject('User-Management/Tenant/Tambah_Tenant/Button_OK'), 0)

WebUI.click(findTestObject('User-Management/Tenant/Tambah_Tenant/Button_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.closeBrowser()

