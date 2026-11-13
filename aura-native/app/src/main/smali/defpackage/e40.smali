.class public final Ldefpackage/e40;
.super Ldefpackage/be5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final l:J

.field public final m:J

.field public final n:Z

.field public final o:Z

.field public final p:Z

.field public final q:Z

.field public final r:Ljava/util/ArrayList;

.field public final s:Ldefpackage/bu4;

.field public t:Ldefpackage/d40;

.field public u:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

.field public v:J

.field public w:J


# direct methods
.method public constructor <init>(Ldefpackage/c40;)V
    .locals 2

    .line 1
    iget-object v0, p1, Ldefpackage/c40;->a:Ldefpackage/bq;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ldefpackage/be5;-><init>(Ldefpackage/bq;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p1, Ldefpackage/c40;->b:J

    .line 7
    .line 8
    iput-wide v0, p0, Ldefpackage/e40;->l:J

    .line 9
    .line 10
    iget-wide v0, p1, Ldefpackage/c40;->c:J

    .line 11
    .line 12
    iput-wide v0, p0, Ldefpackage/e40;->m:J

    .line 13
    .line 14
    iget-boolean v0, p1, Ldefpackage/c40;->d:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Ldefpackage/e40;->n:Z

    .line 17
    .line 18
    iget-boolean v0, p1, Ldefpackage/c40;->e:Z

    .line 19
    .line 20
    iput-boolean v0, p0, Ldefpackage/e40;->o:Z

    .line 21
    .line 22
    iget-boolean v0, p1, Ldefpackage/c40;->f:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Ldefpackage/e40;->p:Z

    .line 25
    .line 26
    iget-boolean p1, p1, Ldefpackage/c40;->g:Z

    .line 27
    .line 28
    iput-boolean p1, p0, Ldefpackage/e40;->q:Z

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Ldefpackage/e40;->r:Ljava/util/ArrayList;

    .line 36
    .line 37
    new-instance p1, Ldefpackage/bu4;

    .line 38
    .line 39
    invoke-direct {p1}, Ldefpackage/bu4;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Ldefpackage/e40;->s:Ldefpackage/bu4;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final A(Ldefpackage/cu4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/e40;->u:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/e40;->D(Ldefpackage/cu4;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final D(Ldefpackage/cu4;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v0, v1, Ldefpackage/e40;->s:Ldefpackage/bu4;

    .line 5
    .line 6
    move-object/from16 v4, p1

    .line 7
    .line 8
    invoke-virtual {v4, v2, v0}, Ldefpackage/cu4;->n(ILdefpackage/bu4;)V

    .line 9
    .line 10
    .line 11
    iget-wide v5, v0, Ldefpackage/bu4;->o:J

    .line 12
    .line 13
    iget-object v3, v1, Ldefpackage/e40;->t:Ldefpackage/d40;

    .line 14
    .line 15
    iget-wide v7, v1, Ldefpackage/e40;->m:J

    .line 16
    .line 17
    const-wide/high16 v9, -0x8000000000000000L

    .line 18
    .line 19
    iget-object v11, v1, Ldefpackage/e40;->r:Ljava/util/ArrayList;

    .line 20
    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_2

    .line 28
    .line 29
    iget-boolean v3, v1, Ldefpackage/e40;->o:Z

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    iget-wide v12, v1, Ldefpackage/e40;->v:J

    .line 35
    .line 36
    sub-long/2addr v12, v5

    .line 37
    cmp-long v0, v7, v9

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-wide v7, v1, Ldefpackage/e40;->w:J

    .line 43
    .line 44
    sub-long v9, v7, v5

    .line 45
    .line 46
    :goto_0
    move-wide v7, v9

    .line 47
    :goto_1
    move-wide v5, v12

    .line 48
    goto :goto_6

    .line 49
    :cond_2
    :goto_2
    iget-boolean v3, v1, Ldefpackage/e40;->p:Z

    .line 50
    .line 51
    iget-wide v12, v1, Ldefpackage/e40;->l:J

    .line 52
    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    iget-wide v14, v0, Ldefpackage/bu4;->k:J

    .line 56
    .line 57
    add-long/2addr v12, v14

    .line 58
    add-long/2addr v14, v7

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    move-wide v14, v7

    .line 61
    :goto_3
    add-long v2, v5, v12

    .line 62
    .line 63
    iput-wide v2, v1, Ldefpackage/e40;->v:J

    .line 64
    .line 65
    cmp-long v0, v7, v9

    .line 66
    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_4
    add-long v9, v5, v14

    .line 71
    .line 72
    :goto_4
    iput-wide v9, v1, Ldefpackage/e40;->w:J

    .line 73
    .line 74
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    const/4 v2, 0x0

    .line 79
    :goto_5
    if-ge v2, v0, :cond_5

    .line 80
    .line 81
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Ldefpackage/b40;

    .line 86
    .line 87
    iget-wide v5, v1, Ldefpackage/e40;->v:J

    .line 88
    .line 89
    iget-wide v7, v1, Ldefpackage/e40;->w:J

    .line 90
    .line 91
    iput-wide v5, v3, Ldefpackage/b40;->s:J

    .line 92
    .line 93
    iput-wide v7, v3, Ldefpackage/b40;->t:J

    .line 94
    .line 95
    add-int/lit8 v2, v2, 0x1

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_5
    move-wide v7, v14

    .line 99
    goto :goto_1

    .line 100
    :goto_6
    :try_start_0
    new-instance v3, Ldefpackage/d40;

    .line 101
    .line 102
    iget-boolean v9, v1, Ldefpackage/e40;->q:Z

    .line 103
    .line 104
    invoke-direct/range {v3 .. v9}, Ldefpackage/d40;-><init>(Ldefpackage/cu4;JJZ)V

    .line 105
    .line 106
    .line 107
    iput-object v3, v1, Ldefpackage/e40;->t:Ldefpackage/d40;
    :try_end_0
    .catch Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    invoke-virtual {v1, v3}, Ldefpackage/bq;->m(Ldefpackage/cu4;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :catch_0
    move-exception v0

    .line 114
    iput-object v0, v1, Ldefpackage/e40;->u:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    :goto_7
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-ge v2, v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Ldefpackage/b40;

    .line 128
    .line 129
    iget-object v3, v1, Ldefpackage/e40;->u:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 130
    .line 131
    iput-object v3, v0, Ldefpackage/b40;->u:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 132
    .line 133
    add-int/lit8 v2, v2, 0x1

    .line 134
    .line 135
    goto :goto_7

    .line 136
    :cond_6
    return-void
.end method

.method public final a(Ldefpackage/gn2;)Z
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/be5;->k:Ldefpackage/bq;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/bq;->h()Ldefpackage/gn2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Ldefpackage/gn2;->e:Ldefpackage/wm2;

    .line 8
    .line 9
    iget-object v1, p1, Ldefpackage/gn2;->e:Ldefpackage/wm2;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ldefpackage/vm2;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ldefpackage/bq;->a(Ldefpackage/gn2;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final b(Ldefpackage/mt2;Ldefpackage/n9;J)Ldefpackage/no2;
    .locals 7

    .line 1
    new-instance v0, Ldefpackage/b40;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/be5;->k:Ldefpackage/bq;

    .line 4
    .line 5
    invoke-virtual {v1, p1, p2, p3, p4}, Ldefpackage/bq;->b(Ldefpackage/mt2;Ldefpackage/n9;J)Ldefpackage/no2;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-wide v3, p0, Ldefpackage/e40;->v:J

    .line 10
    .line 11
    iget-wide v5, p0, Ldefpackage/e40;->w:J

    .line 12
    .line 13
    iget-boolean v2, p0, Ldefpackage/e40;->n:Z

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Ldefpackage/b40;-><init>(Ldefpackage/no2;ZJJ)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/e40;->r:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/e40;->u:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Ldefpackage/p80;->j()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    throw v0
.end method

.method public final n(Ldefpackage/no2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/e40;->r:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 8
    .line 9
    .line 10
    check-cast p1, Ldefpackage/b40;

    .line 11
    .line 12
    iget-object p1, p1, Ldefpackage/b40;->n:Ldefpackage/no2;

    .line 13
    .line 14
    iget-object v1, p0, Ldefpackage/be5;->k:Ldefpackage/bq;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ldefpackage/bq;->n(Ldefpackage/no2;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-boolean p1, p0, Ldefpackage/e40;->o:Z

    .line 26
    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Ldefpackage/e40;->t:Ldefpackage/d40;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p1, p1, Ldefpackage/bc1;->e:Ldefpackage/cu4;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Ldefpackage/e40;->D(Ldefpackage/cu4;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    invoke-super {p0}, Ldefpackage/p80;->p()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ldefpackage/e40;->u:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 6
    .line 7
    iput-object v0, p0, Ldefpackage/e40;->t:Ldefpackage/d40;

    .line 8
    .line 9
    return-void
.end method
