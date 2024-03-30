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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/ThirdParty/PGHolding_BioFarma_BOD-4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Anchor_ThirdPartyManagement'))

WebUI.click(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Anchor_SurveiKepuasanPenyedia'))

WebUI.click(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Anchor_Konfigurasi'))

WebUI.click(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Button_TambahBobotKategori'))

WebUI.setText(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Field_NamaBobotKategori'), 'Lainnya')

WebUI.setText(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Field_PersenBobotKategori'), '5')

WebUI.setText(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Field_BobotKategoriEdit'), '15')

WebUI.click(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Button_SimpanBobotKategori'))

WebUI.click(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Button_TambahJawaban'))

WebUI.setText(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Field_IsiJawaban'), 'Tidak Tahu')

WebUI.click(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Button_SimpanJawaban'))

WebUI.click(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Button_TambahPertanyaan'))

WebUI.setText(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Field_Pertanyaan'), 'Apakah menggunakan Automation?')

WebUI.setText(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Field_BobotPertanyaan'), '100')

WebUI.click(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Button_SimpanPertanyaan'))

WebUI.click(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Button_SimpanAll'))

WebUI.click(findTestObject('Third Party/Internal/SurveiKepuasanPenyedia/Konfigurasi/Button_KonfirmasiOK'))

