package com.example.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.example.domain.QWebBoard;
import com.example.domain.WebBoard;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;

public interface WebBoardRepository extends JpaRepository<WebBoard, Long>, QuerydslPredicateExecutor<WebBoard>{

	public default Predicate makePredicate(String type, String keyword){
		
		BooleanBuilder builder = new BooleanBuilder();
		
		QWebBoard board = QWebBoard.webBoard;
		
		builder.and(board.bno.gt(0));
		
		if(type == null){
			return builder;
		}
		
		switch(type){
		case "t":
			builder.and(board.title.like("%" + keyword +"%"));
			break;
		case "c":
			builder.and(board.content.like("%" + keyword +"%"));
			break;
		case "w":
			builder.and(board.writer.like("%" + keyword +"%"));
			break;
		}
		
		return builder;
	}
	

}





