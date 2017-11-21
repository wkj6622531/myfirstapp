package Config;

import android.content.Context;
import android.content.SharedPreferences.Editor;

public class Config {
	public static String getCachedToken(Context context, String type){
			return context.getSharedPreferences("ID",context.MODE_PRIVATE).getString(type, null);
			//APP_ID代表XML文件名
	}
	public static void  CachedToken(Context context,String type,String token){
		Editor e =context.getSharedPreferences("ID", context.MODE_PRIVATE).edit();
		e.putString(type, token);
		e.commit();
	}
}

