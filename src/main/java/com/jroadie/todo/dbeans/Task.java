package com.jroadie.todo.dbeans;

import io.dbean.core.DBean;

import java.util.HashSet;
import java.util.Set;

public class Task extends DBean {

    private String title;
    private String description;
    private Category category;
    private Set<Tag> tags = new HashSet<>();

    public String title() {
        return title;
    }

    public void title(String title) {
        this.title = title;
    }

    public String description() {
        return description;
    }

    public void description(String description) {
        this.description = description;
    }

    
    public Category category() {
        return category;
    }

    public void category(Category category) {
        this.category = category;
    }

    public Set<Tag> tags() {
        return tags;
    }

    public void tags(Set<Tag> tags) {
        this.tags = tags;
    }

}
