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

    public up0(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, ImageButton imageButton, LinearProgressIndicator linearProgressIndicator, MaterialButton materialButton, MaterialButton materialButton2, TabLayout tabLayout, FrameLayout frameLayout) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = textView;
        this.i = imageButton;
        this.d = linearProgressIndicator;
        this.e = materialButton;
        this.f = materialButton2;
        this.g = tabLayout;
        this.h = frameLayout;
    }

    public up0(LinearLayout linearLayout, ConstraintLayout constraintLayout, AppBarLayout appBarLayout, TextView textView, TextView textView2, RecyclerView recyclerView, Button button, Button button2, SwipeRefreshLayout swipeRefreshLayout, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = appBarLayout;
        this.c = textView;
        this.d = textView2;
        this.e = recyclerView;
        this.f = button;
        this.g = button2;
        this.h = swipeRefreshLayout;
        this.i = materialToolbar;
    }

    public up0(LinearLayout linearLayout, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, RecyclerView recyclerView, ImageView imageView3, LinearLayout linearLayout2, ProgressBar progressBar, TextView textView) {
        this.a = linearLayout;
        this.c = constraintLayout;
        this.d = imageView;
        this.e = imageView2;
        this.f = recyclerView;
        this.g = imageView3;
        this.b = linearLayout2;
        this.h = progressBar;
        this.i = textView;
    }

    public up0(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, LinearLayout linearLayout3, RecyclerView recyclerView, TextView textView2, RecyclerView recyclerView2, TextView textView3, View view) {
        this.a = linearLayout;
        this.c = textView;
        this.b = linearLayout2;
        this.d = linearLayout3;
        this.e = recyclerView;
        this.f = textView2;
        this.g = recyclerView2;
        this.h = textView3;
        this.i = view;
    }

    public up0(LinearLayout linearLayout, TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, MaterialButtonToggleGroup materialButtonToggleGroup, ImageButton imageButton, LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.c = textInputLayout;
        this.d = textInputEditText;
        this.e = textInputEditText2;
        this.f = textInputEditText3;
        this.g = textInputEditText4;
        this.h = materialButtonToggleGroup;
        this.i = imageButton;
        this.b = linearLayout2;
    }
}
