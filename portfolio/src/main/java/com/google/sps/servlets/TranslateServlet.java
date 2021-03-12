package com.google.sps.servlets;

import javax.servlet.annotation.WebServlet;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import io.grpc.Context.Storage;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/translate")

public class TranslateServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String original = request.getParameter("text");
		String language = request.getParameter("language");

		Translate translate = TranslateOptions.getDefaultInstance().getService();
		Translation translation = translate.translate(original, Translate.TranslateOption.targetLanguage(language));
		String translated = translation.getTranslatedText();

        response.setContentType("text/html; charset = UTF-8");
        response.setCharacterEncoding("UTF-8");
		response.getWriter().println(translated);
    }
}