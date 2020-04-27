/**
 * 
 * @author William Nicholas
 *
 */

public class HolidayBonus extends java.lang.Object {
	
	public HolidayBonus() {
		// lol, what's the point of this method?
	}
	
	// Calculates the holiday bonus for each store
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonuses = new double[data.length];
		
		for (int row = 0; row < bonuses.length; row++) {
			for (int col = 0; col < data[row].length; col++) {
				if (data[row][col] >= 0) {
					if (data[row][col] == TwoDimRaggedArrayUtility.getHighestInColumn(data, col)) {
						bonuses[row] += high;
					} else if (data[row][col] == TwoDimRaggedArrayUtility.getLowestInColumn(data, col)) {
						bonuses[row] += low;
					} else {
						bonuses[row] += other;
					}
				}
			}
		}
		
		return bonuses;
	}
	
	// Calculates the total holiday bonuses
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double[] bonuses = calculateHolidayBonus(data, high, low, other);
		double holidayBonuses = 0;
		
		for (int row = 0; row < bonuses.length; row++) {
			holidayBonuses += bonuses[row];
		}
		
		return holidayBonuses;
	}
}