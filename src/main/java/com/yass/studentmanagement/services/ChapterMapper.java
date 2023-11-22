package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.ChapterRequest;
import com.yass.studentmanagement.dto.ChapterResponse;
import com.yass.studentmanagement.entities.Chapter;
import org.springframework.stereotype.Service;

@Service
public class ChapterMapper {

    public Chapter toChapter(ChapterRequest chapterRequest){
        Chapter chapter = new Chapter();
        chapter.setName(chapterRequest.getName());
        return chapter;
    }

    public ChapterResponse toChapterResponse(Chapter chapter){
        var chapterResponse = ChapterResponse.builder()
                .id(chapter.getId())
                .name(chapter.getName())
                .build();
        return chapterResponse;
    }
}
