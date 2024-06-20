package com.ohgiraffers.section02.annotation.subsection05.inject;

import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;

@Service("pokemonServiceInject")
public class PoketmonService {

    // 1. 필드 주입 방식

    @Inject
    @Qualifier("pikachu")
    private Poketmon poketmon;

    public PoketmonService(Poketmon poketmon) {
        this.poketmon = poketmon;
    }

    public void poketmonAttack(){
        //poketmon.attack();
    }
}
