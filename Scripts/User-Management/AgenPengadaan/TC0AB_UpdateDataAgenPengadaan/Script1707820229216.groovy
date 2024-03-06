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

WebUI.maximizeWindow()

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_UserManagement'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_AgenPengadaan'), 5)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_AgenPengadaan'), 5)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_AgenPengadaan'))

WebUI.delay(5)

//WebUI.scrollToElement(findTestObject('User-Management/AgenPengadaan/UpdateDataAgenPengadaan/Text_Aksi'), 5)

WebUI.scrollToPosition(200, 200)

WebUI.waitForElementPresent(findTestObject('User-Management/AgenPengadaan/UpdateDataAgenPengadaan/Button_UpdateData'), 5)

WebUI.click(findTestObject('User-Management/AgenPengadaan/UpdateDataAgenPengadaan/Button_UpdateData'))

WebUI.clearText(findTestObject('User-Management/AgenPengadaan/UpdateDataAgenPengadaan/Input_NomorKontrak'))

WebUI.setText(findTestObject('User-Management/AgenPengadaan/UpdateDataAgenPengadaan/Input_NomorKontrak'), '11/22/33/44')

WebUI.scrollToElement(findTestObject('User-Management/AgenPengadaan/UpdateDataAgenPengadaan/checkbox_Agreement'), 0)

WebUI.waitForElementPresent(findTestObject('User-Management/AgenPengadaan/UpdateDataAgenPengadaan/checkbox_Agreement'), 
    5)

WebUI.click(findTestObject('User-Management/AgenPengadaan/UpdateDataAgenPengadaan/checkbox_Agreement'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/UpdateDataAgenPengadaan/button_Simpan Data'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/UpdateDataAgenPengadaan/Button_OK'))

WebUI.verifyElementPresent(findTestObject('User-Management/AgenPengadaan/UpdateDataAgenPengadaan/Notification_Berhasil'), 
    10)

WebUI.closeBrowser()

