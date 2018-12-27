package controller;

import javax.swing.JOptionPane;

import domain.ArticleBean;
import service.ArticleService;
import service.ArticleServiceImpl;

public class ArticleController {
	public static void main(String[] args) {
		ArticleBean article = null;
		ArticleService articleService = new ArticleServiceImpl();
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료 1.가입\n 2.리스트\n 3.작가찾기\n 4.제목찾기\n 5.책갯수\n 6.작성자 확인\n 7.내용 바꾸기")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case"1":
				articleService.createArticle(JOptionPane.showInputDialog("제목"),
						JOptionPane.showInputDialog("내용"),
						JOptionPane.showInputDialog("작가"));
				break;
			case"2":
				JOptionPane.showMessageDialog(null, articleService.list());
				break;
			case"3":
				String writer = JOptionPane.showInputDialog("글쓴이");
				articleService.findByWriter(writer);
				JOptionPane.showMessageDialog(null, articleService.findByWriter(writer));
				break;
			case"4":
				JOptionPane.showMessageDialog(null, articleService.findByTitle(JOptionPane.showInputDialog("제목입력")));
				break;
			case"5":
				JOptionPane.showMessageDialog(null, articleService.countArticle());
				break;
			case"6":
				JOptionPane.showMessageDialog(null, articleService.existArticle(JOptionPane.showInputDialog("제목입력"), 
						JOptionPane.showInputDialog("작가입력")));
				break;
			case"7":
				articleService.updateContent(JOptionPane.showInputDialog("제목입력"),
						JOptionPane.showInputDialog("내용"));
				break;
			}
		}
	}
}
