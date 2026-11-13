package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class e9 {
    public final a9 a;
    public final int b;

    public e9(Context context, int i) {
        this.a = new a9(new ContextThemeWrapper(context, f9.j(context, i)));
        this.b = i;
    }

    public e9 a() {
        this.a.m = false;
        return this;
    }

    public e9 b(Drawable drawable) {
        this.a.c = drawable;
        return this;
    }

    public void c(CharSequence charSequence) {
        this.a.f = charSequence;
    }

    public f9 create() {
        ListAdapter listAdapter;
        a9 a9Var = this.a;
        ContextThemeWrapper contextThemeWrapper = a9Var.a;
        ContextThemeWrapper contextThemeWrapper2 = a9Var.a;
        f9 f9Var = new f9(contextThemeWrapper, this.b);
        View view = a9Var.e;
        d9 d9Var = f9Var.t;
        int i = 0;
        if (view != null) {
            d9Var.w = view;
        } else {
            CharSequence charSequence = a9Var.d;
            if (charSequence != null) {
                d9Var.d = charSequence;
                TextView textView = d9Var.u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = a9Var.c;
            if (drawable != null) {
                d9Var.s = drawable;
                ImageView imageView = d9Var.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    d9Var.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = a9Var.f;
        if (charSequence2 != null) {
            d9Var.e = charSequence2;
            TextView textView2 = d9Var.v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = a9Var.g;
        if (charSequence3 != null) {
            d9Var.c(-1, charSequence3, a9Var.h);
        }
        CharSequence charSequence4 = a9Var.i;
        if (charSequence4 != null) {
            d9Var.c(-2, charSequence4, a9Var.j);
        }
        CharSequence charSequence5 = a9Var.k;
        if (charSequence5 != null) {
            d9Var.c(-3, charSequence5, a9Var.l);
        }
        if (a9Var.p != null || a9Var.q != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) a9Var.b.inflate(d9Var.A, (ViewGroup) null);
            if (a9Var.u) {
                listAdapter = new x8(a9Var, contextThemeWrapper2, d9Var.B, a9Var.p, alertController$RecycleListView);
            } else {
                int i2 = a9Var.v ? d9Var.C : d9Var.D;
                listAdapter = a9Var.q;
                if (listAdapter == null) {
                    listAdapter = new c9(contextThemeWrapper2, i2, R.id.text1, a9Var.p);
                }
            }
            d9Var.x = listAdapter;
            d9Var.y = a9Var.w;
            if (a9Var.r != null) {
                alertController$RecycleListView.setOnItemClickListener(new y8(i, a9Var, d9Var));
            } else if (a9Var.x != null) {
                alertController$RecycleListView.setOnItemClickListener(new z8(a9Var, alertController$RecycleListView, d9Var));
            }
            if (a9Var.v) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (a9Var.u) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            d9Var.f = alertController$RecycleListView;
        }
        View view2 = a9Var.s;
        if (view2 != null) {
            d9Var.g = view2;
            d9Var.h = false;
        }
        f9Var.setCancelable(a9Var.m);
        if (a9Var.m) {
            f9Var.setCanceledOnTouchOutside(true);
        }
        f9Var.setOnCancelListener(null);
        f9Var.setOnDismissListener(a9Var.n);
        ru2 ru2Var = a9Var.o;
        if (ru2Var != null) {
            f9Var.setOnKeyListener(ru2Var);
        }
        return f9Var;
    }

    public e9 d(CharSequence charSequence, ip3 ip3Var) {
        a9 a9Var = this.a;
        a9Var.i = charSequence;
        a9Var.j = ip3Var;
        return this;
    }

    public e9 e(int i, DialogInterface.OnClickListener onClickListener) {
        a9 a9Var = this.a;
        a9Var.k = a9Var.a.getText(i);
        a9Var.l = onClickListener;
        return this;
    }

    public e9 f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        a9 a9Var = this.a;
        a9Var.g = charSequence;
        a9Var.h = onClickListener;
        return this;
    }

    public void g(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        a9 a9Var = this.a;
        a9Var.p = charSequenceArr;
        a9Var.r = onClickListener;
        a9Var.w = i;
        a9Var.v = true;
    }

    public Context getContext() {
        return this.a.a;
    }

    public final f9 h() {
        f9 create = create();
        create.show();
        return create;
    }

    public e9 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        a9 a9Var = this.a;
        a9Var.i = a9Var.a.getText(i);
        a9Var.j = onClickListener;
        return this;
    }

    public e9 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        a9 a9Var = this.a;
        a9Var.g = a9Var.a.getText(i);
        a9Var.h = onClickListener;
        return this;
    }

    public e9 setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public e9 setView(View view) {
        this.a.s = view;
        return this;
    }

    public e9(Context context) {
        this(context, f9.j(context, 0));
    }
}
