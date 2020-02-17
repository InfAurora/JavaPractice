/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.testing.dao.implementations;

import com.sg.testing.dao.MonsterDao;
import com.sg.testing.dao.implementations.buggy.BadMonsterDaoA;
import com.sg.testing.model.Monster;
import static com.sg.testing.model.MonsterType.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jose
 */
public class AGoodMonsterDaoTest {
    
    public AGoodMonsterDaoTest() {
    }
    MonsterDao dao = new BadMonsterDaoA();
    @Test
    public void testAdd() {
        Monster monster1 = new Monster("Joe", YETI, 30, "pizza");
        Monster result = dao.addMonster(001, monster1);
        Monster get = dao.getMonster(001);
        assertEquals(result, get);
    }
    
    @Test
    public void testGet() {
        Monster monster2 = new Monster("Hellen", VAMPIRE, 22, "pie");
        Monster result = dao.addMonster(002, monster2);
        Monster get = dao.getMonster(002);
        assertEquals(get, monster2);
    }
    
    @Test
    public void testGetAll() {
        Monster monster1 = new Monster("Joe", YETI, 30, "pizza");
        Monster result = dao.addMonster(001, monster1);
        
        Monster monster2 = new Monster("Hellen", VAMPIRE, 22, "pie");
        Monster result2 = dao.addMonster(002, monster2);
        
        Monster monster3 = new Monster("Ken", LIZARDMAN, 12, "Lasagna");
        Monster result3 = dao.addMonster(003, monster3);
        
        List<Monster> all = dao.getAllMonsters();
        assertEquals(all.size(), 3);
        assertEquals(all.get(0), monster1);
        assertEquals(all.get(1), monster2);
        assertEquals(all.get(2), monster3);
    }
    
}
