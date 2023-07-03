@RestController
@RequestMapping("/examenes")
public class ExamenController {
    private final ExamenRepository examenRepository;

    public ExamenController(ExamenRepository examenRepository) {
        this.examenRepository = examenRepository;
    }

    @PostMapping
    public Examen crearExamen(@RequestBody Examen examen) {
        return examenRepository.save(examen);
    }

    // Otros métodos del controlador
}

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    private final EstudianteRepository estudianteRepository;

    public EstudianteController(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    // Otros métodos del controlador
}

// Otros controladores para las demás entidades
