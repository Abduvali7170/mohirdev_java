package test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;


public class SimpleSoapClient {

    public static void main(String args[]) throws IOException {

        String matnr = "GM42355142";
        String storage = "1041";

        /* place your xml request from soap ui below with necessary changes in parameters*/

        String xml= "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:sap-com:document:sap:rfc:functions\">\r\n" +
                "	<soapenv:Header/>\r\n" +
                "	<soapenv:Body>\r\n" +
                "		<urn:_-UZAUTO_-EWM_MOBILE_INV_COUNT>\r\n" +
                "   		<IP_MATNR>" + matnr +"</IP_MATNR>\r\n" +
                "   		<IP_STORAGE>" + storage + "</IP_STORAGE>\r\n" +
                "   	</urn:_-UZAUTO_-EWM_MOBILE_INV_COUNT>\r\n" +
                "	</soapenv:Body>\r\n" +
                "	</soapenv:Envelope>";
        String responseF=callSoapService(xml);
        System.out.println(responseF);
    }



    static String callSoapService(String soapRequest) {
        try {
            String url = "http://sapss5.s4h.uzauto.uz/sap/bc/srt/rfc/uzauto/ewm_ws_inv_count/300/zws_inv_count/zws_inv_count"; // replace your URL here
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // change these values as per soapui request on top left of request, click on RAW, you will find all the headers
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type","text/xml; charset=utf-8");

            String auth = "aakarimov:Saudi2023";
            byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.UTF_8));

            String authHeaderValue = "Basic " + new String(encodedAuth);
            con.setRequestProperty("Authorization", authHeaderValue);

            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(soapRequest);
            wr.flush();
            wr.close();
            String responseStatus = con.getResponseMessage();
            System.out.println(responseStatus);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // You can play with response which is available as string now:
            String finalvalue= response.toString();

            // or you can parse/substring the required tag from response as below based your response code
            finalvalue= finalvalue.substring(finalvalue.indexOf("<EV_RESPONSE>")+13,finalvalue.indexOf("</EV_RESPONSE>"));

//            String formattedSOAPResponse = formatXML(finalvalue); // Write a separate method to format the XML input.
//            System.out.println(formattedSOAPResponse);

            return finalvalue;
        }
        catch (Exception e) {
            return e.getMessage();
        }

    }
}

