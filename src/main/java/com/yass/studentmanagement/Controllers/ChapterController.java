package com.yass.studentmanagement.Controllers;

import com.yass.studentmanagement.dto.ChapterRequest;
import com.yass.studentmanagement.dto.ChapterResponse;
import com.yass.studentmanagement.entities.Chapter;
import com.yass.studentmanagement.services.ChapterMapper;
import com.yass.studentmanagement.services.ChapterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chapters")
public class ChapterController {
    @Autowired
    private ChapterService chapterService;

    @PostMapping("/add")
    private void create(@RequestBody @Valid ChapterRequest chapterRequest){
         chapterService.createChapter(chapterRequest);
    }

    @GetMapping("/getall")
    private List<ChapterResponse> findAll(){
        return chapterService.findAll();
    }
}
