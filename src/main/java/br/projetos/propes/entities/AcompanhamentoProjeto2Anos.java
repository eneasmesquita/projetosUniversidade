/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projetos.propes.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eneas
 */
@Entity
@Table(catalog = "universidade", schema = "propes", name = "acompanhamento_projeto_2_anos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findAll", query = "SELECT a FROM AcompanhamentoProjeto2Anos a"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findById", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.id = :id"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDataExpiracaoProjeto", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.dataExpiracaoProjeto = :dataExpiracaoProjeto"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDataExpiracaoRp1", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.dataExpiracaoRp1 = :dataExpiracaoRp1"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDataExpiracaoRp2", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.dataExpiracaoRp2 = :dataExpiracaoRp2"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDataExpiracaoRp3", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.dataExpiracaoRp3 = :dataExpiracaoRp3"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDataExpiracaoRf", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.dataExpiracaoRf = :dataExpiracaoRf"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail30DiasRp1", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail30DiasRp1 = :disparoEmail30DiasRp1"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail15DiasRp1", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail15DiasRp1 = :disparoEmail15DiasRp1"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail5DiasRp1", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail5DiasRp1 = :disparoEmail5DiasRp1"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail30DiasRp2", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail30DiasRp2 = :disparoEmail30DiasRp2"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail15DiasRp2", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail15DiasRp2 = :disparoEmail15DiasRp2"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail5DiasRp2", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail5DiasRp2 = :disparoEmail5DiasRp2"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail30DiasRp3", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail30DiasRp3 = :disparoEmail30DiasRp3"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail15DiasRp3", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail15DiasRp3 = :disparoEmail15DiasRp3"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail5DiasRp3", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail5DiasRp3 = :disparoEmail5DiasRp3"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail30DiasRf", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail30DiasRf = :disparoEmail30DiasRf"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail15DiasRf", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail15DiasRf = :disparoEmail15DiasRf"),
    @NamedQuery(name = "AcompanhamentoProjeto2Anos.findByDisparoEmail5DiasRf", query = "SELECT a FROM AcompanhamentoProjeto2Anos a WHERE a.disparoEmail5DiasRf = :disparoEmail5DiasRf")})
