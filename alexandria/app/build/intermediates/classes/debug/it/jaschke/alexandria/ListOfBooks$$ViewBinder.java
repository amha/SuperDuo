// Generated code from Butter Knife. Do not modify!
package it.jaschke.alexandria;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ListOfBooks$$ViewBinder<T extends it.jaschke.alexandria.ListOfBooks> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361886, "field 'fab'");
    target.fab = finder.castView(view, 2131361886, "field 'fab'");
    view = finder.findRequiredView(source, 2131361884, "field 'searchText'");
    target.searchText = finder.castView(view, 2131361884, "field 'searchText'");
  }

  @Override public void unbind(T target) {
    target.fab = null;
    target.searchText = null;
  }
}
