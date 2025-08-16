package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        // limpar a palavra
        String palindromo = palavra.replace(" ","").toLowerCase();
        for (int i = 0; i < palindromo.length() / 2; i++) {
            if (palindromo.charAt(i) != palindromo.charAt(palindromo.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
