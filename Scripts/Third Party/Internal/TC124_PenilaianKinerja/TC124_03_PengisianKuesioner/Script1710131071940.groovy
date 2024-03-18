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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/ThirdParty/PGHolding_BioFarma_BOD-2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Anchor_ThirdPartyManagement'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/Anchor_PenilaianKinerja'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PengisianKuesioner/Anchor_PengisianKuesioner'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PengisianKuesioner/Button_Penilaian'))

WebUI.scrollToElement(findTestObject('Third Party/Internal/PenilaianKinerja/PengisianKuesioner/Table_Kuesioner'), 0)

WebDriver driver = DriverFactory.getWebDriver()

WebElement TableOrg = driver.findElement(By.xpath('//table[@class=\'table table-bordered\']/tbody'))

List<WebElement> rows_table = TableOrg.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

'Loop will execute for all the rows of the table'
Loop: for (int row = 1; row < rows_count; row++) {
    if (WebUI.verifyElementPresent(findTestObject('Third Party/Internal/PenilaianKinerja/PengisianKuesioner/Custom_JawabanEkspektasi', 
            [('indexpos') : row + 1]), 5, FailureHandling.OPTIONAL)) {
        WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PengisianKuesioner/Custom_JawabanEkspektasi', 
                [('indexpos') : row + 1]))
    }
    
    if (WebUI.verifyElementPresent(findTestObject('Third Party/Internal/PenilaianKinerja/PengisianKuesioner/Custom_JawabanRealisasi', 
            [('indexpos') : row + 1]), 5, FailureHandling.OPTIONAL)) {
        WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PengisianKuesioner/Custom_JawabanRealisasi', [
                    ('indexpos') : row + 1]))
    }
}

WebUI.setText(findTestObject('Third Party/Internal/PenilaianKinerja/PengisianKuesioner/Field_Catatan'), 'Dibuat menggunakan Automation')

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PengisianKuesioner/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PengisianKuesioner/Button_KonfirmasiOK'))

