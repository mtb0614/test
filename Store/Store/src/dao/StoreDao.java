package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import common.StoreConst;

import dbManager.PSValueList;
import dbManager.SQLBuilder;
import entity.Store;
import form.SearchStoreConditionForm;

public class StoreDao {
	Connection conn = null;
	SQLBuilder sql = null;
	PreparedStatement pstmt = null;

	public StoreDao(Connection conn) {
		this.conn = conn;
	}

	/**
	 * 店舗検索
	 * @param form
	 * @return
	 */
	public List<Store> search(SearchStoreConditionForm form){
		sql = new SQLBuilder();
		sql.select();
		sql.asterisk();
		sql.from();
		sql.tableName(StoreConst.STORE_TABLE_NAME);

		PSValueList value = new PSValueList();

		List<String> condition = new ArrayList<String>();
		SQLBuilder conditionSb = null;
		// store name
		if(form.getName() != null){
			conditionSb = new SQLBuilder();
			conditionSb.columnName(StoreConst.STORE_NAME);
			conditionSb.eq();
			conditionSb.question();
			value.setString(form.getName());
			condition.add(conditionSb.toString());
		}
		// store area
		if(form.getArea() != null){
			conditionSb = new SQLBuilder();
			conditionSb.columnName(StoreConst.STORE_AREA);
			conditionSb.in();
			conditionSb.startFrame();
			for(int i = 0;i < form.getArea().size();i++){
				if(i != 0){
					conditionSb.conm();
				}
				conditionSb.question();
				value.setInt(form.getArea().get(i));
			}
			conditionSb.endFrame();
			condition.add(conditionSb.toString());
		}
		// store category
		if(form.getCategory() != null){
			conditionSb = new SQLBuilder();
			conditionSb.columnName(StoreConst.STORE_CATEGORY);
			conditionSb.in();
			conditionSb.startFrame();
			for(int i = 0;i < form.getCategory().size();i++){
				if(i != 0){
					conditionSb.conm();
				}
				conditionSb.question();
				value.setInt(form.getCategory().get(i));
			}
			conditionSb.endFrame();
			condition.add(conditionSb.toString());
		}
		if( 0 < condition.size()){
			sql.where();
			for(int i = 0; i< condition.size();i++){
				if(i != 0){
					sql.and();
				}
				sql.condition(condition.get(i));
			}
		}

		try {
			pstmt = conn.prepareStatement(sql.toString());

		} catch (Exception e) {

		}


		List<Store> results = new ArrayList<Store>();
		return results;
	}
}
