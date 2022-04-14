package com.t.mapper;


@Repository 
public class T_Mapper {

	@Resource 
	@Named("sqlSessionCharge") 
	private SqlSession sqlSession; 
	
	public List<DataBox> selectListData(DataBox box) {
		return sqlSession.selectList("com.t.mapper.selectListData", box);
	}
	
	
	
	//selectList() �� ���콺 �÷����� �Ʒ��� ���� �޼����� ���. 
	//<DataBox> List<DataBox> org.apache.ibatis.session.SqlSession.selectList(String statement, Object parameter) public List<DataBox> selectListData(DataBox box) { // service ���� mapper �� ���µ� DataBox -> �� ����Ÿ������ Databox �� �޾ƿ��ڴ� ��� �� 
	// DataBox ������ ���ۿ��� ������ �Ǿ ���񽺷� ���°�. ���� ���Ͽ� List<DataBox> �� �޴´�. 
	// List<DataBox> �� �츮�� �������� �������ϱ� List�� ���°Ű� �Ѱ��� DataBox list =null; �� �Ǿ��� �� 
	// (xml�� Mapper���� DataBox ��� ���س��� ������ returnType�� dataBox �ΰ�) 
	// parameterType �� databox �� �޾ƿ��� ������ 
	// Service ���Ͽ��� param �̶�� ���� ���ʿ� DataBox param = new DataBox(); �̶�� �ɷ� Databox �� ��� ������ 
	// xml ���� parameterType='dataBox' ���� Ÿ���� �޾ƿ��°�. 
	// box�� ������ ���������δ� 
	// ���� <DataBox> List<DataBox> org.apache.ibatis.session.SqlSession.selectList(String statement, Object parameter) ���� 
	// Object parameter �������� box ��� ������ �Ķ���� Ÿ���� �־��ٲ���. ��°� return sqlSession.selectList("com.t.mapper.T_Mapper.selectListData", box); } 
	public List<DataBox> selectListExcelData(DataBox box) { 
		return sqlSession.selectList("com.t.mapper.selectListExcelData", box); 
	
	} 
	
	public DataBox selectCountData(DataBox box) { 
		return sqlSession.selectOne("com.t.mapper.selectCountData", box); } 
	
	}
	
}
