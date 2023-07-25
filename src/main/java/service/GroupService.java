package service;


import entity.Group;

import java.util.List;

public interface GroupService {
    Group createGroup(Group group);

    Group getGroupById(Long groupId);

    void delete(Long groupId);

    Group update(Group group, Long groupId);

    List<Group> getAllGroups();


}
