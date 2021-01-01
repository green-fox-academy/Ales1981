package com.greenfoxacademy.pfcwithusers.services;

import com.greenfoxacademy.pfcwithusers.models.Fox;
import com.greenfoxacademy.pfcwithusers.repositories.FoxRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxServiceImpl implements FoxService {
    private final FoxRepository foxRepository;

    public FoxServiceImpl(FoxRepository foxRepository) {
        this.foxRepository = foxRepository;
    }


    @Override
    public Fox showCurrentFox(String name) {
        return foxRepository.findAll()
                .stream().filter(fox -> fox.getName().contains(name)).findAny().orElse(null);
    }

    @Override
    public List<Fox> showAllFoxes() {
        return foxRepository.findAll();
    }

    @Override
    public void createAndAdd(String name, String food, String drink) {
        foxRepository.findAll().add(new Fox(name, food, drink));
    }

}

