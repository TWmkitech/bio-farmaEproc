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

not_run: WebUI.callTestCase(findTestCase('Third Party/Internal/TC129_130_132_133_CalonPenyedia/TC129_130_Verifikasi/TC129_00_VerifikasiLogin'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Tab_Lainnya'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement TableOrg = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> rows_table = TableOrg.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

'Loop will execute for all the rows of the table'
Loop: for (int row = 0; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'To calculate no of columns(cells) In that specific row'
    int columns_count = Columns_row.size()

    // apabila kolom (nomor 2) Status != Disetujui, maka klik Button verifikasi
    String celltext = Columns_row.get(2).getText()

    if (celltext == 'Belum Diverifikasi') {
        'After getting the Expected value from Table we will klik Button Verifikasi'
        if (WebUI.verifyElementPresent(findTestObject('Third Party/Internal/Calon Penyedia/Custom_Button_TidakSetujuDokumenLainnya', 
                [('indexpos') : row + 1]), 5, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('Third Party/Internal/Calon Penyedia/Custom_Button_TidakSetujuDokumenLainnya', [('indexpos') : row + 
                        1]))
        }
        
        WebUI.setText(findTestObject('Third Party/Internal/Calon Penyedia/Field_DokLainnyaAlasanPenolakan'), 'Ditolak menggunakan automation')

        WebUI.click(findTestObject('Third Party/Internal/Calon Penyedia/Button_DokLainnyaTidakSetuju'))

        WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Button_KonfirmasiOK_DokLainnya'))
    }
}

