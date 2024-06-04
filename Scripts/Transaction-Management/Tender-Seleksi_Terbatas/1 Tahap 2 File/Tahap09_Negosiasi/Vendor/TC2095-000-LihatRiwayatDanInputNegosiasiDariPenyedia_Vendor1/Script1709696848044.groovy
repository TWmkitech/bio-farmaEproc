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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/1_Vendor/Vendor1_PT SURYA TUBAL INDONESIA'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Vendor/Vendor/Modul_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Vendor/Vendor/SubModul_Tender  Seleksi Terbatas'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Vendor/Menu_Tender  Seleksi Terbatas Yang Diikuti'))

WebUI.delay(10)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Vendor/Icon_ProsesTender'))

//WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Vendor/Custom_Icon_ProsesTender'), 
//    [('index') : 3], FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Vendor/Vendor/Verify_InformasiUmumPengadaan'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/1_BalasTopik/Menu_Negosiasi'))

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/Textbox_T1R1_HargaNego'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/Textbox_T1R1_HargaNego'), 
    '701')

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/Textbox_T1R2_HargaNego'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/Textbox_T1R2_HargaNego'), 
    '702')

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/Textbox_T2R1_HargaNego'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/Textbox_T2R1_HargaNego'), 
    '675')

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/Textbox_T3R1_HargaNego'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/Textbox_T3R1_HargaNego'), 
    '625')

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/Textbox_T3R2_HargaNego'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/Textbox_T3R2_HargaNego'), 
    '675')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/button_Kirim Harga'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Vendor/2_NegosiasiHarga/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

