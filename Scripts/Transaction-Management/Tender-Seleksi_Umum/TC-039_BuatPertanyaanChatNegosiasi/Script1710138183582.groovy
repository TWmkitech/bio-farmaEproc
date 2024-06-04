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
import com.kms.katalon.core.configuration.RunConfiguration as Config

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/login/PGagen_creator'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/span_Transaction Management'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/SubModul_TenderSeleksi umum'))

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/Searching'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/span_Tahapan  Negosiasi'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/aksi_negosiasi'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/div_ChatNegosiasi'), 0)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/textarea_ChatPenyedia'), 'apakah sanggup dengan tender ini?')

def projectDir = Config.getProjectDir()

TestObject upload_dokumenChatPenyedia = findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/upload_dokumenChatPenyedia')

// Membentuk path lengkap file yang ingin diunggah
def filePathDokChatPenyedia = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_dokumenChatPenyedia, filePathDokChatPenyedia)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/simpankirim_chatPenyedia'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/konfirmasi_OkChatPenyedia'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/textarea_chatEntitas'), 'Apakah spesifikasi komponen sudah yang tertinggi?')

TestObject upload_dokumenChatEntitas = findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/upload_dokumenChatEntitas')

// Membentuk path lengkap file yang ingin diunggah
def filePathDokChatEntitas = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_dokumenChatEntitas, filePathDokChatEntitas)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/simpankirim_entitas'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/konfirmasi_OkChatEntitas'))

