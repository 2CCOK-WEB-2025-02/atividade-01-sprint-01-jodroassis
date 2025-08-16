package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        if (n == 0 || n < 0){
            return new ExercicioDificilResponse(0,0);
        }

        if (n == 1){
            return new ExercicioDificilResponse(1,1);
        }

        int termoAnterior = 0;
        int termoAtual = 1;
        int proxTermo = 0;

        int soma = 1;

        for (int i = 2; i <= n; i++) {
            proxTermo = termoAnterior + termoAtual;
            soma += proxTermo;
            termoAnterior = termoAtual;
            termoAtual = proxTermo;

        }

        return new ExercicioDificilResponse(proxTermo, soma);
    }
}
