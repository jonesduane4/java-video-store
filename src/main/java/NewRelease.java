import java.math.BigDecimal;

public class NewRelease extends Movie {

	public NewRelease(String title) {
		super(title, "3.00");
	}

	@Override
	public String getPriceCode() {
		return "NewRelease";
	}

	@Override
	public BigDecimal caculateFees(int days) {

		BigDecimal rentalDays = new BigDecimal(days);
		BigDecimal amount = new BigDecimal("3.00").multiply(rentalDays);

		return amount;
	}

}
