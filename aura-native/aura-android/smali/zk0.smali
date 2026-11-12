.class public final Lzk0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lhd2;


# instance fields
.field public final n:Landroid/net/Uri;

.field public final o:Li61;

.field public final p:Lci0;

.field public q:Lym1;

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:Z

.field public w:Ljava/io/IOException;

.field public x:Z

.field public final synthetic y:Lal0;


# direct methods
.method public constructor <init>(Lal0;Landroid/net/Uri;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzk0;->y:Lal0;

    .line 5
    .line 6
    iput-object p2, p0, Lzk0;->n:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p2, Li61;

    .line 9
    .line 10
    const-string v0, "DefaultHlsPlaylistTracker:MediaPlaylist"

    .line 11
    .line 12
    invoke-direct {p2, v0}, Li61;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lzk0;->o:Li61;

    .line 16
    .line 17
    iget-object p1, p1, Lal0;->n:Lzh0;

    .line 18
    .line 19
    iget-object p1, p1, Lzh0;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lbi0;

    .line 22
    .line 23
    invoke-interface {p1}, Lbi0;->m()Lci0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lzk0;->p:Lci0;

    .line 28
    .line 29
    return-void
.end method

.method public static a(Lzk0;J)Z
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-long/2addr v0, p1

    .line 6
    iput-wide v0, p0, Lzk0;->u:J

    .line 7
    .line 8
    iget-object p1, p0, Lzk0;->n:Landroid/net/Uri;

    .line 9
    .line 10
    iget-object p0, p0, Lzk0;->y:Lal0;

    .line 11
    .line 12
    iget-object p2, p0, Lal0;->x:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 p2, 0x1

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Lal0;->w:Lcn1;

    .line 22
    .line 23
    iget-object p1, p1, Lcn1;->e:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    const/4 v3, 0x0

    .line 34
    move v4, v3

    .line 35
    :goto_0
    if-ge v4, v0, :cond_1

    .line 36
    .line 37
    iget-object v5, p0, Lal0;->q:Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Lbn1;

    .line 44
    .line 45
    iget-object v6, v6, Lbn1;->a:Landroid/net/Uri;

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Lzk0;

    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-wide v6, v5, Lzk0;->u:J

    .line 57
    .line 58
    cmp-long v6, v1, v6

    .line 59
    .line 60
    if-lez v6, :cond_0

    .line 61
    .line 62
    iget-object p1, v5, Lzk0;->n:Landroid/net/Uri;

    .line 63
    .line 64
    iput-object p1, p0, Lal0;->x:Landroid/net/Uri;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lal0;->c(Landroid/net/Uri;)Landroid/net/Uri;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {v5, p0}, Lzk0;->f(Landroid/net/Uri;)V

    .line 71
    .line 72
    .line 73
    return p2

    .line 74
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    return v3

    .line 78
    :cond_2
    return p2
.end method


# virtual methods
.method public final b(Ljd2;JJZ)V
    .locals 11

    .line 1
    check-cast p1, Lde3;

    .line 2
    .line 3
    new-instance v0, Led2;

    .line 4
    .line 5
    iget-wide v1, p1, Lde3;->a:J

    .line 6
    .line 7
    iget-object v1, p1, Lde3;->b:Lii0;

    .line 8
    .line 9
    iget-object p1, p1, Lde3;->d:Lyl4;

    .line 10
    .line 11
    iget-object v2, p1, Lyl4;->p:Landroid/net/Uri;

    .line 12
    .line 13
    iget-object v3, p1, Lyl4;->q:Ljava/util/Map;

    .line 14
    .line 15
    iget-wide v8, p1, Lyl4;->o:J

    .line 16
    .line 17
    move-wide v4, p2

    .line 18
    move-wide v6, p4

    .line 19
    invoke-direct/range {v0 .. v9}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lzk0;->y:Lal0;

    .line 23
    .line 24
    iget-object p1, p0, Lal0;->p:Li80;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lal0;->s:Lue1;

    .line 30
    .line 31
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v2, 0x4

    .line 42
    const/4 v3, -0x1

    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    move-object v1, v0

    .line 47
    move-object v0, p0

    .line 48
    invoke-virtual/range {v0 .. v10}, Lue1;->q(Led2;IILtb1;ILjava/lang/Object;JJ)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final c()Landroid/net/Uri;
    .locals 8

    .line 1
    iget-object v0, p0, Lzk0;->q:Lym1;

    .line 2
    .line 3
    iget-object v1, p0, Lzk0;->n:Landroid/net/Uri;

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget-object v0, v0, Lym1;->v:Lxm1;

    .line 8
    .line 9
    iget-wide v2, v0, Lxm1;->a:J

    .line 10
    .line 11
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v2, v2, v4

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    iget-boolean v0, v0, Lxm1;->e:Z

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lzk0;->q:Lym1;

    .line 30
    .line 31
    iget-object v2, v1, Lym1;->v:Lxm1;

    .line 32
    .line 33
    iget-boolean v2, v2, Lxm1;->e:Z

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iget-wide v2, v1, Lym1;->k:J

    .line 38
    .line 39
    iget-object v1, v1, Lym1;->r:Lyw1;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    int-to-long v6, v1

    .line 46
    add-long/2addr v2, v6

    .line 47
    const-string v1, "_HLS_msn"

    .line 48
    .line 49
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lzk0;->q:Lym1;

    .line 57
    .line 58
    iget-wide v2, v1, Lym1;->n:J

    .line 59
    .line 60
    cmp-long v2, v2, v4

    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    iget-object v1, v1, Lym1;->s:Lyw1;

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_1

    .line 75
    .line 76
    invoke-static {v1}, Lte5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ltm1;

    .line 81
    .line 82
    iget-boolean v1, v1, Ltm1;->z:Z

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    add-int/lit8 v2, v2, -0x1

    .line 87
    .line 88
    :cond_1
    const-string v1, "_HLS_part"

    .line 89
    .line 90
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 95
    .line 96
    .line 97
    :cond_2
    iget-object p0, p0, Lzk0;->q:Lym1;

    .line 98
    .line 99
    iget-object p0, p0, Lym1;->v:Lxm1;

    .line 100
    .line 101
    iget-wide v1, p0, Lxm1;->a:J

    .line 102
    .line 103
    cmp-long v1, v1, v4

    .line 104
    .line 105
    if-eqz v1, :cond_4

    .line 106
    .line 107
    iget-boolean p0, p0, Lxm1;->b:Z

    .line 108
    .line 109
    if-eqz p0, :cond_3

    .line 110
    .line 111
    const-string p0, "v2"

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    const-string p0, "YES"

    .line 115
    .line 116
    :goto_0
    const-string v1, "_HLS_skip"

    .line 117
    .line 118
    invoke-virtual {v0, v1, p0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 119
    .line 120
    .line 121
    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_5
    :goto_1
    return-object v1
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lzk0;->c()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p0, Lzk0;->n:Landroid/net/Uri;

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p0, p1}, Lzk0;->f(Landroid/net/Uri;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e(Landroid/net/Uri;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lzk0;->y:Lal0;

    .line 4
    .line 5
    iget-object v2, v1, Lal0;->o:Lfn1;

    .line 6
    .line 7
    iget-object v3, v1, Lal0;->w:Lcn1;

    .line 8
    .line 9
    iget-object v4, v0, Lzk0;->q:Lym1;

    .line 10
    .line 11
    invoke-interface {v2, v3, v4}, Lfn1;->e(Lcn1;Lym1;)Lce3;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v9, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 16
    .line 17
    const-string v3, "The uri must be set."

    .line 18
    .line 19
    move-object/from16 v4, p1

    .line 20
    .line 21
    invoke-static {v4, v3}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Lii0;

    .line 25
    .line 26
    const-wide/16 v5, 0x0

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    const/4 v8, 0x0

    .line 30
    const-wide/16 v10, 0x0

    .line 31
    .line 32
    const-wide/16 v12, -0x1

    .line 33
    .line 34
    const/4 v14, 0x0

    .line 35
    const/4 v15, 0x1

    .line 36
    invoke-direct/range {v3 .. v15}, Lii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    new-instance v4, Lde3;

    .line 40
    .line 41
    iget-object v5, v0, Lzk0;->p:Lci0;

    .line 42
    .line 43
    invoke-direct {v4, v5, v3, v2}, Lde3;-><init>(Lci0;Lii0;Lce3;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v1, Lal0;->p:Li80;

    .line 47
    .line 48
    iget v2, v4, Lde3;->c:I

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Li80;->D(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iget-object v2, v0, Lzk0;->o:Li61;

    .line 55
    .line 56
    invoke-virtual {v2, v4, v0, v1}, Li61;->u(Ljd2;Lhd2;I)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final f(Landroid/net/Uri;)V
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lzk0;->u:J

    .line 4
    .line 5
    iget-boolean v0, p0, Lzk0;->v:Z

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lzk0;->o:Li61;

    .line 10
    .line 11
    invoke-virtual {v0}, Li61;->l()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    iget-object v0, v0, Li61;->q:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/io/IOException;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    iget-wide v2, p0, Lzk0;->t:J

    .line 29
    .line 30
    cmp-long v4, v0, v2

    .line 31
    .line 32
    if-gez v4, :cond_1

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    iput-boolean v4, p0, Lzk0;->v:Z

    .line 36
    .line 37
    iget-object v4, p0, Lzk0;->y:Lal0;

    .line 38
    .line 39
    iget-object v4, v4, Lal0;->u:Landroid/os/Handler;

    .line 40
    .line 41
    new-instance v5, Lk6;

    .line 42
    .line 43
    const/16 v6, 0x13

    .line 44
    .line 45
    invoke-direct {v5, v6, p0, p1}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sub-long/2addr v2, v0

    .line 49
    invoke-virtual {v4, v5, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-virtual {p0, p1}, Lzk0;->e(Landroid/net/Uri;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
.end method

.method public final g(Ljd2;JJ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lde3;

    .line 6
    .line 7
    iget-object v2, v1, Lde3;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ldn1;

    .line 10
    .line 11
    new-instance v4, Led2;

    .line 12
    .line 13
    move-object v3, v4

    .line 14
    iget-object v4, v1, Lde3;->b:Lii0;

    .line 15
    .line 16
    iget-object v1, v1, Lde3;->d:Lyl4;

    .line 17
    .line 18
    iget-object v5, v1, Lyl4;->p:Landroid/net/Uri;

    .line 19
    .line 20
    iget-object v6, v1, Lyl4;->q:Ljava/util/Map;

    .line 21
    .line 22
    iget-wide v11, v1, Lyl4;->o:J

    .line 23
    .line 24
    move-wide/from16 v7, p2

    .line 25
    .line 26
    move-wide/from16 v9, p4

    .line 27
    .line 28
    invoke-direct/range {v3 .. v12}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 29
    .line 30
    .line 31
    instance-of v1, v2, Lym1;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    check-cast v2, Lym1;

    .line 36
    .line 37
    invoke-virtual {v0, v2, v3}, Lzk0;->h(Lym1;Led2;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lzk0;->y:Lal0;

    .line 41
    .line 42
    iget-object v1, v1, Lal0;->s:Lue1;

    .line 43
    .line 44
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    const/4 v5, 0x4

    .line 55
    const/4 v6, -0x1

    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x0

    .line 59
    move-object v4, v3

    .line 60
    move-object v3, v1

    .line 61
    invoke-virtual/range {v3 .. v13}, Lue1;->r(Led2;IILtb1;ILjava/lang/Object;JJ)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const-string v1, "Loaded playlist has unexpected type."

    .line 66
    .line 67
    invoke-static {v1}, Landroidx/media3/common/ParserException;->b(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 68
    .line 69
    .line 70
    move-result-object v14

    .line 71
    iput-object v14, v0, Lzk0;->w:Ljava/io/IOException;

    .line 72
    .line 73
    iget-object v1, v0, Lzk0;->y:Lal0;

    .line 74
    .line 75
    iget-object v1, v1, Lal0;->s:Lue1;

    .line 76
    .line 77
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    const/4 v5, 0x4

    .line 88
    const/4 v6, -0x1

    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v9, 0x0

    .line 92
    const/4 v15, 0x1

    .line 93
    move-object v4, v3

    .line 94
    move-object v3, v1

    .line 95
    invoke-virtual/range {v3 .. v15}, Lue1;->s(Led2;IILtb1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 96
    .line 97
    .line 98
    :goto_0
    iget-object v0, v0, Lzk0;->y:Lal0;

    .line 99
    .line 100
    iget-object v0, v0, Lal0;->p:Li80;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final h(Lym1;Led2;)V
    .locals 70

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lzk0;->q:Lym1;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iput-wide v3, v0, Lzk0;->r:J

    .line 12
    .line 13
    iget-object v5, v0, Lzk0;->y:Lal0;

    .line 14
    .line 15
    iget-object v6, v5, Lal0;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    if-eqz v2, :cond_5

    .line 18
    .line 19
    iget-wide v9, v1, Lym1;->k:J

    .line 20
    .line 21
    iget-wide v11, v2, Lym1;->k:J

    .line 22
    .line 23
    cmp-long v9, v9, v11

    .line 24
    .line 25
    if-lez v9, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-gez v9, :cond_2

    .line 29
    .line 30
    :cond_1
    const/4 v9, 0x0

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    iget-object v9, v1, Lym1;->r:Lyw1;

    .line 33
    .line 34
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    iget-object v10, v2, Lym1;->r:Lyw1;

    .line 39
    .line 40
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    sub-int/2addr v9, v10

    .line 45
    if-eqz v9, :cond_4

    .line 46
    .line 47
    if-lez v9, :cond_1

    .line 48
    .line 49
    :cond_3
    :goto_0
    const/4 v9, 0x1

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    iget-object v9, v1, Lym1;->s:Lyw1;

    .line 52
    .line 53
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    iget-object v10, v2, Lym1;->s:Lyw1;

    .line 58
    .line 59
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-gt v9, v10, :cond_3

    .line 64
    .line 65
    if-ne v9, v10, :cond_1

    .line 66
    .line 67
    iget-boolean v9, v1, Lym1;->o:Z

    .line 68
    .line 69
    if-eqz v9, :cond_1

    .line 70
    .line 71
    iget-boolean v9, v2, Lym1;->o:Z

    .line 72
    .line 73
    if-nez v9, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :goto_1
    iget-wide v10, v1, Lym1;->k:J

    .line 81
    .line 82
    iget-object v12, v1, Lym1;->r:Lyw1;

    .line 83
    .line 84
    const-wide/16 v39, 0x0

    .line 85
    .line 86
    if-nez v9, :cond_8

    .line 87
    .line 88
    iget-boolean v9, v1, Lym1;->o:Z

    .line 89
    .line 90
    if-eqz v9, :cond_7

    .line 91
    .line 92
    iget-boolean v9, v2, Lym1;->o:Z

    .line 93
    .line 94
    if-eqz v9, :cond_6

    .line 95
    .line 96
    move-object v12, v2

    .line 97
    move-object/from16 v69, v6

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    const/16 v68, 0x1

    .line 101
    .line 102
    goto/16 :goto_d

    .line 103
    .line 104
    :cond_6
    new-instance v41, Lym1;

    .line 105
    .line 106
    iget v9, v2, Lym1;->d:I

    .line 107
    .line 108
    iget-object v10, v2, Ldn1;->a:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v11, v2, Ldn1;->b:Ljava/util/List;

    .line 111
    .line 112
    iget-wide v14, v2, Lym1;->e:J

    .line 113
    .line 114
    iget-boolean v12, v2, Lym1;->g:Z

    .line 115
    .line 116
    move-wide/from16 v45, v14

    .line 117
    .line 118
    iget-wide v13, v2, Lym1;->h:J

    .line 119
    .line 120
    iget-boolean v15, v2, Lym1;->i:Z

    .line 121
    .line 122
    const/16 v68, 0x1

    .line 123
    .line 124
    iget v7, v2, Lym1;->j:I

    .line 125
    .line 126
    move/from16 v42, v9

    .line 127
    .line 128
    iget-wide v8, v2, Lym1;->k:J

    .line 129
    .line 130
    move-object/from16 v69, v6

    .line 131
    .line 132
    iget v6, v2, Lym1;->l:I

    .line 133
    .line 134
    move/from16 v54, v6

    .line 135
    .line 136
    move/from16 v51, v7

    .line 137
    .line 138
    iget-wide v6, v2, Lym1;->m:J

    .line 139
    .line 140
    move-wide/from16 v55, v6

    .line 141
    .line 142
    iget-wide v6, v2, Lym1;->n:J

    .line 143
    .line 144
    move-wide/from16 v57, v6

    .line 145
    .line 146
    iget-boolean v6, v2, Ldn1;->c:Z

    .line 147
    .line 148
    iget-boolean v7, v2, Lym1;->p:Z

    .line 149
    .line 150
    move/from16 v59, v6

    .line 151
    .line 152
    iget-object v6, v2, Lym1;->q:Low0;

    .line 153
    .line 154
    move-object/from16 v62, v6

    .line 155
    .line 156
    iget-object v6, v2, Lym1;->r:Lyw1;

    .line 157
    .line 158
    move-object/from16 v63, v6

    .line 159
    .line 160
    iget-object v6, v2, Lym1;->s:Lyw1;

    .line 161
    .line 162
    move-object/from16 v64, v6

    .line 163
    .line 164
    iget-object v6, v2, Lym1;->v:Lxm1;

    .line 165
    .line 166
    move-object/from16 v65, v6

    .line 167
    .line 168
    iget-object v6, v2, Lym1;->t:Lbx1;

    .line 169
    .line 170
    move-object/from16 v66, v6

    .line 171
    .line 172
    iget-object v6, v2, Lym1;->w:Lyw1;

    .line 173
    .line 174
    const/16 v60, 0x1

    .line 175
    .line 176
    move-object/from16 v67, v6

    .line 177
    .line 178
    move/from16 v61, v7

    .line 179
    .line 180
    move-wide/from16 v52, v8

    .line 181
    .line 182
    move-object/from16 v43, v10

    .line 183
    .line 184
    move-object/from16 v44, v11

    .line 185
    .line 186
    move/from16 v47, v12

    .line 187
    .line 188
    move-wide/from16 v48, v13

    .line 189
    .line 190
    move/from16 v50, v15

    .line 191
    .line 192
    invoke-direct/range {v41 .. v67}, Lym1;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLow0;Ljava/util/List;Ljava/util/List;Lxm1;Ljava/util/Map;Ljava/util/List;)V

    .line 193
    .line 194
    .line 195
    move-object/from16 v12, v41

    .line 196
    .line 197
    :goto_2
    const/4 v6, 0x0

    .line 198
    goto/16 :goto_d

    .line 199
    .line 200
    :cond_7
    move-object/from16 v69, v6

    .line 201
    .line 202
    const/16 v68, 0x1

    .line 203
    .line 204
    move-object v12, v2

    .line 205
    goto :goto_2

    .line 206
    :cond_8
    move-object/from16 v69, v6

    .line 207
    .line 208
    const/16 v68, 0x1

    .line 209
    .line 210
    iget-boolean v6, v1, Lym1;->p:Z

    .line 211
    .line 212
    if-eqz v6, :cond_9

    .line 213
    .line 214
    iget-wide v6, v1, Lym1;->h:J

    .line 215
    .line 216
    :goto_3
    move-wide/from16 v19, v6

    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_9
    iget-object v6, v5, Lal0;->y:Lym1;

    .line 220
    .line 221
    if-eqz v6, :cond_a

    .line 222
    .line 223
    iget-wide v6, v6, Lym1;->h:J

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_a
    move-wide/from16 v6, v39

    .line 227
    .line 228
    :goto_4
    if-nez v2, :cond_b

    .line 229
    .line 230
    move-wide/from16 v17, v6

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_b
    iget-wide v8, v2, Lym1;->h:J

    .line 234
    .line 235
    iget-wide v13, v2, Lym1;->k:J

    .line 236
    .line 237
    iget-object v15, v2, Lym1;->r:Lyw1;

    .line 238
    .line 239
    move-wide/from16 v17, v6

    .line 240
    .line 241
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    move-wide/from16 v19, v8

    .line 246
    .line 247
    sub-long v7, v10, v13

    .line 248
    .line 249
    long-to-int v7, v7

    .line 250
    invoke-interface {v15}, Ljava/util/List;->size()I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-ge v7, v8, :cond_c

    .line 255
    .line 256
    invoke-interface {v15, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    check-cast v7, Lvm1;

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_c
    const/4 v7, 0x0

    .line 264
    :goto_5
    if-eqz v7, :cond_d

    .line 265
    .line 266
    iget-wide v6, v7, Lwm1;->r:J

    .line 267
    .line 268
    :goto_6
    add-long v6, v19, v6

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_d
    int-to-long v6, v6

    .line 272
    sub-long v8, v10, v13

    .line 273
    .line 274
    cmp-long v6, v6, v8

    .line 275
    .line 276
    if-nez v6, :cond_e

    .line 277
    .line 278
    iget-wide v6, v2, Lym1;->u:J

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_e
    :goto_7
    move-wide/from16 v19, v17

    .line 282
    .line 283
    :goto_8
    iget-boolean v6, v1, Lym1;->i:Z

    .line 284
    .line 285
    if-eqz v6, :cond_f

    .line 286
    .line 287
    iget v6, v1, Lym1;->j:I

    .line 288
    .line 289
    move/from16 v22, v6

    .line 290
    .line 291
    move-object/from16 v34, v12

    .line 292
    .line 293
    const/4 v7, 0x0

    .line 294
    goto :goto_c

    .line 295
    :cond_f
    iget-object v6, v5, Lal0;->y:Lym1;

    .line 296
    .line 297
    if-eqz v6, :cond_10

    .line 298
    .line 299
    iget v6, v6, Lym1;->j:I

    .line 300
    .line 301
    goto :goto_9

    .line 302
    :cond_10
    const/4 v6, 0x0

    .line 303
    :goto_9
    if-nez v2, :cond_12

    .line 304
    .line 305
    :cond_11
    const/4 v7, 0x0

    .line 306
    goto :goto_b

    .line 307
    :cond_12
    iget-wide v7, v2, Lym1;->k:J

    .line 308
    .line 309
    sub-long/2addr v10, v7

    .line 310
    long-to-int v7, v10

    .line 311
    iget-object v8, v2, Lym1;->r:Lyw1;

    .line 312
    .line 313
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    if-ge v7, v9, :cond_13

    .line 318
    .line 319
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    check-cast v7, Lvm1;

    .line 324
    .line 325
    goto :goto_a

    .line 326
    :cond_13
    const/4 v7, 0x0

    .line 327
    :goto_a
    if-eqz v7, :cond_11

    .line 328
    .line 329
    iget v6, v2, Lym1;->j:I

    .line 330
    .line 331
    iget v7, v7, Lwm1;->q:I

    .line 332
    .line 333
    add-int/2addr v6, v7

    .line 334
    const/4 v7, 0x0

    .line 335
    invoke-interface {v12, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    check-cast v8, Lvm1;

    .line 340
    .line 341
    iget v8, v8, Lwm1;->q:I

    .line 342
    .line 343
    sub-int/2addr v6, v8

    .line 344
    :goto_b
    move/from16 v22, v6

    .line 345
    .line 346
    move-object/from16 v34, v12

    .line 347
    .line 348
    :goto_c
    new-instance v12, Lym1;

    .line 349
    .line 350
    iget v13, v1, Lym1;->d:I

    .line 351
    .line 352
    iget-object v14, v1, Ldn1;->a:Ljava/lang/String;

    .line 353
    .line 354
    iget-object v15, v1, Ldn1;->b:Ljava/util/List;

    .line 355
    .line 356
    iget-wide v8, v1, Lym1;->e:J

    .line 357
    .line 358
    iget-boolean v6, v1, Lym1;->g:Z

    .line 359
    .line 360
    iget-wide v10, v1, Lym1;->k:J

    .line 361
    .line 362
    iget v7, v1, Lym1;->l:I

    .line 363
    .line 364
    move/from16 v18, v6

    .line 365
    .line 366
    move/from16 v25, v7

    .line 367
    .line 368
    iget-wide v6, v1, Lym1;->m:J

    .line 369
    .line 370
    move-wide/from16 v26, v6

    .line 371
    .line 372
    iget-wide v6, v1, Lym1;->n:J

    .line 373
    .line 374
    move-wide/from16 v28, v6

    .line 375
    .line 376
    iget-boolean v6, v1, Ldn1;->c:Z

    .line 377
    .line 378
    iget-boolean v7, v1, Lym1;->o:Z

    .line 379
    .line 380
    move/from16 v30, v6

    .line 381
    .line 382
    iget-boolean v6, v1, Lym1;->p:Z

    .line 383
    .line 384
    move/from16 v32, v6

    .line 385
    .line 386
    iget-object v6, v1, Lym1;->q:Low0;

    .line 387
    .line 388
    move-object/from16 v33, v6

    .line 389
    .line 390
    iget-object v6, v1, Lym1;->s:Lyw1;

    .line 391
    .line 392
    move-object/from16 v35, v6

    .line 393
    .line 394
    iget-object v6, v1, Lym1;->v:Lxm1;

    .line 395
    .line 396
    move-object/from16 v36, v6

    .line 397
    .line 398
    iget-object v6, v1, Lym1;->t:Lbx1;

    .line 399
    .line 400
    move-object/from16 v37, v6

    .line 401
    .line 402
    iget-object v6, v1, Lym1;->w:Lyw1;

    .line 403
    .line 404
    const/16 v21, 0x1

    .line 405
    .line 406
    move-object/from16 v38, v6

    .line 407
    .line 408
    move/from16 v31, v7

    .line 409
    .line 410
    move-wide/from16 v16, v8

    .line 411
    .line 412
    move-wide/from16 v23, v10

    .line 413
    .line 414
    const/4 v6, 0x0

    .line 415
    invoke-direct/range {v12 .. v38}, Lym1;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLow0;Ljava/util/List;Ljava/util/List;Lxm1;Ljava/util/Map;Ljava/util/List;)V

    .line 416
    .line 417
    .line 418
    :goto_d
    iput-object v12, v0, Lzk0;->q:Lym1;

    .line 419
    .line 420
    iget-object v7, v0, Lzk0;->n:Landroid/net/Uri;

    .line 421
    .line 422
    if-eq v12, v2, :cond_16

    .line 423
    .line 424
    iput-object v6, v0, Lzk0;->w:Ljava/io/IOException;

    .line 425
    .line 426
    iput-wide v3, v0, Lzk0;->s:J

    .line 427
    .line 428
    iget-object v1, v5, Lal0;->x:Landroid/net/Uri;

    .line 429
    .line 430
    invoke-virtual {v7, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v1

    .line 434
    if-eqz v1, :cond_15

    .line 435
    .line 436
    iget-object v1, v5, Lal0;->y:Lym1;

    .line 437
    .line 438
    if-nez v1, :cond_14

    .line 439
    .line 440
    iget-boolean v1, v12, Lym1;->o:Z

    .line 441
    .line 442
    xor-int/lit8 v1, v1, 0x1

    .line 443
    .line 444
    iput-boolean v1, v5, Lal0;->z:Z

    .line 445
    .line 446
    iget-wide v8, v12, Lym1;->h:J

    .line 447
    .line 448
    iput-wide v8, v5, Lal0;->A:J

    .line 449
    .line 450
    :cond_14
    iput-object v12, v5, Lal0;->y:Lym1;

    .line 451
    .line 452
    iget-object v1, v5, Lal0;->v:Lzm1;

    .line 453
    .line 454
    invoke-virtual {v1, v12}, Lzm1;->u(Lym1;)V

    .line 455
    .line 456
    .line 457
    :cond_15
    invoke-virtual/range {v69 .. v69}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 462
    .line 463
    .line 464
    move-result v6

    .line 465
    if-eqz v6, :cond_19

    .line 466
    .line 467
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v6

    .line 471
    check-cast v6, Lgn1;

    .line 472
    .line 473
    invoke-interface {v6}, Lgn1;->a()V

    .line 474
    .line 475
    .line 476
    goto :goto_e

    .line 477
    :cond_16
    iget-boolean v8, v12, Lym1;->o:Z

    .line 478
    .line 479
    if-nez v8, :cond_19

    .line 480
    .line 481
    iget-wide v8, v1, Lym1;->k:J

    .line 482
    .line 483
    iget-object v1, v1, Lym1;->r:Lyw1;

    .line 484
    .line 485
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    int-to-long v10, v1

    .line 490
    add-long/2addr v8, v10

    .line 491
    iget-object v1, v0, Lzk0;->q:Lym1;

    .line 492
    .line 493
    iget-wide v10, v1, Lym1;->k:J

    .line 494
    .line 495
    cmp-long v8, v8, v10

    .line 496
    .line 497
    if-gez v8, :cond_17

    .line 498
    .line 499
    new-instance v13, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker$PlaylistResetException;

    .line 500
    .line 501
    invoke-direct {v13}, Ljava/io/IOException;-><init>()V

    .line 502
    .line 503
    .line 504
    move/from16 v8, v68

    .line 505
    .line 506
    goto :goto_10

    .line 507
    :cond_17
    iget-wide v8, v0, Lzk0;->s:J

    .line 508
    .line 509
    sub-long v8, v3, v8

    .line 510
    .line 511
    long-to-double v8, v8

    .line 512
    iget-wide v10, v1, Lym1;->m:J

    .line 513
    .line 514
    invoke-static {v10, v11}, Lf35;->i0(J)J

    .line 515
    .line 516
    .line 517
    move-result-wide v10

    .line 518
    long-to-double v10, v10

    .line 519
    const-wide/high16 v12, 0x400c000000000000L    # 3.5

    .line 520
    .line 521
    mul-double/2addr v10, v12

    .line 522
    cmpl-double v1, v8, v10

    .line 523
    .line 524
    if-lez v1, :cond_18

    .line 525
    .line 526
    new-instance v13, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistTracker$PlaylistStuckException;

    .line 527
    .line 528
    invoke-direct {v13}, Ljava/io/IOException;-><init>()V

    .line 529
    .line 530
    .line 531
    :goto_f
    const/4 v8, 0x0

    .line 532
    goto :goto_10

    .line 533
    :cond_18
    move-object v13, v6

    .line 534
    goto :goto_f

    .line 535
    :goto_10
    if-eqz v13, :cond_19

    .line 536
    .line 537
    iput-object v13, v0, Lzk0;->w:Ljava/io/IOException;

    .line 538
    .line 539
    new-instance v1, Lx7;

    .line 540
    .line 541
    const/16 v6, 0x8

    .line 542
    .line 543
    move/from16 v9, v68

    .line 544
    .line 545
    invoke-direct {v1, v9, v6, v13}, Lx7;-><init>(IILjava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual/range {v69 .. v69}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 553
    .line 554
    .line 555
    move-result v9

    .line 556
    if-eqz v9, :cond_19

    .line 557
    .line 558
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v9

    .line 562
    check-cast v9, Lgn1;

    .line 563
    .line 564
    invoke-interface {v9, v7, v1, v8}, Lgn1;->b(Landroid/net/Uri;Lx7;Z)Z

    .line 565
    .line 566
    .line 567
    goto :goto_11

    .line 568
    :cond_19
    iget-object v1, v0, Lzk0;->q:Lym1;

    .line 569
    .line 570
    iget-object v6, v1, Lym1;->v:Lxm1;

    .line 571
    .line 572
    iget-wide v8, v1, Lym1;->m:J

    .line 573
    .line 574
    iget-boolean v6, v6, Lxm1;->e:Z

    .line 575
    .line 576
    const-wide/16 v10, 0x2

    .line 577
    .line 578
    if-nez v6, :cond_1b

    .line 579
    .line 580
    if-eq v1, v2, :cond_1a

    .line 581
    .line 582
    :goto_12
    move-wide/from16 v39, v8

    .line 583
    .line 584
    goto :goto_13

    .line 585
    :cond_1a
    div-long/2addr v8, v10

    .line 586
    goto :goto_12

    .line 587
    :cond_1b
    if-ne v1, v2, :cond_1d

    .line 588
    .line 589
    iget-wide v1, v1, Lym1;->n:J

    .line 590
    .line 591
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    cmp-long v6, v1, v12

    .line 597
    .line 598
    if-eqz v6, :cond_1c

    .line 599
    .line 600
    div-long/2addr v1, v10

    .line 601
    move-wide/from16 v39, v1

    .line 602
    .line 603
    goto :goto_13

    .line 604
    :cond_1c
    div-long/2addr v8, v10

    .line 605
    goto :goto_12

    .line 606
    :cond_1d
    :goto_13
    invoke-static/range {v39 .. v40}, Lf35;->i0(J)J

    .line 607
    .line 608
    .line 609
    move-result-wide v1

    .line 610
    add-long/2addr v1, v3

    .line 611
    move-object/from16 v3, p2

    .line 612
    .line 613
    iget-wide v3, v3, Led2;->e:J

    .line 614
    .line 615
    sub-long/2addr v1, v3

    .line 616
    iput-wide v1, v0, Lzk0;->t:J

    .line 617
    .line 618
    iget-object v1, v0, Lzk0;->q:Lym1;

    .line 619
    .line 620
    iget-boolean v1, v1, Lym1;->o:Z

    .line 621
    .line 622
    if-nez v1, :cond_1f

    .line 623
    .line 624
    iget-object v1, v5, Lal0;->x:Landroid/net/Uri;

    .line 625
    .line 626
    invoke-virtual {v7, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    if-nez v1, :cond_1e

    .line 631
    .line 632
    iget-boolean v1, v0, Lzk0;->x:Z

    .line 633
    .line 634
    if-eqz v1, :cond_1f

    .line 635
    .line 636
    :cond_1e
    invoke-virtual {v0}, Lzk0;->c()Landroid/net/Uri;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    invoke-virtual {v0, v1}, Lzk0;->f(Landroid/net/Uri;)V

    .line 641
    .line 642
    .line 643
    :cond_1f
    return-void
.end method

.method public final j(Ljd2;JJI)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lde3;

    .line 4
    .line 5
    if-nez p6, :cond_0

    .line 6
    .line 7
    new-instance v1, Led2;

    .line 8
    .line 9
    iget-wide v2, v0, Lde3;->a:J

    .line 10
    .line 11
    iget-object v2, v0, Lde3;->b:Lii0;

    .line 12
    .line 13
    move-wide/from16 v7, p2

    .line 14
    .line 15
    invoke-direct {v1, v7, v8, v2}, Led2;-><init>(JLii0;)V

    .line 16
    .line 17
    .line 18
    move-object v5, v1

    .line 19
    :goto_0
    move-object/from16 v1, p0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move-wide/from16 v7, p2

    .line 23
    .line 24
    new-instance v3, Led2;

    .line 25
    .line 26
    iget-wide v1, v0, Lde3;->a:J

    .line 27
    .line 28
    iget-object v4, v0, Lde3;->b:Lii0;

    .line 29
    .line 30
    iget-object v1, v0, Lde3;->d:Lyl4;

    .line 31
    .line 32
    iget-object v5, v1, Lyl4;->p:Landroid/net/Uri;

    .line 33
    .line 34
    iget-object v6, v1, Lyl4;->q:Ljava/util/Map;

    .line 35
    .line 36
    iget-wide v11, v1, Lyl4;->o:J

    .line 37
    .line 38
    move-wide/from16 v9, p4

    .line 39
    .line 40
    invoke-direct/range {v3 .. v12}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 41
    .line 42
    .line 43
    move-object v5, v3

    .line 44
    goto :goto_0

    .line 45
    :goto_1
    iget-object v1, v1, Lzk0;->y:Lal0;

    .line 46
    .line 47
    iget-object v4, v1, Lal0;->s:Lue1;

    .line 48
    .line 49
    iget v6, v0, Lde3;->c:I

    .line 50
    .line 51
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    const/4 v7, -0x1

    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v9, 0x0

    .line 64
    const/4 v10, 0x0

    .line 65
    move/from16 v15, p6

    .line 66
    .line 67
    invoke-virtual/range {v4 .. v15}, Lue1;->u(Led2;IILtb1;ILjava/lang/Object;JJI)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final s(Ljd2;JJLjava/io/IOException;I)Ldd2;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v11, p6

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    check-cast v1, Lde3;

    .line 8
    .line 9
    new-instance v12, Led2;

    .line 10
    .line 11
    iget-wide v2, v1, Lde3;->a:J

    .line 12
    .line 13
    iget v2, v1, Lde3;->c:I

    .line 14
    .line 15
    iget-object v13, v1, Lde3;->b:Lii0;

    .line 16
    .line 17
    iget-object v1, v1, Lde3;->d:Lyl4;

    .line 18
    .line 19
    iget-object v14, v1, Lyl4;->p:Landroid/net/Uri;

    .line 20
    .line 21
    iget-object v15, v1, Lyl4;->q:Ljava/util/Map;

    .line 22
    .line 23
    iget-wide v3, v1, Lyl4;->o:J

    .line 24
    .line 25
    move-wide/from16 v16, p2

    .line 26
    .line 27
    move-wide/from16 v18, p4

    .line 28
    .line 29
    move-wide/from16 v20, v3

    .line 30
    .line 31
    invoke-direct/range {v12 .. v21}, Led2;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 32
    .line 33
    .line 34
    move-object v1, v12

    .line 35
    const-string v3, "_HLS_msn"

    .line 36
    .line 37
    invoke-virtual {v14, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const/4 v12, 0x1

    .line 42
    const/4 v4, 0x0

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    move v3, v12

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v3, v4

    .line 48
    :goto_0
    instance-of v5, v11, Landroidx/media3/exoplayer/hls/playlist/HlsPlaylistParser$DeltaUpdateException;

    .line 49
    .line 50
    sget-object v13, Li61;->s:Ldd2;

    .line 51
    .line 52
    iget-object v6, v0, Lzk0;->y:Lal0;

    .line 53
    .line 54
    if-nez v3, :cond_1

    .line 55
    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    :cond_1
    instance-of v3, v11, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    .line 59
    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    move-object v3, v11

    .line 63
    check-cast v3, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    .line 64
    .line 65
    iget v3, v3, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;->p:I

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const v3, 0x7fffffff

    .line 69
    .line 70
    .line 71
    :goto_1
    if-nez v5, :cond_a

    .line 72
    .line 73
    const/16 v5, 0x190

    .line 74
    .line 75
    if-eq v3, v5, :cond_a

    .line 76
    .line 77
    const/16 v5, 0x1f7

    .line 78
    .line 79
    if-ne v3, v5, :cond_3

    .line 80
    .line 81
    goto/16 :goto_7

    .line 82
    .line 83
    :cond_3
    new-instance v3, Lx7;

    .line 84
    .line 85
    const/16 v5, 0x8

    .line 86
    .line 87
    move/from16 v7, p7

    .line 88
    .line 89
    invoke-direct {v3, v7, v5, v11}, Lx7;-><init>(IILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v5, v6, Lal0;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    move v7, v4

    .line 99
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    const/4 v9, 0x1

    .line 104
    if-eqz v8, :cond_4

    .line 105
    .line 106
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    check-cast v8, Lgn1;

    .line 111
    .line 112
    iget-object v10, v0, Lzk0;->n:Landroid/net/Uri;

    .line 113
    .line 114
    invoke-interface {v8, v10, v3, v4}, Lgn1;->b(Landroid/net/Uri;Lx7;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    xor-int/2addr v8, v9

    .line 119
    or-int/2addr v7, v8

    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iget-object v14, v6, Lal0;->p:Li80;

    .line 122
    .line 123
    if-eqz v7, :cond_6

    .line 124
    .line 125
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {v3}, Li80;->E(Lx7;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v7

    .line 132
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    cmp-long v0, v7, v12

    .line 138
    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    new-instance v0, Ldd2;

    .line 142
    .line 143
    invoke-direct {v0, v4, v7, v8, v4}, Ldd2;-><init>(IJZ)V

    .line 144
    .line 145
    .line 146
    :goto_3
    move-object v13, v0

    .line 147
    goto :goto_4

    .line 148
    :cond_5
    sget-object v0, Li61;->t:Ldd2;

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    :goto_4
    iget v0, v13, Ldd2;->a:I

    .line 152
    .line 153
    if-eqz v0, :cond_8

    .line 154
    .line 155
    if-ne v0, v9, :cond_7

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    move v15, v4

    .line 159
    goto :goto_6

    .line 160
    :cond_8
    :goto_5
    move v15, v9

    .line 161
    :goto_6
    xor-int/lit8 v12, v15, 0x1

    .line 162
    .line 163
    iget-object v0, v6, Lal0;->s:Lue1;

    .line 164
    .line 165
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    const/4 v3, -0x1

    .line 176
    const/4 v4, 0x0

    .line 177
    const/4 v5, 0x0

    .line 178
    const/4 v6, 0x0

    .line 179
    invoke-virtual/range {v0 .. v12}, Lue1;->s(Led2;IILtb1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 180
    .line 181
    .line 182
    if-nez v15, :cond_9

    .line 183
    .line 184
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    :cond_9
    return-object v13

    .line 188
    :cond_a
    :goto_7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 189
    .line 190
    .line 191
    move-result-wide v7

    .line 192
    iput-wide v7, v0, Lzk0;->t:J

    .line 193
    .line 194
    invoke-virtual {v0, v4}, Lzk0;->d(Z)V

    .line 195
    .line 196
    .line 197
    iget-object v0, v6, Lal0;->s:Lue1;

    .line 198
    .line 199
    sget-object v3, Lf35;->a:Ljava/lang/String;

    .line 200
    .line 201
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    const/4 v3, -0x1

    .line 212
    const/4 v4, 0x0

    .line 213
    const/4 v5, 0x0

    .line 214
    const/4 v6, 0x0

    .line 215
    move-object/from16 v11, p6

    .line 216
    .line 217
    invoke-virtual/range {v0 .. v12}, Lue1;->s(Led2;IILtb1;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 218
    .line 219
    .line 220
    return-object v13
.end method
