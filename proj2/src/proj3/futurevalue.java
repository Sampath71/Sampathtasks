package proj3;

public class futurevalue {
		

		public static void main(String[] args) {
			futurevalue investments = new futurevalue();
			double investmentAmount = 1000;
			double interestRate = 10;
			int numberOfYears = 5;

			investments.computeFutureValue(investmentAmount, interestRate, numberOfYears);
		}

		public void computeFutureValue(double investmentAmount, double interestRate, int numberOfYears) {
			System.out.println("Years\tFutureValue");

			for (int i = 1; i <= numberOfYears; i++) {
				double futureValue = investmentAmount * Math.pow(1 + (interestRate / 100), i);
				System.out.println(i + "\t" + (int) futureValue);
			}
		}

	}
