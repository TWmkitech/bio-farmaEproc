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

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Anchor_PemegangSaham'), 0)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Anchor_PemegangSaham'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Button_TambahData'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Field_NamaPemegangSaham'), 'Mr. Holder1')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Field_JenisIdentitas'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Field_JenisIdentitasData'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Field_NoIdentitas'), '3175070101909999')

TestObject uploadIdentitas = findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Upload_Identitas')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/PemegangSaham/ktp.png'

WebUI.uploadFile(uploadIdentitas, filePath)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Field_NPWP'), '092542943407000')

if (WebUI.verifyElementPresent(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Upload_NPWP'), 5, FailureHandling.OPTIONAL)) {
    TestObject uploadNpwp = findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Upload_NPWP')

    // Membentuk path lengkap file yang ingin diunggah
    def filePathNpwp = projectDir + '/Document/ThirdParty/PemegangSaham/npwp.jpg'

    WebUI.uploadFile(uploadNpwp, filePathNpwp)
}

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Field_PersentaseKepemilikan'), 0)

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Field_PersentaseKepemilikan'), '30')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Button_SimpanHolder'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/PemegangSaham/Button_KonfirmasiOK'))

