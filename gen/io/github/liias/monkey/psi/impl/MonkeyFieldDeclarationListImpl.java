// This is a generated file. Not intended for manual editing.
package io.github.liias.monkey.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.liias.monkey.psi.MonkeyTypes.*;
import io.github.liias.monkey.psi.*;

public class MonkeyFieldDeclarationListImpl extends MonkeyPsiCompositeElementImpl implements MonkeyFieldDeclarationList {

  public MonkeyFieldDeclarationListImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MonkeyVisitor) ((MonkeyVisitor)visitor).visitFieldDeclarationList(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MonkeyFieldDeclaration> getFieldDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MonkeyFieldDeclaration.class);
  }

  @Override
  @NotNull
  public MonkeyModifiers getModifiers() {
    return findNotNullChildByClass(MonkeyModifiers.class);
  }

}
