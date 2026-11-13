/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import defpackage.hv2;
import defpackage.qu2;
import defpackage.tu2;
import defpackage.ub2;
import java.util.ArrayList;

public final class tb2
extends BaseAdapter {
    public int n;
    public final ub2 o;

    public tb2(ub2 ub22) {
        this.o = ub22;
        this.n = -1;
        this.a();
    }

    public final void a() {
        Object object = this.o.p;
        tu2 tu22 = ((qu2)object).v;
        if (tu22 != null) {
            ((qu2)object).i();
            object = ((qu2)object).j;
            int n16 = ((ArrayList)object).size();
            for (int i16 = 0; i16 < n16; ++i16) {
                if ((tu2)((ArrayList)object).get(i16) != tu22) continue;
                this.n = i16;
                return;
            }
        }
        this.n = -1;
    }

    public final tu2 b(int n16) {
        ub2 ub22 = this.o;
        Object object = ub22.p;
        ((qu2)object).i();
        object = ((qu2)object).j;
        ub22.getClass();
        int n17 = this.n;
        int n18 = n16;
        if (n17 >= 0) {
            n18 = n16;
            if (n16 >= n17) {
                n18 = n16 + 1;
            }
        }
        return (tu2)((ArrayList)object).get(n18);
    }

    @Override
    public final int getCount() {
        ub2 ub22 = this.o;
        qu2 qu22 = ub22.p;
        qu22.i();
        int n16 = qu22.j.size();
        ub22.getClass();
        if (this.n < 0) {
            return n16;
        }
        return n16 - 1;
    }

    @Override
    public final Object getItem(int n16) {
        return this.b(n16);
    }

    @Override
    public final long getItemId(int n16) {
        return n16;
    }

    @Override
    public final View getView(int n16, View view, ViewGroup viewGroup) {
        View view2 = view;
        if (view == null) {
            view2 = this.o.o.inflate(2131558416, viewGroup, false);
        }
        ((hv2)((Object)view2)).c(this.b(n16));
        return view2;
    }

    @Override
    public final void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}

