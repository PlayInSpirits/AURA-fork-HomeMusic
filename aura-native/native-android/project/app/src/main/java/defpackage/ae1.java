package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ae1 {
    public final TextView a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;

    public ae1(ConstraintLayout constraintLayout, View view, View view2, ImageButton imageButton, ToggleButton toggleButton, ImageButton imageButton2, TextView textView, ImageView imageView, TextView textView2, ImageButton imageButton3, AppCompatImageButton appCompatImageButton, ImageButton imageButton4, SeekBar seekBar) {
        this.b = constraintLayout;
        this.c = view;
        this.d = view2;
        this.e = imageButton;
        this.f = toggleButton;
        this.g = imageButton2;
        this.a = textView;
        this.h = imageView;
        this.i = textView2;
        this.j = imageButton3;
        this.k = appCompatImageButton;
        this.l = imageButton4;
        this.m = seekBar;
    }

    public ae1(CoordinatorLayout coordinatorLayout, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, SearchBar searchBar, RecyclerView recyclerView2, RecyclerView recyclerView3, LinearLayout linearLayout4, RecyclerView recyclerView4, LinearLayout linearLayout5, SearchView searchView, LinearLayout linearLayout6) {
        this.a = textView;
        this.b = recyclerView;
        this.f = linearLayout;
        this.g = linearLayout2;
        this.h = linearLayout3;
        this.l = searchBar;
        this.c = recyclerView2;
        this.d = recyclerView3;
        this.i = linearLayout4;
        this.e = recyclerView4;
        this.j = linearLayout5;
        this.m = searchView;
        this.k = linearLayout6;
    }
}
