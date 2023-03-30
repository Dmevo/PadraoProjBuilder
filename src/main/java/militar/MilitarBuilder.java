package militar;

public class MilitarBuilder {

    private Militar militar;

    public MilitarBuilder() { militar = new Militar(); }

    public Militar build() {
        if (militar.getIdentidade().equals("")) {
            throw new IllegalArgumentException("Identidade inválida");
        }
        if (militar.getCpf().equals("")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        return militar;
    }

    public MilitarBuilder setIdentidade(String identidade) {
        militar.setIdentidade(identidade);
        return this;
    }

    public MilitarBuilder setCpf(String cpf) {
        militar.setCpf(cpf);
        return this;
    }

    public MilitarBuilder setNome(String nome) {
        militar.setNome(nome);
        return this;
    }

    public MilitarBuilder setPatente(String patente) {
        militar.setPatente(patente);
        return this;
    }

    public MilitarBuilder setDataNascimento(String dataNascimento) {
        militar.setDataNascimento(dataNascimento);
        return this;
    }

    public MilitarBuilder setTipoSanguineo(String tipoSanguineo) {
        militar.setTipoSanguineo(tipoSanguineo);
        return this;
    }




}
