// Generated code from Butter Knife. Do not modify!
package it.jaschke.alexandria;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AddBook$$ViewBinder<T extends it.jaschke.alexandria.AddBook> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361870, "field 'barcodeNumber'");
    target.barcodeNumber = finder.castView(view, 2131361870, "field 'barcodeNumber'");
    view = finder.findRequiredView(source, 2131361872, "field 'bookTitleView'");
    target.bookTitleView = finder.castView(view, 2131361872, "field 'bookTitleView'");
    view = finder.findRequiredView(source, 2131361873, "field 'bookSubTitleView'");
    target.bookSubTitleView = finder.castView(view, 2131361873, "field 'bookSubTitleView'");
    view = finder.findRequiredView(source, 2131361874, "field 'authorsView'");
    target.authorsView = finder.castView(view, 2131361874, "field 'authorsView'");
    view = finder.findRequiredView(source, 2131361875, "field 'bookCoverView'");
    target.bookCoverView = finder.castView(view, 2131361875, "field 'bookCoverView'");
    view = finder.findRequiredView(source, 2131361876, "field 'categoriesView'");
    target.categoriesView = finder.castView(view, 2131361876, "field 'categoriesView'");
    view = finder.findRequiredView(source, 2131361878, "field 'saveButtonView'");
    target.saveButtonView = finder.castView(view, 2131361878, "field 'saveButtonView'");
    view = finder.findRequiredView(source, 2131361877, "field 'deleteButtonView'");
    target.deleteButtonView = finder.castView(view, 2131361877, "field 'deleteButtonView'");
    view = finder.findRequiredView(source, 2131361871, "field 'scanButtonView'");
    target.scanButtonView = finder.castView(view, 2131361871, "field 'scanButtonView'");
  }

  @Override public void unbind(T target) {
    target.barcodeNumber = null;
    target.bookTitleView = null;
    target.bookSubTitleView = null;
    target.authorsView = null;
    target.bookCoverView = null;
    target.categoriesView = null;
    target.saveButtonView = null;
    target.deleteButtonView = null;
    target.scanButtonView = null;
  }
}
