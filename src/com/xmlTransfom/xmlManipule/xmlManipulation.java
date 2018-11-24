package com.xmlTransfom.xmlManipule;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class xmlManipulation
{
    public static void main( String[] args)
    {
        try
        {
            // PagarDispCredito.xsd
            DocumentBuilderFactory docBfact = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuild = docBfact.newDocumentBuilder();
            Document doc = docBuild.parse(new File("/home/shiro/Documentos/JavaProyect/books.xml"));

            doc.getDocumentElement().normalize();

            System.out.println("Nombre del Documento: " + doc.getDocumentElement().getNodeName());
            System.out.println();

            if (doc.hasChildNodes())
            {
                NodeList elemPadres = doc.getElementsByTagName("book");


                int totnodos = elemPadres.getLength();

                System.out.println("Elementos Encontrados: " + totnodos);
                System.out.println();

                for (int a = 0; a < elemPadres.getLength(); a++)
                {
                    Node elemen = elemPadres.item(a);
                    System.out.println("Elemento a procesar: " + elemen.getNodeName());
                    //System.out.println("Tipo elemento a procesar: " + elemen.getNodeType());

                    if (elemen.getNodeType() == Node.ELEMENT_NODE)
                    {
                        //System.out.println(elemen.getNodeName() + " : " + elemen.getNodeValue());

                        if (elemen.hasAttributes())
                        {
                            NamedNodeMap atribs = elemen.getAttributes();

                            for (int atr = 0; atr < atribs.getLength(); atr++)
                            {
                                Node atrib = atribs.item(atr);

                                System.out.println("Nombre atributo: " + atrib.getNodeName() + " Valor: " + atrib.getNodeValue());
                            }
                        }




                    }

                    System.out.println();
                }
            }
        }
        catch (ParserConfigurationException pce)
        {
            pce.printStackTrace();
        }
        catch (IOException io)
        {
            io.printStackTrace();
        }
        catch (SAXException se)
        {
            se.printStackTrace();
        }
    }
}
