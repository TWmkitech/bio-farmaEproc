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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGHolding_KAEF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/Tab_Tahapan07'))

WebUI.verifyTextNotPresent('Proses Pengadaan Tahapan Negosiasi akan dimulai pada:', false, FailureHandling.OPTIONAL)

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/verify_StatusNego'),
	'Proses Negosiasi', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/Icon_AksiNego'))

//WebUI.scrollToPosition(0, 20)
WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/verify_StatOnline'), 5)

def offer1 = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/text_Offer_KAEF'))

def offer2 = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/text_Offer_KFTD'))

int nego1 = offer1.replace('.', '').toInteger() * 0.97

int nego2 = offer2.replace('.', '').toInteger() * 0.97

//System.println((nego1 + '-----') + nego2)

WebUI.clearText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/input_Nego_PG-KAEF'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/input_Nego_PG-KAEF'), nego1.toString())

WebUI.clearText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/input_Nego_PG-KFTD'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/input_Nego_PG-KFTD'), nego2.toString())

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/text_TermofPayment'), 'Negosiasi 01 by PG')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/button_KirimNegosiasi'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/button_OK'))

WebUI.delay(8)

WebUI.closeBrowser()

