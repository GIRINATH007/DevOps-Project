package com.company.portal.controller;

import com.company.portal.service.PortalContentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final PortalContentService contentService;

    public HomeController(PortalContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Home");
        model.addAttribute("companyName", contentService.getCompanyName());
        model.addAttribute("tagline", contentService.getCompanyTagline());
        model.addAttribute("announcements", contentService.getLatestAnnouncements());
        model.addAttribute("holidays", contentService.getHolidayCalendar());
        model.addAttribute("directory", contentService.getEmployeeDirectory());
        model.addAttribute("policyHighlights", contentService.getPolicyHighlights());
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "About Company");
        model.addAttribute("companyName", contentService.getCompanyName());
        model.addAttribute("aboutParagraphs", contentService.getAboutParagraphs());
        model.addAttribute("companyValues", contentService.getCompanyValues());
        return "about";
    }

    @GetMapping("/policies")
    public String policies(Model model) {
        model.addAttribute("pageTitle", "HR Policies");
        model.addAttribute("companyName", contentService.getCompanyName());
        model.addAttribute("policies", contentService.getPolicies());
        return "policies";
    }

    @GetMapping("/holidays")
    public String holidays(Model model) {
        model.addAttribute("pageTitle", "Holiday Calendar");
        model.addAttribute("companyName", contentService.getCompanyName());
        model.addAttribute("holidays", contentService.getHolidayCalendar());
        return "holidays";
    }

    @GetMapping("/announcements")
    public String announcements(Model model) {
        model.addAttribute("pageTitle", "Company Announcements");
        model.addAttribute("companyName", contentService.getCompanyName());
        model.addAttribute("announcements", contentService.getLatestAnnouncements());
        return "announcements";
    }

    @GetMapping("/directory")
    public String directory(Model model) {
        model.addAttribute("pageTitle", "Employee Directory");
        model.addAttribute("companyName", contentService.getCompanyName());
        model.addAttribute("directory", contentService.getEmployeeDirectory());
        return "directory";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("pageTitle", "Contact IT");
        model.addAttribute("companyName", contentService.getCompanyName());
        model.addAttribute("contactPhone", contentService.getContactPhone());
        model.addAttribute("contactEmail", contentService.getContactEmail());
        model.addAttribute("contactLocation", contentService.getContactLocation());
        model.addAttribute("supportHours", contentService.getSupportHours());
        return "contact";
    }
}
