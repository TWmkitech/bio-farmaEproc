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

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap05/Tab_Tahapan05'))

def closed = WebUI.verifyTextPresent('Proses Pengadaan Tahapan Evaluasi Harga akan dimulai pada:', false, FailureHandling.OPTIONAL)

//def open = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/verify_TeksProses'),     FailureHandling.OPTIONAL)
// Ubah Jadwal Aanwijzing
if (closed.equals(true)) {
    WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Paket02_UbahJadwal_woLogin'), 
        [('tahap') : 6], FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10)
}

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap05/Tab_Tahapan05'))

WebUI.executeJavaScript('window.scrollTo(0, 800);', null)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap05/verify_StatusHPS'), 'Diatas HPS', 
    FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap05/verify_EvalAdmin'), 'Lulus')

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap05/verify_EvalTeknis'), 
    'Lulus')

WebUI.delay(8)

WebUI.executeJavaScript('window.scrollTo(0, 100);', null)

WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Paket02_UbahJadwal_woLogin'), 
    [('tahap') : 7], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8)

WebUI.verifyTextPresent('Proses Pengadaan Tahapan Evaluasi Harga sudah habis!', false, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

