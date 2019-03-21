package kolej;

import java.util.List;

import kolej.Pelajar;
 
public interface PelajarDao {

    void updatePelajar(Pelajar pelajar);
 
    void deletePelajar(Long id);
 
    Pelajar findPelajarById(Long id);
 
    List<Pelajar> findAllPelajars();
}