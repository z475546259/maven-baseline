package com.seleniumwork.util;

import java.io.FileInputStream;
import java.io.InputStream;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


/***
 * @desc store value of element in page and get it by JXL
 * 
 *
 */
public class DataEngine {
	
	/**
	 * @desc use jxl add-in to operate excel file
	 * @param filepath
	 * @param colname
	 * @param rowindex
	 * @return
	 */
	public static String getValueByRowID(String filepath, String colname, int rowindex) {
		jxl.Workbook readwb = null;
		String retstr = "";
		try {
			InputStream instream = new FileInputStream(filepath);
			readwb = Workbook.getWorkbook(instream);
			Sheet readsheet = readwb.getSheet(0);
			int rsColumns = readsheet.getColumns();
			int rsRows = readsheet.getRows();
			//System.out.println("列数=" + rsColumns);
			//System.out.println("行数=" + rsRows);
			for (int i = 0; i < rsColumns; i++) {
				Cell cell = readsheet.getCell(i, 0);
				//System.out.println("第0行第" + i + "列=" + cell.getContents());
				if (cell.getContents().equals(colname)) {
					cell = readsheet.getCell(i, rowindex);
					retstr = cell.getContents();
				}
			}
		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			return retstr;
		}
	}

	// public static String getValueByFlag(String filepath,String colname,int
	// rowindex)
	// {
	// jxl.Workbook readwb = null;
	// String retstr = "";
	// try
	// {
	// InputStream instream = new FileInputStream(filepath);
	// readwb = Workbook.getWorkbook(instream);
	// Sheet readsheet = readwb.getSheet(0);
	// int rsColumns = readsheet.getColumns();
	// int rsRows = readsheet.getRows();
	// System.out.println("列数="+rsColumns);
	// System.out.println("行数="+rsRows);
	// for(int i=0;i<rsColumns;i++){
	// Cell cell = readsheet.getCell(i,0);
	// System.out.println("第0行第"+i+"列="+cell.getContents());
	// if(cell.getContents().equals(colname)){
	// cell = readsheet.getCell( i,rowindex);
	// retstr = cell.getContents();
	// }
	// }
	// } catch (Exception e) {
	//
	// e.printStackTrace();
	//
	// } finally {
	// return retstr;
	// }
	// }

}