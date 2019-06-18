package com.ojas.controller;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web3j.crypto.CipherException;

import com.ojas.model.BlockchainTransaction;
import com.ojas.service.BlockchainService;

@RestController
@RequestMapping("/ethereum")
public class EthereumBlockchainExplorer {
	@Autowired
	BlockchainService service;

	@PostMapping("/transaction")
	public BlockchainTransaction execute(@RequestBody BlockchainTransaction transaction)
			throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException,
			CipherException, IOException {

		return service.process(transaction);
	}
}