public class AcompanhamentoProjeto2Anos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_expiracao_projeto")
    @Temporal(TemporalType.DATE)
    private Date dataExpiracaoProjeto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_expiracao_rp1")
    @Temporal(TemporalType.DATE)
    private Date dataExpiracaoRp1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_expiracao_rp2")
    @Temporal(TemporalType.DATE)
    private Date dataExpiracaoRp2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_expiracao_rp3")
    @Temporal(TemporalType.DATE)
    private Date dataExpiracaoRp3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_expiracao_rf")
    @Temporal(TemporalType.DATE)
    private Date dataExpiracaoRf;
    @Column(name = "disparo_email_30_dias_rp1")
    private Boolean disparoEmail30DiasRp1;
    @Column(name = "disparo_email_15_dias_rp1")
    private Boolean disparoEmail15DiasRp1;
    @Column(name = "disparo_email_5_dias_rp1")
    private Boolean disparoEmail5DiasRp1;
    @Column(name = "disparo_email_30_dias_rp2")
    private Boolean disparoEmail30DiasRp2;
    @Column(name = "disparo_email_15_dias_rp2")
    private Boolean disparoEmail15DiasRp2;
    @Column(name = "disparo_email_5_dias_rp2")
    private Boolean disparoEmail5DiasRp2;
    @Column(name = "disparo_email_30_dias_rp3")
    private Boolean disparoEmail30DiasRp3;
    @Column(name = "disparo_email_15_dias_rp3")
    private Boolean disparoEmail15DiasRp3;
    @Column(name = "disparo_email_5_dias_rp3")
    private Boolean disparoEmail5DiasRp3;
    @Column(name = "disparo_email_30_dias_rf")
    private Boolean disparoEmail30DiasRf;
    @Column(name = "disparo_email_15_dias_rf")
    private Boolean disparoEmail15DiasRf;
    @Column(name = "disparo_email_5_dias_rf")
    private Boolean disparoEmail5DiasRf;
    @JoinColumn(name = "projeto", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Projeto projeto;

    public AcompanhamentoProjeto2Anos() {
    }

    public AcompanhamentoProjeto2Anos(Integer id) {
        this.id = id;
    }

    public AcompanhamentoProjeto2Anos(Integer id, Date dataExpiracaoProjeto, Date dataExpiracaoRp1, Date dataExpiracaoRp2, Date dataExpiracaoRp3, Date dataExpiracaoRf) {
        this.id = id;
        this.dataExpiracaoProjeto = dataExpiracaoProjeto;
        this.dataExpiracaoRp1 = dataExpiracaoRp1;
        this.dataExpiracaoRp2 = dataExpiracaoRp2;
        this.dataExpiracaoRp3 = dataExpiracaoRp3;
        this.dataExpiracaoRf = dataExpiracaoRf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataExpiracaoProjeto() {
        return dataExpiracaoProjeto;
    }

    public void setDataExpiracaoProjeto(Date dataExpiracaoProjeto) {
        this.dataExpiracaoProjeto = dataExpiracaoProjeto;
    }

    public Date getDataExpiracaoRp1() {
        return dataExpiracaoRp1;
    }

    public void setDataExpiracaoRp1(Date dataExpiracaoRp1) {
        this.dataExpiracaoRp1 = dataExpiracaoRp1;
    }

    public Date getDataExpiracaoRp2() {
        return dataExpiracaoRp2;
    }

    public void setDataExpiracaoRp2(Date dataExpiracaoRp2) {
        this.dataExpiracaoRp2 = dataExpiracaoRp2;
    }

    public Date getDataExpiracaoRp3() {
        return dataExpiracaoRp3;
    }

    public void setDataExpiracaoRp3(Date dataExpiracaoRp3) {
        this.dataExpiracaoRp3 = dataExpiracaoRp3;
    }

    public Date getDataExpiracaoRf() {
        return dataExpiracaoRf;
    }

    public void setDataExpiracaoRf(Date dataExpiracaoRf) {
        this.dataExpiracaoRf = dataExpiracaoRf;
    }

    public Boolean getDisparoEmail30DiasRp1() {
        return disparoEmail30DiasRp1;
    }

    public void setDisparoEmail30DiasRp1(Boolean disparoEmail30DiasRp1) {
        this.disparoEmail30DiasRp1 = disparoEmail30DiasRp1;
    }

    public Boolean getDisparoEmail15DiasRp1() {
        return disparoEmail15DiasRp1;
    }

    public void setDisparoEmail15DiasRp1(Boolean disparoEmail15DiasRp1) {
        this.disparoEmail15DiasRp1 = disparoEmail15DiasRp1;
    }

    public Boolean getDisparoEmail5DiasRp1() {
        return disparoEmail5DiasRp1;
    }

    public void setDisparoEmail5DiasRp1(Boolean disparoEmail5DiasRp1) {
        this.disparoEmail5DiasRp1 = disparoEmail5DiasRp1;
    }

    public Boolean getDisparoEmail30DiasRp2() {
        return disparoEmail30DiasRp2;
    }

    public void setDisparoEmail30DiasRp2(Boolean disparoEmail30DiasRp2) {
        this.disparoEmail30DiasRp2 = disparoEmail30DiasRp2;
    }

    public Boolean getDisparoEmail15DiasRp2() {
        return disparoEmail15DiasRp2;
    }

    public void setDisparoEmail15DiasRp2(Boolean disparoEmail15DiasRp2) {
        this.disparoEmail15DiasRp2 = disparoEmail15DiasRp2;
    }

    public Boolean getDisparoEmail5DiasRp2() {
        return disparoEmail5DiasRp2;
    }

    public void setDisparoEmail5DiasRp2(Boolean disparoEmail5DiasRp2) {
        this.disparoEmail5DiasRp2 = disparoEmail5DiasRp2;
    }

    public Boolean getDisparoEmail30DiasRp3() {
        return disparoEmail30DiasRp3;
    }

    public void setDisparoEmail30DiasRp3(Boolean disparoEmail30DiasRp3) {
        this.disparoEmail30DiasRp3 = disparoEmail30DiasRp3;
    }

    public Boolean getDisparoEmail15DiasRp3() {
        return disparoEmail15DiasRp3;
    }

    public void setDisparoEmail15DiasRp3(Boolean disparoEmail15DiasRp3) {
        this.disparoEmail15DiasRp3 = disparoEmail15DiasRp3;
    }

    public Boolean getDisparoEmail5DiasRp3() {
        return disparoEmail5DiasRp3;
    }

    public void setDisparoEmail5DiasRp3(Boolean disparoEmail5DiasRp3) {
        this.disparoEmail5DiasRp3 = disparoEmail5DiasRp3;
    }

    public Boolean getDisparoEmail30DiasRf() {
        return disparoEmail30DiasRf;
    }

    public void setDisparoEmail30DiasRf(Boolean disparoEmail30DiasRf) {
        this.disparoEmail30DiasRf = disparoEmail30DiasRf;
    }

    public Boolean getDisparoEmail15DiasRf() {
        return disparoEmail15DiasRf;
    }

    public void setDisparoEmail15DiasRf(Boolean disparoEmail15DiasRf) {
        this.disparoEmail15DiasRf = disparoEmail15DiasRf;
    }

    public Boolean getDisparoEmail5DiasRf() {
        return disparoEmail5DiasRf;
    }

    public void setDisparoEmail5DiasRf(Boolean disparoEmail5DiasRf) {
        this.disparoEmail5DiasRf = disparoEmail5DiasRf;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcompanhamentoProjeto2Anos)) {
            return false;
        }
        AcompanhamentoProjeto2Anos other = (AcompanhamentoProjeto2Anos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.projetosUERR.propes.entities.AcompanhamentoProjeto2Anos[ id=" + id + " ]";
    }
    
}
