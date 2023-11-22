package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.ChapterRequest;
import com.yass.studentmanagement.dto.ChapterResponse;
import com.yass.studentmanagement.entities.Chapter;

import java.util.List;

public interface ChapterService {
    public void createChapter(ChapterRequest chapter);
    public List<ChapterResponse> findAll();
    public void deleteChapter(Chapter chapter);
}
