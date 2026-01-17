package com.fftech.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Lista todas as missões
    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    // Listar todas as missoes por ID
    public MissoesModel listarMissoesPorId(Long id) {
        Optional<MissoesModel> missoesPorId = missoesRepository.findById(id);
        return missoesPorId.orElse(null);
    }

    // Inseri uma missao nova
    public MissoesModel criarMissao(MissoesModel missao) {
        return missoesRepository.save(missao);
    }

    // Deletar o ninja - tem que ser um metodo VOID
    public void deletarNissoesPorId(Long id) { missoesRepository.deleteById(id); }

}
