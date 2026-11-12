package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mi4 extends cx3 {
    public final y12 u;
    public final /* synthetic */ ni4 v;

    public mi4(ni4 r4, y12 r5) {
        this.v = r4;
        ConstraintLayout r6 = r5.a;
        super(r6);
        this.u = r5;
        final int r1 = 1;
        r5.q.setSelected(true);
        r5.p.setSelected(true);
        final int r2 = 0;
        r6.setOnClickListener(new li4(this, r2));
        r6.setOnLongClickListener(new q6(24, this));
        r5.o.setOnClickListener(new li4(this, r1));
    }

    public final void s() {
        Bundle r0 = new Bundle();
        ni4 r1 = this.v;
        r0.putParcelable("TRACK_OBJECT", (Parcelable) r1.v.f.get(c()));
        r0.putInt("ITEM_POSITION", c());
        r1.q.onMediaLongClick(r0);
    }

    public final boolean t() {
        int r0 = c();
        if (r0 != (-1)) goto L6;
        return false;
    L6:
        ni4 r3 = this.v;
        rm3 r1 = r3.B;
        Child r4 = (Child) r3.v.f.get(r0);
        r1.getClass();
        r4.getClass();
        LinkedHashSet r2 = (LinkedHashSet) r1.n;
        if (r2.remove(r4.getId()) == true) goto L9;
        r2.add(r4.getId());
    L9:
        vo1 r5 = (vo1) r1.o;
        if (r5 == null) goto L14;
        r5.invoke();
        return true;
    L14:
        return true;
    }
}
