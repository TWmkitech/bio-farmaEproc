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

CustomKeywords.'login.Bod4.login'(GlobalVariable.BOD_4, GlobalVariable.Pass)

WebUI.click(findTestObject('Account Management/Purchase Order/Button_Roles'))

WebUI.click(findTestObject('Account Management/Purchase Order/Button_ChangeRoles'))

WebUI.click(findTestObject('Account Management/Purchase Order/Field_Entitas'))

WebUI.click(findTestObject('Account Management/Purchase Order/Div_Entitas'))

WebUI.click(findTestObject('Account Management/Purchase Order/Button_Ganti'))

WebUI.click(findTestObject('Account Management/Purchase Order/Button_DataIntegrasi'))

WebUI.scrollToElement(findTestObject('Account Management/Purchase Order/Button_PurchaseOrder'), 3)

WebUI.click(findTestObject('Account Management/Purchase Order/Button_PurchaseOrder'))

WebUI.click(findTestObject('Account Management/Purchase Order/Button_Unggah'))

WebUI.click(findTestObject('Account Management/Purchase Order/Button_DownloadTemplatePurchaseOrder'))

WebUI.delay(3)

WebUI.click(findTestObject('Account Management/Purchase Order/Button_Proses'))

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Account Management/Purchase Order/Button_ChooseFile')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/purchaseOrder_template.xlsx'

WebUI.uploadFile(uploadField, filePath)

WebUI.delay(10)

WebUI.click(findTestObject('Account Management/Purchase Order/Button_Proses'))

WebUI.click(findTestObject('Account Management/Purchase Order/Button_Ok'))

WebUI.delay(10)

WebUI.closeBrowser()

