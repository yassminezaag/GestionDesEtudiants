package com.yass.studentmanagement.services;

import com.yass.studentmanagement.dto.ChapterRequest;
import com.yass.studentmanagement.dto.ChapterResponse;
import com.yass.studentmanagement.entities.Chapter;
import com.yass.studentmanagement.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChapterServiceImp implements ChapterService{
    @Autowired
    private ChapterRepository chapterRepository;
    @Autowired
    private ChapterMapper chapterMapper;
    @Override
    public void createChapter(ChapterRequest chapterRequest) {

         chapterRepository.save(chapterMapper.toChapter(chapterRequest));
    }

    @Override
    public List<ChapterResponse> findAll() {
        return chapterRepository.findAll()
                .stream()
                .map(chapterMapper::toChapterResponse)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteChapter(Chapter chapter) {
        chapterRepository.delete(chapter);
    }
}
