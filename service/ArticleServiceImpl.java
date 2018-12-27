package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService{
	private HashMap<String,ArticleBean> map;
	private int seq;
	public ArticleServiceImpl() {
		map = new HashMap<>();
		seq=1000;
	}
	@Override
	public void createArticle(String title, String content, String writer) {
		ArticleBean article = new ArticleBean();
		article.setTitle(String.valueOf(seq));
		article.setContent(content);
		article.setWriter(writer);
		article.setRedDate(redDate());
		map.put(article.getTitle(), article);
		seq++;
	}

	@Override
	public ArrayList<ArticleBean> list() {
		ArrayList<ArticleBean> arrayList = new ArrayList<>();
		Set<String> set = map.keySet();
		for(String key : set) {
				arrayList.add(map.get(key));
			}
		return arrayList;
	}

	@Override
	public ArrayList<ArticleBean> findByWriter(String writer) {
		ArrayList<ArticleBean> arrayList = new ArrayList<>();
		Set<String> set = map.keySet();
		for(String key : set) {
			if(map.get(key).getWriter().equals(writer)) {
				arrayList.add(map.get(key));
			}
		}
		return arrayList;
	}

	@Override
	public ArticleBean findByTitle(String title) {
		return map.get(title);
	}

	@Override
	public int countArticle() {
		return map.size();
	}

	@Override
	public boolean existArticle(String title, String writer) {
		boolean exist =false;
		if(map.get(title).getTitle().equals(title)&&
				map.get(title).getWriter().equals(writer)) {
			exist = true;
		}
		return exist;
	}

	@Override
	public String redDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	@Override
	public void updateContent(String title, String content) {
			map.get(content).setContent(content);
	}

	@Override
	public void deleteTitle(String title, String writer) {
		// TODO Auto-generated method stub
		
	}

}
