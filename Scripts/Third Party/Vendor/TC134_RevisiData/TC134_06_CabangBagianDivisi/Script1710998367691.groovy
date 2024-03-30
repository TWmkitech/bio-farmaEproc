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

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Anchor_CabangBagianDivisi'), 
    5)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Anchor_CabangBagianDivisi'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Button_EditData'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_NamaKantor'), 'Automated Test Edit')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_AlamatKantor'), 'Jl. Automated di Yogya no. 456')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_Provinsi'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_Provinsi_Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_Kota'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_Kota_Data'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_Kodepos'), '12345')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_Telepon'), '027470987564')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_Fax'), '027470987564')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_Email'), 'autocabyogya@yopmail.com')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_KuasaTTDYa'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_NamaPenandatangan'), 'Bpk Kawiyan')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Field_JabatanPenandatangan'), 'Kepala Cabang')

def projectDir = Config.getProjectDir()

TestObject uploadSurat = findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Upload_SuratPenandatangan')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/CabangBagianDivisi/surat.png'

WebUI.uploadFile(uploadSurat, filePath)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/CabangBagianDivisi/Button_KonfirmasiOK'))

WebUI.delay(5)

