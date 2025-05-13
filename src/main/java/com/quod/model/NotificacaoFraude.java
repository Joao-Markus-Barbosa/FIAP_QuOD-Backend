package com.quod.model;

import com.quod.dto.Dispositivo;
import com.quod.dto.Metadados;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "notificacoes_fraude")
public class NotificacaoFraude {

    @Id
    private String id;

    private String transacaoId;
    private String tipoBiometria;
    private String tipoFraude;
    private LocalDateTime dataCaptura;
    private Dispositivo dispositivo;
    private List<String> canalNotificacao;
    private String notificadoPor;
    private Metadados metadados;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTransacaoId() { return transacaoId; }
    public void setTransacaoId(String transacaoId) { this.transacaoId = transacaoId; }

    public String getTipoBiometria() { return tipoBiometria; }
    public void setTipoBiometria(String tipoBiometria) { this.tipoBiometria = tipoBiometria; }

    public String getTipoFraude() { return tipoFraude; }
    public void setTipoFraude(String tipoFraude) { this.tipoFraude = tipoFraude; }

    public LocalDateTime getDataCaptura() { return dataCaptura; }
    public void setDataCaptura(LocalDateTime dataCaptura) { this.dataCaptura = dataCaptura; }

    public Dispositivo getDispositivo() { return dispositivo; }
    public void setDispositivo(Dispositivo dispositivo) { this.dispositivo = dispositivo; }

    public List<String> getCanalNotificacao() { return canalNotificacao; }
    public void setCanalNotificacao(List<String> canalNotificacao) { this.canalNotificacao = canalNotificacao; }

    public String getNotificadoPor() { return notificadoPor; }
    public void setNotificadoPor(String notificadoPor) { this.notificadoPor = notificadoPor; }

    public Metadados getMetadados() { return metadados; }
    public void setMetadados(Metadados metadados) { this.metadados = metadados; }
}

