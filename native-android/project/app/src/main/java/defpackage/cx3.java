package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cx3 {
    public static final List t = null;
    public final View a;
    public WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public cx3 h;
    public cx3 i;
    public int j;
    public ArrayList k;
    public List l;
    public int m;
    public hm2 n;
    public boolean o;
    public int p;
    public int q;
    public RecyclerView r;
    public dw3 s;

    static {
        t = Collections.EMPTY_LIST;
    }

    public cx3(View r4) {
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = null;
        this.i = null;
        this.k = null;
        this.l = null;
        this.m = 0;
        this.n = null;
        this.o = false;
        this.p = 0;
        this.q = -1;
        if (r4 == null) goto L6;
        this.a = r4;
        return;
    L6:
        kf2.n("itemView may not be null");
        throw null;
    }

    public final void a(int r2) {
        this.j = r2 | this.j;
    }

    public final int b() {
        RecyclerView r0 = this.r;
        if (r0 != null) goto L7;
        return -1;
    L7:
        return r0.K(this);
    }

    public final int c() {
        if (this.s != null) goto L5;
        return -1;
    L5:
        RecyclerView r0 = this.r;
        if (r0 != null) goto L8;
        return -1;
    L8:
        dw3 r1 = r0.getAdapter();
        if (r1 != null) goto L11;
        return -1;
    L11:
        int r2 = this.r.K(this);
        if (r2 != (-1)) goto L15;
        return -1;
    L15:
        if (this.s != r1) goto L17;
        return r2;
    L17:
        return -1;
    }

    public final int d() {
        int r0 = this.g;
        if (r0 == (-1)) goto L5;
        return r0;
    L5:
        return this.c;
    }

    public final List e() {
        if ((this.j & 1024) != 0) goto L12;
        ArrayList r0 = this.k;
        if (r0 == null) goto L12;
        if (r0.size() == 0) goto L12;
        return this.l;
    L12:
        return t;
    }

    public final boolean f() {
        View r0 = this.a;
        if (r0.getParent() != null) goto L5;
        return false;
    L5:
        if (r0.getParent() == this.r) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean g() {
        if ((this.j & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public final boolean h() {
        if ((this.j & 4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean i() {
        if ((this.j & 16) != 0) goto L8;
        WeakHashMap r0 = j65.a;
        if (this.a.hasTransientState() == true) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final boolean j() {
        if ((this.j & 8) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean k() {
        if (this.n == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean l() {
        if ((this.j & 256) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean m() {
        if ((this.j & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void n(int r3, boolean r4) {
        if (this.d != (-1)) goto L6;
        this.d = this.c;
    L6:
        if (this.g != (-1)) goto L8;
        this.g = this.c;
    L8:
        if (r4 == false) goto L10;
        this.g += r3;
    L10:
        this.c += r3;
        View r2 = this.a;
        if (r2.getLayoutParams() == null) goto L14;
        ((nw3) r2.getLayoutParams()).c = true;
        return;
    }

    public final void o() {
        if (RecyclerView.P0 == true) goto L5;
    L9:
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.g = -1;
        this.m = 0;
        this.h = null;
        this.i = null;
        ArrayList r2 = this.k;
        if (r2 == null) goto L12;
        r2.clear();
    L12:
        this.j &= -1025;
        this.p = 0;
        this.q = -1;
        RecyclerView.l(this);
        return;
    L5:
        if (l() == false) goto L9;
        nz2.w(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
    }

    public final void p(boolean r3) {
        int r0 = this.m;
        if (r3 == false) goto L5;
        int r1 = r0 - 1;
    L6:
        this.m = r1;
        if (r1 >= 0) goto L13;
        this.m = 0;
        if (RecyclerView.P0 == true) goto L12;
        Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    L20:
        if (RecyclerView.Q0 == false) goto L23;
        Log.d("RecyclerView", "setIsRecyclable val:" + r3 + ":" + this);
        return;
    L23:
        return;
    L12:
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    L13:
        if (r3 == true) goto L16;
        if (r1 != 1) goto L16;
        this.j |= 16;
    L16:
        if (r3 == false) goto L20;
        if (r1 != 0) goto L20;
        this.j &= -17;
        goto L20
    L5:
        r1 = r0 + 1;
        goto L6
    }

    public final boolean q() {
        if ((this.j & 128) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean r() {
        if ((this.j & 32) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final String toString() {
        if (getClass().isAnonymousClass() == false) goto L5;
        String r0 = "ViewHolder";
    L6:
        StringBuilder r1 = b11.s(r0, "{");
        r1.append(Integer.toHexString(hashCode()));
        r1.append(" position=");
        r1.append(this.c);
        r1.append(" id=");
        r1.append(this.e);
        r1.append(", oldPos=");
        r1.append(this.d);
        r1.append(", pLpos:");
        r1.append(this.g);
        StringBuilder r2 = new StringBuilder(r1.toString());
        if (k() == false) goto L14;
        r2.append(" scrap ");
        if (this.o == false) goto L11;
        String r3 = "[changeScrap]";
    L12:
        r2.append(r3);
        goto L14
    L11:
        r3 = "[attachedScrap]";
    L14:
        if (h() == false) goto L17;
        r2.append(" invalid");
    L17:
        if (g() == true) goto L20;
        r2.append(" unbound");
    L20:
        if ((this.j & 2) == 0) goto L23;
        r2.append(" update");
    L23:
        if (j() == false) goto L26;
        r2.append(" removed");
    L26:
        if (q() == false) goto L29;
        r2.append(" ignored");
    L29:
        if (l() == false) goto L32;
        r2.append(" tmpDetached");
    L32:
        if (i() == true) goto L35;
        r2.append(" not recyclable(" + this.m + ")");
    L35:
        if ((this.j & 512) == 0) goto L37;
    L38:
        r2.append(" undefined adapter position");
    L40:
        if (this.a.getParent() != null) goto L42;
        r2.append(" no parent");
    L42:
        r2.append("}");
        return r2.toString();
    L37:
        if (h() == false) goto L40;
    L5:
        r0 = getClass().getSimpleName();
        goto L6
    }
}
