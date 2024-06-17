package com.mmi.learningProject.controller;

import com.mmi.learningProject.model.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

@RequestMapping("/journal")

public class HealthCheck {
    @Autowired
    JournalEntry journalEntry;

//    public String healthCheck() {
//        return "Ok";
//    }

    private Map<Long, JournalEntry> journalEntries = new HashMap();

    @GetMapping
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    }

    @GetMapping("/id/{id}")

    public JournalEntry getEntryById(@PathVariable long id) {

        return journalEntries.get(id);
    }

    @PostMapping
    public void createEntry(@RequestBody JournalEntry myEntry) {
        journalEntries.put(myEntry.getId(), myEntry);

    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable long id) {
        journalEntries.remove(id);
    }
@PutMapping("/id/{id}")
    public  void updateByValue(@PathVariable long id,@RequestBody  JournalEntry journalEntry){
        journalEntries.put(id,journalEntry);

}

}
