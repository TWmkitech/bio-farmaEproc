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

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_AksesRole'), 0)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_AksesRole'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('User-Management/AksesRole/TambahAksesRole/Button_TambahAkses'), 0)

WebUI.click(findTestObject('User-Management/AksesRole/TambahAksesRole/Button_TambahAkses'))

WebUI.waitForElementPresent(findTestObject('User-Management/AksesRole/TambahAksesRole/Input_NamaAksesRole'), 0)

WebUI.setText(findTestObject('User-Management/AksesRole/TambahAksesRole/Input_NamaAksesRole'), 'Purchasing')

WebUI.waitForElementPresent(findTestObject('User-Management/AksesRole/TambahAksesRole/Checkbox_Menu1'), 0)

WebUI.click(findTestObject('User-Management/AksesRole/TambahAksesRole/Checkbox_Menu1'))

WebUI.waitForElementPresent(findTestObject('User-Management/AksesRole/TambahAksesRole/Checkbox_Menu2'), 0)

WebUI.click(findTestObject('User-Management/AksesRole/TambahAksesRole/Checkbox_Menu2'))

WebUI.waitForElementPresent(findTestObject('User-Management/AksesRole/TambahAksesRole/Checkbox_Menu3'), 0)

WebUI.click(findTestObject('User-Management/AksesRole/TambahAksesRole/Checkbox_Menu3'))

WebUI.waitForElementPresent(findTestObject('User-Management/AksesRole/TambahAksesRole/Checkbox_Menu4'), 0)

WebUI.click(findTestObject('User-Management/AksesRole/TambahAksesRole/Checkbox_Menu4'))

WebUI.waitForElementPresent(findTestObject('User-Management/AksesRole/TambahAksesRole/Checkbox_Agreement'), 0)

WebUI.click(findTestObject('User-Management/AksesRole/TambahAksesRole/Checkbox_Agreement'))

WebUI.waitForElementPresent(findTestObject('User-Management/AksesRole/TambahAksesRole/Button_SimpanData'), 0)

WebUI.click(findTestObject('User-Management/AksesRole/TambahAksesRole/Button_SimpanData'))

WebUI.waitForElementPresent(findTestObject('User-Management/AksesRole/TambahAksesRole/Button_OK'), 0)

WebUI.click(findTestObject('User-Management/AksesRole/TambahAksesRole/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

