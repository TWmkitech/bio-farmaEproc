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

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_Entitas'), 0)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_Entitas'), 0)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_Entitas'))

WebUI.delay(10)

TestObject targetElement = findTestObject('Object Repository/User-Management/Entitas/UpdateEntitas/Button_Update')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/UpdateEntitas/Button_Update'), 0)

WebUI.click(findTestObject('User-Management/Entitas/UpdateEntitas/Button_Update'))

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/TambahEntitas/Input_NamaEntitas'), 0)

WebUI.clearText(findTestObject('User-Management/Entitas/TambahEntitas/Input_NamaEntitas'))

WebUI.setText(findTestObject('User-Management/Entitas/TambahEntitas/Input_NamaEntitas'), 'PT Sentral Farmasi Indonesia')

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/TambahEntitas/Input_NomorEntitas'), 0)

WebUI.clearText(findTestObject('User-Management/Entitas/TambahEntitas/Input_NomorEntitas'))

WebUI.setText(findTestObject('User-Management/Entitas/TambahEntitas/Input_NomorEntitas'), 'SSI003')

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/TambahEntitas/Input_KodeEntitas'), 0)

WebUI.clearText(findTestObject('User-Management/Entitas/TambahEntitas/Input_KodeEntitas'))

WebUI.setText(findTestObject('User-Management/Entitas/TambahEntitas/Input_KodeEntitas'), 'SFI')

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/TambahEntitas/Input_KodeNPK'), 0)

WebUI.clearText(findTestObject('User-Management/Entitas/TambahEntitas/Input_KodeNPK'))

WebUI.setText(findTestObject('User-Management/Entitas/TambahEntitas/Input_KodeNPK'), '456')

WebUI.scrollToPosition(0, 400)

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/TambahEntitas/Field_LevelEntitas'), 0)

WebUI.click(findTestObject('User-Management/Entitas/TambahEntitas/Field_LevelEntitas'))

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/UpdateEntitas/Div_DataLevel'), 0)

WebUI.click(findTestObject('User-Management/Entitas/UpdateEntitas/Div_DataLevel'))

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/TambahEntitas/Field_IndukEntitas'), 0)

WebUI.click(findTestObject('User-Management/Entitas/TambahEntitas/Field_IndukEntitas'))

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/UpdateEntitas/Div_DataInduk'), 0)

WebUI.click(findTestObject('User-Management/Entitas/UpdateEntitas/Div_DataInduk'))

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/TambahEntitas/Checkbox_Agreement'), 0)

WebUI.click(findTestObject('User-Management/Entitas/TambahEntitas/Checkbox_Agreement'))

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/TambahEntitas/Button_Simpan'), 0)

WebUI.click(findTestObject('User-Management/Entitas/TambahEntitas/Button_Simpan'))

WebUI.waitForElementPresent(findTestObject('User-Management/Entitas/TambahEntitas/Button_OK'), 0)

WebUI.click(findTestObject('User-Management/Entitas/TambahEntitas/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

