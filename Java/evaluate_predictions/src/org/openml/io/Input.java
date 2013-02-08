package org.openml.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Input {

	public static InputStreamReader getURL( String sUrl ) throws IOException {
		URL url = new URL( sUrl );
		URLConnection urlConnection = url.openConnection();
		urlConnection.setConnectTimeout(1000);
		urlConnection.setReadTimeout(30000);
		return new InputStreamReader( urlConnection.getInputStream() );
	}
}
