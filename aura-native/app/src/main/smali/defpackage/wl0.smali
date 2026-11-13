.class public final Ldefpackage/wl0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/cd2;


# static fields
.field public static final r:Ldefpackage/gy3;


# instance fields
.field public final a:Ldefpackage/bu4;

.field public final b:Ldefpackage/zt4;

.field public final c:Ldefpackage/gj0;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:J

.field public final i:J

.field public final j:J

.field public final k:J

.field public final l:I

.field public final m:Z

.field public final n:J

.field public final o:Ldefpackage/bx1;

.field public final p:Ljava/util/concurrent/ConcurrentHashMap;

.field public q:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 2
    .line 3
    const-string v1, "file"

    .line 4
    .line 5
    const-string v2, "content"

    .line 6
    .line 7
    const-string v3, "data"

    .line 8
    .line 9
    const-string v4, "android.resource"

    .line 10
    .line 11
    const-string v5, "rawresource"

    .line 12
    .line 13
    const-string v6, "asset"

    .line 14
    .line 15
    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x6

    .line 20
    invoke-static {v1, v0}, Ldefpackage/gh0;->f(I[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, Ldefpackage/yw1;->i(I[Ljava/lang/Object;)Ldefpackage/gy3;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Ldefpackage/wl0;->r:Ldefpackage/gy3;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Ldefpackage/gj0;IIIIIZLjava/util/Map;)V
    .locals 14

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    move/from16 v3, p5

    .line 8
    .line 9
    move/from16 v4, p6

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    const/16 v5, 0x3e8

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const-string v7, "bufferForPlaybackMs"

    .line 18
    .line 19
    const-string v8, "0"

    .line 20
    .line 21
    invoke-static {v5, v6, v7, v8}, Ldefpackage/wl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v9, "bufferForPlaybackForLocalPlaybackMs"

    .line 25
    .line 26
    invoke-static {v5, v6, v9, v8}, Ldefpackage/wl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/16 v10, 0x7d0

    .line 30
    .line 31
    const-string v11, "bufferForPlaybackAfterRebufferMs"

    .line 32
    .line 33
    invoke-static {v10, v6, v11, v8}, Ldefpackage/wl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v12, "bufferForPlaybackAfterRebufferForLocalPlaybackMs"

    .line 37
    .line 38
    invoke-static {v4, v6, v12, v8}, Ldefpackage/wl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v13, "minBufferMs"

    .line 42
    .line 43
    invoke-static {v0, v5, v13, v7}, Ldefpackage/wl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v7, "minBufferForLocalPlaybackMs"

    .line 47
    .line 48
    invoke-static {v1, v5, v7, v9}, Ldefpackage/wl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v10, v13, v11}, Ldefpackage/wl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v4, v7, v12}, Ldefpackage/wl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v5, "maxBufferMs"

    .line 58
    .line 59
    invoke-static {v2, v0, v5, v13}, Ldefpackage/wl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v5, "maxBufferForLocalPlaybackMs"

    .line 63
    .line 64
    invoke-static {v3, v1, v5, v7}, Ldefpackage/wl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v5, "backBufferDurationMs"

    .line 68
    .line 69
    invoke-static {v6, v6, v5, v8}, Ldefpackage/wl0;->k(IILjava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    new-instance v5, Ldefpackage/bu4;

    .line 73
    .line 74
    invoke-direct {v5}, Ldefpackage/bu4;-><init>()V

    .line 75
    .line 76
    .line 77
    iput-object v5, p0, Ldefpackage/wl0;->a:Ldefpackage/bu4;

    .line 78
    .line 79
    new-instance v5, Ldefpackage/zt4;

    .line 80
    .line 81
    invoke-direct {v5}, Ldefpackage/zt4;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v5, p0, Ldefpackage/wl0;->b:Ldefpackage/zt4;

    .line 85
    .line 86
    iput-object p1, p0, Ldefpackage/wl0;->c:Ldefpackage/gj0;

    .line 87
    .line 88
    int-to-long v5, v0

    .line 89
    invoke-static {v5, v6}, Ldefpackage/f35;->Q(J)J

    .line 90
    .line 91
    .line 92
    move-result-wide v5

    .line 93
    iput-wide v5, p0, Ldefpackage/wl0;->d:J

    .line 94
    .line 95
    int-to-long v0, v1

    .line 96
    invoke-static {v0, v1}, Ldefpackage/f35;->Q(J)J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    iput-wide v0, p0, Ldefpackage/wl0;->e:J

    .line 101
    .line 102
    int-to-long v0, v2

    .line 103
    invoke-static {v0, v1}, Ldefpackage/f35;->Q(J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    iput-wide v0, p0, Ldefpackage/wl0;->f:J

    .line 108
    .line 109
    int-to-long v0, v3

    .line 110
    invoke-static {v0, v1}, Ldefpackage/f35;->Q(J)J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    iput-wide v0, p0, Ldefpackage/wl0;->g:J

    .line 115
    .line 116
    const-wide/16 v0, 0x3e8

    .line 117
    .line 118
    invoke-static {v0, v1}, Ldefpackage/f35;->Q(J)J

    .line 119
    .line 120
    .line 121
    move-result-wide v0

    .line 122
    iput-wide v0, p0, Ldefpackage/wl0;->h:J

    .line 123
    .line 124
    iput-wide v0, p0, Ldefpackage/wl0;->i:J

    .line 125
    .line 126
    const-wide/16 v0, 0x7d0

    .line 127
    .line 128
    invoke-static {v0, v1}, Ldefpackage/f35;->Q(J)J

    .line 129
    .line 130
    .line 131
    move-result-wide v0

    .line 132
    iput-wide v0, p0, Ldefpackage/wl0;->j:J

    .line 133
    .line 134
    int-to-long v0, v4

    .line 135
    invoke-static {v0, v1}, Ldefpackage/f35;->Q(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v0

    .line 139
    iput-wide v0, p0, Ldefpackage/wl0;->k:J

    .line 140
    .line 141
    const/4 p1, -0x1

    .line 142
    iput p1, p0, Ldefpackage/wl0;->l:I

    .line 143
    .line 144
    move/from16 p1, p7

    .line 145
    .line 146
    iput-boolean p1, p0, Ldefpackage/wl0;->m:Z

    .line 147
    .line 148
    const-wide/16 v0, 0x0

    .line 149
    .line 150
    invoke-static {v0, v1}, Ldefpackage/f35;->Q(J)J

    .line 151
    .line 152
    .line 153
    move-result-wide v0

    .line 154
    iput-wide v0, p0, Ldefpackage/wl0;->n:J

    .line 155
    .line 156
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 157
    .line 158
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-object p1, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 162
    .line 163
    invoke-static/range {p8 .. p8}, Ldefpackage/bx1;->b(Ljava/util/Map;)Ldefpackage/bx1;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iput-object p1, p0, Ldefpackage/wl0;->o:Ldefpackage/bx1;

    .line 168
    .line 169
    const-wide/16 v0, -0x1

    .line 170
    .line 171
    iput-wide v0, p0, Ldefpackage/wl0;->q:J

    .line 172
    .line 173
    return-void
.end method

.method public static k(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-lt p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    :goto_0
    const-string p1, "%s cannot be less than %s"

    .line 7
    .line 8
    invoke-static {p0, p1, p2, p3}, Ldefpackage/rr2;->p(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/ik3;Ldefpackage/cu4;Ldefpackage/mt2;J)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ldefpackage/vl0;

    .line 22
    .line 23
    iget-boolean p1, p1, Ldefpackage/vl0;->b:Z

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_1
    const/4 p0, 0x1

    .line 30
    return p0
.end method

.method public final b(Ldefpackage/ik3;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/wl0;->m(Ldefpackage/ik3;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, Ldefpackage/wl0;->q:J

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final c(Ldefpackage/ik3;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/wl0;->m(Ldefpackage/ik3;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d(Ldefpackage/ik3;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final e(Ldefpackage/ik3;)V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-wide v2, p0, Ldefpackage/wl0;->q:J

    .line 10
    .line 11
    const-wide/16 v4, -0x1

    .line 12
    .line 13
    cmp-long v4, v2, v4

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x1

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    cmp-long v2, v2, v0

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v5

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v2, v6

    .line 27
    :goto_1
    const-string v3, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper)."

    .line 28
    .line 29
    invoke-static {v3, v2}, Ldefpackage/rr2;->v(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    iput-wide v0, p0, Ldefpackage/wl0;->q:J

    .line 33
    .line 34
    iget-object v0, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ldefpackage/vl0;

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    new-instance v1, Ldefpackage/vl0;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput v6, v1, Ldefpackage/vl0;->a:I

    .line 50
    .line 51
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    iget v2, v1, Ldefpackage/vl0;->a:I

    .line 56
    .line 57
    add-int/2addr v2, v6

    .line 58
    iput v2, v1, Ldefpackage/vl0;->a:I

    .line 59
    .line 60
    :goto_2
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ldefpackage/vl0;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Ldefpackage/wl0;->o:Ldefpackage/bx1;

    .line 70
    .line 71
    iget-object p1, p1, Ldefpackage/ik3;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v1, p1}, Ldefpackage/bx1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Ljava/lang/Integer;

    .line 78
    .line 79
    const/4 v1, -0x1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eq v2, v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    iget p0, p0, Ldefpackage/wl0;->l:I

    .line 94
    .line 95
    :goto_3
    if-eq p0, v1, :cond_4

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_4
    const/high16 p0, 0xc80000

    .line 99
    .line 100
    :goto_4
    iput p0, v0, Ldefpackage/vl0;->c:I

    .line 101
    .line 102
    iput-boolean v5, v0, Ldefpackage/vl0;->b:Z

    .line 103
    .line 104
    return-void
.end method

.method public final f(Ldefpackage/bd2;Ldefpackage/tv4;[Ldefpackage/t41;)V
    .locals 7

    .line 1
    iget-object p2, p1, Ldefpackage/bd2;->a:Ldefpackage/ik3;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/wl0;->o:Ldefpackage/bx1;

    .line 4
    .line 5
    iget-object v1, p2, Ldefpackage/ik3;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ldefpackage/bx1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Integer;

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eq v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget v0, p0, Ldefpackage/wl0;->l:I

    .line 28
    .line 29
    :goto_0
    iget-object v2, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    invoke-virtual {v2, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, Ldefpackage/vl0;

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    if-ne v0, v1, :cond_4

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ldefpackage/wl0;->l(Ldefpackage/bd2;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    array-length v0, p3

    .line 47
    const/4 v1, 0x0

    .line 48
    move v2, v1

    .line 49
    move v3, v2

    .line 50
    :goto_1
    const/high16 v4, 0xc80000

    .line 51
    .line 52
    if-ge v2, v0, :cond_3

    .line 53
    .line 54
    aget-object v5, p3, v2

    .line 55
    .line 56
    if-eqz v5, :cond_2

    .line 57
    .line 58
    invoke-interface {v5}, Ldefpackage/t41;->c()Ldefpackage/sv4;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iget v5, v5, Ldefpackage/sv4;->c:I

    .line 63
    .line 64
    const/high16 v6, 0x20000

    .line 65
    .line 66
    packed-switch v5, :pswitch_data_0

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ldefpackage/nz2;->c()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_0
    move v4, v6

    .line 74
    goto :goto_2

    .line 75
    :pswitch_1
    const/high16 v4, 0x1900000

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :pswitch_2
    if-eqz p1, :cond_1

    .line 79
    .line 80
    const/high16 v4, 0x12c0000

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    const/high16 v4, 0x7d00000

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :pswitch_3
    const/high16 v4, 0x89a0000

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :pswitch_4
    move v4, v1

    .line 90
    :goto_2
    :pswitch_5
    add-int/2addr v3, v4

    .line 91
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const/high16 p1, 0xc880000

    .line 95
    .line 96
    invoke-static {v3, v4, p1}, Ldefpackage/f35;->j(III)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    :cond_4
    iput v0, p2, Ldefpackage/vl0;->c:I

    .line 101
    .line 102
    invoke-virtual {p0}, Ldefpackage/wl0;->n()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ldefpackage/ik3;)Ldefpackage/r20;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/r20;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ldefpackage/r20;-><init>(Ldefpackage/wl0;Ldefpackage/ik3;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final h(Ldefpackage/bd2;)Z
    .locals 14

    .line 1
    iget-object v0, p1, Ldefpackage/bd2;->a:Ldefpackage/ik3;

    .line 2
    .line 3
    iget-wide v1, p1, Ldefpackage/bd2;->e:J

    .line 4
    .line 5
    iget-object v3, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Ldefpackage/vl0;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v4, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ldefpackage/vl0;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    monitor-enter v4

    .line 28
    :try_start_0
    iget v5, v4, Ldefpackage/vl0;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    monitor-exit v4

    .line 31
    iget-object v4, p0, Ldefpackage/wl0;->c:Ldefpackage/gj0;

    .line 32
    .line 33
    iget v4, v4, Ldefpackage/gj0;->o:I

    .line 34
    .line 35
    mul-int/2addr v5, v4

    .line 36
    iget-object v4, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-virtual {v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Ldefpackage/vl0;

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget v4, v4, Ldefpackage/vl0;->c:I

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x1

    .line 51
    if-lt v5, v4, :cond_0

    .line 52
    .line 53
    move v4, v7

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v4, v6

    .line 56
    :goto_0
    sget-object v5, Ldefpackage/ik3;->d:Ldefpackage/ik3;

    .line 57
    .line 58
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    xor-int/lit8 p0, v4, 0x1

    .line 65
    .line 66
    return p0

    .line 67
    :cond_1
    invoke-virtual {p0, p1}, Ldefpackage/wl0;->l(Ldefpackage/bd2;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-wide v8, p0, Ldefpackage/wl0;->e:J

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    iget-wide v8, p0, Ldefpackage/wl0;->d:J

    .line 77
    .line 78
    :goto_1
    if-eqz v0, :cond_3

    .line 79
    .line 80
    iget-wide v10, p0, Ldefpackage/wl0;->g:J

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    iget-wide v10, p0, Ldefpackage/wl0;->f:J

    .line 84
    .line 85
    :goto_2
    iget p1, p1, Ldefpackage/bd2;->f:F

    .line 86
    .line 87
    const/high16 v5, 0x3f800000    # 1.0f

    .line 88
    .line 89
    cmpl-float v5, p1, v5

    .line 90
    .line 91
    if-lez v5, :cond_4

    .line 92
    .line 93
    invoke-static {v8, v9, p1}, Ldefpackage/f35;->A(JF)J

    .line 94
    .line 95
    .line 96
    move-result-wide v8

    .line 97
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 98
    .line 99
    .line 100
    move-result-wide v8

    .line 101
    :cond_4
    const-wide/32 v12, 0x7a120

    .line 102
    .line 103
    .line 104
    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    cmp-long p1, v1, v8

    .line 109
    .line 110
    if-gez p1, :cond_8

    .line 111
    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    iget-boolean p0, p0, Ldefpackage/wl0;->m:Z

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    move p0, v6

    .line 118
    :goto_3
    if-nez p0, :cond_6

    .line 119
    .line 120
    if-nez v4, :cond_7

    .line 121
    .line 122
    :cond_6
    move v6, v7

    .line 123
    :cond_7
    iput-boolean v6, v3, Ldefpackage/vl0;->b:Z

    .line 124
    .line 125
    if-nez v6, :cond_a

    .line 126
    .line 127
    cmp-long p0, v1, v12

    .line 128
    .line 129
    if-gez p0, :cond_a

    .line 130
    .line 131
    const-string p0, "DefaultLoadControl"

    .line 132
    .line 133
    const-string p1, "Target buffer size reached with less than 500ms of buffered media data."

    .line 134
    .line 135
    invoke-static {p0, p1}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_8
    cmp-long p0, v1, v10

    .line 140
    .line 141
    if-gez p0, :cond_9

    .line 142
    .line 143
    if-eqz v4, :cond_a

    .line 144
    .line 145
    :cond_9
    iput-boolean v6, v3, Ldefpackage/vl0;->b:Z

    .line 146
    .line 147
    :cond_a
    :goto_4
    iget-boolean p0, v3, Ldefpackage/vl0;->b:Z

    .line 148
    .line 149
    return p0

    .line 150
    :catchall_0
    move-exception p0

    .line 151
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    throw p0
.end method

.method public final i(Ldefpackage/ik3;)J
    .locals 0

    .line 1
    iget-wide p0, p0, Ldefpackage/wl0;->n:J

    .line 2
    .line 3
    return-wide p0
.end method

.method public final j(Ldefpackage/bd2;)Z
    .locals 10

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/wl0;->l(Ldefpackage/bd2;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p1, Ldefpackage/bd2;->a:Ldefpackage/ik3;

    .line 6
    .line 7
    iget-wide v2, p1, Ldefpackage/bd2;->e:J

    .line 8
    .line 9
    iget v4, p1, Ldefpackage/bd2;->f:F

    .line 10
    .line 11
    invoke-static {v2, v3, v4}, Ldefpackage/f35;->E(JF)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iget-boolean v4, p1, Ldefpackage/bd2;->g:Z

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-wide v4, p0, Ldefpackage/wl0;->k:J

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-wide v4, p0, Ldefpackage/wl0;->j:J

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-wide v4, p0, Ldefpackage/wl0;->i:J

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-wide v4, p0, Ldefpackage/wl0;->h:J

    .line 33
    .line 34
    :goto_0
    iget-wide v6, p1, Ldefpackage/bd2;->h:J

    .line 35
    .line 36
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    cmp-long p1, v6, v8

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    const-wide/16 v8, 0x2

    .line 46
    .line 47
    div-long/2addr v6, v8

    .line 48
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    :cond_3
    const-wide/16 v6, 0x0

    .line 53
    .line 54
    cmp-long p1, v4, v6

    .line 55
    .line 56
    if-lez p1, :cond_6

    .line 57
    .line 58
    cmp-long p1, v2, v4

    .line 59
    .line 60
    if-gez p1, :cond_6

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    iget-boolean v0, p0, Ldefpackage/wl0;->m:Z

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    move v0, p1

    .line 69
    :goto_1
    if-nez v0, :cond_5

    .line 70
    .line 71
    iget-object v0, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Ldefpackage/vl0;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    monitor-enter v0

    .line 83
    :try_start_0
    iget v2, v0, Ldefpackage/vl0;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    monitor-exit v0

    .line 86
    iget-object v0, p0, Ldefpackage/wl0;->c:Ldefpackage/gj0;

    .line 87
    .line 88
    iget v0, v0, Ldefpackage/gj0;->o:I

    .line 89
    .line 90
    mul-int/2addr v2, v0

    .line 91
    iget-object p0, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 92
    .line 93
    invoke-virtual {p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Ldefpackage/vl0;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget p0, p0, Ldefpackage/vl0;->c:I

    .line 103
    .line 104
    if-lt v2, p0, :cond_5

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :catchall_0
    move-exception p0

    .line 108
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    throw p0

    .line 110
    :cond_5
    return p1

    .line 111
    :cond_6
    :goto_2
    const/4 p0, 0x1

    .line 112
    return p0
.end method

.method public final l(Ldefpackage/bd2;)Z
    .locals 3

    .line 1
    iget-object v0, p1, Ldefpackage/bd2;->b:Ldefpackage/cu4;

    .line 2
    .line 3
    iget-object p1, p1, Ldefpackage/bd2;->c:Ldefpackage/mt2;

    .line 4
    .line 5
    iget-object p1, p1, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/wl0;->b:Ldefpackage/zt4;

    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget p1, p1, Ldefpackage/zt4;->c:I

    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/wl0;->a:Ldefpackage/bu4;

    .line 16
    .line 17
    const-wide/16 v1, 0x0

    .line 18
    .line 19
    invoke-virtual {v0, p1, p0, v1, v2}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p0, p0, Ldefpackage/bu4;->b:Ldefpackage/gn2;

    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p0, p0, Ldefpackage/bn2;->a:Landroid/net/Uri;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    sget-object p1, Ldefpackage/wl0;->r:Ldefpackage/gy3;

    .line 43
    .line 44
    invoke-virtual {p1, p0}, Ldefpackage/yw1;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 52
    return p0

    .line 53
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 54
    return p0
.end method

.method public final m(Ldefpackage/ik3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ldefpackage/vl0;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget v2, v1, Ldefpackage/vl0;->a:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, -0x1

    .line 14
    .line 15
    iput v2, v1, Ldefpackage/vl0;->a:I

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ldefpackage/wl0;->n()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Ldefpackage/wl0;->c:Ldefpackage/gj0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    iget-boolean p0, v1, Ldefpackage/gj0;->n:Z

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ldefpackage/gj0;->b(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit v1

    .line 24
    return-void

    .line 25
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0

    .line 27
    :cond_1
    iget-object p0, p0, Ldefpackage/wl0;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ldefpackage/vl0;

    .line 48
    .line 49
    iget v0, v0, Ldefpackage/vl0;->c:I

    .line 50
    .line 51
    add-int/2addr v2, v0

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    invoke-virtual {v1, v2}, Ldefpackage/gj0;->b(I)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
