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

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Button_DashboardAnalytics'))

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Button_ContractProfile'))

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Button_InvoiceProcessing'))

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Field_Filter'))

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Pilih_Filter'))

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Field_Start'))

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Pilih_Start'))

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Field_End'))

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Pilih_End'))

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Field_Entitas'))

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Pilih_Entitas'))

WebUI.click(findTestObject('Dashboard Analytics/Contract Profile/Invoice Processing/Button_Search'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 400)

WebUI.delay(5)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

