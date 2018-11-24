package br.com.application.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Client {

	private UUID id;
	private String name;

	public Client(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		
		private UUID id;
		private String name;
		
		private Builder() {}
		 
		public Builder withId(UUID id) {
			this.id = id;
			return this;
		}
		
		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		
		public Client build() {
			return new Client(this);
		}
	}
	
	@JsonCreator
	static Client json(@JsonProperty("id") UUID id, @JsonProperty("nome") String name) {
		return builder()
				.withId(id)
				.withName(name)
				.build();
	}
}
