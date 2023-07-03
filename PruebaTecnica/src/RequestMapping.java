public @interface RequestMapping {
}
public class Spring {
}
@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long> {
}

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
}
