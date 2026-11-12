package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class np3 extends dw3 {
    public final PreferenceGroup q;
    public ArrayList r;
    public ArrayList s;
    public final ArrayList t;
    public final g5 v = new g5(25, this);
    public final Handler u = new Handler(Looper.getMainLooper());

    public np3(PreferenceGroup preferenceGroup) {
        this.q = preferenceGroup;
        preferenceGroup.U = this;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            o(((PreferenceScreen) preferenceGroup).j0);
        } else {
            o(true);
        }
        s();
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.s.size();
    }

    @Override // defpackage.dw3
    public final long b(int i) {
        if (this.o) {
            return r(i).d();
        }
        return -1L;
    }

    @Override // defpackage.dw3
    public final int c(int i) {
        mp3 mp3Var = new mp3(r(i));
        ArrayList arrayList = this.t;
        int iIndexOf = arrayList.indexOf(mp3Var);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        int size = arrayList.size();
        arrayList.add(mp3Var);
        return size;
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        rp3 rp3Var = (rp3) cx3Var;
        Preference preferenceR = r(i);
        ColorStateList colorStateList = rp3Var.v;
        View view = rp3Var.a;
        Drawable background = view.getBackground();
        Drawable drawable = rp3Var.u;
        if (background != drawable) {
            WeakHashMap weakHashMap = j65.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) rp3Var.s(R.id.title);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        preferenceR.l(rp3Var);
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        mp3 mp3Var = (mp3) this.t.get(i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        TypedArray typedArrayObtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, bt3.a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = zz1.r(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = layoutInflaterFrom.inflate(mp3Var.a, viewGroup, false);
        if (viewInflate.getBackground() == null) {
            WeakHashMap weakHashMap = j65.a;
            viewInflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = mp3Var.b;
            if (i2 != 0) {
                layoutInflaterFrom.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new rp3(viewInflate);
    }

    public final ArrayList p(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.d0.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            CharSequence string = null;
            if (i2 >= size) {
                int i4 = preferenceGroup.h0;
                if (i4 != Integer.MAX_VALUE && i3 > i4) {
                    Context context = preferenceGroup.n;
                    long j = preferenceGroup.p;
                    u41 u41Var = new u41(context, null);
                    u41Var.S = app.homemusic.R.layout.expand_button;
                    u41Var.v(app.homemusic.R.drawable.ic_arrow_down_24dp);
                    Context context2 = u41Var.n;
                    u41Var.z(context2.getString(app.homemusic.R.string.expand_button_title));
                    if (999 != u41Var.t) {
                        u41Var.t = 999;
                        np3 np3Var = u41Var.U;
                        if (np3Var != null) {
                            Handler handler = np3Var.u;
                            g5 g5Var = np3Var.v;
                            handler.removeCallbacks(g5Var);
                            handler.post(g5Var);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj = arrayList2.get(i);
                        i++;
                        Preference preference = (Preference) obj;
                        CharSequence charSequence = preference.u;
                        boolean z = preference instanceof PreferenceGroup;
                        if (z && !TextUtils.isEmpty(charSequence)) {
                            arrayList3.add((PreferenceGroup) preference);
                        }
                        if (arrayList3.contains(preference.W)) {
                            if (z) {
                                arrayList3.add((PreferenceGroup) preference);
                            }
                        } else if (!TextUtils.isEmpty(charSequence)) {
                            string = string == null ? charSequence : context2.getString(app.homemusic.R.string.summary_collapsed_preference_list, string, charSequence);
                        }
                    }
                    u41Var.x(string);
                    u41Var.b0 = j + 1000000;
                    u41Var.s = new qr2(16, this, preferenceGroup);
                    arrayList.add(u41Var);
                }
                return arrayList;
            }
            Preference preferenceG = preferenceGroup.G(i2);
            if (preferenceG.K) {
                int i5 = preferenceGroup.h0;
                if (i5 == Integer.MAX_VALUE || i3 < i5) {
                    arrayList.add(preferenceG);
                } else {
                    arrayList2.add(preferenceG);
                }
                if (preferenceG instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceG;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else {
                        if (preferenceGroup.h0 != Integer.MAX_VALUE && preferenceGroup2.h0 != Integer.MAX_VALUE) {
                            kf2.o("Nesting an expandable group inside of another expandable group is not supported!");
                            return null;
                        }
                        ArrayList arrayListP = p(preferenceGroup2);
                        int size3 = arrayListP.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            Object obj2 = arrayListP.get(i6);
                            i6++;
                            Preference preference2 = (Preference) obj2;
                            int i7 = preferenceGroup.h0;
                            if (i7 == Integer.MAX_VALUE || i3 < i7) {
                                arrayList.add(preference2);
                            } else {
                                arrayList2.add(preference2);
                            }
                            i3++;
                        }
                    }
                } else {
                    i3++;
                }
            }
            i2++;
        }
    }

    public final void q(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.d0);
        }
        int size = preferenceGroup.d0.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceG = preferenceGroup.G(i);
            arrayList.add(preferenceG);
            mp3 mp3Var = new mp3(preferenceG);
            if (!this.t.contains(mp3Var)) {
                this.t.add(mp3Var);
            }
            if (preferenceG instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preferenceG;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    q(arrayList, preferenceGroup2);
                }
            }
            preferenceG.U = this;
        }
    }

    public final Preference r(int i) {
        if (i < 0 || i >= this.s.size()) {
            return null;
        }
        return (Preference) this.s.get(i);
    }

    public final void s() {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Preference) obj).U = null;
        }
        ArrayList arrayList2 = new ArrayList(this.r.size());
        this.r = arrayList2;
        PreferenceGroup preferenceGroup = this.q;
        q(arrayList2, preferenceGroup);
        this.s = p(preferenceGroup);
        d();
        ArrayList arrayList3 = this.r;
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            ((Preference) obj2).getClass();
        }
    }
}
