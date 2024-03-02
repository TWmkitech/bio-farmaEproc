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

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Anchor_PengalamanPekerjaan'))

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Button_TambahData'))

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_NoKontrak'), '002/SPK-II/2024')

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_NamaPekerjaan'), 'Pembuatan Automation Quality Assurance')

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalKontrak'))

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalKontrak_Bulan'))

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalKontrak_Tahun'), '2023')

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalKontrak_Data'))

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalPelaksanaanAwal'))

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalPelaksanaanAwal_Bulan'))

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalPelaksanaanAwal_Tahun'), '2023')

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalPelaksanaanAwal_Data'))

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalPelaksanaanAkhir'))

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalPelaksanaanAkhir_Bulan'))

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalPelaksanaanAkhir_Tahun'), '2023')

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalPelaksanaanAkhir_Data'))

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_Subkon'))

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_Subkon_DataYa'))

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_PemberiPekerjaan'), 'PT Power Source Indonesia')

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_PemilikPekerjaan'), 'Biofarma')

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_LokasiPekerjaan'), 'Bandung')

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_MataUangKontrak'))

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_MataUangKontrak_Data'))

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_NilaiPekerjaan'), '20000000')

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_LingkupPekerjaan'), 'Membuat otomatisasi pengecekan kualitas aplikasi')

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_Bidang'), 'Bidang Automation')

def projectDir = Config.getProjectDir()

TestObject uploadFile = findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Upload_SPK')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/ThirdParty/PengalamanPekerjaan/spk.jpg'

WebUI.uploadFile(uploadFile, filePath)

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_NoBAST'), '001/BAST-II/2024')

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalBAST'))

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalBAST_Bulan'))

WebUI.setText(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalBAST_Tahun'), '2023')

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Field_TanggalBAST_Data'))

TestObject uploadFile2 = findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Upload_BAST')

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir + '/Document/ThirdParty/PengalamanPekerjaan/bast.png'

WebUI.uploadFile(uploadFile2, filePath2)

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Data Profile/PengalamanPekerjaan/Button_KonfirmasiOK'))

