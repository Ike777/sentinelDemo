package com.module.users.generate;

import java.io.Serializable;


/**
 * t_user
 * @author
 */

public class TUser implements Serializable {
    private Long userId;

    private String uaserName;

    private Long tenantId;


    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }



    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUaserName() {
        return uaserName;
    }

    public void setUaserName(String uaserName) {
        this.uaserName = uaserName;
    }

    private static final long serialVersionUID = 1L;
}
