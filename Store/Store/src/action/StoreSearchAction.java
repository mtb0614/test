package action;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import common.StoreConst;

import dao.StoreDao;
import dbManager.DbManager;
import entity.Store;
import form.SearchStoreConditionForm;

public class StoreSearchAction {
	DbManager db = null;
	public void search(HttpServletRequest req){
		Connection con = db.getConnection();
		SearchStoreConditionForm form = setFormForRequest(req);
		List<Store> results = new StoreDao(con).search(form);

	}

	/**
	 * パラメータからFORMへセット
	 * @param req
	 * @return form
	 */
	public SearchStoreConditionForm setFormForRequest(HttpServletRequest req){
		SearchStoreConditionForm form = new SearchStoreConditionForm();
		form.setName(convertEmptyToNull(req.getParameter(StoreConst.STORE_NAME)));
		form.setArea(covnertPramValToArrayList(req.getParameterValues(StoreConst.STORE_AREA)));
		form.setCategory(covnertPramValToArrayList(req.getParameterValues(StoreConst.STORE_CATEGORY)));
		return form;
	}

	public String convertEmptyToNull(String s) {
		if(s != ""){
			return s;
		}
		return null;
	}

	public List<String> covnertPramValToArrayList(String[] s) {
		List<String> list = null;
		if(s != null){
			list = new ArrayList<String>();
			for(int i =0; i < s.length;i++){
				list.add(s[i]);
			}
		}
		return list;
	}

}
