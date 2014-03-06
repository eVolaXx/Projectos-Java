
public class Polynomial {
	private double[] coeffs;
	public Polynomial(double... coeffs) {
		//this.coeffs=coeffs;
		this.coeffs = new double[coeffs.length];
		for (int i=0; i<coeffs.length; i++ ) {
			this.coeffs[i]=coeffs[i];
		}
	}
	public int getDegree() {
		return coeffs.length-1;
	}
	public String toString() {
		String form = "";
		int l = coeffs.length-1;
		while (l>=0){
			if (l==0) {
				form = form.concat(String.format("%.1f", coeffs[l]));
			} else {
				if (l==1) {
					form = form.concat(String.format("%.1fX", coeffs[l]));
				} else {
					form = form.concat(String.format("%.1f"+"X^%d", coeffs[l],l));
				}
			}
			if (l!=0)
				form = form.concat(" + ");
			
			l--;
		}
		return form;
	}
	
	public double evaluate(double x) {
		double accum = coeffs[0];
		for (int i = 1; i< coeffs.length; i++) {
			accum = accum + coeffs[i]*Math.pow(x, i);
		}
		return accum;
	}
	public double getCoefficent(int pos) {
		return coeffs[pos];
	}
	public Polynomial add(Polynomial p) {
		double[] newPol;
		int lengthMax;
		if (p.getDegree() > getDegree()) {
			lengthMax = p.getDegree()+1;
			newPol = new double[lengthMax];
			for (int i=0; i<=getDegree(); i++) {
				newPol[i]=p.getCoefficent(i) + coeffs[i];
			}
			for (int i=getDegree()+1; i <= p.getDegree(); i ++) {
				newPol[i] = p.getCoefficent(i);
			}
		} else {
			lengthMax = getDegree()+1;
			newPol = new double[lengthMax];
			for (int i=0; i<=p.getDegree(); i++) {
				newPol[i]=p.getCoefficent(i) + coeffs[i];
			}
			for (int i=p.getDegree()+1; i <= getDegree(); i ++) {
				newPol[i] = coeffs[i];
			}
		}
		return new Polynomial(newPol);
	}
	public Polynomial add2(Polynomial p) {
		double[] newPol;
		Polynomial pShort, pLong;
		if (p.getDegree() > getDegree()) {
			pShort = this;
			pLong = p;
		} else {
			pShort = p;
			pLong = this;
		}
		newPol = new double[pLong.getDegree()+1];
		for (int i=0; i<=pShort.getDegree(); i++) {
			newPol[i]=pShort.getCoefficent(i) + pLong.getCoefficent(i);
		}
		for (int i=pShort.getDegree()+1; i <= pLong.getDegree(); i ++) {
			newPol[i] = pLong.getCoefficent(i);
		}
		return new Polynomial(newPol);
	}
	public Polynomial multiply(Polynomial p) {
		double[] aTemp = null;
		Polynomial polyResult=new Polynomial();
		int cont;
		for (int i=0; i<p.getDegree()+1; i++) {
			aTemp = new double[getDegree()+1+i];
			for (int j=0; j<i; j++) {
				aTemp[j] = 0;
			}
			cont = 0;
			for (int j = i; j<aTemp.length; j++) {
				aTemp[j] = p.getCoefficent(i)*getCoefficent(cont);
				cont++;
			}
			polyResult = polyResult.add(new Polynomial(aTemp));
		}
		return polyResult;
	}
}






