package br.com.lrfoods.pagamentos.repository;

import br.com.lrfoods.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
