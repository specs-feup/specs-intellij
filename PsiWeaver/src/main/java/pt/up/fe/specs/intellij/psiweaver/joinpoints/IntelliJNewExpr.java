package pt.up.fe.specs.intellij.psiweaver.joinpoints;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNewExpression;
import pt.up.fe.specs.intellij.psiweaver.abstracts.joinpoints.ANewExpr;

public class IntelliJNewExpr extends ANewExpr {

    private final PsiNewExpression newExpr;

    public IntelliJNewExpr(PsiNewExpression newExpr) {
        super(new IntelliJCall(newExpr));
        this.newExpr = newExpr;
    }


    @Override
    public PsiElement getNode() {
        return newExpr;
    }
}
