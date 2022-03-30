import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list  = new ArrayList<>();
		list.add(52);
		list.add(86);
		list.add(96);
		list.add(62);
		list.add(79);
		list.add(96);
		list.add(84);
		
		IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();
		int summ = 0;
		for(int x: list) {
			intSummaryStatistics.accept(x);
		
		}
		
		System.out.println(intSummaryStatistics.getAverage());
		System.out.println(intSummaryStatistics.getCount() +" + " + list.size());
		System.out.println(intSummaryStatistics.getMax());
		System.out.println(intSummaryStatistics.getMin());
		System.out.println(intSummaryStatistics.getSum());
		

	}

}
