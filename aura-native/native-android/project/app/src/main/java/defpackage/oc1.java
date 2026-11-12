package defpackage;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oc1 {
    public final AppBarLayout a;
    public final ConstraintLayout b;
    public final RecyclerView c;
    public final Button d;
    public final TextView e;
    public final TextView f;
    public final MaterialToolbar g;

    public oc1(LinearLayout linearLayout, ConstraintLayout constraintLayout, RecyclerView recyclerView, Button button, AppBarLayout appBarLayout, TextView textView, TextView textView2, MaterialToolbar materialToolbar) {
        this.b = constraintLayout;
        this.c = recyclerView;
        this.d = button;
        this.a = appBarLayout;
        this.e = textView;
        this.f = textView2;
        this.g = materialToolbar;
    }

    public oc1(LinearLayout linearLayout, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, RecyclerView recyclerView, Button button, TextView textView, TextView textView2, MaterialToolbar materialToolbar) {
        this.a = appBarLayout;
        this.b = constraintLayout;
        this.c = recyclerView;
        this.d = button;
        this.e = textView;
        this.f = textView2;
        this.g = materialToolbar;
    }
}
