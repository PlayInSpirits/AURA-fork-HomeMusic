package com.eddyizm.tempus.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import defpackage.t6;
import defpackage.ud3;
import defpackage.wg0;
import defpackage.xt3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AlbumArtContentProvider extends ContentProvider {
    public static final /* synthetic */ int o = 0;
    public ExecutorService n;

    static {
        new UriMatcher(-1).addURI("app.homemusic.albumart.provider", "albumArt/*", 1);
    }

    public AlbumArtContentProvider() {
    }

    public static Uri a(String r2) {
        return new Uri.Builder().scheme("content").authority("app.homemusic.albumart.provider").appendPath("albumArt").appendPath(r2).build();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri r1, String r2, String[] r3) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri r1) {
        return "";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri r1, ContentValues r2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.n = Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors() / 2));
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri r7, String r8) {
        Context r3 = getContext();
        String r9 = r7.getLastPathSegment();
        if (r9 != null) goto L5;
    L7:
        if (r9 != null) goto L9;
    L12:
        Uri r10 = Uri.parse(wg0.b(ud3.t(), r9));
    L11:
        Uri r4 = r10;
        File r2 = null;
    L18:
        ParcelFileDescriptor[] r11 = ParcelFileDescriptor.createPipe();     // Catch: IOException -> L15
        ParcelFileDescriptor r12 = r11[0];     // Catch: IOException -> L15
        this.n.execute(new t6(r11[1], r2, r3, r4, 0));     // Catch: IOException -> L15
        return r12;
    L15:
        e = move-exception;
        throw new FileNotFoundException("Could not create pipe: " + e.getMessage());
    L9:
        if (r9.startsWith("ir_") == false) goto L12;
        r10 = Uri.parse(new String(Base64.decode(r9.substring(3), 10)));
        goto L11
    L5:
        if (r9.startsWith("rl_") == false) goto L7;
        r2 = xt3.e(r9.substring(3));
        r4 = null;
        goto L18
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri r1, String[] r2, String r3, String[] r4, String r5) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        ExecutorService r0 = this.n;
        if (r0 == null) goto L13;
        r0.shutdown();
    L9:
        this.n.shutdownNow();
        return;
    L6:
        if (this.n.awaitTermination(5, TimeUnit.SECONDS) == true) goto L14;
        this.n.shutdownNow();     // Catch: InterruptedException -> L9
        return;
    L14:
        return;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri r1, ContentValues r2, String r3, String[] r4) {
        return 0;
    }
}
