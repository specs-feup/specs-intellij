package pt.up.fe.specs.intellij.util;

public class CodeUtils {

    public static String removeGenerics(String typeName) {
        //            System.out.println("PSY TYPE: " + field.getType());
        //            System.out.println("PSY TYPE ELEMENT: " + field.getTypeElement());

        // Remove template information
        int angleBracketIndex = typeName.indexOf('<');
        if(angleBracketIndex != -1) {
            typeName = typeName.substring(0, angleBracketIndex);
        }

        return typeName;
    }
}
