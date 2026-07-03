package com.company.portal.service;

import com.company.portal.model.Announcement;
import com.company.portal.model.Employee;
import com.company.portal.model.Holiday;
import com.company.portal.model.Policy;
import org.springframework.stereotype.Service;

import java.time.Month;
import java.util.List;

@Service
public class PortalContentService {

    public String getCompanyName() {
        return "Company Intranet Portal";
    }

    public String getCompanyTagline() {
        return "Connecting people, information, and services for a stronger workplace.";
    }

    public List<String> getAboutParagraphs() {
        return List.of(
                "Our company is committed to building a collaborative environment where every team member can thrive.",
                "We support innovation, transparency, and employee well-being through clear policies and reliable communication.",
                "This intranet portal provides fast access to announcements, HR resources, and IT support for our workforce."
        );
    }

    public List<String> getCompanyValues() {
        return List.of("Integrity", "Teamwork", "Customer Focus", "Continuous Improvement");
    }

    public List<Policy> getPolicies() {
        return List.of(
                new Policy("Remote Work Guidelines", "Employees may work remotely with manager approval and must stay connected via company tools."),
                new Policy("Leave Request Process", "Submit planned leave requests through HR and provide required documentation for extended absence."),
                new Policy("Expense Reimbursement", "Use the expense portal for business-related expenses and retain receipts for review."),
                new Policy("Code of Conduct", "Maintain professionalism, respect colleagues, and follow company policies during all workplace interactions.")
        );
    }

    public List<Holiday> getHolidayCalendar() {
        return List.of(
                new Holiday(Month.JANUARY, 1, "New Year’s Day"),
                new Holiday(Month.MAY, 1, "Labor Day"),
                new Holiday(Month.DECEMBER, 25, "Christmas Day"),
                new Holiday(Month.NOVEMBER, 28, "Company Holiday"));
    }

    public List<Announcement> getLatestAnnouncements() {
        return List.of(
                new Announcement("New intranet features launched", "Check the HR policies page for streamlined forms and updated support contacts."),
                new Announcement("Wellness program registration", "Sign up for the upcoming wellness workshops available to all employees."),
                new Announcement("Quarterly all-hands meeting", "Join the virtual session next Friday for department updates and leadership insights.")
        );
    }

    public List<Employee> getEmployeeDirectory() {
        return List.of(
                new Employee("Alicia Roberts", "HR Manager", "Human Resources"),
                new Employee("Marcus Chen", "IT Support Lead", "Information Technology"),
                new Employee("Priya Patel", "Operations Coordinator", "Operations"),
                new Employee("Jamal Carter", "Marketing Specialist", "Marketing")
        );
    }

    public List<String> getPolicyHighlights() {
        return List.of(
                "Review the leave policy before submitting requests.",
                "Keep your business expenses aligned with company guidelines.",
                "Report IT issues through the contact page for a timely response."
        );
    }

    public String getContactPhone() {
        return "+1 (800) 555-0123";
    }

    public String getContactEmail() {
        return "it-support@companyportal.example";
    }

    public String getContactLocation() {
        return "Building B, 2nd Floor, IT Service Center";
    }

    public String getSupportHours() {
        return "Monday to Friday, 8:30 AM – 5:30 PM";
    }
}
