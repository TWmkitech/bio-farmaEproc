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

CustomKeywords.'login.admin.login'(GlobalVariable.Admin, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_UserManagement'), 0)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_UserManagement'))

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_PurchasingGroup'), 0)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_PurchasingGroup'), 0)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_PurchasingGroup'))

WebUI.delay(10)

TestObject targetElement = findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Button_Update')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Button_Update'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Button_Update'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_NamaPurchasingGroup'), 
    0)

WebUI.clearText(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_NamaPurchasingGroup'))

WebUI.setText(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_NamaPurchasingGroup'), 'Pharmaceutical')

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_KodePurchasing'), 
    0)

WebUI.clearText(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_KodePurchasing'))

WebUI.setText(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_KodePurchasing'), 'PM-002')

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_Deskripsi'), 0)

WebUI.clearText(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_Deskripsi'))

WebUI.setText(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_Deskripsi'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.')

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_NomorSK'), 0)

WebUI.clearText(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_NomorSK'))

WebUI.setText(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Input_NomorSK'), 'SK-201402')

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_TanggalSK'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_TanggalSK'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Span_DataTglSK'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Span_DataTglSK'))

WebUI.scrollToPosition(0, 500)

WebUI.waitForElementClickable(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Upload_SK'), 0)

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Upload_SK')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Checkbox_Holding'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Checkbox_Holding'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_NamaPerusahaan'), 
    0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_NamaPerusahaan'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataNamaPerusahaan'), 
    0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataNamaPerusahaan'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_BOD1'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_BOD1'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataBOD1'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataBOD1'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_BOD2'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_BOD2'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataBOD2'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataBOD2'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_BOD3'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_BOD3'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataBOD3'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataBOD3'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_BOD4'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_BOD4'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataBOD4'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataBOD4'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_Material'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Field_Material'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataMaterial'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Div_DataMaterial'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Checkbox_Agreement'), 
    0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Checkbox_Agreement'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Button_Simpan'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Button_Simpan'))

WebUI.waitForElementPresent(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Button_OK'), 0)

WebUI.click(findTestObject('User-Management/PurchasingGroup/Update_PurchasingGroup/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

