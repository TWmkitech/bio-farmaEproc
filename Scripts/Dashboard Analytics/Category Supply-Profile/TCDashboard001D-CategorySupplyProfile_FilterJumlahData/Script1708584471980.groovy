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

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Button_DashboardAnalytics'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Button_CategorySupplyProfile'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Field_JenisFilter'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Pilih_JenisFilter'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Field_Start'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Pilih_Start'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Field_End'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Pilih_End'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Field_Entitas'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Pilih_Entitas'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Field_Tampilkan'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Pilih_Tampilkan'))

WebUI.click(findTestObject('Dashboard Analytics/Category Supply-Profile/Button_Search'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 600)

WebUI.delay(0)

