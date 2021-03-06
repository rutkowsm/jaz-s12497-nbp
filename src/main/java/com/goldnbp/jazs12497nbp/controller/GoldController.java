package com.goldnbp.jazs12497nbp.controller;

import com.goldnbp.jazs12497nbp.entity.GoldRateQueryResult;
import com.goldnbp.jazs12497nbp.service.GoldService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nbpgold")
public class GoldController {

    public GoldService goldService;

    GoldController(GoldService goldService){
        this.goldService = goldService;
    }

    @GetMapping("/today")
    public ResponseEntity<GoldRateQueryResult> getCurrentGoldRate() {
        return ResponseEntity.ok(this.goldService.getCurrentGoldRate());
    }

    @GetMapping("/{effectiveDate}")
    public ResponseEntity<GoldRateQueryResult> getGoldRateByDate(@PathVariable String effectiveDate){
        return ResponseEntity.ok(this.goldService.getGoldRateByDate(effectiveDate));
    }
}
