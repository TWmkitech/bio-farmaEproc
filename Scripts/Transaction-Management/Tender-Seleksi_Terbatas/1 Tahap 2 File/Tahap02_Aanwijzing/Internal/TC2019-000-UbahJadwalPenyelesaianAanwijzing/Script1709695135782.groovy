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
import java.text.SimpleDateFormat as SimpleDateFormat

def date = new Date()

SimpleDateFormat wholeDate = new SimpleDateFormat('HH:mm:a')

String strDate = wholeDate.format(date)

list = strDate.split(':')

String finaltime = ((((list[0]) + ':') + (list[1])) + ':') + (list[2])

String hour = list[0]

String minute = list[1]

String ampm = list[2]

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGHolding_BioFarma_BOD-4'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/0_Anchor_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/2_Anchor_Tender-Seleksi_Terbatas'))

WebUI.delay(5)

TestObject targetElement = findTestObject('Object Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/button_Lihat Jadwal'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/button_Edit Jadwal'))

WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Internal/1_UbahJadwal/SelectBox_Date_Column'), 
    [('index') : 8], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Internal/1_UbahJadwal/Select_Date_Aanwijzing_Selesai'), 
    [('index') : 18], FailureHandling.STOP_ON_FAILURE)

/*
WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_Hour_Selesai'))

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_Hour_Selesai'), 
    '1')

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_Minute_Selesai'))

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_Minute_Selesai'), 
    '25')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_AMPM_Selesai'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_AMPM_Selesai'))

//WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Selectbox_Date_PendaftaranResponMinat_AMPM'))
WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_AMPM_Selesai'), 
    Keys.chord(Keys.ENTER))
*/
WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_Hour_Selesai'))

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_Hour_Selesai'), 
    hour)

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_Minute_Selesai'))

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_Minute_Selesai'), 
    minute)

String get = WebUI.getText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_AMPM_Selesai'))

if (get != ampm) {
    WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_AMPM_Selesai'))

    WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_AMPM_Selesai'), 
        Keys.chord(Keys.ENTER))
} else {
    WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Date_Aanwijzing_AMPM_Selesai'), 
        Keys.chord(Keys.ENTER))
}

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/button_SimpanPerubahan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

