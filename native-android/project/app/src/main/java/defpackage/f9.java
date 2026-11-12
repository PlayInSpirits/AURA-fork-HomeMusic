package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import app.homemusic.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class f9 extends dg implements DialogInterface {
    public final d9 t;

    public f9(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, j(contextThemeWrapper, i));
        this.t = new d9(getContext(), this, getWindow());
    }

    public static int j(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button i(int i) {
        d9 d9Var = this.t;
        if (i == -3) {
            return d9Var.o;
        }
        if (i == -2) {
            return d9Var.l;
        }
        if (i == -1) {
            return d9Var.i;
        }
        d9Var.getClass();
        return null;
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        d9 d9Var = this.t;
        d9Var.b.setContentView(d9Var.z);
        Context context = d9Var.a;
        Window window = d9Var.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = d9Var.g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !d9.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (d9Var.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (d9Var.f != null) {
                ((LinearLayout.LayoutParams) ((ya2) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = d9.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = d9.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = d9.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        d9Var.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        d9Var.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        d9Var.v = textView;
        if (textView != null) {
            CharSequence charSequence = d9Var.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                d9Var.r.removeView(d9Var.v);
                if (d9Var.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) d9Var.r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(d9Var.r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(d9Var.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        d9Var.i = button;
        i4 i4Var = d9Var.G;
        button.setOnClickListener(i4Var);
        boolean zIsEmpty = TextUtils.isEmpty(d9Var.j);
        Button button2 = d9Var.i;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(d9Var.j);
            d9Var.i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        d9Var.l = button3;
        button3.setOnClickListener(i4Var);
        boolean zIsEmpty2 = TextUtils.isEmpty(d9Var.m);
        Button button4 = d9Var.l;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(d9Var.m);
            d9Var.l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        d9Var.o = button5;
        button5.setOnClickListener(i4Var);
        boolean zIsEmpty3 = TextUtils.isEmpty(d9Var.p);
        Button button6 = d9Var.o;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(d9Var.p);
            d9Var.o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = d9Var.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = d9Var.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = d9Var.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (d9Var.w != null) {
            viewGroupB.addView(d9Var.w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            d9Var.t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(d9Var.d) || !d9Var.E) {
                window.findViewById(R.id.title_template).setVisibility(8);
                d9Var.t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                d9Var.u = textView2;
                textView2.setText(d9Var.d);
                Drawable drawable = d9Var.s;
                if (drawable != null) {
                    d9Var.t.setImageDrawable(drawable);
                } else {
                    d9Var.u.setPadding(d9Var.t.getPaddingLeft(), d9Var.t.getPaddingTop(), d9Var.t.getPaddingRight(), d9Var.t.getPaddingBottom());
                    d9Var.t.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = d9Var.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (d9Var.e == null && d9Var.f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = d9Var.f;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.n, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.o);
        }
        if (!z2) {
            View view2 = d9Var.f;
            if (view2 == null) {
                view2 = d9Var.r;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = j65.a;
                view2.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = d9Var.f;
        if (alertController$RecycleListView2 == null || (listAdapter = d9Var.x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = d9Var.y;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.t.r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.t.r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.dg, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d9 d9Var = this.t;
        d9Var.d = charSequence;
        TextView textView = d9Var.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
