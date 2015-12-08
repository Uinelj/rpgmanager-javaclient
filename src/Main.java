
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query ="http://localhost/~uinelj/web/rpgmanager-server/action.php?a=update&id=foo&field=Str&value=4";/*
		RpgServerInteract rsi = new RpgServerInteract(query);
		System.out.println(rsi.getResponse());
		StatsExtractor se = new StatsExtractor(rsi.getResponse(), "value");*/
		
		Request rq = new Request(query);
		System.out.println(rq.getResult());
		System.out.println(rq.getKeys());
		//System.out.println(rq.getValue("cha"));
		
	}

}
