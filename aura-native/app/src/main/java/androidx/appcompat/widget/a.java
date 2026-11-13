package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class a implements View.OnClickListener {
    public final /* synthetic */ SearchView n;

    public a(SearchView searchView) {
        this.n = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.n;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.C;
        if (view == searchView.G) {
            searchView.w(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.c0;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.I) {
            searchView.m();
            return;
        }
        if (view == searchView.H) {
            searchView.q();
            return;
        }
        if (view != searchView.J) {
            if (view == searchAutoComplete) {
                searchView.l();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.q0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.k(searchView.V, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.U);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
