package tn.esprit.tpfoyer.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.repository.EtudiantRepository;

import java.util.*;

@ExtendWith(MockitoExtension.class)
class EtudiantServiceImplTest {
    @Mock
    EtudiantRepository er;


  @InjectMocks
  EtudiantServiceImpl es;


  Etudiant etudiant = new Etudiant("Fertani", "Youssef", 12345678, new Date(2000, 8, 23));
    List<Etudiant> etudiants = new ArrayList<>() {
        {
            add(new Etudiant("Doe", "John", 123456789, new Date(2000, 1, 15)));
            add(new Etudiant("Smith", "Alice", 987654321, new Date(1999, 5, 10)));
            add(new Etudiant("Brown", "James", 456789123, new Date(2001, 8, 25)));
        }
    };

    @Test
    void testrecupererEtudiantParCin() {
        Mockito.when(er.findById(Mockito.anyLong())).thenReturn(Optional.of(etudiant));
        Etudiant etudiant1=es.recupererEtudiantParCin(123456789);
        Assertions.assertNotNull(etudiant1);

    }

}
