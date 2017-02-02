package com.app.entity.db1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.app.util.EnumUtil.LanguageCode;


@Entity
@Table(name = "SystemMessages")
public class SystemMessages {

	@Id
	@Column(name = "message_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long messageId;

	@Column(name = "ref_code", unique = false, nullable = false, length = 128)
	private String refCode;

	@Column(name = "lang_code", nullable = false, columnDefinition = "varchar(2) default 'EN'")
	@Enumerated(EnumType.STRING)
	private LanguageCode langCode;

	@Column(name = "message", unique = false, nullable = false)
	@Lob
	private String message;

	public Long getMessageId() {
		return messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public String getRefCode() {
		return refCode;
	}

	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}

	public LanguageCode getLangCode() {
		return langCode;
	}

	public void setLangCode(LanguageCode langCode) {
		this.langCode = langCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
