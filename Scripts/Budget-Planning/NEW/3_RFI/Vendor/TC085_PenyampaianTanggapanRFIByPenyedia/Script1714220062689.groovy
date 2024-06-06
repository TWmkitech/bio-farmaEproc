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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Vendor/Proxsis Solusi Bisnis'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/Anchor_RFI'), 30)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/Anchor_RFI'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/3_RFI/Vendor/CariDataRFI'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/ICON_Submission'), 30)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/ICON_Submission'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/PBUTTON_Informasi_OK'), 
    30)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/PBUTTON_Informasi_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/TBOX_HargaSatuan_T1'), 
    30)

WebUI.clearText(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/TBOX_HargaSatuan_T1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/TBOX_HargaSatuan_T1'), '100')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/TBOX_HargaSatuan_T2'), 
    30)

WebUI.clearText(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/TBOX_HargaSatuan_T2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/TBOX_HargaSatuan_T2'), '200')

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/RBUTTON_SupplyBarang_Ya'))

WebUI.setText(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/TBOX_EntitasManaYangPernah'), 'Bio Farma')

TestObject uploadField = findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/UPLOAD_SuratKeagenan')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/DATE_JangkaWaktuPenawaran'))

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/SDATE_JangkaWaktuPenawaran_42'))

WebUI.setText(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/TBOX_PertanyaanPenting'), 'Ya')

WebUI.setText(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/TBOX_DokumenPendukung'), 'Dokumen Tanggapan')

TestObject uploadField1 = findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/UPLOAD_DokumenPendukung')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/ICON_TambahDokumenPendukung'))

WebUI.setText(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/TBOX_TambahDokumenPendukung'), 'Tambah Dokumen Tanggapan')

TestObject uploadField2 = findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/UPLOAD_TambahDokumenPendukung')

// Mendapatkan direktori proyek
def projectDir2 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir2 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/CBOX_BukanProsesPelaksanaanBarang'))

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/CBOX_DataYangBenar'))

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/BUTTON_Simpan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/Button_PopupKonfirmasi_OK'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/01_VENDOR/02_PenyampaianTanggapan/Button_PopupKonfirmasi_OK'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(20)

WebUI.closeBrowser()

