package com.adc2018.bpmhw3.api.entity;

import com.adc2018.bpmhw3.api.entity.list.RecommendList;
import com.adc2018.bpmhw3.util.MapSort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class FriendMap {

    private static final Logger logger = LoggerFactory.getLogger(FriendMap.class);

    private User root;
    private Map<User, Set<User>> map;

    public User getRoot() {
        return root;
    }

    public void setRoot(User root) {
        this.root = root;
    }

    public Map<User, Set<User>> getMap() {
        return map;
    }

    public void setMap(Map<User, Set<User>> map) {
        this.map = map;
    }



    private Set<User> set = null;
    private Map<User, Integer> apprearance = null;

    private void dfs(User user) {
        set.add(user);
        Set<User> friends = map.getOrDefault(user, new HashSet<>());
        for(User u: friends) {
            if(user != root && !map.getOrDefault(root, new HashSet<>()).contains(user)) {
                apprearance.put(user, apprearance.getOrDefault(user, 0) + 1);
            }
            if(set.contains(u)) continue;
            dfs(u);
        }

    }
    public RecommendList recommend() {
        set = new HashSet<>();
        apprearance = new HashMap<>();
        dfs(root);
        apprearance = MapSort.sortByValue(apprearance);

        RecommendList recommendList = new RecommendList();
        List<Recommend> recommends = new ArrayList<>();
        for(User u: apprearance.keySet()) {
            recommends.add(Recommend.Factory(u, apprearance.get(u)));
        }
        recommendList.setRecommendList(recommends);
        return recommendList;
    }

    @Override
    public String toString() {
        return "FriendMap{" +
                "root=" + root +
                ", map=" + map +
                '}';
    }
}
