package OOPS;

/*--------------------------------------------------- 1. Create an Object ------------------------------------------------------- */
/*
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnotherClass obj1=new  AnotherClass();
		obj1.someMethod();
		

	}

}
*/




/*2.------------------------------------------------2. Static Methods:---------------------------------------------------------------*/

/*

public class MainClass {
    public static void main(String[] args) {
        AnotherClass.staticMethod();
    }
}


class AnotherClass {
    public static void staticMethod() {
        System.out.println("Static method in AnotherClass");
    }
}


*/


/* ---------------------------------------------3. Inheritance:---------------------------------------------------------------------*/
/*
class ParentClass {
    public void someMethod() {
        System.out.println("Method in ParentClass");
    }
}

class AnotherClass extends ParentClass {
    // other methods
}

public class MainClass {
    public static void main(String[] args) {
        AnotherClass obj = new AnotherClass();
        obj.someMethod(); // Calls the method in ParentClass
    }
}
*/







/*4.------------------------------------ Use of this Keyword:------------------------------------------------------------------------*/

/*
  class AnotherClass {
    public void someMethod() {
        System.out.println("Method in AnotherClass");
    }

    public void callAnotherMethod() {
        this.someMethod();
    }
}

public class MainClass {
    public static void main(String[] args) {
        AnotherClass obj = new AnotherClass();
        obj.callAnotherMethod();
    }
}
*/



/*-----------------------------------------5. Method Parameters:------------------------------------------------------------------------*/
/*

class AnotherClass {
    public void methodInAnotherClass() {
        System.out.println("Method in AnotherClass");
    }
}
******************************************************
class MainClass {
    public void someMethod(AnotherClass anotherObj) {
        anotherObj.methodInAnotherClass();
    }
******************************************************
    public static void main(String[] args) {
        MainClass mainObj = new MainClass();
        AnotherClass anotherObj = new AnotherClass();
        mainObj.someMethod(anotherObj);
    }
}
*/



/*--------------------------------------6. Using static import (for static members):---------------------------------------------------*/
/*
package package_name;

public class AnotherClass {
    public static void staticMethod() {
        System.out.println("Static method in AnotherClass");
    }
}

import static package_name.AnotherClass.staticMethod;

public class MainClass {
    public static void main(String[] args) {
        staticMethod();
    }
}
``

*/








