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

WebUI.delay(3)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Tab_Tahapan02'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/button_AanwijzingLapangan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/button_TambahAanLap'))

String cDay = new Date().format('d-M-yyyy')

int cDate = (cDay.split('-')[0]).toInteger() + 5

String cTime = new Date().format('hh:mm:a')

String cHour = cTime.split(':')[0]

String cMinute = cTime.split(':')[1]

String cPeriod = cTime.split(':')[2]

System.println(cDate)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/div_PilihPeserta'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/div_Peserta1'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/field_PilihTanggal'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/div_Tanggal', [('date') : cDate]))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/input_Hour'), cHour)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/input_Minute'), cMinute)

String cAMPM = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/select_AMPM'))

if (!(cAMPM.equals(cPeriod))) {
    WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/select_AMPM'))
}

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/input_Lokasi'), 'MKI')

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/input_Catatan'), 'Catatan Aanwijzing Lapangan')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/button_SimpanKirimAanLap'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/btn_OKAanLap'))

WebUI.delay(8)

WebUI.verifyTextPresent('Catatan Aanwijzing Lapangan', false)

WebUI.delay(5)

WebUI.closeBrowser()

