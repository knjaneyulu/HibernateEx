package info.inetsolv.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="course_tbl")
public class Course {

	@Id
	@Column
	@SequenceGenerator(name="course_id_seq_generator",sequenceName="course_id_seq_generator",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="course_id_seq_generator")
	private Integer cid;
	private String cname;
	@ManyToMany(mappedBy="courseTbls")
	private List<Student> studenttbls;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Student> getStudenttbls() {
		return studenttbls;
	}
	public void setStudenttbls(List<Student> studenttbls) {
		this.studenttbls = studenttbls;
	}
	
	
}
