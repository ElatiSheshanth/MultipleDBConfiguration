package com.app.entity.mongo.db1;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.app.util.EnumUtil.LanguageCode;

@Document(collection = "SystemMessages")
public class SystemMessages {

	@Id
	private Long messageId;

	private String refCode;

	private LanguageCode langCode;

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
