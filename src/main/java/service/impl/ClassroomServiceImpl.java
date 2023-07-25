package service.impl;

import entity.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClassroomRepository;
import service.ClassroomService;

import java.util.List;

@Service
public class ClassroomServiceImpl implements ClassroomService {

    @Autowired
    private ClassroomRepository repo;

    @Override
    public Classroom createClassroom(Classroom classroom) {
        return null;
    }

    @Override
    public Classroom getClassroomById(Long classroomId) {
        return null;
    }

    @Override
    public void delete(Long classroomId) {

    }

    @Override
    public Classroom update(Classroom classroom, Long classroomId) {
        return null;
    }

    @Override
    public List<Classroom> getAllClassrooms() {
        return null;
    }
}
