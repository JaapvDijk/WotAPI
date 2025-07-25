package com.learningjava.wotapi.api.controller;

import com.learningjava.wotapi.api.model.dto.PlayerInfoPlayerRequest;
import com.learningjava.wotapi.api.model.dto.PlayerSearchPlayerRequest;
import com.learningjava.wotapi.api.model.worldoftanks.dto.PlayerResponse;
import com.learningjava.wotapi.api.service.PlayerService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<PlayerResponse>> search(@Valid @ModelAttribute PlayerSearchPlayerRequest request)
    {
        var result = playerService.getPlayers(request.getName());

        return ResponseEntity.ok(result);
    }

    @GetMapping("/info/{id}")
    public ResponseEntity<String> getPlayer(@Valid @ModelAttribute PlayerInfoPlayerRequest request)
    {
        var result = playerService.getPlayerInfo(request.getId());

        if (Objects.isNull(result))
        {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(result);
    }
}
