
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import org.apache.poi.ss.usermodel.Workbook

import java.util.List

import org.apache.poi.ss.usermodel.Sheet

import java.lang.Object

import org.apache.poi.ss.usermodel.Cell

import org.apache.poi.ss.usermodel.Row

import java.util.Map

import com.kms.katalon.core.testobject.TestObject

import com.kms.katalon.core.testobject.ResponseObject

import org.openqa.selenium.WebElement


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelFile"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelFile(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getSheetNames"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getSheetNames(
        	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheets"(
    	Workbook workbook	
     , 	java.util.List<String> sheetNames	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheets(
        	workbook
         , 	sheetNames)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getWorkbook(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.createWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createWorkbook(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook"(
    	String filePath	
     , 	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).saveWorkbook(
        	filePath
         , 	workbook)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByIndex"(
    	Sheet sheet	
     , 	int rowIndex	
     , 	int colIndex	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByIndex(
        	sheet
         , 	rowIndex
         , 	colIndex
         , 	value)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddress(
        	sheet
         , 	cellAddress
         , 	value)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	
     , 	int sheetIndex	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath
         , 	sheetIndex)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheetByName"(
    	String filePath	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheetByName(
        	filePath
         , 	sheetName)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.locateCell"(
    	Sheet sheet	
     , 	Object cellContent	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).locateCell(
        	sheet
         , 	cellContent)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValue"(
    	Cell cell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValue(
        	cell)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellIndexByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellIndexByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByAddress(
        	sheet
         , 	cellAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getRowIndexByCellContent"(
    	Sheet sheet	
     , 	String cellContent	
     , 	int columnIdxForCell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getRowIndexByCellContent(
        	sheet
         , 	cellContent
         , 	columnIdxForCell)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getTableContent"(
    	Sheet sheet	
     , 	int startRow	
     , 	int endRow	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getTableContent(
        	sheet
         , 	startRow
         , 	endRow)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getDataRows"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> rowIndexs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getDataRows(
        	sheet
         , 	rowIndexs)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getMapOfKeyValueRows"(
    	Sheet sheet	
     , 	int keyRowIdx	
     , 	int valueRowIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getMapOfKeyValueRows(
        	sheet
         , 	keyRowIdx
         , 	valueRowIdx)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getColumnsByIndex"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> columnIndexes	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getColumnsByIndex(
        	sheet
         , 	columnIndexes)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2
         , 	isValueOnly)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByRangeAddress"(
    	Sheet sheet	
     , 	String topLeftAddress	
     , 	String rightBottomAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByRangeAddress(
        	sheet
         , 	topLeftAddress
         , 	rightBottomAddress)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddresses"(
    	Sheet sheet	
     , 	Map content	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddresses(
        	sheet
         , 	content)
}

def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValuesByRangeIndexes"(
    	Sheet sheet	
     , 	int rowInd1	
     , 	int colInd1	
     , 	int rowInd2	
     , 	int colInd2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValuesByRangeIndexes(
        	sheet
         , 	rowInd1
         , 	colInd1
         , 	rowInd2
         , 	colInd2)
}

def static "newpackage.HighlightElement.run"(
    	TestObject objectto	) {
    (new newpackage.HighlightElement()).run(
        	objectto)
}

def static "randomData.TestDataGenerator.getRandomParagraphs"(
    	int a	
     , 	int b	) {
    (new randomData.TestDataGenerator()).getRandomParagraphs(
        	a
         , 	b)
}

def static "randomData.TestDataGenerator.getRandomName"(
    	int a	
     , 	int b	) {
    (new randomData.TestDataGenerator()).getRandomName(
        	a
         , 	b)
}

def static "randomData.TestDataGenerator.getRandomFemaleName"() {
    (new randomData.TestDataGenerator()).getRandomFemaleName()
}

def static "randomData.TestDataGenerator.getRandomMaleName"() {
    (new randomData.TestDataGenerator()).getRandomMaleName()
}

def static "randomData.TestDataGenerator.getRandomFirstName"() {
    (new randomData.TestDataGenerator()).getRandomFirstName()
}

def static "randomData.TestDataGenerator.getRandomLastName"() {
    (new randomData.TestDataGenerator()).getRandomLastName()
}

def static "randomData.TestDataGenerator.getRandomCity"() {
    (new randomData.TestDataGenerator()).getRandomCity()
}

def static "randomData.TestDataGenerator.getRandomHeading"(
    	int numberofWords	) {
    (new randomData.TestDataGenerator()).getRandomHeading(
        	numberofWords)
}

def static "randomData.TestDataGenerator.getRandomHeading_two"(
    	int Wordsfrom	
     , 	int wordstwo	) {
    (new randomData.TestDataGenerator()).getRandomHeading_two(
        	Wordsfrom
         , 	wordstwo)
}

def static "randomData.TestDataGenerator.getRandomEmail"() {
    (new randomData.TestDataGenerator()).getRandomEmail()
}

def static "randomData.TestDataGenerator.set_RandomNumber"(
    	long len	) {
    (new randomData.TestDataGenerator()).set_RandomNumber(
        	len)
}

