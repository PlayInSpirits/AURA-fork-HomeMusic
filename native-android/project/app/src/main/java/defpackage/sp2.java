package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sp2 {
    public final Bundle a;

    public sp2(Bundle r1) {
        this.a = r1;
    }

    public final HashSet a() {
        Bundle r2 = this.a;
        if (r2.containsKey("allowedPackages") == true) goto L7;
        return new HashSet();
    L7:
        return new HashSet(r2.getStringArrayList("allowedPackages"));
    }

    public final ArrayList b() {
        Bundle r2 = this.a;
        if (r2.containsKey("controlFilters") == true) goto L7;
        return new ArrayList();
    L7:
        return new ArrayList(r2.getParcelableArrayList("controlFilters"));
    }

    public final ArrayList c() {
        Bundle r2 = this.a;
        if (r2.containsKey("groupMemberIds") == true) goto L7;
        return new ArrayList();
    L7:
        return new ArrayList(r2.getStringArrayList("groupMemberIds"));
    }

    public final String d() {
        return this.a.getString("id");
    }

    public final boolean e() {
        if (TextUtils.isEmpty(d()) == false) goto L5;
        return false;
    L5:
        if (TextUtils.isEmpty(this.a.getString("name")) == false) goto L7;
        return false;
    L7:
        if (b().contains(null) == true) goto L14;
        return true;
    L14:
        return false;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("MediaRouteDescriptor{ id=");
        r0.append(d());
        r0.append(", groupMemberIds=");
        r0.append(c());
        r0.append(", name=");
        Bundle r2 = this.a;
        r0.append(r2.getString("name"));
        r0.append(", description=");
        r0.append(r2.getString("status"));
        r0.append(", iconUri=");
        String r1 = r2.getString("iconUri");
        if (r1 != null) goto L5;
        Uri r3 = null;
    L6:
        r0.append(r3);
        r0.append(", isEnabled=");
        r0.append(r2.getBoolean("enabled", true));
        r0.append(", isSystemRoute=");
        r0.append(r2.getBoolean("isSystemRoute", false));
        r0.append(", connectionState=");
        r0.append(r2.getInt("connectionState", 0));
        r0.append(", controlFilters=");
        r0.append(Arrays.toString(b().toArray()));
        r0.append(", playbackType=");
        r0.append(r2.getInt("playbackType", 1));
        r0.append(", playbackStream=");
        r0.append(r2.getInt("playbackStream", -1));
        r0.append(", deviceType=");
        r0.append(r2.getInt("deviceType"));
        r0.append(", volume=");
        r0.append(r2.getInt("volume"));
        r0.append(", volumeMax=");
        r0.append(r2.getInt("volumeMax"));
        r0.append(", volumeHandling=");
        r0.append(r2.getInt("volumeHandling", 0));
        r0.append(", presentationDisplayId=");
        r0.append(r2.getInt("presentationDisplayId", -1));
        r0.append(", extras=");
        r0.append(r2.getBundle("extras"));
        r0.append(", isValid=");
        r0.append(e());
        r0.append(", minClientVersion=");
        r0.append(r2.getInt("minClientVersion", 1));
        r0.append(", maxClientVersion=");
        r0.append(r2.getInt("maxClientVersion", Integer.MAX_VALUE));
        r0.append(", isVisibilityPublic=");
        r0.append(r2.getBoolean("isVisibilityPublic", true));
        r0.append(", allowedPackages=");
        r0.append(Arrays.toString(a().toArray()));
        r0.append(" }");
        return r0.toString();
    L5:
        r3 = Uri.parse(r1);
        goto L6
    }
}
