package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class up0 {
    public final ViewGroup a;
    public final LinearLayout b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;

    public up0(LinearLayout r1, LinearLayout r2, TextView r3, ImageButton r4, LinearProgressIndicator r5, MaterialButton r6, MaterialButton r7, TabLayout r8, FrameLayout r9) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.i = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = r9;
    }

    public up0(LinearLayout r1, ConstraintLayout r2, AppBarLayout r3, TextView r4, TextView r5, RecyclerView r6, Button r7, Button r8, SwipeRefreshLayout r9, MaterialToolbar r10) {
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = r9;
        this.i = r10;
    }

    public up0(LinearLayout r1, ConstraintLayout r2, ImageView r3, ImageView r4, RecyclerView r5, ImageView r6, LinearLayout r7, ProgressBar r8, TextView r9) {
        this.a = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.f = r5;
        this.g = r6;
        this.b = r7;
        this.h = r8;
        this.i = r9;
    }

    public up0(ConstraintLayout r1, LinearLayout r2, TextView r3, LinearLayout r4, LinearLayout r5, RecyclerView r6, TextView r7, RecyclerView r8, TextView r9, View r10) {
        this.a = r2;
        this.c = r3;
        this.b = r4;
        this.d = r5;
        this.e = r6;
        this.f = r7;
        this.g = r8;
        this.h = r9;
        this.i = r10;
    }

    public up0(LinearLayout r1, TextInputLayout r2, TextInputEditText r3, TextInputEditText r4, TextInputEditText r5, TextInputEditText r6, MaterialButtonToggleGroup r7, ImageButton r8, LinearLayout r9) {
        this.a = r1;
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.f = r5;
        this.g = r6;
        this.h = r7;
        this.i = r8;
        this.b = r9;
    }
}
