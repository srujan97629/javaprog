package com.bridgeit.AnnotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp 
{
   public static void main(String[] args)
   {
	   AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(TextEditorConfig.class);
      TextEditor text = context.getBean(TextEditor.class);
      text.spellCheck();
      context.close();
      
   }
}
