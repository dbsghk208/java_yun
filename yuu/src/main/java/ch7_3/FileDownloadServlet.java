package ch7_3;

//실체클래스, 자식클래스
public class FileDownloadServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("파일 다운로드합니다.");
	}
}
