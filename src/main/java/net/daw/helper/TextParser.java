/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.helper;

/**
 *
 * @author Alvaro
 */
public class TextParser {

    public static String toHtml(String text) {
        ParserConverter oParserConverter = new ParserConverter();
       text = oParserConverter.h6(text);
       text = oParserConverter.h5(text);
       text = oParserConverter.h4(text);
       text = oParserConverter.h3(text);
       text = oParserConverter.h2(text);
       text = oParserConverter.h1(text);
       text = oParserConverter.aExtern(text);
       System.out.println(text);
        return text;
    }
    
    
    
}