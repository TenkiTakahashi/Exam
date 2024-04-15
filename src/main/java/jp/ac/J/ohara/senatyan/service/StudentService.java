package jp.ac.J.ohara.senatyan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import jp.ac.J.ohara.senatyan.model.Student;
import jp.ac.J.ohara.senatyan.repository.StudentRepository;

@Repository
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	/**
	 * スケジュール帳一覧の取得
	 * @return List<Student>
	 */
	public List<Student> getScheduleList() {
	    List<Student> entityList = this.repository.findAll();
	    return entityList;
	}

	/**
	 * 詳細データの取得
	 * @param @NonNull Long index
	 * @return  Student
	 */
	public Student get(@NonNull Long index) {
		Student Student = this.repository.findById(index).orElse(new Student());
		return Student;
	}

	/**
	 * スケジュール帳一覧の取得
	 * @param Student Student
	 */
	public void save(@NonNull Student Student) {
		Student.setIS_ATTEND(true);
		this.repository.save(Student);
	}
	 // 受け取ったidからデータを取得して、Formを返却する
    public Student getOneBook(Long index) {
		
        // idを指定して本の情報を取得する
    	Student student = repository.findById(index).orElseThrow();
		
        // 画面返却用のFormに値を設定する
    	/*
        Student editstudent = new Student();
        editstudent.setNAME(student.getNAME());
        editstudent.setCLASS_NUM(student.getCLASS_NUM());
		*/
        return student;
    }
    // 本を更新する
    public void update(Student editstudent) {
		
        // データベースに登録する値を保持するインスタンスの作成
        //Student student = new Student();
		
        // 画面から受け取った値を設定する
    	/*
        student.setId(editstudent.getId());
        student.setNAME(editstudent.getNAME());
        student.setCLASS_NUM(editstudent.getCLASS_NUM());
        */
		
        // データベースを更新する
        repository.save(editstudent);
    }

}
