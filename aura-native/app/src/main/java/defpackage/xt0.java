/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.function.Function;

public final class xt0
implements Function {
    public final String a;
    public final String b;

    public xt0(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public final Object apply(Object object) {
        object = new Download((Child)object);
        ((Download)object).setPlaylistId(this.a);
        ((Download)object).setPlaylistName(this.b);
        return object;
    }
}

