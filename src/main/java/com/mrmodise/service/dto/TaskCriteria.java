package com.mrmodise.service.dto;

import java.io.Serializable;
import java.util.Objects;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;
import io.github.jhipster.service.filter.LocalDateFilter;

/**
 * Criteria class for the Task entity. This class is used in TaskResource to
 * receive all the possible filtering options from the Http GET request parameters.
 * For example the following could be a valid requests:
 * <code> /tasks?id.greaterThan=5&amp;attr1.contains=something&amp;attr2.specified=false</code>
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class TaskCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter title;

    private StringFilter description;

    private LocalDateFilter dueDate;

    private BooleanFilter completed;

    private BooleanFilter isCollapsed;

    private LongFilter categoryId;

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getTitle() {
        return title;
    }

    public void setTitle(StringFilter title) {
        this.title = title;
    }

    public StringFilter getDescription() {
        return description;
    }

    public void setDescription(StringFilter description) {
        this.description = description;
    }

    public LocalDateFilter getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateFilter dueDate) {
        this.dueDate = dueDate;
    }

    public BooleanFilter getCompleted() {
        return completed;
    }

    public void setCompleted(BooleanFilter completed) {
        this.completed = completed;
    }

    public BooleanFilter getIsCollapsed() {
        return isCollapsed;
    }

    public void setIsCollapsed(BooleanFilter isCollapsed) {
        this.isCollapsed = isCollapsed;
    }

    public LongFilter getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(LongFilter categoryId) {
        this.categoryId = categoryId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final TaskCriteria that = (TaskCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(title, that.title) &&
            Objects.equals(description, that.description) &&
            Objects.equals(dueDate, that.dueDate) &&
            Objects.equals(completed, that.completed) &&
            Objects.equals(isCollapsed, that.isCollapsed) &&
            Objects.equals(categoryId, that.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        title,
        description,
        dueDate,
        completed,
        isCollapsed,
        categoryId
        );
    }

    @Override
    public String toString() {
        return "TaskCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (title != null ? "title=" + title + ", " : "") +
                (description != null ? "description=" + description + ", " : "") +
                (dueDate != null ? "dueDate=" + dueDate + ", " : "") +
                (completed != null ? "completed=" + completed + ", " : "") +
                (isCollapsed != null ? "isCollapsed=" + isCollapsed + ", " : "") +
                (categoryId != null ? "categoryId=" + categoryId + ", " : "") +
            "}";
    }

}
