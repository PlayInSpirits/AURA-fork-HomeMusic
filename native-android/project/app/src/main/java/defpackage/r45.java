package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r45 {
    public static final /* synthetic */ int a = 0;

    static {
        hn2.a("media3.database");
    }

    public static int a(SQLiteDatabase r10, int r11, String r12) {
        /*  JADX ERROR: Simple mode code generation failed
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:361)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:354)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:316)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:279)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            */
        /*
            java.lang.String r0 = "ExoPlayerVersions"
            boolean r0 = defpackage.f35.f0(r10, r0)     // Catch: android.database.SQLException -> L48
            r1 = -1
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r3 = "ExoPlayerVersions"
            java.lang.String r0 = "version"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: android.database.SQLException -> L48
            java.lang.String r5 = "feature = ? AND instance_uid = ?"
            java.lang.String r11 = java.lang.Integer.toString(r11)     // Catch: android.database.SQLException -> L48
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: android.database.SQLException -> L48
            r8 = 0
            r9 = 0
            r7 = 0
            r2 = r10
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: android.database.SQLException -> L48
            int r11 = r10.getCount()     // Catch: java.lang.Throwable -> L3a
            if (r11 != 0) goto L2e
            r10.close()     // Catch: android.database.SQLException -> L48
            return r1
        L2e:
            r10.moveToNext()     // Catch: java.lang.Throwable -> L3a
            r11 = 0
            int r11 = r10.getInt(r11)     // Catch: java.lang.Throwable -> L3a
            r10.close()     // Catch: android.database.SQLException -> L48
            return r11
        L3a:
            r0 = move-exception
            r11 = r0
            if (r10 == 0) goto L47
            r10.close()     // Catch: java.lang.Throwable -> L42
            goto L47
        L42:
            r0 = move-exception
            r10 = r0
            r11.addSuppressed(r10)     // Catch: android.database.SQLException -> L48
        L47:
            throw r11     // Catch: android.database.SQLException -> L48
        L48:
            r0 = move-exception
            r10 = r0
            androidx.media3.database.DatabaseIOException r11 = new androidx.media3.database.DatabaseIOException
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r45.a(android.database.sqlite.SQLiteDatabase, int, java.lang.String):int");
    }

    public static void b(SQLiteDatabase r2, int r3, String r4, int r5) {
        r2.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");     // Catch: SQLException -> L4
        ContentValues r0 = new ContentValues();     // Catch: SQLException -> L4
        r0.put("feature", Integer.valueOf(r3));     // Catch: SQLException -> L4
        r0.put("instance_uid", r4);     // Catch: SQLException -> L4
        r0.put("version", Integer.valueOf(r5));     // Catch: SQLException -> L4
        r2.replaceOrThrow("ExoPlayerVersions", null, r0);     // Catch: SQLException -> L4
        return;
    L4:
        e = move-exception;
        throw new DatabaseIOException(e);
    }
}
