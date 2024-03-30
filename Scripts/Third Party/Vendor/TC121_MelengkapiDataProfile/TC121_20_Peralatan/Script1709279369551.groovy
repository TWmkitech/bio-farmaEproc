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

not_run: WebUI.callTestCase(findTestCase('Third Party/Vendor/TC121_MelengkapiDataProfile/TC121_00'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Anchor_Peralatan'))

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Button_Tambah'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Field_NamaMerk'), 'AutoMerk')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Field_KelompokPeralatan'), 'Peralatan Konstruksi')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Field_Kapasitas'), 'Maksimum')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Field_FungsiPeralatan'), 'Memindahkan barang berat')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Field_LokasiPeralatan'), 'Bandung')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Field_TahunPembuatan'), '2015')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Field_Jumlah'), '1')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Field_HakMilik'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Field_HakMilik_Data'))

def projectDir = Config.getProjectDir()

TestObject uploadFile = findTestObject('Third Party/Vendor/Data Profile/Peralatan/Upload_Foto')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/Peralatan/foto.jpg'

WebUI.uploadFile(uploadFile, filePath)

TestObject uploadFile2 = findTestObject('Third Party/Vendor/Data Profile/Peralatan/Upload_BuktiKepemilikan')

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir + '/Document/ThirdParty/Peralatan/kepemilikan.png'

WebUI.uploadFile(uploadFile2, filePath2)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/Peralatan/Button_KonfirmasiOK'))

