
import com.app.controller.controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestClass {

    @InjectMocks
    private controller c;

    @Mock
    Model model;

    @Test
   void performAdditionTest() {
       controller c = new controller();
        Model m=mock(Model.class);
        int a = 5;
        int b = 10;
        int s=a+b;
        String res=c.performAddition(m,a,b);
        assertEquals("result.html",res);
    }



    @Test
    public void getAddition(){
        controller controller=new controller();

        Model model = mock(Model.class);
        model.addAttribute("a",1);
        model.addAttribute("b",2);

        String result = controller.showAdditionForm(model);

        assertEquals("addition-form.html", result);

    }

}
