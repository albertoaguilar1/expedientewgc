package expedientewebgc.chedraui.com;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import expedientewebgc.chedraui.com.controler.ExpedienteController;
import expedientewebgc.com.cliente.msj.Mensaje;

public class appEngineControlTest {

//  @Test
//  public void test() throws IOException {
//    MockHttpServletResponse response = new MockHttpServletResponse();
// 
//    new HelloAppEngine().doGet(null, response);
//    Assert.assertEquals("text/plain", response.getContentType());
//    Assert.assertEquals("UTF-8", response.getCharacterEncoding());
//    //Assert.assertEquals("Hello App Engine!\r\n", response.getWriterContent().toString());
//  }
  
  
  
  
  @Test
  
  public void test2() throws IOException {

    String x  = new ExpedienteController().hello();
    if (x.isEmpty()) {
    	 Assert.assertTrue(false);
    }else {
   	
    	 Assert.assertTrue(true);
    }
  } 

    

    @Test
    public void test3() throws IOException {
      Mensaje x  = new ExpedienteController().consultaCorreo("faraond1@gmail.com", "1234");   
      if (x !=null) {
    		 Assert.assertTrue(true);
      }

  }
}
