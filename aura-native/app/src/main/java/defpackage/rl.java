/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.media.AudioManager;
import defpackage.il;
import defpackage.q41;
import defpackage.tl;
import defpackage.xa3;
import defpackage.xp4;
import defpackage.yp4;

public final class rl
implements AudioManager.OnAudioFocusChangeListener {
    public final tl a;

    public rl(tl tl5) {
        this.a = tl5;
    }

    @Override
    public final void onAudioFocusChange(int n16) {
        Object object;
        Object object2 = this.a;
        object2.getClass();
        if (n16 != -3 && n16 != -2) {
            if (n16 != -1) {
                if (n16 != 1) {
                    xa3.m(n16, "Unknown focus change type: ", "AudioFocusManager");
                    return;
                }
                ((tl)object2).b(2);
                object2 = ((tl)object2).c;
                if (object2 != null) {
                    yp4 yp42 = ((q41)object2).u;
                    yp42.getClass();
                    object2 = yp4.c();
                    ((xp4)object2).a = yp42.a.obtainMessage(33, 1, 0);
                    ((xp4)object2).b();
                }
                return;
            }
            Object object3 = ((tl)object2).c;
            if (object3 != null) {
                object3 = ((q41)object3).u;
                object3.getClass();
                xp4 xp42 = yp4.c();
                xp42.a = ((yp4)object3).a.obtainMessage(33, -1, 0);
                xp42.b();
            }
            ((tl)object2).a();
            ((tl)object2).b(1);
            return;
        }
        if (n16 != -2 && ((object = ((tl)object2).d) == null || ((il)object).a != 1)) {
            ((tl)object2).b(4);
            return;
        }
        object = ((tl)object2).c;
        if (object != null) {
            yp4 yp43 = ((q41)object).u;
            yp43.getClass();
            object = yp4.c();
            ((xp4)object).a = yp43.a.obtainMessage(33, 0, 0);
            ((xp4)object).b();
        }
        ((tl)object2).b(3);
    }
}

