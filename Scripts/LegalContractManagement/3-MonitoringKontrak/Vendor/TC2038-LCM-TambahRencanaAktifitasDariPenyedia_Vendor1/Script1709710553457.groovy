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

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/1_Modul/1_Modul_LegalKontrak'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/1_InisiasiKontrak/Vendor/1_Modul/4_MonitoringKontrak'))

TestObject targetElement = findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Internal/Icon_Rincian')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/1_Tambah RencanaMilestone/Icon_Rincian'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/1_Tambah RencanaMilestone/IP_Icon_Rincian2'))

TestObject targetElement1 = findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/2_TambahRencanaAktifitas/2/Icon_Plus_Add')

WebUI.sendKeys(targetElement1, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/2_TambahRencanaAktifitas/2/Icon_Plus_Add'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/2_TambahRencanaAktifitas/2/TBox_Tahapan'), 
    'Test Tahapan Aktifitas')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/2_TambahRencanaAktifitas/2/Date_TglMulaiAktifitas'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/2_TambahRencanaAktifitas/2/Date_TglMulaiAktifitas_12'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/2_TambahRencanaAktifitas/2/Date_TglSelesaiAktifitas'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/2_TambahRencanaAktifitas/2/Date_TglSelesaiAktifitas_31'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/2_TambahRencanaAktifitas/2/Tbox_Rencana'), 
    '100')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/2_TambahRencanaAktifitas/button_Simpan Monitoring'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/2_TambahRencanaAktifitas/Button_PopupKonfirmasi_OK'))

WebUI.verifyElementPresent(findTestObject('LegalContractManagement/1Tahap2File/3_MonitoringKontrak/Vendor/Verify_Popup_Berhasil'), 
    30)

WebUI.closeBrowser()

