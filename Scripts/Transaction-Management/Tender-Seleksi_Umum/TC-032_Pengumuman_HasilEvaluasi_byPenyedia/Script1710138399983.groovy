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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://vendor-dev.digital-healthcare.id/home.html')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/009_Pengumuman_Hasil_Evaluasi/button_Masuk'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/032_Pengumuman_HasilEvaluasi_byPenyedia/input_Username_username'), 
    'DRM-JP.24.000013')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/032_Pengumuman_HasilEvaluasi_byPenyedia/input_Password_password'), 
    'password.1')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/032_Pengumuman_HasilEvaluasi_byPenyedia/button_Login'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/032_Pengumuman_HasilEvaluasi_byPenyedia/a_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/032_Pengumuman_HasilEvaluasi_byPenyedia/a_Tender  Seleksi Umum'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/032_Pengumuman_HasilEvaluasi_byPenyedia/a_TenderSeleksi Umum Yang Diikuti'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/032_Pengumuman_HasilEvaluasi_byPenyedia/proses'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/032_Pengumuman_HasilEvaluasi_byPenyedia/pengumuman_Hasil_Evaluasi'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Seleksi-Umum/032_Pengumuman_HasilEvaluasi_byPenyedia/hasil_Evaluasi'), 
    2)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/032_Pengumuman_HasilEvaluasi_byPenyedia/hasil_Evaluasi'))

WebUI.delay(5)

WebUI.closeBrowser()

