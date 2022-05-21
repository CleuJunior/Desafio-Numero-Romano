package com.example.challenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/search")
public class ChallengerController {

    private final ChallengerService challengeService;

    @Autowired
    public ChallengerController(ChallengerService challengeService) { this.challengeService = challengeService; }

    @GetMapping
    public ResponseEntity<List<ChallengerDTO>> listChallenger () {
        return ResponseEntity.ok()
                .body(challengeService.findAllChallengerText());

    }

    @PostMapping
    public ResponseEntity<Challenger> addText (@RequestBody Challenger challenger) {
        Challenger ch = challengeService.insertText(challenger);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(ch.getId()).toUri();

        return ResponseEntity.created(uri).body(ch);

    }


}
