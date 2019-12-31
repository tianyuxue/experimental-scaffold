package com.jitianyu.exp2.domain;

import java.time.Instant;

/**
 * Commodity represents a commodity in the shop
 */
public class Commodity {
    private Long commodityId;
    private String name;
    private Short status;

    private Instant createOn;
    private Instant lastModified;
    private Boolean deleted;

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Commodity [commodityId=" + commodityId + ", createOn=" + createOn + ", deleted=" + deleted
                + ", lastModified=" + lastModified + ", name=" + name + ", status=" + status + "]";
    }

    public Instant getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Instant createOn) {
        this.createOn = createOn;
    }

    public Instant getLastModified() {
        return lastModified;
    }

    public void setLastModified(Instant lastModified) {
        this.lastModified = lastModified;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

}