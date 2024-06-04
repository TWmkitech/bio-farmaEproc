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

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/login/PGEntitasINAF-BOD3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/GantiRoleINAf3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/AksiGantiRoleINAFBOD3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/GantiAksesRoleINAFBOD3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/EntitasINAF3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/Aksi_Tombol_GantiINAF3'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/span_transactionManagement_Entitas'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/submodul_seleksi umum_entitas'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Icon_Detail_Entitas'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/span_TahapanSPPBJ_Entitas'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/SetujuEntitasINAFBOD-3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/PersetujuanSPJPINAFBOD-3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/SPPBJ/a_ok_persetujuanINAFBOD-3'))

