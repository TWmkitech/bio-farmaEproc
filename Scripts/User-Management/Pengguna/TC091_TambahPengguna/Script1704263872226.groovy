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

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_Pengguna'), 0)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_Pengguna'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Button_TambahPengguna'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Button_TambahPengguna'))

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Button_SearchPegawai'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Button_SearchPegawai'))

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Button_PilihPegawai'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Button_PilihPegawai'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 400)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_BOD4'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_BOD4'))

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_BOD3'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_BOD3'))

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_Default'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_Default'))

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_Entitas1'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_Entitas1'))

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_Entitas2'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_Entitas2'))

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_Admin'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_Admin'))

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_Agreement'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Checkbox_Agreement'))

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Button_SimpanData'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Button_SimpanData'))

WebUI.waitForElementPresent(findTestObject('User-Management/Pengguna/TambahPengguna/Button_OK'), 0)

WebUI.click(findTestObject('User-Management/Pengguna/TambahPengguna/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

