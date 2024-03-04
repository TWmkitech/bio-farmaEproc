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

//WebUI.openBrowser(GlobalVariable.UrlEprocDev)
WebUI.openBrowser('')

WebUI.navigateToUrl('https://eproc-dev.digital-healthcare.id/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login/internal/Field_Email'), '12000128')

WebUI.setText(findTestObject('Object Repository/Login/internal/Field_Pass'), 'ul4ul4ul1ul1')

WebUI.click(findTestObject('Object Repository/Login/internal/Button_Masuk'))

WebUI.waitForElementPresent(findTestObject('Login/internal/Verify_Username'), 5)

WebUI.verifyElementText(findTestObject('Login/internal/Verify_Username'), 'Nasriah Iyut')

//ChangeRoles to HOLDING
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/dropdown_Profile'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/changeRoles'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_changeRole'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/select_Holding_BOD-3'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/button_Ganti'))

