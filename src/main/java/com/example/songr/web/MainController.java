package com.example.songr.web;

import com.example.songr.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class MainController {

    @GetMapping("/hello")
    void helloWorld(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
    }

    @GetMapping("/capitalize/{word}")
    String capitalize(@PathVariable String word, Model model) {
        String Capitalizer = word.toUpperCase(Locale.ROOT);
        model.addAttribute("word", Capitalizer);
        return "capitalize";
    }

    @GetMapping("/albums")
    String getAllAlbums(Model model) {

        List<Album> albums = new ArrayList<>();
        albums.add(new Album("Enemy with JID", "JID", 10, 300, "./static/assets/C4192189.jpg"));
        albums.add(new Album("Enemy with JID", "JID", 10, 300, "./static/assets/C4192189.jpg"));
        albums.add(new Album("Enemy with JID", "JID", 10, 300, "./static/assets/C4192189.jpg"));

        model.addAttribute("albums", albums);

        return "albums";
    }
}
