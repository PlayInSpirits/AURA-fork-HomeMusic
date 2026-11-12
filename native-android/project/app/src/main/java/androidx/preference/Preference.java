package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import app.homemusic.R;
import defpackage.bp3;
import defpackage.bt3;
import defpackage.cp3;
import defpackage.dd1;
import defpackage.dp3;
import defpackage.ep3;
import defpackage.g5;
import defpackage.gi1;
import defpackage.i4;
import defpackage.j65;
import defpackage.kc1;
import defpackage.kf2;
import defpackage.kp3;
import defpackage.ld1;
import defpackage.np3;
import defpackage.po;
import defpackage.pp3;
import defpackage.rp3;
import defpackage.xa3;
import defpackage.zz1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public final String A;
    public Bundle B;
    public final boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final String G;
    public final Object H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public int S;
    public final int T;
    public np3 U;
    public ArrayList V;
    public PreferenceGroup W;
    public boolean X;
    public dp3 Y;
    public ep3 Z;
    public final i4 a0;
    public final Context n;
    public pp3 o;
    public long p;
    public boolean q;
    public bp3 r;
    public cp3 s;
    public int t;
    public CharSequence u;
    public CharSequence v;
    public int w;
    public Drawable x;
    public String y;
    public Intent z;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.t = Integer.MAX_VALUE;
        this.C = true;
        this.D = true;
        this.F = true;
        this.I = true;
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.O = true;
        this.R = true;
        this.S = R.layout.preference;
        this.a0 = new i4(13, this);
        this.n = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bt3.g, i, 0);
        this.w = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.y = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.u = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.v = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.t = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.A = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.S = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.T = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.C = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        this.D = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.F = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.G = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.L = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, this.D));
        this.M = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, this.D));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.H = o(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.H = o(typedArrayObtainStyledAttributes, 11);
        }
        this.R = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.N = zHasValue;
        if (zHasValue) {
            this.O = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.P = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.K = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.Q = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void u(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                u(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final void A(boolean z) {
        if (this.K != z) {
            this.K = z;
            np3 np3Var = this.U;
            if (np3Var != null) {
                Handler handler = np3Var.u;
                g5 g5Var = np3Var.v;
                handler.removeCallbacks(g5Var);
                handler.post(g5Var);
            }
        }
    }

    public boolean B() {
        return !g();
    }

    public final boolean C() {
        return (this.o == null || !this.F || TextUtils.isEmpty(this.y)) ? false : true;
    }

    public final void D() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.G;
        if (str != null) {
            pp3 pp3Var = this.o;
            Preference preferenceF = null;
            if (pp3Var != null && (preferenceScreen = (PreferenceScreen) pp3Var.g) != null) {
                preferenceF = preferenceScreen.F(str);
            }
            if (preferenceF == null || (arrayList = preferenceF.V) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public final boolean a(Serializable serializable) {
        bp3 bp3Var = this.r;
        return bp3Var == null || bp3Var.g(this, serializable);
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        if (TextUtils.isEmpty(this.y) || (parcelable = bundle.getParcelable(this.y)) == null) {
            return;
        }
        this.X = false;
        p(parcelable);
        if (this.X) {
            return;
        }
        kf2.o("Derived class did not call super.onRestoreInstanceState()");
    }

    public void c(Bundle bundle) {
        if (TextUtils.isEmpty(this.y)) {
            return;
        }
        this.X = false;
        Parcelable parcelableQ = q();
        if (!this.X) {
            kf2.o("Derived class did not call super.onSaveInstanceState()");
        } else if (parcelableQ != null) {
            bundle.putParcelable(this.y, parcelableQ);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.t;
        int i2 = preference2.t;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.u;
        CharSequence charSequence2 = preference2.u;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.u.toString());
    }

    public long d() {
        return this.p;
    }

    public final String e(String str) {
        return !C() ? str : this.o.d().getString(this.y, str);
    }

    public CharSequence f() {
        ep3 ep3Var = this.Z;
        return ep3Var != null ? ep3Var.r(this) : this.v;
    }

    public boolean g() {
        return this.C && this.I && this.J;
    }

    public void h() {
        int iIndexOf;
        np3 np3Var = this.U;
        if (np3Var == null || (iIndexOf = np3Var.s.indexOf(this)) == -1) {
            return;
        }
        np3Var.e(iIndexOf, this);
    }

    public void i(boolean z) {
        ArrayList arrayList = this.V;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.I == z) {
                preference.I = !z;
                preference.i(preference.B());
                preference.h();
            }
        }
    }

    public void j() {
        PreferenceScreen preferenceScreen;
        String str = this.G;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        pp3 pp3Var = this.o;
        Preference preferenceF = null;
        if (pp3Var != null && (preferenceScreen = (PreferenceScreen) pp3Var.g) != null) {
            preferenceF = preferenceScreen.F(str);
        }
        if (preferenceF == null) {
            StringBuilder sbJ = xa3.j("Dependency \"", str, "\" not found for preference \"");
            sbJ.append(this.y);
            sbJ.append("\" (title: \"");
            sbJ.append((Object) this.u);
            sbJ.append("\"");
            throw new IllegalStateException(sbJ.toString());
        }
        if (preferenceF.V == null) {
            preferenceF.V = new ArrayList();
        }
        preferenceF.V.add(this);
        boolean zB = preferenceF.B();
        if (this.I == zB) {
            this.I = !zB;
            i(B());
            h();
        }
    }

    public final void k(pp3 pp3Var) {
        long j;
        this.o = pp3Var;
        if (!this.q) {
            synchronized (pp3Var) {
                j = pp3Var.b;
                pp3Var.b = 1 + j;
            }
            this.p = j;
        }
        if (C()) {
            pp3 pp3Var2 = this.o;
            if ((pp3Var2 != null ? pp3Var2.d() : null).contains(this.y)) {
                r(null);
                return;
            }
        }
        Object obj = this.H;
        if (obj != null) {
            r(obj);
        }
    }

    public void l(rp3 rp3Var) {
        Integer numValueOf;
        View view = rp3Var.a;
        view.setOnClickListener(this.a0);
        view.setId(0);
        TextView textView = (TextView) rp3Var.s(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceF = f();
            if (TextUtils.isEmpty(charSequenceF)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceF);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) rp3Var.s(android.R.id.title);
        if (textView2 != null) {
            CharSequence charSequence = this.u;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.N) {
                    textView2.setSingleLine(this.O);
                }
                if (!this.D && g() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) rp3Var.s(android.R.id.icon);
        boolean z = this.P;
        if (imageView != null) {
            int i = this.w;
            if (i != 0 || this.x != null) {
                if (this.x == null) {
                    this.x = zz1.r(this.n, i);
                }
                Drawable drawable = this.x;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.x != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(z ? 4 : 8);
            }
        }
        View viewS = rp3Var.s(R.id.icon_frame);
        if (viewS == null) {
            viewS = rp3Var.s(android.R.id.icon_frame);
        }
        if (viewS != null) {
            if (this.x != null) {
                viewS.setVisibility(0);
            } else {
                viewS.setVisibility(z ? 4 : 8);
            }
        }
        if (this.R) {
            u(view, g());
        } else {
            u(view, true);
        }
        boolean z2 = this.D;
        view.setFocusable(z2);
        view.setClickable(z2);
        rp3Var.x = this.L;
        rp3Var.y = this.M;
        boolean z3 = this.Q;
        if (z3 && this.Y == null) {
            this.Y = new dp3(this);
        }
        view.setOnCreateContextMenuListener(z3 ? this.Y : null);
        view.setLongClickable(z3);
        if (!z3 || z2) {
            return;
        }
        WeakHashMap weakHashMap = j65.a;
        view.setBackground(null);
    }

    public void m() {
    }

    public void n() {
        D();
    }

    public Object o(TypedArray typedArray, int i) {
        return null;
    }

    public void p(Parcelable parcelable) {
        this.X = true;
        if (parcelable == AbsSavedState.EMPTY_STATE || parcelable == null) {
            return;
        }
        kf2.n("Wrong state class -- expecting Preference State");
    }

    public Parcelable q() {
        this.X = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void r(Object obj) {
    }

    public void s(View view) {
        kc1 kc1Var;
        String str;
        if (g() && this.D) {
            m();
            cp3 cp3Var = this.s;
            if (cp3Var != null) {
                cp3Var.j(this);
                return;
            }
            pp3 pp3Var = this.o;
            if (pp3Var == null || (kc1Var = (kp3) pp3Var.h) == null || (str = this.A) == null) {
                Intent intent = this.z;
                if (intent != null) {
                    this.n.startActivity(intent);
                    return;
                }
                return;
            }
            for (kc1 kc1Var2 = kc1Var; kc1Var2 != null; kc1Var2 = kc1Var2.I) {
            }
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            ld1 ld1VarQ = kc1Var.q();
            if (this.B == null) {
                this.B = new Bundle();
            }
            Bundle bundle = this.B;
            dd1 dd1VarF = ld1VarQ.F();
            kc1Var.X().getClassLoader();
            kc1 kc1VarA = dd1VarF.a(str);
            kc1VarA.c0(bundle);
            kc1VarA.f0(kc1Var);
            po poVar = new po(ld1VarQ);
            poVar.j(((View) kc1Var.a0().getParent()).getId(), kc1VarA, null);
            poVar.c(null);
            poVar.e(false);
        }
    }

    public final void t(String str) {
        if (C() && !TextUtils.equals(str, e(null))) {
            SharedPreferences.Editor editorC = this.o.c();
            editorC.putString(this.y, str);
            if (this.o.a) {
                return;
            }
            editorC.apply();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.u;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceF = f();
        if (!TextUtils.isEmpty(charSequenceF)) {
            sb.append(charSequenceF);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public final void v(int i) {
        Drawable drawableR = zz1.r(this.n, i);
        if (this.x != drawableR) {
            this.x = drawableR;
            this.w = 0;
            h();
        }
        this.w = i;
    }

    public final void w(int i) {
        x(this.n.getString(i));
    }

    public void x(CharSequence charSequence) {
        if (this.Z != null) {
            kf2.o("Preference already has a SummaryProvider set.");
        } else {
            if (TextUtils.equals(this.v, charSequence)) {
                return;
            }
            this.v = charSequence;
            h();
        }
    }

    public final void y(ep3 ep3Var) {
        this.Z = ep3Var;
        h();
    }

    public final void z(String str) {
        if (TextUtils.equals(str, this.u)) {
            return;
        }
        this.u = str;
        h();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gi1.p(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
