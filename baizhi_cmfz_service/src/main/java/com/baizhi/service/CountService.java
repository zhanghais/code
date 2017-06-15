package com.baizhi.service;

import com.baizhi.entity.Count;

import javax.ws.rs.PathParam;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
public interface CountService {
    HashMap<String, Object> save(Count count);
    HashMap<String, Object> delete(String id);
    HashMap<String, Object> update(Count count);
    HashMap<String, Object> queryBy(String userid,String learnid);
}
