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
import com.kms.katalon.core.configuration.RunConfiguration as Config

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGHolding_KAEF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Tab_Tahapan02'))

WebUI.verifyTextNotPresent('Proses Pengadaan Tahapan Aanwijzing akan dimulai pada:', false, FailureHandling.OPTIONAL)

int topik = 1

String teks = 'Buat Topik Aanwijzing ke-' + topik + ' dari PG BOD-4'

int odd = 2*topik - 1

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/text_BuatTopik'), 8)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/text_BuatTopik'), teks)

// Upload File 
TestObject uploadField = findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/button_UploadFile')

def projectDir = Config.getProjectDir()

def filePath = projectDir + '/Document/TM-Paket2/doc_test.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.delay(3)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/button_KirimTopik'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/button_OK'))

WebUI.delay(8)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/verify_TeksTopik', [('list') : odd]), teks)

WebUI.delay(5)

WebUI.closeBrowser()

