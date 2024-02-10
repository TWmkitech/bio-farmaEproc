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

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/Global-TestObject/NavLink_User'), 0)

WebUI.click(findTestObject('Data-Integrasi/Global-TestObject/NavLink_User'))

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/Global-TestObject/Button_ChangeRoles'), 0)

WebUI.click(findTestObject('Data-Integrasi/Global-TestObject/Button_ChangeRoles'))

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/Global-TestObject/Field_Roles'), 0)

WebUI.click(findTestObject('Data-Integrasi/Global-TestObject/Field_Roles'))

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/Global-TestObject/Field_Entitas'), 0)

WebUI.click(findTestObject('Data-Integrasi/Global-TestObject/Field_Entitas'))

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/Global-TestObject/Button_Ganti'), 0)

WebUI.click(findTestObject('Data-Integrasi/Global-TestObject/Button_Ganti'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/Global-TestObject/Anchor_DataIntegrasi'), 0)

WebUI.click(findTestObject('Data-Integrasi/Global-TestObject/Anchor_DataIntegrasi'))

WebUI.scrollToElement(findTestObject('Data-Integrasi/Global-TestObject/Anchor_PurchaseOrder'), 3)

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/Global-TestObject/Anchor_PurchaseOrder'), 0)

WebUI.click(findTestObject('Data-Integrasi/Global-TestObject/Anchor_PurchaseOrder'))

WebUI.waitForElementPresent(findTestObject('Data-Integrasi/Upload_PurchaseOrder/Button_Unggah'), 0)

WebUI.click(findTestObject('Data-Integrasi/Upload_PurchaseOrder/Button_Unggah'))

WebUI.delay(10)

WebUI.waitForElementClickable(findTestObject('Data-Integrasi/Upload_PurchaseOrder/Button_ChooseFile'), 0)

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Data-Integrasi/Upload_PurchaseOrder/Button_ChooseFile')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/purchaseOrder_DataIntegrasi.xlsx'

WebUI.uploadFile(uploadField, filePath)

WebUI.delay(10)

WebUI.waitForElementClickable(findTestObject('Data-Integrasi/Upload_PurchaseOrder/Button_Proses'), 0)

WebUI.click(findTestObject('Data-Integrasi/Upload_PurchaseOrder/Button_Proses'))

WebUI.waitForElementClickable(findTestObject('Data-Integrasi/Upload_PurchaseOrder/Button_OK'), 0)

WebUI.click(findTestObject('Data-Integrasi/Upload_PurchaseOrder/Button_OK'))

WebUI.delay(12)

WebUI.closeBrowser()

