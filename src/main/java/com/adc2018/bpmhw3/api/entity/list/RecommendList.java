package com.adc2018.bpmhw3.api.entity.list;

import com.adc2018.bpmhw3.api.entity.Recommend;

import java.util.List;

public class RecommendList {

    private List<Recommend> recommendList;

    public List<Recommend> getRecommendList() {
        return recommendList;
    }

    public void setRecommendList(List<Recommend> recommendList) {
        this.recommendList = recommendList;
    }


    @Override
    public String toString() {
        return "RecommendList{" +
                "recommendList=" + recommendList +
                '}';
    }
}
