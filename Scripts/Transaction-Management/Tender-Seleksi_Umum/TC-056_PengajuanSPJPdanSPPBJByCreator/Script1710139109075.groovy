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

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/login/PGagen_creator'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/span_Transaction Management'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/SubModul_TenderSeleksi umum'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Icon_Proses'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/span_Tahapan  SPPBJ'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/PerluJaminan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/Ya_Jaminan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/PilihTanggalSPJP'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/TanggalSPJPEntitas1'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/BerlakuSampaiEntitas1'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/TanggalBerlakuSampaiEntitas1'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/PilihTanggalSPJPEntitas2'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/TanggalSPJPEntitas2'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/BerlakuSampaiEntitas2'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/TanggalBerlakuSampaiEntitas2'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/PilihTanggalSPJPEntitas3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/TanggalSPJPEntitas3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/BerlakuSampaiEntitas3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/TanggalBerlakuSampaiEntitas3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/SimpanJaminanPelaksana'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/a_ok_jaminanPelaksana'))

WebUI.delay(7)

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/PilihTanggalSPPBJ'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/TanggalSPPBJ'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/PilihTembusan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/Tembusan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/SimpanPratinjauSPPBJ'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/a_ok_pratinjauSPPBJ'))

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/AjukanPersetujuanSPJPByCreator'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/a_ok_AjukanPersetujuanSPJP'))

