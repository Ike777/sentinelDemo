package com.sharding.module.order.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shenw
 * @since 2020-07-09
 */
public class TOrder implements Serializable {

    private static final long serialVersionUID=1L;

    private Long orderId;

    private String orderNo;

    private Integer orderItemId;

    private Long userId;

    private Long tenantId;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "TOrder{" +
        "orderId=" + orderId +
        ", orderNo=" + orderNo +
        ", orderItemId=" + orderItemId +
        ", userId=" + userId +
        ", tenantId=" + tenantId +
        ", createdDate=" + createdDate +
        ", updatedDate=" + updatedDate +
        "}";
    }
}
