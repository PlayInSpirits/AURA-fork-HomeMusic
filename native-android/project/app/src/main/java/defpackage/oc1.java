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

    public oc1(LinearLayout r1, ConstraintLayout r2, RecyclerView r3, Button r4, AppBarLayout r5, TextView r6, TextView r7, MaterialToolbar r8) {
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.a = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
    }

    public oc1(LinearLayout r1, AppBarLayout r2, ConstraintLayout r3, RecyclerView r4, Button r5, TextView r6, TextView r7, MaterialToolbar r8) {
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
    }
}
