/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.Directory;
import com.eddyizm.tempus.ui.fragment.DirectoryFragment;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.af;
import defpackage.j65;
import defpackage.ml3;
import java.util.WeakHashMap;

public final class pq0
implements af {
    public final DirectoryFragment a;
    public final Directory b;

    public pq0(DirectoryFragment directoryFragment, Directory directory) {
        this.a = directoryFragment;
        this.b = directory;
    }

    @Override
    public final void a(int n16) {
        Object object = this.a;
        Object object2 = ((DirectoryFragment)object).l0;
        if (object2 == null) {
            return;
        }
        int n17 = ((ConstraintLayout)((ml3)object2).c).getHeight();
        object2 = (MaterialToolbar)((DirectoryFragment)object).l0.f;
        WeakHashMap weakHashMap = j65.a;
        int n18 = ((View)object2).getMinimumHeight();
        object = ((DirectoryFragment)object).l0;
        if (n17 + n16 < n18 * 2) {
            ((MaterialToolbar)((ml3)object).f).setTitle(this.b.getName());
            return;
        }
        ((MaterialToolbar)((ml3)object).f).setTitle(2131951866);
    }
}

