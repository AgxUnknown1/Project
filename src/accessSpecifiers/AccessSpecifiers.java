/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessSpecifiers;

/**
 *
 * @author user
 */
final public class AccessSpecifiers {
    int num1;//default access specifier//can be accessed from all the classes in the same package
    public int num2;//public access specifier//can be accessed from the classes of other package//worlwidely accessed
    protected static int num3;//can be accessed only by any class in the same package and only child classes from other packages
    private int num4;//can be accessed only from the current class
}
