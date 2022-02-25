package com.wooga.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PetApiResponse {
	private int id;
	private String name;
	private String status;
	private NameId category;
	private List<String> photoUrls;
	private List<NameId> tags;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public NameId getCategory() {
		return category;
	}

	public void setCategory(NameId category) {
		this.category = category;
	}

	public List<String> getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}

	public List<NameId> getTags() {
		return tags;
	}

	public void setTags(List<NameId> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "{id:" + id + ", name:" + name + ", status:" + status + ", category:" + category + ", photoUrls:"
				+ photoUrls + ", tags:" + tags + "}";
	}

}
