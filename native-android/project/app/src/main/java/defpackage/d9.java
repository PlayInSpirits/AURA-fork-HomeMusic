package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import app.homemusic.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d9 {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final boolean E;
    public final b9 F;
    public final i4 G;
    public final Context a;
    public final f9 b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public AlertController$RecycleListView f;
    public View g;
    public boolean h;
    public Button i;
    public CharSequence j;
    public Message k;
    public Button l;
    public CharSequence m;
    public Message n;
    public Button o;
    public CharSequence p;
    public Message q;
    public NestedScrollView r;
    public Drawable s;
    public ImageView t;
    public TextView u;
    public TextView v;
    public View w;
    public ListAdapter x;
    public int y;
    public final int z;

    public d9(Context r5, f9 r6, Window r7) {
        this.h = false;
        this.y = -1;
        this.G = new i4(2, this);
        this.a = r5;
        this.b = r6;
        this.c = r7;
        b9 r8 = new b9();
        r8.b = new WeakReference(r6);
        this.F = r8;
        TypedArray r9 = r5.obtainStyledAttributes(null, st3.e, R.attr.alertDialogStyle, 0);
        this.z = r9.getResourceId(0, 0);
        r9.getResourceId(2, 0);
        this.A = r9.getResourceId(4, 0);
        this.B = r9.getResourceId(5, 0);
        this.C = r9.getResourceId(7, 0);
        this.D = r9.getResourceId(3, 0);
        this.E = r9.getBoolean(6, true);
        r9.getDimensionPixelSize(1, 0);
        r9.recycle();
        r6.e().i(1);
    }

    public static boolean a(View r4) {
        if (r4.onCheckIsTextEditor() == false) goto L6;
        return true;
    L6:
        if ((r4 instanceof ViewGroup) == true) goto L8;
        return false;
    L8:
        ViewGroup r5 = (ViewGroup) r4;
        int r0 = r5.getChildCount();
    L9:
        if (r0 <= 0) goto L13;
        r0 = r0 - 1;
        if (a(r5.getChildAt(r0)) == false) goto L9;
        return true;
    L13:
        return false;
    }

    public static ViewGroup b(View r2, View r3) {
        if (r2 == null) goto L4;
        if (r3 == null) goto L13;
        ViewParent r0 = r3.getParent();
        if ((r0 instanceof ViewGroup) == false) goto L13;
        ((ViewGroup) r0).removeView(r3);
    L13:
        if ((r2 instanceof ViewStub) == false) goto L16;
        r2 = ((ViewStub) r2).inflate();
    L16:
        return (ViewGroup) r2;
    L4:
        if ((r3 instanceof ViewStub) == false) goto L7;
        r3 = ((ViewStub) r3).inflate();
    L7:
        return (ViewGroup) r3;
    }

    public final void c(int r2, CharSequence r3, DialogInterface.OnClickListener r4) {
        if (r4 == null) goto L4;
        Message r5 = this.F.obtainMessage(r2, r4);
    L6:
        if (r2 != (-3)) goto L8;
        this.p = r3;
        this.q = r5;
        return;
    L8:
        if (r2 != (-2)) goto L10;
        this.m = r3;
        this.n = r5;
        return;
    L10:
        if (r2 != (-1)) goto L13;
        this.j = r3;
        this.k = r5;
        return;
    L13:
        kf2.n("Button does not exist");
        return;
    L4:
        r5 = null;
        goto L6
    }
}
