package linpeng.util;
/**
 * ��ȡ��ַ��
 * @author lp
 *
 */
public class UrlUtil {

	/**
	 * ���ݵ�ǰ���ŷ���ͻ�ȡ���ŵ�ҳ������ȡ��Ӧ��ַ
	 * @param order   ��ǰ���ŷ�����
	 * @param page_load   ��ȡ���ŵ�ҳ��
	 * @return
	 */
	public static String getUrlByOrder(int order,int page_load){
		String url=Constant.URL_IMPORTANT_NEWS;
		switch (order) {
		case 0:
			url=Constant.URL_IMPORTANT_NEWS;
			break;
		case 1:
			url=Constant.URL_NOTICE;
			break;
		case 2:
			url=Constant.URL_TENDER;
			break;
		case 3:
			url=Constant.URL_LECTURE;
			break;
		case 4:
			url=Constant.URL_MEDIA;
			break;
		case 5:
			url=Constant.URL_COMPOSITE;
			break;
		default:
			break;
		}
		if(page_load!=1){
			url=url+page_load+".html";
		}
		if(order==1&&page_load!=1){
			url="http://news.hfut.edu.cn/list-2-"+page_load+".html";
		}
		return url;
	}
}
