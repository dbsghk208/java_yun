package com.t.mapper;


@Repository 
public class T_Mapper {

	@Resource 
	@Named("sqlSessionCharge") 
	private SqlSession sqlSession; 
	
	public List<DataBox> selectListData(DataBox box) {
		return sqlSession.selectList("com.t.mapper.selectListData", box);
	}
	
	
	
	//selectList() 에 마우스 올려보면 아래와 같은 메세지가 뜬다. 
	//<DataBox> List<DataBox> org.apache.ibatis.session.SqlSession.selectList(String statement, Object parameter) public List<DataBox> selectListData(DataBox box) { // service 에서 mapper 로 오는데 DataBox -> 는 리턴타입으로 Databox 로 받아오겠다 라는 것 
	// DataBox 시작이 맵퍼에서 시작이 되어서 서비스로 가는것. 서비스 파일에 List<DataBox> 로 받는다. 
	// List<DataBox> 는 우리가 여러개를 받을꺼니깐 List로 쓰는거고 한개면 DataBox list =null; 이 되었을 것 
	// (xml도 Mapper에서 DataBox 라고 정해놨기 때문에 returnType이 dataBox 인것) 
	// parameterType 은 databox 로 받아오는 이유는 
	// Service 파일에서 param 이라는 것을 위쪽에 DataBox param = new DataBox(); 이라는 걸로 Databox 를 줬기 때문에 
	// xml 에서 parameterType='dataBox' 으로 타입을 받아오는것. 
	// box인 이유는 정식적으로는 
	// 위에 <DataBox> List<DataBox> org.apache.ibatis.session.SqlSession.selectList(String statement, Object parameter) 에서 
	// Object parameter 값때문에 box 라는 값으로 파라메터 타입을 넣어줄꺼다. 라는것 return sqlSession.selectList("com.t.mapper.T_Mapper.selectListData", box); } 
	public List<DataBox> selectListExcelData(DataBox box) { 
		return sqlSession.selectList("com.t.mapper.selectListExcelData", box); 
	
	} 
	
	public DataBox selectCountData(DataBox box) { 
		return sqlSession.selectOne("com.t.mapper.selectCountData", box); } 
	
	}
	
}
