package ru.skypro.homework.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ads")
public class CommentController {

    @GetMapping("/{id}/comments")
    @PostMapping("/{id}/comments")
    @DeleteMapping("/{adId}/comments/{commentId}")
    @PatchMapping("/{adId}/comments/{commentId}")


}
