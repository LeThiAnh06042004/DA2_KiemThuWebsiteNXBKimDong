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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nxbkimdong.com.vn/?traffic_id=6766ddbed2ed7e00010d242a&ref=mo&utm_source=masoffer&gad_source=1&gclid=Cj0KCQiAyc67BhDSARIsAM95Qzu--BQT28U1AaVPt4fplhX_jGLhOix0W-xWhjfTqLFetnKysZ6b_yIaAhvEEALw_wcB')

WebUI.click(findTestObject('Object Repository/Page_Nh xut bn Kim ng/img_Ngn nm s Vit - Nh Hu L - L Trung H_1062826747'))

WebUI.click(findTestObject('Object Repository/Page_Ngn nm s Vit - Nh Ty Sn - Li gm nhn i _552bb8/a_t cu hi'))

WebUI.setText(findTestObject('Object Repository/Page_Ngn nm s Vit - Nh Ty Sn - Li gm nhn i _552bb8/input_Tn_reviewer_name'), 
    ten)

WebUI.setText(findTestObject('Object Repository/Page_Ngn nm s Vit - Nh Ty Sn - Li gm nhn i _552bb8/input_Email_reviewer_email'), 
    email)

WebUI.setText(findTestObject('Object Repository/Page_Ngn nm s Vit - Nh Ty Sn - Li gm nhn i _552bb8/input_S in thoi_reviewer_phone'), 
    sdt)

WebUI.setText(findTestObject('Object Repository/Page_Ngn nm s Vit - Nh Ty Sn - Li gm nhn i _552bb8/textarea_Ni dung_question_content'), 
    cauhoi)

WebUI.click(findTestObject('Object Repository/Page_Ngn nm s Vit - Nh Ty Sn - Li gm nhn i _552bb8/input_Ni dung_starbap-submit-question btn b_0a67e8'))

WebUI.closeBrowser()

