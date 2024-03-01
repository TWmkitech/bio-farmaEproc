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

WebUI.openBrowser(GlobalVariable.UrlStaging)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Login/internal/Field_Email'), '11000420')

WebUI.setText(findTestObject('Object Repository/Login/internal/Field_Pass'), 'bi0farma')

WebUI.click(findTestObject('Object Repository/Login/internal/Button_Masuk'))

WebUI.verifyElementText(findTestObject('Login/internal/Verify_Username'), 'Yogi Hasan Sadikin')

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/ChangeRoles/Icon_Key'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/ChangeRoles/button_Change Roles'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/ChangeRoles/Selectbox_ChangeRoles'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/ChangeRoles/Selectbox_ChangeRoles_1'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/ChangeRoles/button_Ganti'))

