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
import groovy.time.TimeCategory as TimeCategory

// Cek Vendor
WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/Vendor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Modul_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Submodul_PengadaanLainnya'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/input_Searching01'), GlobalVariable.NoPP)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap01/verify_StatusTable'), 'Belum Mendaftar')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap01/Icon_Daftar'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap01/Button_Daftar'))

// Internal
WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGHolding_KAEF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(2)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

// Akhiri Jadwal
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/button_LihatJadwal'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/button_EditJadwal'))

String cDay = new Date().format('d-M-yyyy')

String cTime = new Date().format('hh:mm:a')

int cDate = (cDay.split('-')[0]).toInteger() + 5

String cMonth = cDay.split('-')[1]

String cYear = cDay.split('-')[2]

String cHour = cTime.split(':')[0]

String cMinute = cTime.split(':')[1]

String cPeriod = cTime.split(':')[2]

int tahap = 2

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/custom_FieldTglSelesai', 
        [('list') : tahap]))

int trow = (2 * tahap) + 3

String mPath1 = ((('div[' + trow) + ']/div[1]/div/div/select/option[') + cMonth) + ']'

String dPath1 = ((('div[' + trow) + ']/div[2]/div/div[2]/div/span[') + cDate) + ']'

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/custom_Month', [('xpath') : mPath1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/custom_Date', [('xpath') : dPath1]))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/input_Hour', [('list') : trow]), 
    cHour)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/input_Minute', [('list') : trow]), 
    cMinute)

String cAMPM = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/select_AMPM', 
        [('list') : trow]))

if (!(cAMPM.equals(cPeriod))) {
    WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/select_AMPM', [('list') : trow]))
}

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/button_SimpanPerubahan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/UbahJadwal/button_OK'))

WebUI.delay(12)

WebUI.refresh()

WebUI.verifyElementVisible(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap01/verify_OnHold'))

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap01/verify_AlasanOnHold'), 
    'Jumlah Peserta Respon Minat kurang dari yang di persyaratkan minimal 1')

WebUI.verifyElementVisible(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap01/button_PerpanjangJadwal'))

WebUI.verifyElementVisible(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap01/button_BatalPengadaan'))

WebUI.verifyElementVisible(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap01/button_PengadaanUlang'))

WebUI.delay(3)

WebUI.closeBrowser()

