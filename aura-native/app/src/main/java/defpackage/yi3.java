/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.text.TextUtils;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.LyricsList;
import defpackage.a83;
import defpackage.aj3;
import defpackage.ud3;

public final class yi3
implements a83 {
    public final int a;
    public final aj3 b;
    public final Child c;

    public yi3(aj3 aj32, Child child, int n16) {
        this.a = n16;
        this.b = aj32;
        this.c = child;
    }

    @Override
    public final void b(Object object) {
        int n16 = this.a;
        Child child = this.c;
        aj3 aj32 = this.b;
        switch (n16) {
            default: {
                object = (String)object;
                aj32.j.i(object);
                aj32.k.i(null);
                if (ud3.O() && !TextUtils.isEmpty((CharSequence)object)) {
                    aj32.g(child, (String)object, null);
                }
                return;
            }
            case 0: 
        }
        object = (LyricsList)object;
        aj32.k.i(object);
        aj32.j.i(null);
        if (ud3.O() && aj3.d((LyricsList)object)) {
            aj32.g(child, null, (LyricsList)object);
        }
    }
}

