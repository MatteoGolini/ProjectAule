package service;


import entity.Classroom;

import java.util.List;

public interface ClassroomService {
    Classroom createClassroom(Classroom classroom);

    Classroom getClassroomById(Long classroomId);

    void delete(Long classroomId);

    Classroom update(Classroom classroom, Long classroomId);

    List<Classroom> getAllClassrooms();


}
