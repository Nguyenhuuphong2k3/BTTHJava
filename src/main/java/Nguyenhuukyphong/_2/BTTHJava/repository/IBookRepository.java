package Nguyenhuukyphong._2.BTTHJava.repository;

import Nguyenhuukyphong._2.BTTHJava.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

}
