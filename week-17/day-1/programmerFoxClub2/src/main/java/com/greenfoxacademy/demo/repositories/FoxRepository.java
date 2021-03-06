package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.Fox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FoxRepository {
    private List<Fox> pack = new ArrayList<>();

    public FoxRepository() {
        pack.add(new Fox("Lucky","fish","wine"));
        pack.add(new Fox("Lefty","chicken","milk"));
        pack.add(new Fox("Hunter","mouse","water"));
        pack.add(new Fox("Bamby","cake","cacao"));
    }

    public List<Fox> getPack() {
        return pack;
    }

    public void setPack(List<Fox> pack) {
        this.pack = pack;
    }
}
