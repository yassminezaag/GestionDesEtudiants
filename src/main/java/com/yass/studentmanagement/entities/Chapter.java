package com.yass.studentmanagement.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chapter extends AuditModel{
    private String name;
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    @JsonBackReference
    private Course course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapter chapter = (Chapter) o;
        return Objects.equals(name, chapter.name) && Objects.equals(course, chapter.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
