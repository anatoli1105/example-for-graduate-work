package ru.skypro.homework.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AnnouncementsController {
@GetMapping("/ads")
 @PostMapping("/ads")
    @GetMapping("/ads/{id}")
    @DeleteMapping("/ads/{id}")
    @PatchMapping("ads/{}ad")
    @GetMapping("/ads/me")
    @PatchMapping("/ads/{id}/image")

}
