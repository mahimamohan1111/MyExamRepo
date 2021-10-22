package com.myexamques.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "QUESTION_TBL")
public class Question {

	@Id
	@GeneratedValue
	private int id;

	private String quesstr;
	private String questopic;

	@OneToMany(targetEntity = Option.class, cascade = CascadeType.ALL)
	@JoinColumn(name="q_fk",referencedColumnName = "id")
	private List<Option> options;
	
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuesstr() {
		return quesstr;
	}
	public void setQuesstr(String quesstr) {
		this.quesstr = quesstr;
	}
	
	public String getQuestopic() {
		return questopic;
	}
	public void setQuestopic(String questopic) {
		this.questopic = questopic;
	}
}
