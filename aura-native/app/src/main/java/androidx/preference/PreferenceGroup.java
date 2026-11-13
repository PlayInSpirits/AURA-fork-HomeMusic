package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import defpackage.bt3;
import defpackage.g5;
import defpackage.kf2;
import defpackage.lp3;
import defpackage.np3;
import defpackage.pp3;
import defpackage.yd4;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final yd4 b0;
    public final Handler c0;
    public final ArrayList d0;
    public boolean e0;
    public int f0;
    public boolean g0;
    public int h0;
    public final g5 i0;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.b0 = new yd4(0);
        this.c0 = new Handler(Looper.getMainLooper());
        this.e0 = true;
        this.f0 = 0;
        this.g0 = false;
        this.h0 = Integer.MAX_VALUE;
        this.i0 = new g5(24, this);
        this.d0 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bt3.i, i, 0);
        this.e0 = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i3 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && TextUtils.isEmpty(this.y)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.h0 = i3;
        }
        obtainStyledAttributes.recycle();
    }

    public final void E(Preference preference) {
        long j;
        if (this.d0.contains(preference)) {
            return;
        }
        if (preference.y != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.W;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            String str = preference.y;
            if (preferenceGroup.F(str) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        int i = preference.t;
        if (i == Integer.MAX_VALUE) {
            if (this.e0) {
                int i2 = this.f0;
                this.f0 = i2 + 1;
                if (i2 != i) {
                    preference.t = i2;
                    np3 np3Var = preference.U;
                    if (np3Var != null) {
                        Handler handler = np3Var.u;
                        g5 g5Var = np3Var.v;
                        handler.removeCallbacks(g5Var);
                        handler.post(g5Var);
                    }
                }
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).e0 = this.e0;
            }
        }
        int binarySearch = Collections.binarySearch(this.d0, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        boolean B = B();
        if (preference.J == B) {
            preference.J = !B;
            preference.i(preference.B());
            preference.h();
        }
        synchronized (this) {
            this.d0.add(binarySearch, preference);
        }
        pp3 pp3Var = this.o;
        String str2 = preference.y;
        if (str2 == null || !this.b0.containsKey(str2)) {
            synchronized (pp3Var) {
                j = pp3Var.b;
                pp3Var.b = 1 + j;
            }
        } else {
            j = ((Long) this.b0.get(str2)).longValue();
            this.b0.remove(str2);
        }
        preference.p = j;
        preference.q = true;
        try {
            preference.k(pp3Var);
            preference.q = false;
            if (preference.W != null) {
                kf2.o("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                return;
            }
            preference.W = this;
            if (this.g0) {
                preference.j();
            }
            np3 np3Var2 = this.U;
            if (np3Var2 != null) {
                Handler handler2 = np3Var2.u;
                g5 g5Var2 = np3Var2.v;
                handler2.removeCallbacks(g5Var2);
                handler2.post(g5Var2);
            }
        } catch (Throwable th) {
            preference.q = false;
            throw th;
        }
    }

    public final Preference F(CharSequence charSequence) {
        Preference F;
        if (charSequence == null) {
            kf2.n("Key cannot be null");
            return null;
        }
        if (TextUtils.equals(this.y, charSequence)) {
            return this;
        }
        int size = this.d0.size();
        for (int i = 0; i < size; i++) {
            Preference G = G(i);
            if (TextUtils.equals(G.y, charSequence)) {
                return G;
            }
            if ((G instanceof PreferenceGroup) && (F = ((PreferenceGroup) G).F(charSequence)) != null) {
                return F;
            }
        }
        return null;
    }

    public final Preference G(int i) {
        return (Preference) this.d0.get(i);
    }

    public final void H() {
        synchronized (this) {
            try {
                ArrayList arrayList = this.d0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    I((Preference) arrayList.get(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        np3 np3Var = this.U;
        if (np3Var != null) {
            Handler handler = np3Var.u;
            g5 g5Var = np3Var.v;
            handler.removeCallbacks(g5Var);
            handler.post(g5Var);
        }
    }

    public final boolean I(Preference preference) {
        boolean remove;
        synchronized (this) {
            try {
                preference.D();
                if (preference.W == this) {
                    preference.W = null;
                }
                remove = this.d0.remove(preference);
                if (remove) {
                    String str = preference.y;
                    if (str != null) {
                        this.b0.put(str, Long.valueOf(preference.d()));
                        this.c0.removeCallbacks(this.i0);
                        this.c0.post(this.i0);
                    }
                    if (this.g0) {
                        preference.n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return remove;
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.d0.size();
        for (int i = 0; i < size; i++) {
            G(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void c(Bundle bundle) {
        super.c(bundle);
        int size = this.d0.size();
        for (int i = 0; i < size; i++) {
            G(i).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void i(boolean z) {
        super.i(z);
        int size = this.d0.size();
        for (int i = 0; i < size; i++) {
            Preference G = G(i);
            if (G.J == z) {
                G.J = !z;
                G.i(G.B());
                G.h();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void j() {
        super.j();
        this.g0 = true;
        int size = this.d0.size();
        for (int i = 0; i < size; i++) {
            G(i).j();
        }
    }

    @Override // androidx.preference.Preference
    public final void n() {
        D();
        this.g0 = false;
        int size = this.d0.size();
        for (int i = 0; i < size; i++) {
            G(i).n();
        }
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(lp3.class)) {
            super.p(parcelable);
            return;
        }
        lp3 lp3Var = (lp3) parcelable;
        this.h0 = lp3Var.n;
        super.p(lp3Var.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        super.q();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new lp3(this.h0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
