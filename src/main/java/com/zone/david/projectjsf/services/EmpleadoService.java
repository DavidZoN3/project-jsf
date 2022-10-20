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

		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("López");
		empleadoIBM.setSegundoApellido("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Jesús");
		empleadoMicrosoft.setPrimerApellido("López");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setSegundoApellido("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("López");
		empleadoApple.setSegundoApellido("Romero");
		empleadoApple.setSegundoApellido("Architect");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoApple);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoIBM);
		
		return empleados;

	}

}
