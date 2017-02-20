import java.math.BigDecimal;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String title) {
		super(title, "1.50");

	}

	@Override
	public String getPriceCode() {
		return "Children's";
			}

	@Override
	public BigDecimal caculateFees(int days) {
		
		BigDecimal amount = new BigDecimal("1.50");
		if (days > 3) {
			BigDecimal extraDays = new BigDecimal(days - 3);
			amount = amount.add(new BigDecimal("1.50").multiply(extraDays));
		}
		return amount;
		
		
		
	}

}
	

