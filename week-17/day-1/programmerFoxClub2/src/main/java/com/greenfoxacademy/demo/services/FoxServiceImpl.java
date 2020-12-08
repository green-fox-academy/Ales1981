package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.Fox;
import com.greenfoxacademy.demo.models.Trick;
import com.greenfoxacademy.demo.repositories.FoxRepository;
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
        return foxRepository.getPack()
                .stream().filter(fox -> fox.getName().contains(name)).findAny().orElse(null);
    }

    @Override
    public List<Fox> showAllFoxes() {
        return foxRepository.getPack();
    }

    @Override
    public void createAndAdd(String name, String food, String drink) {
        foxRepository.getPack().add(new Fox(name, food, drink));
    }

}
