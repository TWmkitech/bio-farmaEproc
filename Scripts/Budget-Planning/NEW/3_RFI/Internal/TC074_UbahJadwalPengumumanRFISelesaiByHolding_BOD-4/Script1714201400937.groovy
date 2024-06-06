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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/3_RFI/Internal/SearchRFIDariDRP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

TestObject targetElement = findTestObject('Budget-Planning/RFI/UbahJadwal/Icon_PerbaruiKonfigurasiRFI')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/UbahJadwal/Icon_PerbaruiKonfigurasiRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/UbahJadwal/Icon_PerbaruiKonfigurasiRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/UbahJadwal/Date_1PengumumanRFI_WaktuSelesai'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/UbahJadwal/Date_1PengumumanRFI_WaktuSelesai'))

WebUI.click(findTestObject('Budget-Planning/RFI/UbahJadwal/SDate_1PengumumanRFI_WaktuSelesai_2'))

def date = new Date()

SimpleDateFormat wholeDate = new SimpleDateFormat('HH:mm:a')

String strDate = wholeDate.format(date)

list = strDate.split(':')

String finaltime = ((((list[0]) + ':') + (list[1])) + ':') + (list[2])

String hour = list[0]

String minute = list[1]

String ampm = list[2]

WebUI.clearText(findTestObject('Budget-Planning/RFI/UbahJadwal/Hour_1PengumumanRFI_WaktuSelesai'))

WebUI.sendKeys(findTestObject('Budget-Planning/RFI/UbahJadwal/Hour_1PengumumanRFI_WaktuSelesai'), hour)

int intminute = minute.toInteger()

intminute = (intminute + 1)

String strminute = intminute.toString()

WebUI.clearText(findTestObject('Budget-Planning/RFI/UbahJadwal/Minute_1PengumumanRFI_WaktuSelesai'))

WebUI.sendKeys(findTestObject('Budget-Planning/RFI/UbahJadwal/Minute_1PengumumanRFI_WaktuSelesai'), strminute)

String get = WebUI.getText(findTestObject('Budget-Planning/RFI/UbahJadwal/AMPM_1PengumumanRFI_WaktuSelesai'))

if (get != ampm) {
    WebUI.click(findTestObject('Budget-Planning/RFI/UbahJadwal/AMPM_1PengumumanRFI_WaktuSelesai'))

    WebUI.sendKeys(findTestObject('Budget-Planning/RFI/UbahJadwal/AMPM_1PengumumanRFI_WaktuSelesai'), Keys.chord(Keys.ENTER))
} else {
    WebUI.sendKeys(findTestObject('Budget-Planning/RFI/UbahJadwal/AMPM_1PengumumanRFI_WaktuSelesai'), Keys.chord(Keys.ENTER))
}

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/UbahJadwal/PBUTTON_AturUlangJadwalRFI_Simpan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/UbahJadwal/PBUTTON_AturUlangJadwalRFI_Simpan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/UbahJadwal/Button_PopupKonfirmasi_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/UbahJadwal/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

