package io.reis.minha_calculadora.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Controlador REST responsável pelas operações matemáticas básicas.
 * Cada endpoint aceita GET e POST e retorna um JSON com o campo "resultado".
 */
@RestController
@RequestMapping("/api")
public class MinhaCalculadoraController {

    @RequestMapping(value = "/soma", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Map<String, Double>> soma(@RequestParam double a,
                                                    @RequestParam double b) {
        Map<String, Double> resposta = new HashMap<>();
        resposta.put("resultado", a + b);
        return ResponseEntity.ok(resposta);
    }

    @RequestMapping(value = "/subtracao", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Map<String, Double>> subtracao(@RequestParam double a,
                                                         @RequestParam double b) {
        Map<String, Double> resposta = new HashMap<>();
        resposta.put("resultado", a - b);
        return ResponseEntity.ok(resposta);
    }

    @RequestMapping(value = "/multiplicacao", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Map<String, Double>> multiplicacao(@RequestParam double a,
                                                             @RequestParam double b) {
        Map<String, Double> resposta = new HashMap<>();
        resposta.put("resultado", a * b);
        return ResponseEntity.ok(resposta);
    }

    @RequestMapping(value = "/divisao", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<?> divisao(@RequestParam double a,
                                     @RequestParam double b) {
        if (b == 0.0) {
            Map<String, String> erro = new HashMap<>();
            erro.put("erro", "Divisão por zero não é permitida");
            return ResponseEntity.badRequest().body(erro);
        }
        Map<String, Double> resposta = new HashMap<>();
        resposta.put("resultado", a / b);
        return ResponseEntity.ok(resposta);
    }

    @RequestMapping(value = "/potencia", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Map<String, Double>> potencia(@RequestParam double a,
                                                        @RequestParam double b) {
        Map<String, Double> resposta = new HashMap<>();
        resposta.put("resultado", Math.pow(a, b));
        return ResponseEntity.ok(resposta);
    }
}
