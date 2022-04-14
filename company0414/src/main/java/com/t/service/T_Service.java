package com.t.service;


@Service
public class T_Service {
	static Logger logger = LoggerFactory.getLogger(T_Service.class);
	
	@Inject
	private T_Mapper t_Mapper;
	
	
	public void getList(PaginationInfo paginationInfo, ModelMap model,
			DataBox dataBox, DataBox userMap) throws Exception {

		DataBox param = new DataBox();
		
		if( dataBox.getString("start_dh").isEmpty() ){
			//System.out.println(" start_dh 비었음. 초기값 세팅. ");
			Date date = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, 0);
			
			SimpleDateFormat df1 = new SimpleDateFormat("yyyyMMdd");
			int year = Integer.parseInt(df1.format(cal.getTime()).substring(0, 4));
			int month = Integer.parseInt(df1.format(cal.getTime()).substring(4, 6));
			
			cal.set(year, month-1, 1);
			
			dataBox.put("start_dh", df1.format(cal.getTime()));
		}
		
		if( dataBox.getString("end_dh").isEmpty() ){
			//System.out.println(" end_dh 비었음. 초기값 세팅. ");
			Date date = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			cal.add(Calendar.DATE, -1);
			SimpleDateFormat df1 = new SimpleDateFormat("yyyyMMdd");
			
			dataBox.put("end_dh", df1.format(cal.getTime()));
		}
	
		param.put("data", dataBox);
		//param.put("userMap", userMap);
		param.put("page", paginationInfo);
		
				
		System.out.println(" param : " + param.toString());
		
		
		List<DataBox> list = null;		
		List<DataBox> listSize = null;
		
		if(dataBox.getString("searchYn").equals("Y") ) {  // 맨 처음 메뉴 접근했을 때에는 조회 안하고,   조회버튼 눌렀을 때 조회하기
			list = t_Mapper.selectListData(param);
			listSize = t_Mapper.selectListData(param);
			
			if(listSize.size() >  0){
				paginationInfo.setTotalRecordCount(listSize.size());
			}
		}
		
		
		model.addAttribute("list", list);
		model.addAttribute("data", dataBox);
		model.addAttribute("userMap", userMap);
		model.addAttribute("paginationInfo", paginationInfo);
	}
	
	

	public void getListByExcel(ModelMap model, DataBox dataBox, DataBox userMap)  throws Exception  {
	
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal= Calendar.getInstance();	
		cal.add(cal.DATE, -1);
		
		Date date = cal.getTime();

		ValidationUtil.isDateScope(dataBox.getString("start_dh"), dataBox.getString("end_dh"), 30);
		DataBox box = new DataBox();
		SimpleDateFormat yearMonthDay = new SimpleDateFormat("yyyyMMdd_HHmmss");

		if( dataBox.getString("start_dh").isEmpty() ){
			
			dataBox.put("start_dh", formatter.format(date));
			dataBox.put("end_dh", formatter.format(date));
		}
		
	//--생략
		
		box.put("data", dataBox);
	
		DataBox data = new DataBox();
		
		List<DataBox> list = t_Mapper.selectListExcelData(box);
	
		// 엑셀 추가 사항
			data.put("headerName", dataBox.get("header_name").toString());
			data.put("dbcolName", dataBox.get("dbcol_name").toString());
	
		
		data.put("list", list);
		
	
		dataBox.put("start_dh", formatter2.format( formatter.parse(dataBox.get("start_dh").toString() )) );
		dataBox.put("end_dh", formatter2.format( formatter.parse(dataBox.get("end_dh").toString() ))  );
		data.put("box", dataBox);
		
	

		model.addAttribute("list", list);	
		model.addAttribute("data", data);
		model.addAttribute("fileName", "내역"+yearMonthDay.format(date));
	
	
}
	
	
	
}
