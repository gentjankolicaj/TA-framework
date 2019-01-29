package com.ta.framework.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import org.apache.maven.shared.utils.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import com.ta.framework.configuration.GlobalConfigs;
import com.ta.framework.references.LogMap;
import com.ta.framework.result.MyResult;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class ReportUtils {

	private static OutputStream outputStream;
	private static int fileNumber = 0;

	public static void saveResultsToExcel(List<MyResult> resultList, String fileName, String sheetName,
			ReportFileType fileType) throws Exception {
		if (fileType.equals(ReportFileType.XLS) || fileType.equals(ReportFileType.XLSX)) {

			Workbook workbook = null;
			Sheet sheet = null;
			if (fileType.equals(ReportFileType.XLS)) {
				workbook = WorkbookFactory.create(false); // horible spreadsheet format HSSF
			} else {
				workbook = new XSSFWorkbook(); // xml spreadsheet format XSSF for exel spreadsheets
			}

			handleFileCollision(fileName, fileType);

			sheet = workbook.createSheet(sheetName);

			Row row = null;
			Cell cell0 = null;
			Cell cell1 = null;
			Cell cell2 = null;

			for (int r = 0; r < resultList.size(); r++) {
				MyResult result = resultList.get(r);
				row = sheet.createRow(r);
				cell0 = row.createCell(0);
				cell1 = row.createCell(1);

				if (result.getKey() != null)
					cell0.setCellValue(result.getKey().toString());

				if (result.getValue() != null)
					cell1.setCellValue(result.getValue().toString());
			}

			workbook.write(outputStream);
			workbook.close();

			outputStream.flush();
			outputStream.close();

		}

	}

	public static void saveResultsToExcel(Map<Integer, MyResult> resultMap, String fileName, String sheetName,
			ReportFileType fileType) throws Exception {
		if (fileType.equals(ReportFileType.XLS) || fileType.equals(ReportFileType.XLSX)) {

			Workbook workbook = null;
			Sheet sheet = null;
			if (fileType.equals(ReportFileType.XLS)) {
				workbook = WorkbookFactory.create(false); // horible spreadsheet format HSSF
			} else {
				workbook = new XSSFWorkbook(); // xml spreadsheet format XSSF for exel spreadsheets
			}

			handleFileCollision(fileName, fileType);

			sheet = workbook.createSheet(sheetName);

			Row row = null;
			Cell cell0 = null;
			Cell cell1 = null;
			Cell cell2 = null;
			int rowNumber = 0;
			for (Map.Entry<Integer, MyResult> entry : resultMap.entrySet()) {
				row = sheet.createRow(rowNumber);
				MyResult tmpRes = entry.getValue();

				cell0 = row.createCell(0);
				cell1 = row.createCell(1);
				cell2 = row.createCell(2);
				rowNumber++;

				cell0.setCellValue(entry.getKey().toString());

				if (tmpRes != null) {
					if (tmpRes.getKey() != null)
						cell1.setCellValue(tmpRes.getKey().toString());

					if (tmpRes.getValue() != null)
						cell2.setCellValue(tmpRes.getValue().toString());
				}

			}

			workbook.write(outputStream);
			workbook.close();

			outputStream.flush();
			outputStream.close();

		}

	}

	public static void saveResultsToWord(Map<Integer, MyResult> resultsMap, String fileName, ReportFileType fileType)
			throws Exception {
		if (fileType.equals(ReportFileType.DOCX)) {

			XWPFDocument document = new XWPFDocument();

			handleFileCollision(fileName, fileType);

			XWPFTable table = document.createTable();

			XWPFTableRow tableRow = null;
			XWPFTableCell cell0 = null;
			XWPFTableCell cell1 = null;
			XWPFTableCell cell2 = null;

			for (Map.Entry<Integer, MyResult> entry : resultsMap.entrySet()) {
				tableRow = table.createRow();
				MyResult tmpRes = entry.getValue();

				cell0 = tableRow.createCell();
				cell0.setText(entry.getKey().toString());

				if (tmpRes != null) {
					if (tmpRes.getKey() != null) {
						cell1=tableRow.createCell();
						cell1.setText(tmpRes.getKey().toString());
					}

					if (tmpRes.getValue() != null) {
						cell2=tableRow.createCell();
						cell2.setText(tmpRes.getValue().toString());
					}
				}

			}

			document.write(outputStream);
			document.close();

			outputStream.flush();
			outputStream.close();

		}
	}

	public static void saveResultsToWord(List<MyResult> resultsList, String fileName, ReportFileType fileType)
			throws Exception {
		if (fileType.equals(ReportFileType.DOCX)) {

			XWPFDocument document = new XWPFDocument();

			handleFileCollision(fileName, fileType);

			XWPFTable table = document.createTable();

			XWPFTableRow tableRow = null;
			XWPFTableCell cell0 = null;
			XWPFTableCell cell1 = null;

			for (int r = 0; r < resultsList.size(); r++) {
				MyResult tmp = resultsList.get(r);
				tableRow = table.createRow();
				if (tmp.getKey() != null) {
					cell0 = tableRow.createCell();
					cell0.setText(tmp.getKey().toString());
				}

				if (tmp.getValue() != null) {
					cell1 = tableRow.createCell();
					cell1.setText(tmp.getValue().toString());
				}

			}

			document.write(outputStream);
			document.close();

			outputStream.flush();
			outputStream.close();

		}
	}

	private static String buildFilePath(String fileName, ReportFileType fileType) {
		return GlobalConfigs.homeDirectory + GlobalConfigs.fileSeparator + fileName + "_" + fileNumber + "."
				+ fileType.getFileExtension();
	}

	private static void handleFileCollision(String fileName, ReportFileType fileType)
			throws FileNotFoundException, Exception {
		String filePath = buildFilePath(fileName, fileType);
		File fileObject = new File(filePath);
		while (fileObject.exists()) {
			String fullFileName = fileObject.getName().trim();
			String name = StringUtils.substring(fullFileName, 0, fullFileName.lastIndexOf("."));
			String number = StringUtils.substring(name, name.lastIndexOf("_") + 1, name.length());
			fileNumber = Integer.valueOf(number) + 1;
			filePath = buildFilePath(fileName, fileType);
			fileObject = new File(filePath);
		}
		outputStream = new FileOutputStream(filePath);

	}
	
	
	public static void saveLogs(String fileName,String sheetName,ReportFileType fileType) throws Exception{
		Map logMap=LogMap.getLogMap();
		saveResultsToExcel(logMap,fileName,sheetName,fileType);
		
	}

}