def static "randomData.TestDataGenerator.set_RandomNumberWithText"(
    	int length	) {
    (new randomData.TestDataGenerator()).set_RandomNumberWithText(
        	length)
}

def static "com.kms.katalon.webui.keyword.vuejs.ModalKeywords.getModalTitleText"(
    	TestObject toModalContainer	) {
    (new com.kms.katalon.webui.keyword.vuejs.ModalKeywords()).getModalTitleText(
        	toModalContainer)
}

def static "com.kms.katalon.webui.keyword.vuejs.ModalKeywords.getModalContentText"(
    	TestObject toModalContainer	) {
    (new com.kms.katalon.webui.keyword.vuejs.ModalKeywords()).getModalContentText(
        	toModalContainer)
}

def static "com.kms.katalon.webui.keyword.vuejs.ModalKeywords.clickConfirmButtonByText"(
    	TestObject toModalContainer	
     , 	String buttonText	) {
    (new com.kms.katalon.webui.keyword.vuejs.ModalKeywords()).clickConfirmButtonByText(
        	toModalContainer
         , 	buttonText)
}

def static "com.kms.katalon.webui.keyword.vuejs.ModalKeywords.clickConfirmButtonByText"(
    	TestObject toModalContainer	) {
    (new com.kms.katalon.webui.keyword.vuejs.ModalKeywords()).clickConfirmButtonByText(
        	toModalContainer)
}

def static "com.plugin.keywords.token.accessToken.getAccessTokenFromAPI"(
    	Object accessTokenKey	
     , 	ResponseObject APIResult	) {
    (new com.plugin.keywords.token.accessToken()).getAccessTokenFromAPI(
        	accessTokenKey
         , 	APIResult)
}

def static "com.testwithhari.katalon.plugins.Gmail.deleteAllEMails"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).deleteAllEMails(
        	emailID
         , 	password
         , 	folderLableName)
}

def static "com.testwithhari.katalon.plugins.Gmail.sendEmail"(
    	String from_emailaddress	
     , 	String email_password	
     , 	String to_emailaddress	
     , 	String email_subject	
     , 	String email_body	) {
    (new com.testwithhari.katalon.plugins.Gmail()).sendEmail(
        	from_emailaddress
         , 	email_password
         , 	to_emailaddress
         , 	email_subject
         , 	email_body)
}

def static "com.testwithhari.katalon.plugins.Gmail.getEmailsCount"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).getEmailsCount(
        	emailID
         , 	password
         , 	folderLableName)
}

def static "com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).readLatestEMailBodyContent(
        	emailID
         , 	password
         , 	folderLableName)
}

def static "newpackage.VerifyDrodownValues_AlphabeticalOrder.verifyOptionsInDropdownInAphabeticalOrder"(
    	TestObject objectto	) {
    (new newpackage.VerifyDrodownValues_AlphabeticalOrder()).verifyOptionsInDropdownInAphabeticalOrder(
        	objectto)
}

def static "newpackage.VerifyExpectedAndActualOptionsInDropdown.VerifyExpectedAndActual"(
    	TestObject objectto	
     , 	java.util.List<String> listOfOptions	) {
    (new newpackage.VerifyExpectedAndActualOptionsInDropdown()).VerifyExpectedAndActual(
        	objectto
         , 	listOfOptions)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getAttribute"(
    	WebElement element	
     , 	String attribute	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getAttribute(
        	element
         , 	attribute)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.scrollTo"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).scrollTo(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isVisible"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isVisible(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElements"(
    	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElements(
        	cssSelector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isDisabled"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isDisabled(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElement"(
    	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElement(
        	cssSelector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getParentElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getParentElement(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.isChecked"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).isChecked(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectRadio"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectRadio(
        	parentElement
         , 	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectRadio"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectRadio(
        	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getShadowElement"(
    	WebElement parent	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getShadowElement(
        	parent
         , 	selector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElementsInsideParent"(
    	WebElement parent	
     , 	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElementsInsideParent(
        	parent
         , 	cssSelector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.findElementInsideParent"(
    	WebElement parent	
     , 	String cssSelector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).findElementInsideParent(
        	parent
         , 	cssSelector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getAllShadowElement"(
    	WebElement parent	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getAllShadowElement(
        	parent
         , 	selector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getChildElements"(
    	WebElement parent	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getChildElements(
        	parent)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getSiblingElements"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getSiblingElements(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getSiblingElement"(
    	WebElement element	
     , 	String selector	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getSiblingElement(
        	element
         , 	selector)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getNextSiblingElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getNextSiblingElement(
        	element)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectCheckbox"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectCheckbox(
        	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectCheckbox"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectCheckbox(
        	parentElement
         , 	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectDropdown"(
    	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectDropdown(
        	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.selectDropdown"(
    	WebElement parentElement	
     , 	String label	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).selectDropdown(
        	parentElement
         , 	label)
}

def static "com.katalon.plugin.keyword.shadow.ShadowKeywords.getPreviousSiblingElement"(
    	WebElement element	) {
    (new com.katalon.plugin.keyword.shadow.ShadowKeywords()).getPreviousSiblingElement(
        	element)
}
