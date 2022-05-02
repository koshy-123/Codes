package web;

import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.read.biff.BiffException;

public interface Intellect {
 String[][]  entry1() throws BiffException, IOException;
 String[][] powerhouse1() throws FileNotFoundException, BiffException, IOException;
  void beforetest1() throws InterruptedException;
  
 
}
