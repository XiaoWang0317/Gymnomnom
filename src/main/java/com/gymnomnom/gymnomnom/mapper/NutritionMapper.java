package com.gymnomnom.gymnomnom.mapper;

import com.gymnomnom.gymnomnom.pojo.Diet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NutritionMapper {
    /**
     * Input nurition data to database
     * @param diet object
     */
    @Insert("insert into diet_table (id, date, age, fat, vc, va, calories, protein, carbs, gender) values " +
            "(#{id}, #{date}, #{age}, #{fat}, #{vc}, #{va}, #{calories}, #{protein}, #{carbs}, #{gender})")
    void inputDiet(Diet diet);
}