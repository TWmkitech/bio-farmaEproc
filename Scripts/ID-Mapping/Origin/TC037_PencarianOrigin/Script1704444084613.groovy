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

CustomKeywords.'login.Bod4.login'(GlobalVariable.BOD_4, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Anchor_IDmapping'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Anchor_IDmapping'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Global_TestObject/Anchor_Origin'), 0)

WebUI.click(findTestObject('ID-Mapping/Global_TestObject/Anchor_Origin'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Pencarian_Origin/Field_FilterStatus'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Pencarian_Origin/Field_FilterStatus'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Pencarian_Origin/Div_DataFilterStatus'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Pencarian_Origin/Div_DataFilterStatus'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Pencarian_Origin/Field_FilterKolom'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Pencarian_Origin/Field_FilterKolom'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Pencarian_Origin/Div_DataFilterKolom'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Pencarian_Origin/Div_DataFilterKolom'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Pencarian_Origin/Input_Search'), 0)

WebUI.setText(findTestObject('ID-Mapping/Origin/Pencarian_Origin/Input_Search'), 'ocb')

WebUI.delay(10)

WebUI.closeBrowser()

