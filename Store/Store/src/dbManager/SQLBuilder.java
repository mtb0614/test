package dbManager;

public class SQLBuilder {
	StringBuilder sb = new StringBuilder();

	public String toString(){
		return sb.toString();
	}

	public void select(){
		sb.append("SELECT ");
	}
	public void where(){
		sb.append("WHERE ");
	}
	public void from(){
		sb.append("FROM ");
	}
	public void and(){
		sb.append("AND ");
	}
	public void conm(){
		sb.append(", ");
	}
	public void or(){
		sb.append("or ");
	}
	public void asterisk(){
		sb.append("* ");
	}
	public void tableName(String str){
		sb.append(str + " ");
	}
	public void columnName(String str){
		sb.append(str + " ");
	}
	public void eq(){
		sb.append("= ");
	}
	public void columnValue(String str){
		sb.append(str + " ");
	}
	public void in(){
		sb.append("in ");
	}
	public void startFrame(){
		sb.append("( ");
	}
	public void endFrame(){
		sb.append(") ");
	}
	public void condition(String str){
		sb.append(str);
	}
	public void question(){
		sb.append("? ");
	}
}
