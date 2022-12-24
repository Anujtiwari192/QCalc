package com.crio.qcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.crio.qcalc.LogicCalculator;
import com.crio.qcalc.ScientificCalculator;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Hello World!");
		StandardCalculator calc = new StandardCalculator();
		calc.add(1, 1);
		System.out.println(calc.getResult());
		LogicCalculator logic_calc = new LogicCalculator();
		logic_calc.OR(8, 6);
		logic_calc.printResult();
	}

}
