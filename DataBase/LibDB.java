package DataBase;
import java.util.*;
import myClass.*;

/**
 * 제네릭 타입 T를 이용하여 다양한 도서관 데이터(User, Book 등)를 목록 형태로 
 * 저장하고 관리하는 데이터베이스 클래스
 * 
 * @author (2025320015 김홍일, 2022320016 박문아, 2022320001 이승건)
 * @version (2026.10.05)
 */
public class LibDB <T extends DB_Element>
{
    private ArrayList<T> db;

    /**
     * 비어 있는 ArrayList를 생성하여 LibDB 객체를 초기화하는 생성자 
     */
    public LibDB()
    {
        this.db = new ArrayList<T>();        
    }

    /**
     * 전달받은 데이터 요소를 데이터베이스(리스트)에 추가하는 메소드
     * 
     * @param data 데이터베이스에 추가할 요소 객체
     */
    public void addElement(T data)
    {
        db.add(data);
    }

    /**
     * 고유 식별번호로 요소 검색하는 메소드
     *
     * @param id 찾을 요소의 식별번호 (bookID 또는 stID)
     * @return 검색된 요소 객체 (일치하는 항목이 없을 경우 null)
     */
    public T findElement(String id)
    {
        for (T element : db) {
            if (element.getID().equals(id)) {
                return element;
            }
        }
        return null;
    }

    /**
     * 데이터베이스에 저장된 모든 요소를 화면에 순서대로 출력하는 메소드
     * 
     */
    public void printAllElements()
    {
        for(T element:db){
            System.out.println(element.toString());
        }
    }
}