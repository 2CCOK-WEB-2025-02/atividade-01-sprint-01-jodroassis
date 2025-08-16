package school.sptech.sprint1_nota1.ex;

import org.springframework.web.bind.annotation.*;

@RestController
public class ExercicioAquecimentoController {

    @GetMapping("/ex-00/{numero}")
    public Boolean exercicioAquecimento(@PathVariable Integer numero) { // int não pode conter um valor null
        if (numero == null){
            return false;
        }
        return numero % 2 == 0;
    }
}
