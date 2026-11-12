package defpackage;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pc1 {
    public final ConstraintLayout a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final View f;
    public final TextView g;
    public final TextView h;
    public final View i;
    public final View j;
    public final View k;
    public final TextView l;
    public final Button m;
    public final View n;
    public final View o;
    public final View p;
    public final View q;

    public pc1(LinearLayout linearLayout, TextView textView, ImageView imageView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout, Button button, Button button2, TextView textView5, TextView textView6, TextView textView7, MaterialToolbar materialToolbar, View view, RecyclerView recyclerView, View view2) {
        this.b = linearLayout;
        this.c = textView;
        this.j = imageView;
        this.a = constraintLayout;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.k = frameLayout;
        this.l = button;
        this.m = button2;
        this.g = textView5;
        this.h = textView6;
        this.i = textView7;
        this.n = materialToolbar;
        this.o = view;
        this.q = recyclerView;
        this.p = view2;
    }

    public pc1(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialSwitch materialSwitch, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, MaterialSwitch materialSwitch2, TextInputEditText textInputEditText3, TextInputEditText textInputEditText4, MaterialSwitch materialSwitch3, TextInputEditText textInputEditText5, TextInputEditText textInputEditText6, AutoCompleteTextView autoCompleteTextView, MaterialButton materialButton4) {
        this.a = constraintLayout;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = materialButton3;
        this.e = textInputEditText;
        this.f = textInputLayout;
        this.g = materialSwitch;
        this.h = textInputEditText2;
        this.i = textInputLayout2;
        this.j = materialSwitch2;
        this.k = textInputEditText3;
        this.l = textInputEditText4;
        this.m = materialSwitch3;
        this.n = textInputEditText5;
        this.o = textInputEditText6;
        this.p = autoCompleteTextView;
        this.q = materialButton4;
    }
}
