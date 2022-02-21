package guo.proj.javao2o.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import guo.proj.javao2o.entity.Area;

import java.util.List;

public interface AreaService {
    public static final String AREALISTKEY = "arealist";

    /**
     * 
     *
     * @return
     */
    List<Area> getAreaList() throws JsonProcessingException;


}
