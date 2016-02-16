// Generated code from Butter Knife. Do not modify!
package it.jaschke.alexandria;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BookDetail$$ViewBinder<T extends it.jaschke.alexandria.BookDetail> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361879, "field 'bookTitleView'");
    target.bookTitleView = finder.castView(view, 2131361879, "field 'bookTitleView'");
    view = finder.findRequiredView(source, 2131361880, "field 'bookSubTitleView'");
    target.bookSubTitleView = finder.castView(view, 2131361880, "field 'bookSubTitleView'");
    view = finder.findRequiredView(source, 2131361881, "field 'bookDescView'");
    target.bookDescView = finder.castView(view, 2131361881, "field 'bookDescView'");
    view = finder.findRequiredView(source, 2131361874, "field 'authorsView'");
    target.authorsView = finder.castView(view, 2131361874, "field 'authorsView'");
    view = finder.findRequiredView(source, 2131361866, "field 'bookCoverView'");
    target.bookCoverView = finder.castView(view, 2131361866, "field 'bookCoverView'");
    view = finder.findRequiredView(source, 2131361876, "field 'categoriesView'");
    target.categoriesView = finder.castView(view, 2131361876, "field 'categoriesView'");
    view = finder.findRequiredView(source, 2131361882, "field 'backButtonView'");
    target.backButtonView = finder.castView(view, 2131361882, "field 'backButtonView'");
    view = finder.findRequiredView(source, 2131361877, "field 'deleteButtonView'");
    target.deleteButtonView = finder.castView(view, 2131361877, "field 'deleteButtonView'");
  }

  @Override public void unbind(T target) {
    target.bookTitleView = null;
    target.bookSubTitleView = null;
    target.bookDescView = null;
    target.authorsView = null;
    target.bookCoverView = null;
    target.categoriesView = null;
    target.backButtonView = null;
    target.deleteButtonView = null;
  }
}
