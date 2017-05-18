package ru.javastudy.ws.main;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import ru.javastudy.ws.model.Goods;
import ru.javastudy.ws.soap.WebserviceSEI;

/**
 * Created by e.kutsenko on 17.05.2017.
 */
public class JavaStudyWS{
  public static void main(String[]args){
    testSOAPFormClient();
  }
  private static void testSOAPFormClient(){
      String soapServiceUrl = "http://localhost:8080/soap/webserviceSEI";

      JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
      factoryBean.setServiceClass(WebserviceSEI.class);
      factoryBean.setAddress(soapServiceUrl);

      WebserviceSEI webserviceSEI = (WebserviceSEI) factoryBean.create();

      Goods result = webserviceSEI.getGoods();
      System.out.println("Result: " + result);
    }
}
