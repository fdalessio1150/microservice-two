package br.com.application.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ClientList {

	private List<Client> clientList;

	public ClientList(Builder builder) {
		this.clientList = builder.clientList;
	}

	public static Builder builder() {
		return new Builder();
	}

	public List<Client> getClientList() {
		return clientList;
	}

	public static class Builder {

		private List<Client> clientList;

		private Builder() {}

		public Builder withClients(List<Client> clientList) {
			this.clientList = clientList;
			return this;
		}

		public ClientList build() {
			return new ClientList(this);
		}
	}

	@JsonCreator
	static ClientList json(List<Client> clientList) {
		return builder()
				.withClients(clientList)
				.build();
	}
}
