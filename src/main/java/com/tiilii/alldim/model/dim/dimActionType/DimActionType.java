/**
 *	create by tools 2019-1-15 17:16:56
 *	Copyright © 2012 武汉天量数据技术有限公司
 *	注意：DimActionType.java不是开源产品，任何未经许可的源码修改、重新发布、反编译，都会被追究法律责任
 *
 */
package com.tiilii.alldim.model.dim.dimActionType;

import com.tiilii.framework.core.annotation.Column;

import com.tiilii.framework.core.annotation.Entity;
import com.tiilii.framework.core.annotation.GeneratorType;
import com.tiilii.framework.core.annotation.IDGenerator;
import java.io.Serializable;

@Entity(table = "d_action_type")
@IDGenerator(generator=GeneratorType.NATIVE)
public class DimActionType implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIELD_ACTIONTYPEID = "actionTypeId";
	public static final String FIELD_ACTIONTYPENAME = "actionTypeName";

	@Column(name="action_type_id", isPk=true, isFk=false,isBlob=false,isClob=false)
	private String actionTypeId;

	@Column(name="action_type_name", isPk=false, isFk=false,isBlob=false,isClob=false)
	private String actionTypeName;

	public String getActionTypeId(){

			return this.actionTypeId;
	}

	public void setActionTypeId(String actionTypeId){
		this.actionTypeId=actionTypeId;
	}

	public String getActionTypeName(){

			return this.actionTypeName;
	}

	public void setActionTypeName(String actionTypeName){
		this.actionTypeName=actionTypeName;
	}

}
