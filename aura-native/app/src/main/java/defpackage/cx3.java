package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class cx3 {
    public static final List t = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int j;
    public RecyclerView r;
    public dw3 s;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public cx3 h = null;
    public cx3 i = null;
    public ArrayList k = null;
    public List l = null;
    public int m = 0;
    public hm2 n = null;
    public boolean o = false;
    public int p = 0;
    public int q = -1;

    public cx3(View view) {
        if (view != null) {
            this.a = view;
        } else {
            kf2.n("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i) {
        this.j = i | this.j;
    }

    public final int b() {
        RecyclerView recyclerView = this.r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.K(this);
    }

    public final int c() {
        RecyclerView recyclerView;
        dw3 adapter;
        int K;
        if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (K = this.r.K(this)) == -1 || this.s != adapter) {
            return -1;
        }
        return K;
    }

    public final int d() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final List e() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) ? t : this.l;
    }

    public final boolean f() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.r) ? false : true;
    }

    public final boolean g() {
        return (this.j & 1) != 0;
    }

    public final boolean h() {
        return (this.j & 4) != 0;
    }

    public final boolean i() {
        if ((this.j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = j65.a;
        return !this.a.hasTransientState();
    }

    public final boolean j() {
        return (this.j & 8) != 0;
    }

    public final boolean k() {
        return this.n != null;
    }

    public final boolean l() {
        return (this.j & 256) != 0;
    }

    public final boolean m() {
        return (this.j & 2) != 0;
    }

    public final void n(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z) {
            this.g += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((nw3) view.getLayoutParams()).c = true;
        }
    }

    public final void o() {
        if (RecyclerView.P0 && l()) {
            nz2.w(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
            return;
        }
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.p = 0;
        this.q = -1;
        RecyclerView.l(this);
    }

    public final void p(boolean z) {
        int i = this.m;
        int i2 = z ? i - 1 : i + 1;
        this.m = i2;
        if (i2 < 0) {
            this.m = 0;
            if (RecyclerView.P0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z && i2 == 1) {
            this.j |= 16;
        } else if (z && i2 == 0) {
            this.j &= -17;
        }
        if (RecyclerView.Q0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    public final boolean q() {
        return (this.j & 128) != 0;
    }

    public final boolean r() {
        return (this.j & 32) != 0;
    }

    public final String toString() {
        StringBuilder s = b11.s(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        s.append(Integer.toHexString(hashCode()));
        s.append(" position=");
        s.append(this.c);
        s.append(" id=");
        s.append(this.e);
        s.append(", oldPos=");
        s.append(this.d);
        s.append(", pLpos:");
        s.append(this.g);
        StringBuilder sb = new StringBuilder(s.toString());
        if (k()) {
            sb.append(" scrap ");
            sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (q()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.m + ")");
        }
        if ((this.j & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
