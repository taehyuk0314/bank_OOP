package service;

import java.util.ArrayList;
import java.util.HashMap;

import domain.ArticleBean;

public interface ArticleService {
	public void createArticle(String title,String content,String writer);
	public ArrayList<ArticleBean> list();
	public ArrayList<ArticleBean> findByWriter(String writer);
	public ArticleBean findByTitle(String title);
	public int countArticle();
	public boolean existArticle(String title,String writer);
	public String redDate();
	public void updateContent(String title,String content);
	public void deleteTitle(String title,String writer);
}
