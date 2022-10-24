/**
 * 
 */
package com.zone.david.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.zone.david.projectjsf.entity.*;

/**
 * @author DavidZoN3 
 * Clase que permite realizar la logica de negocio para Empleados.
 *
 */
public class EmpleadoService {
/*
 * Metodo que permite consultar la lista de empleados de empresas de IT.
 * @return {@link Empleado} lista de empleados.
 */
	public List<Empleado> consultarEmpleados() {
		// generar la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();

		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		Empleado empleadoIBM2 = new Empleado();
		Empleado empleadoMicrosoft2 = new Empleado();
		Empleado empleadoApple2 = new Empleado();
		Empleado empleadoIBM3 = new Empleado();
		Empleado empleadoMicrosoft3 = new Empleado();
		Empleado empleadoApple3 = new Empleado();

		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("López");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Jesús");
		empleadoMicrosoft.setPrimerApellido("López");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("López");
		empleadoApple.setSegundoApellido("Romero");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(false);
		
		empleadoIBM2.setNombre("David");
		empleadoIBM2.setPrimerApellido("Paniagua");
		empleadoIBM2.setSegundoApellido("López");
		empleadoIBM2.setPuesto("Senior Developer Java");
		empleadoIBM2.setEstatus(true);
		
		empleadoMicrosoft2.setNombre("Jorge");
		empleadoMicrosoft2.setPrimerApellido("López");
		empleadoMicrosoft2.setSegundoApellido("Romero");
		empleadoMicrosoft2.setPuesto("CEO");
		empleadoMicrosoft2.setEstatus(true);
		
		empleadoApple3.setNombre("Juan");
		empleadoApple3.setPrimerApellido("López");
		empleadoApple3.setSegundoApellido("Romero");
		empleadoApple3.setPuesto("Architect");
		empleadoApple3.setEstatus(false);
		
		empleadoIBM3.setNombre("Christian");
		empleadoIBM3.setPrimerApellido("Paniagua");
		empleadoIBM3.setSegundoApellido("López");
		empleadoIBM3.setPuesto("Senior Developer Java");
		empleadoIBM3.setEstatus(true);
		
		empleadoMicrosoft3.setNombre("Pedro");
		empleadoMicrosoft3.setPrimerApellido("López");
		empleadoMicrosoft3.setSegundoApellido("Romero");
		empleadoMicrosoft3.setPuesto("CEO");
		empleadoMicrosoft3.setEstatus(true);
		
		empleadoApple2.setNombre("Pablo");
		empleadoApple2.setPrimerApellido("López");
		empleadoApple2.setSegundoApellido("Romero");
		empleadoApple2.setPuesto("Architect");
		empleadoApple2.setEstatus(true);
		
		empleados.add(empleadoApple);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoIBM);
		empleados.add(empleadoApple2);
		empleados.add(empleadoMicrosoft2);
		empleados.add(empleadoIBM2);
		empleados.add(empleadoApple3);
		empleados.add(empleadoMicrosoft3);
		empleados.add(empleadoIBM3);
		
		return empleados;

	}

}
