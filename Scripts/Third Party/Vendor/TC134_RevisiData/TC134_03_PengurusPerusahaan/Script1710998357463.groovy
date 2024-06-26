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

not_run: WebUI.callTestCase(findTestCase('Third Party/Vendor/TC134_RevisiData/TC134_00'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Anchor_PengurusPerusahaan'), 
    5)

WebUI.enhancedClick(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Anchor_PengurusPerusahaan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Button_EditData'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_KelompokJabatan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_KelompokJabatanData'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_JenisIdentitas'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_JenisIdentitasData'))

not_run: WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_NoIdentitas'), '3175070101909999')

not_run: TestObject uploadIdentitas = findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Upload_Identitas')

// Mendapatkan direktori proyek
not_run: def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
not_run: def filePath = projectDir + '/Document/ThirdParty/PengurusPerusahaan/ktp.png'

not_run: WebUI.uploadFile(uploadIdentitas, filePath)

not_run: WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_NPWP'), '092542943407000')

not_run: if (WebUI.verifyElementPresent(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Upload_Npwp'), 
    5, FailureHandling.OPTIONAL)) {
    TestObject uploadNpwp = findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Upload_Npwp')

    // Membentuk path lengkap file yang ingin diunggah
    def filePathNpwp = projectDir + '/Document/ThirdParty/PengurusPerusahaan/npwp.jpg'

    WebUI.uploadFile(uploadNpwp, filePathNpwp)
}

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_Jabatan'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_Jabatan'), 'Direktur Utama')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_NamaPengurus'), 'Mr. Direktur Utama Edit')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_AlamatPengurus'), 'Jl. Alamat Pengurus Perusahaan No. 150')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_Email'), 'dirut.test@yopmail.com')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_NoTelpPengurus'), '08191234567')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Field_PenandaTangan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PengurusPerusahaan/Button_KonfirmasiOK'))

WebUI.delay(5)

