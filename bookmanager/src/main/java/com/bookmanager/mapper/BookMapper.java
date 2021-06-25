package com.bookmanager.mapper;

import com.bookmanager.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookMapper {
    List<Book> getAllBook();
    Book getBookById(String id);
    void updateBook(Book book);
    void deleteBook(long id);
    void addBook(Book book);
    List<Book> searchBook(String keyword);
}
