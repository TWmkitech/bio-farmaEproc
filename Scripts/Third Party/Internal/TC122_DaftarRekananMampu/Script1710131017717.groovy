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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/ThirdParty/PGHolding_BioFarma_BOD-3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Anchor_ThirdPartyManagement'))

WebUI.click(findTestObject('Third Party/Internal/RekananMampu/Anchor_DaftarRekananMampu'))

WebUI.click(findTestObject('Third Party/Internal/RekananMampu/Filter_PilihKriteria'))

WebUI.click(findTestObject('Third Party/Internal/RekananMampu/Filter_PilihKriteria_Data'))

not_run: WebUI.setText(findTestObject('Third Party/Internal/Verifikasi/Field_CariData'), GlobalVariable.NamaCalonRekanan)

WebUI.click(findTestObject('Third Party/Internal/RekananMampu/Button_LihatDetail'))

WebUI.scrollToElement(findTestObject('Third Party/Internal/RekananMampu/Div_Legalitas'), 0)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Third Party/Internal/RekananMampu/Div_PajakKeuangan'), 0)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Third Party/Internal/RekananMampu/Div_Lainnya'), 0)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Third Party/Internal/RekananMampu/Div_LogVerifikasi'), 0)

WebUI.delay(5)

