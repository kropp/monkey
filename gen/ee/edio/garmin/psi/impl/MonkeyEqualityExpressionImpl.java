// This is a generated file. Not intended for manual editing.
package ee.edio.garmin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ee.edio.garmin.psi.MonkeyTypes.*;
import ee.edio.garmin.psi.*;

public class MonkeyEqualityExpressionImpl extends MonkeyPsiCompositeElementImpl implements MonkeyEqualityExpression {

  public MonkeyEqualityExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MonkeyVisitor) ((MonkeyVisitor)visitor).visitEqualityExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MonkeyHasExpression> getHasExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MonkeyHasExpression.class);
  }

}
