package service.impl;

import entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.GroupRepository;
import service.GroupService;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository repo;

    @Override
    public Group createGroup(Group group) {
        return null;
    }

    @Override
    public Group getGroupById(Long groupId) {
        return null;
    }

    @Override
    public void delete(Long groupId) {

    }

    @Override
    public Group update(Group group, Long groupId) {
        return null;
    }

    @Override
    public List<Group> getAllGroups() {
        return null;
    }
}
