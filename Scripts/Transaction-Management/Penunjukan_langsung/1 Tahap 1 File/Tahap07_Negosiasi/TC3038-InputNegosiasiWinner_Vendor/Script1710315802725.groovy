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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/Vendor_PT Bespin Global Indonesia'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Modul_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Submodul_PengadaanLainnya'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Menu_PengadaanLainnyaYangDiikuti'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/Menu_5_Negosiasi'))

def notstart = WebUI.verifyTextPresent('Tahapan Belum Dimulai', false, FailureHandling.OPTIONAL)

if (notstart.equals(true)) {
    WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Paket02_UbahJadwal'), [('tahap') : 8], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10)
}

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/Menu_5_Negosiasi'))

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/verify_SedangBerlangsung'), 
    'SEDANG BERLANGSUNG')

int nego1 = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/text_offer_KFTD')).replace(
    '.', '').toInteger() * 0.98

int nego2 = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/text_offer_KAEF')).replace(
    '.', '').toInteger() * 0.98

TestObject targetElement = findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/input_Nego-KFTD')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.clearText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/input_Nego-KFTD'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/input_Nego-KFTD'), nego1.toString())

WebUI.clearText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/input_Nego-KAEF'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/input_Nego-KAEF'), nego2.toString())

WebUI.delay(8)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/text_TermofPayment'), 'Negosiasi 98% Harga Penawaran by Vendor')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/button_KirimHarga'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/btn_OK'))

WebUI.delay(8)

WebUI.closeBrowser()

