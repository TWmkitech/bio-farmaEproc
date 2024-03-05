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

WebUI.click(findTestObject('TransactionManagement/Penunjukan-Langsung/Internal/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan-Langsung/Internal/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

//waiting element present
WebUI.click(findTestObject('TransactionManagement/Penunjukan-Langsung/Tahap06/Internal/icon_Proses_Holding'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan-Langsung/Tahap06/Internal/Tab_Tahapan06'))

// Melakukan Persetujuan
TestObject targetElement = findTestObject('TransactionManagement/Penunjukan-Langsung/Tahap06/Internal/btn_AjukanPersetujuan')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('TransactionManagement/Penunjukan-Langsung/Tahap06/Internal/btn_AjukanPersetujuan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan-Langsung/Tahap06/Internal/radio_Setuju'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan-Langsung/Tahap06/Internal/textarea_Catatan_form'), 'Approved by PG BOD 04')

WebUI.click(findTestObject('TransactionManagement/Penunjukan-Langsung/Tahap06/Internal/button_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan-Langsung/Tahap06/Internal/button_OK'))

// Verifikasi persetujuan
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_LihatBA'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_TutupBA'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan-Langsung/Tahap06/Internal/tab_StatusPersetujuan'))

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan-Langsung/Tahap06/Internal/verify_StatApproval-PG-BOD4'), 
    'Setuju')

