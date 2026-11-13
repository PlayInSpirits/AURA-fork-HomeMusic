/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.Context;
import android.view.View;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import defpackage.jz4;
import defpackage.ni4;
import defpackage.si4;
import java.util.List;

public final class to1
implements View.OnClickListener {
    public final Context n;
    public final List o;
    public final boolean p;
    public final SongListPageFragment q;
    public final ni4 r;
    public final List s;
    public final si4 t;

    public to1(Context context, List list, boolean bl5, SongListPageFragment songListPageFragment, ni4 ni42, List list2, si4 si42) {
        this.n = context;
        this.o = list;
        this.p = bl5;
        this.q = songListPageFragment;
        this.r = ni42;
        this.s = list2;
        this.t = si42;
    }

    @Override
    public final void onClick(View view) {
        jz4.J(this.n, this.o, true);
        if (this.p && this.q.T != null) {
            this.r.r(this.s);
            this.t.run();
        }
    }
}

