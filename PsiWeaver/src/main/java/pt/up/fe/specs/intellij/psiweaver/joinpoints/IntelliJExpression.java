package pt.up.fe.specs.intellij.psiweaver.joinpoints;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiExpression;
import pt.up.fe.specs.intellij.psiweaver.abstracts.joinpoints.AExpression;
import pt.up.fe.specs.intellij.util.CodeUtils;
import pt.up.fe.specs.intellij.util.IntelliJNodes;

import java.util.function.Supplier;

public class IntelliJExpression extends AExpression {

    private final PsiExpression expr;

    public IntelliJExpression(PsiExpression expr) {
        this.expr = expr;
    }

    @Override
    public PsiElement getNode() {
        return expr;
    }

    @Override
    public String getTypeImpl() {
        Supplier<String> getTypeText = () -> {
            return expr.getType().getPresentableText();
        };

        return CodeUtils.removeGenerics(IntelliJNodes.read(getTypeText));
    }
}
