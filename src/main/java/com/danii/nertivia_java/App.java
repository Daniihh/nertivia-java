package com.danii.nertivia_java;

import java.net.URISyntaxException;
import java.util.Arrays;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) throws URISyntaxException {
		IO.Options options = new IO.Options();
		options.query = "sid=";

		Socket socket = IO.socket("https://nertivia.supertiger.tk/", options);
		socket.on("new message", (data) -> System.out.println(data));
		socket.on("connect_error", (data) -> System.out.println(Arrays.toString(data)));
		System.out.println(socket);

		socket.open();
	}
}
