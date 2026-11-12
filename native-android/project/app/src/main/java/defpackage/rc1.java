package defpackage;

import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rc1 {
    public final ConstraintLayout a;
    public final AppBarLayout b;
    public final RecyclerView c;
    public final Button d;
    public final MaterialToolbar e;

    public rc1(LinearLayout linearLayout, ConstraintLayout constraintLayout, AppBarLayout appBarLayout, RecyclerView recyclerView, Button button, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = appBarLayout;
        this.c = recyclerView;
        this.d = button;
        this.e = materialToolbar;
    }

    public rc1(LinearLayout linearLayout, AppBarLayout appBarLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout, Button button, MaterialToolbar materialToolbar) {
        this.b = appBarLayout;
        this.c = recyclerView;
        this.a = constraintLayout;
        this.d = button;
        this.e = materialToolbar;
    }
}
