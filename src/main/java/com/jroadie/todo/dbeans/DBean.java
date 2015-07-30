package com.jroadie.todo.dbeans;

import io.dbean.ddl.Id;

import java.util.Date;

public abstract class DBean extends io.dbean.core.DBean {

    private Long id;
    private Date created;
    private Date updated;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
