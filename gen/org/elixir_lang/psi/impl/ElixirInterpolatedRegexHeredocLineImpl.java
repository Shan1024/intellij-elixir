// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;

public class ElixirInterpolatedRegexHeredocLineImpl extends ASTWrapperPsiElement implements ElixirInterpolatedRegexHeredocLine {

  public ElixirInterpolatedRegexHeredocLineImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ElixirVisitor visitor) {
    visitor.visitInterpolatedRegexHeredocLine(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) accept((ElixirVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ElixirHeredocLinePrefix getHeredocLinePrefix() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, ElixirHeredocLinePrefix.class));
  }

  @Override
  @NotNull
  public ElixirInterpolatedRegexBody getInterpolatedRegexBody() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, ElixirInterpolatedRegexBody.class));
  }

  public Body getBody() {
    return ElixirPsiImplUtil.getBody(this);
  }

  @NotNull
  public OtpErlangObject quote(Heredoc heredoc, int prefixLength) {
    return ElixirPsiImplUtil.quote(this, heredoc, prefixLength);
  }

}
