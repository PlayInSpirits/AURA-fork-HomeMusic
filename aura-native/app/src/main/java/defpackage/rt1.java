/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.app.Activity;
import android.widget.TextView;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.dx2;
import defpackage.gf1;
import defpackage.j15;
import defpackage.pc3;
import defpackage.q82;
import defpackage.rg1;
import defpackage.su3;
import defpackage.wf1;
import defpackage.xl;

public final class rt1
implements wf1 {
    public final int n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;

    public rt1(LinearProgressIndicator linearProgressIndicator, TextView textView, HubUpdater hubUpdater, Activity activity) {
        this.n = 0;
        this.o = linearProgressIndicator;
        this.p = textView;
        this.q = hubUpdater;
        this.r = activity;
    }

    public rt1(gf1 gf12, dx2 dx22, q82 q822, pc3 pc32, int n16) {
        this.n = 1;
        this.o = gf12;
        this.p = dx22;
        this.q = q822;
        this.r = pc32;
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        int n16 = this.n;
        Object object3 = this.r;
        Object object4 = this.q;
        Object object5 = this.p;
        Object object6 = this.o;
        switch (n16) {
            default: {
                object6 = (gf1)object6;
                object5 = (dx2)object5;
                object4 = (q82)object4;
                object3 = (pc3)object3;
                object = (rg1)object;
                ((Integer)object2).getClass();
                su3.b((gf1)object6, (dx2)object5, (q82)object4, (pc3)object3, (rg1)object, xl.O(1));
                return j15.a;
            }
            case 0: 
        }
        object6 = (LinearProgressIndicator)object6;
        object5 = (TextView)object5;
        object4 = (HubUpdater)object4;
        object3 = (Activity)object3;
        return HubUpdater.b((Long)object, (LinearProgressIndicator)object6, (TextView)object5, (Long)object2, (HubUpdater)object4, (Activity)object3);
    }
}

