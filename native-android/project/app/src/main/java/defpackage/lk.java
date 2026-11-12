package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lk implements uw2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public lk(Context r2, jq0 r3) {
        this.a = 1;
        this.b = r2.getApplicationContext();
        this.c = r3;
    }

    @Override // defpackage.uw2
    public final boolean a(Object r6) {
        int r0 = this.a;
        Object r5 = this.b;
        switch(r0) {
            case 0: goto L20;
            case 1: goto L18;
            case 2: goto L12;
            case 3: goto L10;
            default: goto L4;
        };
    L4:
        Uri r7 = (Uri) r6;
        if ("android.resource".equals(r7.getScheme()) == true) goto L7;
        return false;
    L7:
        if (((Context) r5).getPackageName().equals(r7.getAuthority()) == true) goto L9;
        return false;
    L9:
        return true;
    L10:
        Integer r8 = (Integer) r6;
        return true;
    L12:
        ArrayList r9 = (ArrayList) r5;
        int r1 = r9.size();
        int r3 = 0;
    L13:
        if (r3 >= r1) goto L33;
        Object r4 = r9.get(r3);
        r3 = r3 + 1;
        if (((uw2) r4).a(r6) == false) goto L13;
        return true;
    L33:
        return false;
    L18:
        Integer r10 = (Integer) r6;
        return true;
    L20:
        Uri r11 = (Uri) r6;
        if ("file".equals(r11.getScheme()) == true) goto L23;
        return false;
    L23:
        if (r11.getPathSegments().isEmpty() == false) goto L25;
        return false;
    L25:
        if ("android_asset".equals(r11.getPathSegments().get(0)) == true) goto L27;
        return false;
    L27:
        return true;
    }

    @Override // defpackage.uw2
    public final tw2 b(Object r9, int r10, int r11, db3 r12) {
        int r0 = this.a;
        tw2 r3 = null;
        int r4 = 0;
        Object r5 = this.b;
        Object r8 = this.c;
        switch(r0) {
            case 0: goto L62;
            case 1: goto L56;
            case 2: goto L43;
            case 3: goto L31;
            default: goto L4;
        };
    L4:
        Uri r13 = (Uri) r9;
        uw2 r14 = (uw2) r8;
        List<String> r1 = r13.getPathSegments();
        if (r1.size() != 1) goto L20;
        int r2 = Integer.parseInt(r13.getPathSegments().get(0));     // Catch: NumberFormatException -> L12
        if (r2 == 0) goto L10;
        r3 = r14.b(Integer.valueOf(r2), r10, r11, r12);     // Catch: NumberFormatException -> L12
    L68:
        return r3;
    L10:
        if (Log.isLoggable("ResourceUriLoader", 5) == false) goto L68;
        Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + r13);     // Catch: NumberFormatException -> L12
    L12:
        e = move-exception;
        if (Log.isLoggable("ResourceUriLoader", 5) == false) goto L78;
        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + r13, e);
        return r3;
    L78:
        return r3;
    L20:
        if (r1.size() != 2) goto L28;
        List<String> r6 = r13.getPathSegments();
        String r7 = r6.get(0);
        Context r15 = (Context) r5;
        int r16 = r15.getResources().getIdentifier(r6.get(1), r7, r15.getPackageName());
        if (r16 != 0) goto L82;
        if (Log.isLoggable("ResourceUriLoader", 5) == false) goto L80;
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + r13);
        return null;
    L80:
        return null;
    L82:
        return r14.b(Integer.valueOf(r16), r10, r11, r12);
    L28:
        if (Log.isLoggable("ResourceUriLoader", 5) == false) goto L83;
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + r13);
        return null;
    L83:
        return null;
    L31:
        Integer r17 = (Integer) r9;
        Resources r18 = (Resources) r8;
        Uri r19 = Uri.parse("android.resource://" + r18.getResourcePackageName(r17.intValue()) + '/' + r18.getResourceTypeName(r17.intValue()) + '/' + r18.getResourceEntryName(r17.intValue()));     // Catch: Resources.NotFoundException -> L34
    L39:
        if (r19 != null) goto L42;
        return null;
    L42:
        return ((uw2) r5).b(r19, r10, r11, r12);
    L34:
        e = move-exception;
        if (Log.isLoggable("ResourceLoader", 5) == false) goto L38;
        Log.w("ResourceLoader", "Received invalid resource id: " + r17, e);
    L38:
        r19 = null;
        goto L39
    L43:
        ArrayList r20 = (ArrayList) r5;
        int r21 = r20.size();
        ArrayList r22 = new ArrayList(r21);
        f42 r23 = null;
    L44:
        if (r4 >= r21) goto L52;
        uw2 r24 = (uw2) r20.get(r4);
        if (r24.a(r9) == false) goto L50;
        tw2 r25 = r24.b(r9, r10, r11, r12);
        if (r25 == null) goto L50;
        r23 = r25.a;
        r22.add(r25.c);
    L50:
        r4 = r4 + 1;
        goto L44
    L52:
        if (r22.isEmpty() == true) goto L85;
        if (r23 != null) goto L55;
        return null;
    L55:
        return new tw2(r23, new bz2(r22, (io3) r8));
    L85:
        return null;
    L56:
        Integer r26 = (Integer) r9;
        Resources.Theme r110 = (Resources.Theme) r12.c(v04.b);
        if (r110 == null) goto L59;
        Resources r111 = r110.getResources();
    L61:
        return new tw2(new s73(r26), new kq0(r110, r111, (jq0) r8, r26.intValue()));
    L59:
        r111 = ((Context) r5).getResources();
        goto L61
    L62:
        Uri r27 = (Uri) r9;
        String r112 = r27.toString().substring(22);
        s73 r113 = new s73(r27);
        AssetManager r28 = (AssetManager) r5;
        switch(((kk) r8).a) {
            case 0: goto L65;
            default: goto L64;
        };
    L64:
        v61 r29 = new v61(r28, r112, 1);
    L67:
        return new tw2(r113, r29);
    L65:
        r29 = new v61(r28, r112, 0);
        goto L67
    }

    public String toString() {
        switch(this.a) {
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.b).toArray()) + '}';
    }

    public lk(Resources r2, uw2 r3) {
        this.a = 3;
        this.c = r2;
        this.b = r3;
    }

    public /* synthetic */ lk(int r1, Object r2, Object r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public lk(Context r2, uw2 r3) {
        this.a = 4;
        this.b = r2.getApplicationContext();
        this.c = r3;
    }
}
