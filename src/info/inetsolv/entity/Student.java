package info.inetsolv.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="Student_tbl")
public class Student {

	@Id
	@Column
	@SequenceGenerator(name="student_id_seq_generator",sequenceName="student_id_seq_generator",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="student_id_seq_generator")
	private Integer sid;
	private String sname;
	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(
			name="student_course_tbl"
			,joinColumns={
					@JoinColumn(name="sid")
			},inverseJoinColumns={
					@JoinColumn(name="cid")
			}
			)
	private List<Course> courseTbls;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Course> getCourse() {
		return courseTbls;
	}
	public void setCourse(List<Course> course) {
		this.courseTbls = course;
	}
	
}
