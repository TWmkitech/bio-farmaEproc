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

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Tab_Tahapan09'))

def closed = WebUI.verifyTextPresent('Proses Pengadaan Tahapan SPPBJ akan dimulai pada:', false, FailureHandling.OPTIONAL)

// Ubah Jadwal 
if (closed.equals(true)) {
    WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Paket02_UbahJadwal_woLogin'), 
        [('tahap') : 11], FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10)
}

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/Tab_Tahapan08'))

WebUI.verifyTextPresent('Proses pengadaan tahap Penetapan Pemenang sudah habis!', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Tab_Tahapan09'))

WebUI.delay(3)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Field_PilihJaminan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/div_YAJaminan'))

String cDay = new Date().format('d-M-yyyy')

int cDate = (cDay.split('-')[0]).toInteger() + 5

// Jaminan KFTD
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Field_TanggalSPJP_KFTD'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/date_StartSPJP_KFTD', [('date') : cDate]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Field_BatasSPJP_KFTD'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/date_EndSPJP_KFTD', [('date') : cDate]))

// Jaminan KAEF
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Field_TanggalSPJP_KAEF'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/date_StartSPJP_KAEF', [('date') : cDate]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Field_BatasSPJP_KAEF'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/date_EndSPJP_KAEF', [('date') : cDate]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/button_SimpanJaminan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/button_OK'))

WebUI.delay(10)

// SPPBJ 

TestObject targetElement = findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Field_TanggalSPPBJ')

WebUI.click(targetElement)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/date_SPPBJ', [('date') : cDate]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Field_PilihTembusan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/div_TembusanDirutKAEF'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/button_SimpanSPPBJ'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/button_AjukanPersetujuan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

