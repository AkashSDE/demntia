package com.example.demntia;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TransactionAnalyzerController {
	 @Autowired
	    private TransactionAnalysisService transactionAnalysisService;

	    @GetMapping("/analyze")
	    public String analyzeTransactions(@RequestParam String query) throws IOException {
	        return transactionAnalysisService.analyzeTransactions(query);
	    }
}