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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 30)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_DRP'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_DRP'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/1_DRP/SearchDRP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Budget-Planning/DRP/MelengkapiDataDRP/Icon_Update'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('Budget-Planning/DRP/MelengkapiDataDRP/Icon_Update'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/UpdateDRP/TBOX_Kuantitas_T1'), 30)

WebUI.clearText(findTestObject('Budget-Planning/DRP/UpdateDRP/TBOX_Kuantitas_T1'))

WebUI.setText(findTestObject('Budget-Planning/DRP/UpdateDRP/TBOX_Kuantitas_T1'), '100')

WebUI.clearText(findTestObject('Budget-Planning/DRP/UpdateDRP/TBOX_Kuantitas_T2'))

WebUI.setText(findTestObject('Budget-Planning/DRP/UpdateDRP/TBOX_Kuantitas_T2'), '200')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/MelengkapiDataDRP/Button_Kirim'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/MelengkapiDataDRP/Button_Kirim'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DRP/TambahDRP/Button_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/DRP/TambahDRP/Button_OK'))

WebUI.delay(20, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

