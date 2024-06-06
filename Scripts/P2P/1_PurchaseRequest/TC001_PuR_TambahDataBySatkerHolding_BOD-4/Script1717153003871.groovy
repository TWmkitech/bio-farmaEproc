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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/P2P/SatkerHolding2/SatkerHolding2BIOF_BOD-4_AbdulahFajar'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('P2P/1_PurchaseRequest/0_GlobalTestObject/Satker/Anchor_PurchaseRequest'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/BUTTON_TambahDataBaru'))

WebUI.setText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_NamaPR'), 'CEK PR/24/05/21/002 CEK')

WebUI.setText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_TahunAnggaran'), '2024')

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_SumberAnggaran'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_SumberAnggaran_RKAP'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_CostCenter'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_CostCenter_AlokasiBiayaProdukPartnership'))

WebUI.setText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_NomorReferensi'), '001')

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/CBOX_MataUang'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_NamaMaterial_A'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_NamaMaterial_A_TUBE 2 ML'))

WebUI.setText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_Kuantitas_A'), '500')

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_MataUang_A'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_MataUang_A_IDR'))

WebUI.setText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_HargaSatuan_A'), '100')

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_UOM_A'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_UOM_A_ul'))

WebUI.setText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_Spesifikasi_A'), 'Spesifikasi A')

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_Origin_A'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_Origin_A_PfizerManufacturing'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_ShipmentTo_A'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_ShipmentTo_A_BIOFKolonelMasturi'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_TanggalKadaluwarsa_A'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_TanggalKadaluwarsa_A_42'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/DATE_EstimasiTanggalDibutuhkan'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/DATE_EstimasiTanggalDibutuhkan_42'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_DokumenPendukung'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/SBOX_DokumenPendukung_InfoRencanaKebutuhan'))

//Skenario upload file
// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('P2P/1_PurchaseRequest/1_TambahData/UPLOAD_DokumenPendukung')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.setText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TAREA_DeskripsiPR'), 'Deskripsi PR')

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/button_Simpan'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

