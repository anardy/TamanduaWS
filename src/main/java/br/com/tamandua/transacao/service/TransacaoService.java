package br.com.tamandua.transacao.service;

import java.util.List;

import br.com.tamandua.transacao.entities.ContaEntity;
import br.com.tamandua.transacao.entities.HistTransacaoEntity;

public interface TransacaoService {

	public List<ContaEntity> buscarConta(Integer nroConta);
	public String inserirTransferencia(Integer nrocontaConcedente, String senhaConcedente, Double valor, Integer nrocontaBeneficiado);
	public boolean validaSenha(Integer nroConta, String senha);
	public boolean atualizaSaldoConta(Integer nroConta, Double valor);
	public List<HistTransacaoEntity> extrairExtrato(Integer nroConta);
	public String autentica(Integer nroConta, String senha);
}