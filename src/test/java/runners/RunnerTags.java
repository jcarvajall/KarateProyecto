package runners;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.Runner.Builder;

public class RunnerTags {

    public static void main(String[] args) {
        // Construir el objeto Runner y especificar la ubicación de la característica
        Builder builder = Runner.builder();
        builder.path("classpath:features");
        // Ejecutar las pruebas y obtener los resultados
        Results results = builder.parallel(1);
        System.out.println(results.getErrorMessages());
        System.exit(results.getErrorMessages().isEmpty() ? 0 : 1);
    }
}
