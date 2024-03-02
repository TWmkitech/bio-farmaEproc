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

WebUI.callTestCase(findTestCase('Third Party/Vendor/TC121_MelengkapiDataProfile/TC121_00'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Anchor_Personel'))

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Button_TambahData'))

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Field_JenisPersonel'))

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Field_JenisPersonel_DataTA'))

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Field_Kewarganegaraan'))

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Field_Kewarganegaraan_Data'))

WebUI.setText(findTestObject('Third Party/Data Profile/Personel/Field_NoKTP'), '3175070101909999')

def projectDir = Config.getProjectDir()

TestObject uploadFile = findTestObject('Third Party/Data Profile/Personel/Upload_KTP')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/Personel/ktp.png'

WebUI.uploadFile(uploadFile, filePath)

WebUI.setText(findTestObject('Third Party/Data Profile/Personel/Field_NPWP'), '092542943407000')

TestObject uploadFile2 = findTestObject('Third Party/Data Profile/Personel/Upload_NPWP')

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir + '/Document/ThirdParty/Personel/npwp.jpg'

WebUI.uploadFile(uploadFile2, filePath2)

WebUI.setText(findTestObject('Third Party/Data Profile/Personel/Field_Nama'), 'Nadia')

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Field_JenisKelamin'))

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Field_JenisKelamin_Data'))

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Field_TanggalLahir'))

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Field_TanggalLahir_Bulan'))

WebUI.setText(findTestObject('Third Party/Data Profile/Personel/Field_TanggalLahir_Tahun'), '1988')

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Field_TanggalLahir_Data'))

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Field_PendidikanTerakhir'))

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Field_PendidikanTerakhir_Data'))

TestObject uploadFile3 = findTestObject('Third Party/Data Profile/Personel/Upload_CV')

// Membentuk path lengkap file yang ingin diunggah
def filePath3 = projectDir + '/Document/ThirdParty/Personel/cv.png'

WebUI.uploadFile(uploadFile3, filePath3)

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Data Profile/Personel/Button_KonfirmasiOK'))

