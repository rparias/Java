package org.formacion;

public class BancoAdapter implements InternationalMoneyOrganization {

    BancoNostrum bancoNostrumAPIOriginal;

    public BancoAdapter(BancoNostrum bancoNostrumAPIOriginal) {
        this.bancoNostrumAPIOriginal = bancoNostrumAPIOriginal;
    }

    @Override
    public void transfer(int cantidad, String cliente) {
        bancoNostrumAPIOriginal.movimiento(cliente, cantidad);
    }

    @Override
    public int state(String cliente) {
        Integer state = bancoNostrumAPIOriginal.estado(cliente);
        if (state == null)
            return 0;
        return state;
    }
}
