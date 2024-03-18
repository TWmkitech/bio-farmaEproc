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

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Tab_Tahapan04'))

def closed = WebUI.verifyTextPresent('Proses Pengadaan Tahapan Evaluasi Administrasi & Teknis akan dimulai pada:', false)

// Ubah Jadwal Aanwijzing
if (closed.equals(true)) {
    WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Paket02_UbahJadwal_woLogin'), [('tahap') : 5], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10)
}

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Tab_Tahapan04'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/button_PenjadwalanPOC'))

// PILIH TANGGAL
String cDay = new Date().format('d-M-yyyy')

String cTime = new Date().format('hh:mm:a')

int cDate = (cDay.split('-')[0]).toInteger() + 5

String cHour = cTime.split(':')[0]

String cMinute = cTime.split(':')[1]

String cPeriod = cTime.split(':')[2]

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/field_TglPOC'))

WebUI.doubleClick(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/span_TglPresentasi', 
        [('date') : cDate]))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/input_Hour', [('list') : 3]), 
    cHour)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/input_Minute', [('list') : 3]), 
    cMinute)

String cAMPM = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/select_AMPM', 
        [('list') : 3]))

if (!(cAMPM.equals(cPeriod))) {
    WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/select_AMPM', [('list') : 3]))
}

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/div_PilihJenisRapat'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/div_RapatOnline'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/text_LinkRapat'), 'ZOOM')

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/text_KeteranganPOC'), 
    'Auto Description')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/icon_TambahPeserta'))

// ROW 1 : Peserta Internal
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/radio_PesertaInternal'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/field_NamaInternal'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/div_CustomNama', [('list') : 4]))

// ROW 2 : Peserta Eksternal 
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/icon_TambahPeserta'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/input_Nama'), 'Viena')

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/input_Email'), 'viena@yopmail.com')

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/input_UnitKerja'), 
    'AutoTest')

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/input_Instansi'), 'QA')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/button_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Penjadwalan/button_OK'))

WebUI.delay(8)

WebUI.closeBrowser()