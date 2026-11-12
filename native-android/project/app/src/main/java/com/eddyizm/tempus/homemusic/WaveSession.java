package com.eddyizm.tempus.homemusic;

import defpackage.gi1;
import defpackage.h12;
import defpackage.k62;
import defpackage.kh3;
import defpackage.q40;
import defpackage.qm4;
import defpackage.ti;
import defpackage.u01;
import defpackage.ux3;
import defpackage.v40;
import defpackage.xa3;
import defpackage.xj0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class WaveSession {
    public static final int $stable = 0;
    private static final Set<String> ASKING = null;
    public static final String CONTEXT_PREFIX = "wave:";
    public static final Companion Companion = null;
    public static final int LOW_WATER = 2;
    private static final int MAX_EVENTS = 500;
    private static final int MAX_QUEUED = 50;
    private boolean again;
    private String askedFor;
    private int failures;
    private String id;
    private boolean inFlight;
    private final String mode;
    private int polls;
    private final HashMap<String, String> refs;
    private final Map<String, Object> seed;
    private String settledFor;
    private final String title;
    private final ArrayList<PlayEvent> unsent;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Companion {
        public /* synthetic */ Companion(xj0 r1) {
            this();
        }

        public static /* synthetic */ Map startBody$default(Companion r1, Map r2, String r3, String r4, String r5, String r6, int r7, Object r8) {
            if ((r7 & 4) == 0) goto L6;
            r4 = null;
        L6:
            if ((r7 & 8) == 0) goto L9;
            r5 = null;
        L9:
            if ((r7 & 16) == 0) goto L12;
            r6 = null;
        L12:
            return r1.startBody(r2, r3, r4, r5, r6);
        }

        public final Map<String, Object> startBody(Map<String, ? extends Object> r9, String r10, String r11, String r12, String r13) {
            HashMap r8 = new HashMap();
            if (r9 == null) goto L5;
            Object r2 = r9.get("ref");
        L7:
            if ((r2 instanceof String) == false) goto L9;
            String r3 = (String) r2;
        L11:
            if (r9 == null) goto L13;
            Object r4 = r9.get("artist_ref");
        L15:
            if ((r4 instanceof String) == false) goto L17;
            String r5 = (String) r4;
        L19:
            if (r9 == null) goto L21;
            Object r14 = r9.get("nd_artist_id");
        L23:
            if ((r14 instanceof String) == false) goto L25;
            String r15 = (String) r14;
        L27:
            if (r3 != null) goto L29;
        L32:
            if (r15 != null) goto L34;
        L37:
            if (r5 != null) goto L39;
        L42:
            if (r10 != null) goto L44;
        L47:
            ux3 r16 = k62.c;
            String r17 = gi1.b0(r11);
            if (r17 == null) goto L51;
            r8.put("origin", r17);
        L51:
            if (r12 != null) goto L53;
        L58:
            if (r13 != null) goto L60;
        L65:
            return r8;
        L60:
            if (qm4.u0(r13) == false) goto L63;
            r13 = null;
        L63:
            if (r13 == null) goto L65;
            r8.put("client", qm4.J0(32, r13));
            goto L65
        L53:
            if (qm4.u0(r12) == false) goto L56;
            r12 = null;
        L56:
            if (r12 == null) goto L58;
            r8.put("restart_of", qm4.J0(32, r12));
            goto L58
        L44:
            if (qm4.u0(r10) == true) goto L47;
            r8.put("mode", r10);
            goto L47
        L39:
            if (qm4.u0(r5) == true) goto L42;
            Map r18 = Collections.singletonMap("artist_ref", r5);
            r18.getClass();
            r8.put(WaveTrack.SEED, r18);
            goto L42
        L34:
            if (qm4.u0(r15) == true) goto L37;
            Map r19 = Collections.singletonMap("nd_artist_id", r15);
            r19.getClass();
            r8.put(WaveTrack.SEED, r19);
            goto L42
        L29:
            if (qm4.u0(r3) == true) goto L32;
            Map r20 = Collections.singletonMap("ref", r3);
            r20.getClass();
            r8.put(WaveTrack.SEED, r20);
            goto L42
        L25:
            r15 = null;
            goto L27
        L21:
            r14 = null;
            goto L23
        L17:
            r5 = null;
            goto L19
        L13:
            r4 = null;
            goto L15
        L9:
            r3 = null;
            goto L11
        L5:
            r2 = null;
            goto L7
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        $stable = 8;
        ASKING = ti.t0(new String[]{PlayEvent.START, PlayEvent.LIKE, PlayEvent.DISLIKE});
    }

    public WaveSession(String r1, String r2, Map<String, ? extends Object> r3, String r4) {
        r1.getClass();
        this.title = r2;
        this.seed = r3;
        this.mode = r4;
        this.id = r1;
        this.refs = new HashMap();
        this.unsent = new ArrayList();
    }

    public static /* synthetic */ boolean a(HashSet r0, PlayEvent r1) {
        return sent$lambda$1(r0, r1);
    }

    public static /* synthetic */ WaveNextIn request$default(WaveSession r0, List r1, boolean r2, boolean r3, int r4, Object r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = true;
    L6:
        if ((r4 & 4) == 0) goto L9;
        r3 = r2;
    L9:
        return r0.request(r1, r2, r3);
    }

    private static final boolean sent$lambda$1(HashSet r0, PlayEvent r1) {
        r1.getClass();
        return r0.contains(r1.getEventId());
    }

    public final boolean getAgain() {
        return this.again;
    }

    public final String getAskedFor() {
        return this.askedFor;
    }

    public final String getContext() {
        return xa3.g(CONTEXT_PREFIX, this.id);
    }

    public final int getFailures() {
        return this.failures;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInFlight() {
        return this.inFlight;
    }

    public final String getMode() {
        return this.mode;
    }

    public final int getPolls() {
        return this.polls;
    }

    public final Map<String, Object> getSeed() {
        return this.seed;
    }

    public final String getSettledFor() {
        return this.settledFor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Set<String> ids() {
        Set<String> r0 = this.refs.keySet();
        r0.getClass();
        return q40.T0(r0);
    }

    public final boolean isWave(String r1) {
        if (r1 != null) goto L4;
        return false;
    L4:
        if (this.refs.containsKey(r1) == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean onEvent(PlayEvent r3) {
        r3.getClass();
        if (h12.c(r3.getContext(), getContext()) == true) goto L6;
        return false;
    L6:
        this.unsent.add(r3);
        return ASKING.contains(r3.getKind());
    }

    public final String refOf(String r1) {
        r1.getClass();
        return this.refs.get(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [u01] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    public final List<String> register(List<? extends WaveTrack> r8) {
        r8.getClass();
        ArrayList r0 = new ArrayList();
        Iterator r9 = r8.iterator();
    L4:
        if (r9.hasNext() == false) goto L18;
        WaveTrack r1 = (WaveTrack) r9.next();
        String r2 = r1.getRef();
        if (r2 != null) goto L8;
    L16:
        ?? r3 = u01.n;
    L17:
        v40.n0(r3, r0);
        goto L4
    L8:
        if (qm4.u0(r2) == false) goto L11;
        r2 = null;
    L11:
        if (r2 == null) goto L16;
        r3 = ti.i0(new String[]{r1.getSongId(), "hub:".concat(r2)});
        int r4 = r3.size();
        int r5 = 0;
    L14:
        if (r5 >= r4) goto L17;
        Object r6 = r3.get(r5);
        r5 = r5 + 1;
        HashMap<String, String> r7 = this.refs;
        r7.put((String) r6, r2);
        goto L14
    L18:
        return r0;
    }

    public final void renew(String r1) {
        r1.getClass();
        this.id = r1;
        this.unsent.clear();
        this.failures = 0;
        this.polls = 0;
    }

    public final WaveNextIn request(List<String> r12, boolean r13, boolean r14) {
        r12.getClass();
        ArrayList<PlayEvent> r0 = this.unsent;
        ArrayList r1 = new ArrayList();
        int r2 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L8;
        PlayEvent r4 = r0.get(r3);
        r3 = r3 + 1;
        boolean r6 = r13;
        boolean r7 = r14;
        if (PlayEvent.supported$default(r4, r6, r7, false, 4, null) == false) goto L7;
        r1.add(r4);
    L7:
        r13 = r6;
        r14 = r7;
        goto L3
    L8:
        List r15 = q40.L0(r1, 500);
        ArrayList r16 = new ArrayList();
        Iterator<T> r17 = r12.iterator();
    L10:
        if (r17.hasNext() == false) goto L15;
        String r5 = (String) r17.next();
        String r8 = this.refs.get(r5);
        if (r8 == null) goto L10;
        r16.add(r8);
        goto L10
    L15:
        return new WaveNextIn(r15, q40.L0(q40.t0(r16), MAX_QUEUED));
    }

    public final void sent(WaveNextIn r3) {
        r3.getClass();
        List<PlayEvent> r4 = r3.getPlayed();
        HashSet r0 = new HashSet();
        Iterator<T> r5 = r4.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        r0.add(((PlayEvent) r5.next()).getEventId());
        goto L4
    L6:
        v40.p0(this.unsent, new kh3(r0, 2));
    }

    public final void setAgain(boolean r1) {
        this.again = r1;
    }

    public final void setAskedFor(String r1) {
        this.askedFor = r1;
    }

    public final void setFailures(int r1) {
        this.failures = r1;
    }

    public final void setInFlight(boolean r1) {
        this.inFlight = r1;
    }

    public final void setPolls(int r1) {
        this.polls = r1;
    }

    public final void setSettledFor(String r1) {
        this.settledFor = r1;
    }

    public final boolean settled(String r2) {
        if (this.failures > 0) goto L10;
        if (r2 != null) goto L6;
        return false;
    L6:
        if (h12.c(this.settledFor, r2) == true) goto L13;
        return false;
    L13:
        return true;
    L10:
        return true;
    }

    public final WaveNextIn snapshot(List<String> r5) {
        r5.getClass();
        List r0 = q40.Q0(this.unsent);
        ArrayList r1 = new ArrayList();
        Iterator<T> r6 = r5.iterator();
    L4:
        if (r6.hasNext() == false) goto L9;
        String r2 = (String) r6.next();
        String r3 = this.refs.get(r2);
        if (r3 == null) goto L4;
        r1.add(r3);
        goto L4
    L9:
        return new WaveNextIn(r0, q40.L0(q40.t0(r1), MAX_QUEUED));
    }
}
