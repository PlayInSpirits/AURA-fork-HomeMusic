/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import java.util.List;
import java.util.function.Consumer;

public final class qi4
implements Consumer {
    public final SongListPageFragment a;
    public final int b;

    public qi4(SongListPageFragment songListPageFragment, int n16) {
        this.a = songListPageFragment;
        this.b = n16;
    }

    public final void accept(Object object) {
        int n16;
        object = (List)object;
        SongListPageFragment songListPageFragment = this.a;
        if (songListPageFragment.l0 != null && this.b == (n16 = songListPageFragment.s0)) {
            songListPageFragment.r0 = false;
            songListPageFragment.p0.r((List)object);
            songListPageFragment.j0();
            songListPageFragment.k0((List)object);
        }
    }
}

