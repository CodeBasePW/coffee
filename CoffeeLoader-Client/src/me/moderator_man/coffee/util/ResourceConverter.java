package me.moderator_man.coffee.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import me.moderator_man.coffee.api.util.IResourceConverter;

public class ResourceConverter implements IResourceConverter
{
	private JSONObject meta = new JSONObject();
	
	public void onEnable()
	{
		try
		{
			String meta_raw = get("https://launchermeta.mojang.com/v1/packages/4759bad2824e419da9db32861fcdc3a274336532/pre-1.6.json");
			meta = new JSONObject(meta_raw).getJSONObject("objects");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("ResourceConverter has been enabled.");
	}
	
	public String convertResource(String resource)
	{
		String hash = meta.getJSONObject(resource).getString("hash");
		String sub = hash.substring(0, 2);
		return String.format("http://resources.download.minecraft.net/%s/%s", sub, hash);
	}
	
	public String get(String url)
	{
		try
		{
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			return response.toString();
		} catch (Exception ex) {
			ex.printStackTrace();
			return "";
		}
	}
}
