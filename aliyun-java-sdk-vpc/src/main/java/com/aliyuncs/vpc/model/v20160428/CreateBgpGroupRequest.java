/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateBgpGroupRequest extends RpcAcsRequest<CreateBgpGroupResponse> {
	
	public CreateBgpGroupRequest() {
		super("Vpc", "2016-04-28", "CreateBgpGroup", "vpc");
	}

	private String authKey;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String clientToken;

	private String ownerAccount;

	private String description;

	private Long ownerId;

	private Integer peerAsn;

	private Boolean isFakeAsn;

	private String routerId;

	private String name;

	public String getAuthKey() {
		return this.authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
		if(authKey != null){
			putQueryParameter("AuthKey", authKey);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getPeerAsn() {
		return this.peerAsn;
	}

	public void setPeerAsn(Integer peerAsn) {
		this.peerAsn = peerAsn;
		if(peerAsn != null){
			putQueryParameter("PeerAsn", peerAsn.toString());
		}
	}

	public Boolean getIsFakeAsn() {
		return this.isFakeAsn;
	}

	public void setIsFakeAsn(Boolean isFakeAsn) {
		this.isFakeAsn = isFakeAsn;
		if(isFakeAsn != null){
			putQueryParameter("IsFakeAsn", isFakeAsn.toString());
		}
	}

	public String getRouterId() {
		return this.routerId;
	}

	public void setRouterId(String routerId) {
		this.routerId = routerId;
		if(routerId != null){
			putQueryParameter("RouterId", routerId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<CreateBgpGroupResponse> getResponseClass() {
		return CreateBgpGroupResponse.class;
	}

}
