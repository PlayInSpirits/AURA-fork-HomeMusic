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

    public rc1(LinearLayout r1, ConstraintLayout r2, AppBarLayout r3, RecyclerView r4, Button r5, MaterialToolbar r6) {
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
    }

    public rc1(LinearLayout r1, AppBarLayout r2, RecyclerView r3, ConstraintLayout r4, Button r5, MaterialToolbar r6) {
        this.b = r2;
        this.c = r3;
        this.a = r4;
        this.d = r5;
        this.e = r6;
    }
}
