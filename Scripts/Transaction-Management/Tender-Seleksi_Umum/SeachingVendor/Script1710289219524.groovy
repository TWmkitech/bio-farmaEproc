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

not_run: WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/Vendor/Login_vendor/Techolution Digital Indonesia'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/Modul_Transaction'))

not_run: WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/Submodul_Tender Seleksi Umum'))

not_run: WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/span_Tender Umum yang diikuti'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PilihJenisSearching'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/JenisPP'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/No.PP'), 'PP/JPROC/2024/000076')

WebUI.delay(5)

