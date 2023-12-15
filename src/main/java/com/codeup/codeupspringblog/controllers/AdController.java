package com.codeup.codeupspringblog.controllers;


//import com.codeup.codeupspringblog.dao.AdDao;
import com.codeup.codeupspringblog.models.Ad;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
//@AllArgsConstructor
@Controller
//@RequestMapping("/ads")
public class AdController {

    Ad ad = new Ad("Amazing new product!", "The everything thing will solve all your problems! It will clean your floors, wash your dishes, cook your dinner, and walk your dog!");
    Ad ad2 = new Ad("Latest flying car", "This new flying car will take off above traffic and save you time on your morning commute! No pilot license required!");
    Ad ad3 = new Ad("Sunshine in a bottle", "Captured sunlight in a convenient recyclable bottle for all your natural lighting needs!");
    List<Ad> ads = new ArrayList<>(List.of(ad, ad2, ad3));

    @GetMapping("/ads")
    public String showAllAds(Model model){
        model.addAttribute("ads", ads);
        return "/ads/index";
    }
    @GetMapping("/ads/create")
    public String showCreateAdForm(){
        return "/ads/create";
    }

    @PostMapping("/ads/create")
    public String handleAdSubmission(@RequestParam(name = "title") String title, @RequestParam(name = "description") String description){
        ads.add(new Ad(title, description));
        return "redirect:/ads";
    }






//    private AdDao adDao;
//
//    @GetMapping(value = {"", "/"})
//    public String adIndex(Model model){
////        List<Ad> ads = adDao.findAll();
//        model.addAttribute("ads", adDao.findAll());
//        return "/ads/index";
//    }
//    @GetMapping({"/{id}", "/{id}/"})
//    public String showAd(@PathVariable long id,
//                         Model model) {
////        model.addAttribute("ad", ad2);
//        Ad ad;
//        if (adDao.findById(id).isPresent()){
//            ad = adDao.findById(id).get();
//        } else {
//            ad = new Ad("Ad not found", "");
//        }
//        model.addAttribute("ad", ad);
//        return "/ads/show";
//    }
//
//    @GetMapping({"/create", "/create/"})
//    public String showCreate() {
//        return "/ads/create";
//    }
//    @PostMapping({"/create", "/create/"})
//    public String doCreate(@RequestParam(name="title") String title,
//                           @RequestParam(name = "description") String description) {
//        Ad ad = new Ad(title, description);
//        adDao.save(ad);
//        return "redirect:/ads";
//    }

}
