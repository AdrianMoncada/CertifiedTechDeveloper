public class CajeroService implements ICajeroService{
    private AutenticationService autenticationService;
    private CuentaService cuentaService;
    private CajaService cajaService;

    public CajeroService(AutenticationService autenticationService, CuentaService cuentaService, CajaService cajaService) {
        this.autenticationService = autenticationService;
        this.cuentaService = cuentaService;
        this.cajaService = cajaService;
    }

    @Override
    public void retirarDinero(String dni, String password, Integer saldoARetirar) {
        if(autenticationService.validarUsuarioYContrasena(dni,password)){
            System.out.println("Se encontró DNI y Password en base de datos.");
            cuentaService.getCuenta(dni);
            cajaService.entregarDinero(saldoARetirar);
        }
    else {
            System.out.println("DNI y Password no encontrados en base de datos.");
        }
    }
}
