package com.jroadie.todo.dbeans;

import io.dbean.core.DBean;

import java.util.Date;

public class Task extends DBean {

    private String title;
    private String description;
    private Date dateToComplete;
    private Date created;
    private Date updated;

}
