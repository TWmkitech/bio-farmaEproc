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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Entitas/KAEF/PGEntitas_KAEF_BOD-1'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_DRP'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_DRP'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/ApprovalAnperBOD1/Button_Approve'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/ApprovalAnperBOD1/Button_Approve'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 500)

WebUI.delay(5)

WebUI.scrollToPosition(0, 1800)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/ApprovalAnperBOD1/Checkbox_Persetujuan'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/ApprovalAnperBOD1/Checkbox_Persetujuan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/ApprovalAnperBOD1/Button_Kirim'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/ApprovalAnperBOD1/Button_Kirim'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/ApprovalAnperBOD1/Button_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/ApprovalAnperBOD1/Button_OK'))

WebUI.verifyElementPresent(findTestObject('Budget-Planning/DRP/Verify_PopupKonfirmasi_Berhasil'), 30)

WebUI.closeBrowser()
