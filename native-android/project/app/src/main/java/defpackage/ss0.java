package defpackage;

import android.content.ContentValues;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.database.DatabaseIOException;
import androidx.viewpager2.widget.ViewPager2;
import app.homemusic.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 implements xx, j45 {
    public static final String[] r = null;
    public Object n;
    public Object o;
    public Object p;
    public Object q;

    static {
        r = new String[]{"id", "key", "metadata"};
    }

    public ss0(int r2) {
        switch(r2) {
            case 5: goto L5;
            default: goto L3;
        };
    L3:
        this.n = new jo3(10);
        this.o = new yd4(0);
        this.p = new ArrayList();
        this.q = new HashSet();
        return;
    L5:
        this.n = new ArrayList();
        this.o = new HashMap();
        this.p = new HashMap();
    }

    public static ss0 C(LayoutInflater r3, ViewGroup r4) {
        View r5 = r3.inflate(R.layout.item_library_catalogue_album, r4, false);
        int r6 = R.id.album_catalogue_cover_image_view;
        ImageView r0 = (ImageView) uo.s(r5, R.id.album_catalogue_cover_image_view);
        if (r0 == null) goto L10;
        r6 = R.id.album_name_label;
        TextView r1 = (TextView) uo.s(r5, R.id.album_name_label);
        if (r1 == null) goto L10;
        r6 = R.id.artist_name_label;
        TextView r2 = (TextView) uo.s(r5, R.id.artist_name_label);
        if (r2 == null) goto L10;
        return new ss0((ConstraintLayout) r5, r0, r1, r2);
    L10:
        nz2.n("Missing required view with ID: ".concat(r5.getResources().getResourceName(r6)));
        return null;
    }

    public double A(ol1 r6) {
        Map r0 = B();
        HashMap r1 = (HashMap) r0;
        double r2 = ((Double) r1.get((ol1) ((ArrayList) z()).get(((ArrayList) z()).size() - 1))).doubleValue() - ((Double) ((HashMap) B()).get((ol1) ((ArrayList) z()).get(0))).doubleValue();
        double r3 = ((Double) ((HashMap) B()).get(r6)).doubleValue() - ((Double) ((HashMap) B()).get((ol1) ((ArrayList) z()).get(0))).doubleValue();
        if (r2 != 0.0d) goto L7;
        return 0.5d;
    L7:
        return r3 / r2;
    }

    public Map B() {
        HashMap r1 = (HashMap) this.q;
        if (r1 == null) goto L5;
        return r1;
    L5:
        ArrayList r2 = new ArrayList(y());
        r2.add((ol1) this.n);
        HashMap r3 = new HashMap();
        int r4 = r2.size();
        int r5 = 0;
    L6:
        if (r5 >= r4) goto L14;
        Object r6 = r2.get(r5);
        r5 = r5 + 1;
        ol1 r7 = (ol1) r6;
        double[] r8 = h12.C(r7.d);
        double r9 = Math.toDegrees(Math.atan2(r8[2], r8[1])) % 360.0d;
        if (r9 >= 0.0d) goto L10;
        r9 = r9 + 360.0d;
    L10:
        double r10 = Math.pow(Math.hypot(r8[1], r8[2]), 1.07d) * 0.02d;
        double r16 = (r9 - 50.0d) % 360.0d;
        if (r16 >= 0.0d) goto L13;
        r16 = r16 + 360.0d;
    L13:
        r3.put(r7, Double.valueOf((Math.cos(Math.toRadians(r16)) * r10) - 0.5d));
        goto L6
    L14:
        this.q = r3;
        return r3;
    }

    public void D(SQLiteDatabase r3) {
        String r0 = (String) this.p;
        r0.getClass();
        r45.b(r3, 1, r0, 1);
        String r1 = (String) this.q;
        r1.getClass();
        r3.execSQL("DROP TABLE IF EXISTS ".concat(r1));
        r3.execSQL("CREATE TABLE " + ((String) this.q) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public void E(fe1 r3) {
        kc1 r0 = r3.c;
        String r1 = r0.r;
        HashMap r2 = (HashMap) this.o;
        if (r2.get(r1) == null) goto L5;
        return;
    L5:
        r2.put(r0.r, r3);
        if (ld1.I(2) == false) goto L9;
        Log.v("FragmentManager", "Added fragment to active set " + r0);
        return;
    }

    public void F(fe1 r4) {
        HashMap r0 = (HashMap) this.o;
        kc1 r1 = r4.c;
        if (r1.O == false) goto L6;
        ((od1) this.q).f(r1);
    L6:
        if (r0.get(r1.r) == r4) goto L9;
        return;
    L9:
        if (((fe1) r0.put(r1.r, null)) != null) goto L12;
        return;
    L12:
        if (ld1.I(2) == false) goto L15;
        Log.v("FragmentManager", "Removed fragment from active set " + r1);
        return;
    }

    public Bundle G(String r1, Bundle r2) {
        HashMap r0 = (HashMap) this.p;
        if (r2 == null) goto L7;
        return (Bundle) r0.put(r1, r2);
    L7:
        return (Bundle) r0.remove(r1);
    }

    public void H() {
        h45 r0 = (h45) this.o;
        rm2 r1 = (rm2) this.n;
        ViewPager2 r11 = (ViewPager2) this.q;
        int r2 = android.R.id.accessibilityActionPageLeft;
        j65.l(r11, android.R.id.accessibilityActionPageLeft);
        boolean r3 = false;
        j65.i(r11, 0);
        j65.l(r11, android.R.id.accessibilityActionPageRight);
        j65.i(r11, 0);
        j65.l(r11, android.R.id.accessibilityActionPageUp);
        j65.i(r11, 0);
        j65.l(r11, android.R.id.accessibilityActionPageDown);
        j65.i(r11, 0);
        if (r11.getAdapter() == null) goto L37;
        int r7 = r11.getAdapter().a();
        if (r7 != 0) goto L9;
        return;
    L9:
        if (r11.E == true) goto L12;
        return;
    L12:
        if (r11.getOrientation() != 0) goto L29;
        if (r11.t.b.getLayoutDirection() != 1) goto L16;
        r3 = true;
    L16:
        if (r3 == false) goto L18;
        int r5 = 16908360;
    L19:
        if (r3 == false) goto L22;
        r2 = 16908361;
    L22:
        if (r11.q >= (r7 - 1)) goto L25;
        j65.m(r11, new o3(r5, null), r1);
    L25:
        if (r11.q <= 0) goto L35;
        j65.m(r11, new o3(r2, null), r0);
        return;
    L35:
        return;
    L18:
        r5 = 16908361;
        goto L19
    L29:
        if (r11.q >= (r7 - 1)) goto L32;
        j65.m(r11, new o3(android.R.id.accessibilityActionPageDown, null), r1);
    L32:
        if (r11.q <= 0) goto L36;
        j65.m(r11, new o3(android.R.id.accessibilityActionPageUp, null), r0);
        return;
    L36:
        return;
    }

    @Override // defpackage.xx
    public void b(HashMap r3) {
        SQLiteDatabase r0 = ((tk4) this.n).getWritableDatabase();     // Catch: SQLException -> L14
        r0.beginTransactionNonExclusive();     // Catch: SQLException -> L14
        D(r0);     // Catch: Throwable -> L7
        Iterator r4 = r3.values().iterator();     // Catch: Throwable -> L7
    L5:
        if (r4.hasNext() == false) goto L9;
        q(r0, (wx) r4.next());     // Catch: Throwable -> L7
        goto L5
    L9:
        r0.setTransactionSuccessful();     // Catch: Throwable -> L7
        ((SparseArray) this.o).clear();     // Catch: Throwable -> L7
        r0.endTransaction();     // Catch: SQLException -> L14
        return;
    L7:
        th = move-exception;
        r0.endTransaction();     // Catch: SQLException -> L14
        throw th;     // Catch: SQLException -> L14
    L14:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    @Override // defpackage.xx
    public void c(wx r1, boolean r2) {
        SparseArray r0 = (SparseArray) this.o;
        int r3 = r1.a;
        if (r2 == false) goto L6;
        r0.delete(r3);
        return;
    L6:
        r0.put(r3, null);
    }

    @Override // defpackage.g45
    public ce d(long r15, ce r17, ce r18, ce r19) {
        if (((ce) this.p) != null) goto L5;
        this.p = r19.c();
    L5:
        ce r0 = (ce) this.p;
        if (r0 == null) goto L18;
        int r1 = r0.b();
        int r3 = 0;
    L8:
        ce r4 = (ce) this.p;
        if (r3 >= r1) goto L14;
        if (r4 == null) goto L12;
        r4.d(r3, ((de) this.n).get(r3).b(r15, r17.a(r3), r18.a(r3), r19.a(r3)));
        r3 = r3 + 1;
        goto L8
    L12:
        h12.Q("velocityVector");
        throw null;
    L14:
        if (r4 == null) goto L16;
        return r4;
    L16:
        h12.Q("velocityVector");
        throw null;
    L18:
        h12.Q("velocityVector");
        throw null;
    }

    @Override // defpackage.xx
    public void e(wx r2) {
        ((SparseArray) this.o).put(r2.a, r2);
    }

    @Override // defpackage.xx
    public boolean f() {
        SQLiteDatabase r0 = ((tk4) this.n).getReadableDatabase();     // Catch: SQLException -> L8
        String r2 = (String) this.p;     // Catch: SQLException -> L8
        r2.getClass();     // Catch: SQLException -> L8
        if (r45.a(r0, 1, r2) == (-1)) goto L6;
        return true;
    L6:
        return false;
    L8:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    @Override // defpackage.xx
    public void g(HashMap r6) {
        SparseArray r7 = (SparseArray) this.o;
        if (r7.size() != 0) goto L24;
        return;
    L24:
        SQLiteDatabase r0 = ((tk4) this.n).getWritableDatabase();     // Catch: SQLException -> L21
        r0.beginTransactionNonExclusive();     // Catch: SQLException -> L21
        int r1 = 0;
    L25:
    L12:
        th = move-exception;
        r0.endTransaction();     // Catch: SQLException -> L21
        throw th;     // Catch: SQLException -> L21
    L8:
        if (r1 >= r7.size()) goto L16;
        wx r2 = (wx) r7.valueAt(r1);     // Catch: Throwable -> L12
        if (r2 != null) goto L14;
        int r3 = r7.keyAt(r1);     // Catch: Throwable -> L12
        String r4 = (String) this.q;     // Catch: Throwable -> L12
        r4.getClass();     // Catch: Throwable -> L12
        r0.delete(r4, "id = ?", new String[]{Integer.toString(r3)});     // Catch: Throwable -> L12
    L15:
        r1 = r1 + 1;     // Catch: Throwable -> L12
        goto L25
    L14:
        q(r0, r2);     // Catch: Throwable -> L12
        goto L15
    L16:
        r0.setTransactionSuccessful();     // Catch: Throwable -> L12
        r7.clear();     // Catch: Throwable -> L12
        r0.endTransaction();     // Catch: SQLException -> L21
        return;
    L21:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    @Override // defpackage.xx
    public void h(long r1) {
        String r2 = Long.toHexString(r1);
        this.p = r2;
        this.q = xa3.g("ExoPlayerCacheIndex", r2);
    }

    @Override // defpackage.xx
    public void i(HashMap r13, SparseArray r14) {
        tk4 r0 = (tk4) this.n;
        if (((SparseArray) this.o).size() != 0) goto L5;
        boolean r1 = true;
    L6:
        rr2.w(r1);
        SQLiteDatabase r2 = r0.getReadableDatabase();     // Catch: SQLiteException -> L12
        String r4 = (String) this.p;     // Catch: SQLiteException -> L12
        r4.getClass();     // Catch: SQLiteException -> L12
        if (r45.a(r2, 1, r4) == 1) goto L17;
        SQLiteDatabase r3 = r0.getWritableDatabase();     // Catch: SQLiteException -> L12
        r3.beginTransactionNonExclusive();     // Catch: SQLiteException -> L12
        D(r3);     // Catch: Throwable -> L14
        r3.setTransactionSuccessful();     // Catch: Throwable -> L14
        r3.endTransaction();     // Catch: SQLiteException -> L12
        goto L17
    L14:
        th = move-exception;
        r3.endTransaction();     // Catch: SQLiteException -> L12
        throw th;     // Catch: SQLiteException -> L12
    L17:
        SQLiteDatabase r5 = r0.getReadableDatabase();     // Catch: SQLiteException -> L12
        String r6 = (String) this.q;     // Catch: SQLiteException -> L12
        r6.getClass();     // Catch: SQLiteException -> L12
        Cursor r12 = r5.query(r6, r, null, null, null, null, null);     // Catch: SQLiteException -> L12
    L38:
    L22:
        th = move-exception;
        if (r12 == null) goto L44;
        r12.close();     // Catch: Throwable -> L29
    L45:
        throw th;     // Catch: SQLiteException -> L12
    L29:
        th = move-exception;
        th.addSuppressed(th);     // Catch: SQLiteException -> L12
        throw th;     // Catch: SQLiteException -> L12
    L44:
        throw th;     // Catch: SQLiteException -> L12
    L19:
        if (r12.moveToNext() == false) goto L24;
        int r7 = r12.getInt(0);     // Catch: Throwable -> L22
        String r8 = r12.getString(1);     // Catch: Throwable -> L22
        r8.getClass();     // Catch: Throwable -> L22
        r13.put(r8, new wx(r7, r8, ml3.f(new DataInputStream(new ByteArrayInputStream(r12.getBlob(2))))));     // Catch: Throwable -> L22
        r14.put(r7, r8);     // Catch: Throwable -> L22
    L24:
        r12.close();     // Catch: SQLiteException -> L12
        return;
    L12:
        e = move-exception;
        r13.clear();
        r14.clear();
        throw new DatabaseIOException(e);
    L5:
        r1 = false;
        goto L6
    }

    @Override // defpackage.xx
    public void j() {
        tk4 r2 = (tk4) this.n;
        String r6 = (String) this.p;
        r6.getClass();
        String r1 = "ExoPlayerCacheIndex".concat(r6);     // Catch: SQLException -> L19
        SQLiteDatabase r3 = r2.getWritableDatabase();     // Catch: SQLException -> L19
        r3.beginTransactionNonExclusive();     // Catch: SQLException -> L19
        int r4 = r45.a;     // Catch: Throwable -> L12
    L14:
        e = move-exception;
        throw new DatabaseIOException(e);     // Catch: Throwable -> L12
    L6:
        if (f35.f0(r3, "ExoPlayerVersions") == false) goto L9;
        r3.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), r6});     // Catch: Throwable -> L12 SQLException -> L14
    L9:
        r3.execSQL("DROP TABLE IF EXISTS ".concat(r1));     // Catch: Throwable -> L12
        r3.setTransactionSuccessful();     // Catch: Throwable -> L12
        r3.endTransaction();     // Catch: SQLException -> L19
        return;
    L12:
        th = move-exception;
        r3.endTransaction();     // Catch: SQLException -> L19
        throw th;     // Catch: SQLException -> L19
    L19:
        e = move-exception;
        throw new DatabaseIOException(e);
    }

    @Override // defpackage.g45
    public ce k(long r15, ce r17, ce r18, ce r19) {
        if (((ce) this.o) != null) goto L5;
        this.o = r17.c();
    L5:
        ce r0 = (ce) this.o;
        if (r0 == null) goto L18;
        int r1 = r0.b();
        int r3 = 0;
    L8:
        ce r4 = (ce) this.o;
        if (r3 >= r1) goto L14;
        if (r4 == null) goto L12;
        r4.d(r3, ((de) this.n).get(r3).e(r15, r17.a(r3), r18.a(r3), r19.a(r3)));
        r3 = r3 + 1;
        goto L8
    L12:
        h12.Q("valueVector");
        throw null;
    L14:
        if (r4 == null) goto L16;
        return r4;
    L16:
        h12.Q("valueVector");
        throw null;
    L18:
        h12.Q("valueVector");
        throw null;
    }

    @Override // defpackage.g45
    public ce l(ce r10, ce r11, ce r12) {
        if (((ce) this.q) != null) goto L5;
        this.q = r12.c();
    L5:
        ce r0 = (ce) this.q;
        if (r0 == null) goto L18;
        int r1 = r0.b();
        int r3 = 0;
    L8:
        ce r4 = (ce) this.q;
        if (r3 >= r1) goto L14;
        if (r4 == null) goto L12;
        r4.d(r3, ((de) this.n).get(r3).d(r10.a(r3), r11.a(r3), r12.a(r3)));
        r3 = r3 + 1;
        goto L8
    L12:
        h12.Q("endVelocityVector");
        throw null;
    L14:
        if (r4 == null) goto L16;
        return r4;
    L16:
        h12.Q("endVelocityVector");
        throw null;
    L18:
        h12.Q("endVelocityVector");
        throw null;
    }

    @Override // defpackage.g45
    public long m(ce r9, ce r10, ce r11) {
        int r0 = r9.b();
        long r1 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r0) goto L5;
        r1 = Math.max(r1, ((de) this.n).get(r3).c(r9.a(r3), r10.a(r3), r11.a(r3)));
        r3 = r3 + 1;
        goto L3
    L5:
        return r1;
    }

    public void n(ArrayList r6) {
        if (r6 != null) goto L4;
        kf2.n("filters must not be null");
        return;
    L4:
        if (r6.isEmpty() == true) goto L12;
        int r0 = r6.size();
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L22;
        Object r2 = r6.get(r1);
        r1 = r1 + 1;
        IntentFilter r3 = (IntentFilter) r2;
        if (r3 == null) goto L6;
        ArrayList r4 = (ArrayList) this.p;
        if (r4.contains(r3) == true) goto L6;
        r4.add(r3);
        goto L6
    L22:
        return;
    }

    public void o(kc1 r2) {
        if (((ArrayList) this.n).contains(r2) == true) goto L13;
        ArrayList r0 = (ArrayList) this.n;
        monitor-enter(r0);
        ((ArrayList) this.n).add(r2);     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        r2.x = true;
        return;
    L10:
        th = move-exception;
        throw th;
    L13:
        er1.o(r2, "Fragment already added: ");
    }

    public void p(ArrayList r6) {
        if (r6.isEmpty() == true) goto L19;
        int r0 = r6.size();
        int r1 = 0;
    L5:
        if (r1 >= r0) goto L20;
        Object r2 = r6.get(r1);
        r1 = r1 + 1;
        String r3 = (String) r2;
        ArrayList r4 = (ArrayList) this.o;
        if (TextUtils.isEmpty(r3) == true) goto L11;
        if (r4.contains(r3) == true) goto L5;
        r4.add(r3);
        goto L5
    L11:
        kf2.n("groupMemberId must not be empty");
        return;
    L20:
        return;
    }

    public void q(SQLiteDatabase r5, wx r6) {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        ml3.g(r6.e, new DataOutputStream(r0));
        byte[] r1 = r0.toByteArray();
        ContentValues r2 = new ContentValues();
        r2.put("id", Integer.valueOf(r6.a));
        r2.put("key", r6.b);
        r2.put("metadata", r1);
        String r4 = (String) this.q;
        r4.getClass();
        r5.replaceOrThrow(r4, null, r2);
    }

    public sp2 r() {
        Bundle r0 = (Bundle) this.n;
        r0.putParcelableArrayList("controlFilters", new ArrayList((ArrayList) this.p));
        r0.putStringArrayList("groupMemberIds", new ArrayList((ArrayList) this.o));
        r0.putStringArrayList("allowedPackages", new ArrayList((HashSet) this.q));
        return new sp2(r0);
    }

    public void s(Object r5, ArrayList r6, HashSet r7) {
        if (r6.contains(r5) == false) goto L6;
        return;
    L6:
        if (r7.contains(r5) == true) goto L14;
        r7.add(r5);
        ArrayList r0 = (ArrayList) ((yd4) this.o).get(r5);
        if (r0 == null) goto L12;
        int r1 = r0.size();
        int r2 = 0;
    L10:
        if (r2 >= r1) goto L12;
        s(r0.get(r2), r6, r7);
        r2 = r2 + 1;
    L12:
        r7.remove(r5);
        r6.add(r5);
        return;
    L14:
        tb4.e("This graph contains cyclic dependencies");
    }

    public kc1 t(String r1) {
        fe1 r0 = (fe1) ((HashMap) this.o).get(r1);
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.c;
    }

    public kc1 u(String r3) {
        Iterator r2 = ((HashMap) this.o).values().iterator();
    L4:
        if (r2.hasNext() == false) goto L13;
        fe1 r0 = (fe1) r2.next();
        if (r0 == null) goto L4;
        kc1 r1 = r0.c;
        if (r3.equals(r1.r) == true) goto L11;
        r1 = r1.H.c.u(r3);
    L11:
        if (r1 == null) goto L4;
        return r1;
    L13:
        return null;
    }

    public ArrayList v() {
        ArrayList r0 = new ArrayList();
        Iterator r2 = ((HashMap) this.o).values().iterator();
    L4:
        if (r2.hasNext() == false) goto L8;
        fe1 r1 = (fe1) r2.next();
        if (r1 == null) goto L4;
        r0.add(r1);
        goto L4
    L8:
        return r0;
    }

    public ArrayList w() {
        ArrayList r0 = new ArrayList();
        Iterator r2 = ((HashMap) this.o).values().iterator();
    L4:
        if (r2.hasNext() == false) goto L9;
        fe1 r1 = (fe1) r2.next();
        if (r1 != null) goto L7;
        r0.add(null);
        goto L4
    L7:
        r0.add(r1.c);
        goto L4
    L9:
        return r0;
    }

    public List x() {
        if (((ArrayList) this.n).isEmpty() == true) goto L5;
        ArrayList r0 = (ArrayList) this.n;
        monitor-enter(r0);
        ArrayList r1 = new ArrayList((ArrayList) this.n);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return r1;
    L11:
        th = move-exception;
        throw th;
    L5:
        return Collections.EMPTY_LIST;
    }

    public List y() {
        List r0 = (List) this.p;
        if (r0 == null) goto L5;
        return r0;
    L5:
        ArrayList r1 = new ArrayList();
        double r3 = 0.0d;
    L7:
        if (r3 > 360.0d) goto L9;
        ol1 r2 = (ol1) this.n;
        r1.add(ol1.a(r3, r2.b, r2.c));
        r3 = r3 + 1.0d;
        goto L7
    L9:
        List r4 = Collections.unmodifiableList(r1);
        this.p = r4;
        return r4;
    }

    public List z() {
        ArrayList r0 = (ArrayList) this.o;
        if (r0 == null) goto L5;
        return r0;
    L5:
        ArrayList r1 = new ArrayList(y());
        r1.add((ol1) this.n);
        Collections.sort(r1, Comparator.comparing(new t8(3, this), new n7(22)));
        this.o = r1;
        return r1;
    }

    public /* synthetic */ ss0(Object r1) {
        this.n = r1;
    }

    public /* synthetic */ ss0(ConstraintLayout r1, View r2, TextView r3, TextView r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    public ss0(gy3 r1, xc5 r2, hd5 r3, wo0 r4) {
        if (r1 == null) goto L5;
        Object r5 = yw1.k(r1);
    L6:
        this.n = r5;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        return;
    L5:
        vw1 r6 = yw1.o;
        r5 = gy3.r;
        goto L6
    }

    public ss0(String r3, String r4) {
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new HashSet();
        Bundle r0 = new Bundle();
        this.n = r0;
        if (r3 == null) goto L10;
        r0.putString("id", r3);
        if (r4 == null) goto L8;
        r0.putString("name", r4);
        return;
    L8:
        nz2.n("name must not be null");
        throw null;
    L10:
        nz2.n("id must not be null");
        throw null;
    }

    public ss0(c81 r2) {
        this(new oz4(r2));
    }
}
