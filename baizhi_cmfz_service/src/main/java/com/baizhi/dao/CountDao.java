package com.baizhi.dao;

import com.baizhi.entity.Count;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
public interface CountDao {
    void save(Count count);
    void delete(String id);
    void update(Count count);
    List<Count> queryBy(@Param("learnid")String learnid, @Param("userid")String userid);
}
